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
- 회원가입 `POST /User`

### 내 정보

- 내 정보 `GET /User/me`
- 내 정보 수정 `PATCH /User/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{product_id}/reviews`
- 상품에 리뷰 수정 `PATCH /products/{product_id}/reviews/{id}`
- 상품에 리뷰 삭제 `DELETE /products/{product_id}/reviews/{id}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart/items`
- 장바구니에 상품 삭제 `DELETE /cart/items/{product_id}`
- 장바구니 (담긴 상품 목록) `GET /cart`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?

* 다양한 API를 사용할수도 있고 구분되기 위해서 다르다 (?)

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?

* 헤더에 사용자 정보(쿠키)를 넘겨주어 관련 데이터로 확인한다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?

* 개인정보와 연관된 정보를 파라미터로 받는 API를 구성하지 않는다.
* 쿠키값으로 인증을 통해 정보를 확인한다.