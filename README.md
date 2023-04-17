# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{postId}`
- 게시글 삭제 `DELETE /posts/{postId}`

### 로그인/회원가입

- 로그인 폼 `GET users/login`
- 로그인 `POST users/login` OR `POST /session`
- 로그아웃 `POST users/logout` OR `DELETE /session`

### 내 정보

- 회원가입 `POST /users`
- 내 정보 `GET /users/me`
- 내 정보 수정 `PATCH /users/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{productId}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{productId}/reviews`
- 상품에 리뷰 수정 `PUT /products/{productId}/reviews/{reviewId}`
- 상품에 리뷰 삭제 `DELETE /products/{productId}/reviews`

### 장바구니

- 장바구니에 상품 추가 `POST /cart/products`
- 장바구니에 상품 삭제 `DELETE /cart/products/{productId}`
- 장바구니 (담긴 상품 목록) `GET /cart/products`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
> 달라야할 것 같다. 화면 URL은 누구에게나 보여지는 것이라, 보안 문제가 있을 수 있을 것 같다.


> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
> 쿠키-세션 또는 토큰을 사용해서 사용자를 식별할 수 있다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
> 사용자를 식별할 수 있으니, 해당 user-id가 아니면 정보를 볼 수 없도록 권한을 제한하면 된다.

