# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인 `GET /session`
- 로그아웃 `DELETE /session`
- 회원가입 `POST /session`

### 내 정보

- 내 정보 `GET /profile`
- 내 정보 수정 `PUT /profile`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{product_id}/reviews/{id}`
- 상품에 리뷰 수정 `PUT /products/{product_id}/reviews/{id}`
- 상품에 리뷰 삭제 `DELETE /products/{product_id}/reviews/{id}`

### 장바구니

- 장바구니에 상품 추가 `POST /carts`
- 장바구니에 상품 삭제 `DELETE /carts/{id}`
- 장바구니 (담긴 상품 목록) `GET /carts`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
일치할 필요가 없다. SSR 환경에서는 화면 URL과 API URL 일치에 대해 고민해야겠지만 그 외의 부분에서는 같아야 할 이유가 없다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
인증을 통해 식별할 수 잇다.
인증 헤더의 정보를 통해 사용자를 특성할 수 있다.
인증 방법은 토큰이나 세션 기반이 될 수 있다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
인가 과정을 통하면 된다.
특정 사용자의 정보에 접근하려 하면 해당 유저가 리소스에 대한 권한이 있는지
위에서 말한 헤더의 정보를 통해 확인할 수 있다.