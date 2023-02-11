# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인    `POST /session`
- 로그아웃   `DELETE /session`

### 회원가입/내 정보

- 회원가입       `POST /users` or `POST /personal`   
- 내 정보       `GET /users/{users_id}` or `GET /personal/{personal_id}`
- 내 정보 수정   `PATCH /users/{users_id}` or `PATCH /personal/{personal_id}` 
-> 개인적이라는 의미를 강조하고자 personal 을 리소스로 사용하고 싶은데,  
-> 단수형이라 사용하는 것이 맞는지 의문이 갑니다.. 과제 확인시 이에 대한 의견 말씀해주시면 너무 감사드릴것 같아요!
-> 과제에서는 인터셉터를 통해 @RequestAttribute 로 userId 값을 전달받는 것을 가정하였기 때문에 GET, PATCH API id 를 @PathVariable 로 받지 않는 형태로 구현했습니다.

### 상품

- 상품 목록   `GET /items`
- 상품 상세   `GET /items/{items_id}`

### 상품 리뷰

- 상품에 리뷰 작성   `POST /items/{items_id}/comments`
- 상품에 리뷰 수정   `PATCH /items/{items_id}/comments/{comments_id}`
- 상품에 리뷰 삭제   `DELETE /items/{items_id}/comments/{comments_id}`

### 장바구니

- 장바구니에 상품 추가       `POST /baskets`
- 장바구니에 상품 삭제       `DELETE /baskets/{baskets_id}`
- 장바구니 (담긴 상품 목록)   `GET /baskets`

### 주문하기

- 주문하기    `POST /orders`
- 주문 목록   `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
-> 달라야 한다 생각합니다. 화면 URL과 API URL을 호출할 때 각각의 용도가 다르기 때문입니다.
화면 URL 호출은 말 그대로 F/E 단에서 단순히 페이지에 관한 정보를 나타내는 용도이고, API URL 은 B/E 단에서 디비와 관련된 정보를 응답으로 내어주는 용도로 하나의 API URL을 다수의 F/E 단에서 목적에 따라 각각 호출 할 수 있습니다. 
만약 화면 URL과 API URL을 일치시킨다면, 해당 API URL은 하나의 화면 URL 에서만 사용된다는 전재가 붙어야 할텐데, 이는 상당히 결합성을 높이는 설계로 이후 요구사항이 발생했을 때 유연하게 대처 할 수 없는 설계라고 생각합니다.  

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
-> 서버는 API 요청을 받을 때 HTTP Header 값을 통해 사용자를 인식할 수 있습니다.
가장 많이 사용되는 세션의 경우, 클라이언트가 Id, Password 를 통해 로그인 요청을 할 경우 개인 정보에 접근할 수 있는 키 값으로 쿠키를 전달하게 되고 쿠키를 전달받은 클라이언트는 매 요청시 cookie 라는 헤더값으로 해당 쿠키값을 담아 요청하게 됩니다. 
토큰의 경우 마찬가지로 클라이언트의 Id, Password 를 통해 로그인 요청을 할 경우, API에 접근할 수 있는 엑세스 토큰(제한시간이 있는)을 발급하게 되고 토큰을 전달받은 클라이언트는 Authorization 라는 헤더 값을 통해서 요청을 하게 됩니다. 추가적으로 엑세스 토큰의 제한시간이 만료되었을 경우 엑세스 토큰을 재발급 받을 수 있는 리프레쉬 토큰을 엑세스 토큰 발급시에 함께 발급해주게 됩니다.
위 두 방법을 통해서 서버는 사용자를 구분하게 됩니다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
-> 서버가 응답으로 세션쿠키 값과, 엑세스 토큰의 값을 응답할 때 평문으로 주는 것이 아닌, UUID 혹은 Hash 알고리즘을 사용해 규칙성 없는 응답을 주게되면, 값을 유추할 수 없기에 다른 사람이 개인정보를 탈취할 위험성이 줄어들게 됩니다. 