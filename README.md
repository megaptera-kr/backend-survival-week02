# 백엔드 생존코스 2주차 과제

## REST API 설계

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

- 상품에 리뷰 작성 `POST /products/{product_id}/reviews`
- 상품에 리뷰 수정 `PATCH /products/{product_id}/reviews/{review_id}`
- 상품에 리뷰 삭제 `DELETE /products/{product_id}/reviews/{review_id}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart`
- 장바구니에 상품 삭제 `DELETE /cartItem/{cart_item_id}`
- 장바구니 (담긴 상품 목록) `GET /cart`

### 주문하기

- 주문하기 `POST /cart/orders`
- 주문 목록 `GET /cart/orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?

세션을 이용해서 요청 헤더의 쿠키를 확인한다

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?

권한 검증과 CSRF 공격에 대한 방어책 마련한다 (토큰검증)
