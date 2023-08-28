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
- 회원가입 `POST /users`

### 내 정보

- 내 정보 `GET /users/me`
- 내 정보 수정 `PATCH /users/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{id}/reviews`
- 상품에 리뷰 수정 `PATCH /products/{id}/reviews/{id}`
- 상품에 리뷰 삭제 `DELETE /products/{id}/reviews/{id}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart-products`
- 장바구니에 상품 삭제 `DELETE /cart-products/{id}`
- 장바구니 (담긴 상품 목록) `GET /cart-products`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?

달라도 된다. 화면 URL은 리소스에 어떤 action을 취할 건지 표현할 수 없지만,
API URL은 HTTP method를 명시해 취하려는 action을 표현할 수 있기 때문이다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?

서버의 세션에 사용자를 식별할 수 있는 id를 만들고, 그 id를 응답 Headers의 Cookie에 담아 보낸다.
응답을 받은 클라이언트는 해당 id를 가지고 있다가, 서버에 요청을 보낼 때마다 id를 요청 Headers의 Cookie에 담아 보냄으로써
서버는 사용자가 누구인지 알 수 있게 된다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?

사용자가 타인의 정보가 포함된 리소스에 접근하려 할 때,
요청의 Cookie에 있는 id를 확인해 세션에 존재하는 id와 다를 경우,
접근할 수 없게 하면 된다.