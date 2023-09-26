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
- 회원가입 `POST /users`

### 내 정보

- 내 정보 `GET /users/me`
- 내 정보 수정 `PUT /users/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{id}/reviews`
- 상품에 리뷰 수정 `PUT /products/{id}/reviews`
- 상품에 리뷰 삭제 `DELETE /products/{id}/reviews`

### 장바구니

- 장바구니에 상품 추가 `POST /users/me/cart/products`
- 장바구니에 상품 삭제 `DELETE /users/me/cart/products`
- 장바구니 (담긴 상품 목록) `GET /users/me/cart/products`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
> 프론트와 백이 서로 구분된 서버로 가동된다면 일치해도 되지만, 만약 같은 서버에서 가동된다면 구분해야 함

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
> cookie 에 있는 session_id 를 통해 session 으로부터 사용자 확인
> access_token 을 발급받아서 매 요청마다 header에 access_token 확인
> oauth 를 통해서 사용자 대리 인증

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
> 위 방법들을 통해 사용자 정보를 확인해서 권한을 확인 후 인가를 결정
