# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/로그아웃

- 로그인 `POST /session`
- 로그아웃 `DELETE /session`

### 내 정보

- 회원가입 `POST /users`
- 내 정보 `GET /users/me` 
- 내 정보 수정 `PUT /users/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{productId}/reviews/{id}`
- 상품에 리뷰 수정 `PUT /products/{productId}/reviews/{id}`
- 상품에 리뷰 삭제 `DELETE /products/{productId}/reviews/{id}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart/{id}`
- 장바구니에 상품 삭제 `DELETE /cart/{id}`
- 장바구니 (담긴 상품 목록) `GET /cart`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록  `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
- 화면 URL은 브라우저 창에서 사용자가 입력하는 URL, API URL은 클라이언트와 서버가 데이터를 주고 받을 때 쓰는 URL이라고 하자.
화면 URL은 API URL은 불일치하는 것이 효율적이다. 그 이유는 다음과 같다.
화면 URL과 API URL을 별도로 유지하면 API의 변경이 더 용이하다. 만약 둘이 동일하다면 API URL이 변경되었을 때 그에 맞춰 클라이언트 코드까지 다 수정해야할 것이다.
또한, 각 URL의 역할이 명확해지고 코드의 가독성이 향상된다. 한편, 두 URL이 일치한다면 해당 구조를 이해한 누군가가 API URL을 조작해 악용할 수 있는 가능성도 있기에 두 URL은 달라야 한다.  

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
- 클라이언트의 HTTP 요청 헤더에 있는 정보들을 통해 클라이언트의 정보를 확인할 수 있다. 헤더에서 User-Agent, Cookie, Authorization 등의 클라이언트 정보를 확인할 수 있다.
- User-Agent: 클라이언트의 브라우저나 애플리케이션의 정보를 서버에 전달하여서버는 클라이언트의 종류와 버전, 운영체제 등을 알 수 있다. 
- Cookie: 클라이언트의 상태 정보를 저장하고, 서버에서 필요할 때마다 클라이언트에게 전송. 클라이언트가 해당 서버에 요청할 때마다 쿠키를 활용하여 본인의 정보를 전달할 수 있다.
- Authorization: 클라이언트의 인증정보를 보고 서버는 사용자가 누구인지 알 수 있다. 

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
- 보안 인증(Authentication)과 권한 부여(Authorization)를 통해 인가된 클라이언트만 본인의 정보를 확인할 수 있게끔 함으로써 다른 사람이 함부로 정보를 확인하는 것을 예방할 수 있다.
