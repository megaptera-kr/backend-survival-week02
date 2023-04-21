# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인 `POST /session`
- 로그아웃 `DELETE /session`
- 회원가입 `POST /user`

### 내 정보

- 내 정보 `GET /user/me`
- 내 정보 수정 `PATCH /user/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{product_id}/review`
- 상품에 리뷰 수정 `PATCH /products/{product_id}/review`
- 상품에 리뷰 삭제 `DELETE /products/{product_id}/review`

### 장바구니

- 장바구니에 상품 추가 `POST /products/{product_id}/cart`
- 장바구니에 상품 삭제 `DELETE /products/{product_id}/cart`
- 장바구니 (담긴 상품 목록) `GET /cart`

### 주문하기

- 주문하기 `POST /order`
- 주문 목록 `GET /order`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?


하나의 resource에 반드시 한 가지 표현방식이 있는 것이 아니므로, 다양하게 URL을 구성할 수 있습니다.
<br>
Redirect 등으로 인해 원래 요청했던 URL이 A인 경우에도 결국 브라우저에는 B가 보일 때가 있을 것입니다.
<br>
AJAX API를 사용하는 경우에도 콘솔에는 해당 API를 호출한 URL이 뜨겠지만, 브라우저 상단에는 페이지 자체의 URL이 그대로 유지될 수도 있습니다.
<br><br>
이외에 화면 URL과 실제 API URL이 다른 경우의 수는 다양할 텐데,
보안 이슈가 있거나 유저의 직접 접근을 최대한 피해야 하는 경우에는 위의 방식들을 적절히 활용하여 의도적으로 URL을 숨길 수도 있을 것입니다.
<br>
<br>

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?

주로 Request header에 있는 'cookie'나 'user-agent' 항목을 통해 사용자의 접속 환경이나 정보(로그인 여부, 아이디 등)를 확인합니다.
<br>그런 정보를 전혀 전달하지 않는다면 서버 입장에서는 이 사용자가 이전과 같은 사용자가 맞는지 알 수 없습니다. (Stateless)
<br>
<br>

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?

가급적 user_id, session_id와 같이 개인정보와 연관된 파라미터를 URL로 받는 API를 구성하지 않아야 합니다.
<br>그런 정보들이 필요하다면 위에서 언급한 대로 'cookie' 등을 통해 인증 토큰을 부여하는 식으로 운영하여야
다른 사용자를 사칭하여 서비스를 이용하는 케이스가 없을 것입니다.