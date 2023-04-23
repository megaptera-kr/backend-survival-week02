# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인 `/sessions`

- 로그인 `GET`
- 로그아웃 `DELETE`

### 사용자 `/users`

- 내 정보 `GET`
- 내 정보 수정 `PATCH`
    - `/{id}`
- 회원가입 `POST`

### 상품 `/products`

- 상품 목록 `GET`
- 상품 상세 `GET`
    - `/{id}`

### 상품 리뷰 `/products/{productId}/reviews`

- 상품에 리뷰 작성 `POST`
- 상품에 리뷰 수정 `PATCH`
    - `/{id}`
- 상품에 리뷰 삭제 `DELETE`
    - `/{id}`

### 장바구니 `/carts`

- 장바구니 (담긴 상품 목록) `GET`
- 장바구니에 상품 추가 `POST`
    - `/items`
- 장바구니에 상품 삭제 `DELETE`
    - `/items/{productsId}`

### 주문하기 `/orders`

- 주문 목록 `GET`
- 주문하기 `POST`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?

목적과 용도가 다르기 때문에 당연히 분리시켜야한다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?

헤더에 담긴 토큰 정보나, 쿠키에 담겨 있는 session id 등을 통해 확인한다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?

인증, 인가의 개념이 적용된다.

먼저, 인증 되지 않은 경우 `401`을 return

인증이 된 경우에는 validation rules를 통해 필터링 한다.

예를 들어, `PATCH /users/1`로 요청이 온 경우, 현재 요청을 보낸 사용자의 id가 1인지 확인한다.

1이 아닌 경우 인가되지 않은 경우이기 때문에, `403`을 return

