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
- 회원가입 `/POST users`

### 내 정보

- 내 정보 `GET /users`
- 내 정보 수정 `PATCH /users`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{productId}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{productId}/reviews`
- 상품에 리뷰 수정 `PATCH /products/{productId}/reviews/{id}`
- 상품에 리뷰 삭제 `DELETE /products/{productId}/reviews/{id}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart/{productId}`
- 장바구니에 상품 삭제 `DELETE /cart/items/{productId}`
- 장바구니 (담긴 상품 목록) `GET /cart/`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
> 서로 처리하는 부분이 다르기 때문에 상관없다.
 

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
> 로그인시 쿠키에 세션아이디를 부여하고 세션에 사용자 정보를 저장하여 알 수 있다. 

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
> 인증 과정을 통해 다른 사람의 정보에 접근을 차단할 수 있다.
