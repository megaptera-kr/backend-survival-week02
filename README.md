# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{post_id}` > 특정 게시글을 수정
- 게시글 삭제 `DELETE /posts/{post_id}` > 특정 게시글을 삭제

### 로그인/회원가입

- 로그인 `POST /session`
- 로그아웃 `DELETE /session`
- 회원가입 `POST /users`

### 내 정보

- 내 정보 `GET /users/me`
- 내 정보 수정 `PATCH /users/{user_id}` > 특정 유저의 정보를 수정

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{product_id}` > 특정 상품의 상세정보를 얻어옴

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{products_id}/reviews` > 특정 상품에 리뷰 작성
- 상품에 리뷰 수정 `PATCH /products/{products_id}/reviews/{review_id}` > 특정 상품의 특정 리뷰를 수정
- 상품에 리뷰 삭제 `DELETE /products/{products_id}/reviews/{review_id}` > 특정 상품의 특정 리뷰를 삭제

### 장바구니

- 장바구니에 상품 추가 `POST /carts`
- 장바구니에 상품 삭제 `DELETE /carts/{cart_id}` > 장바구니에 담겨있는 상품을 삭제
- 장바구니 (담긴 상품 목록) `GET /carts/{user_id}` > 특정 유저의 장바구니를 가져오기위해

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders/{user_id}` > 특정 유저의 주문 목록

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
> 달라야 된다 생각한다. 화면 URL 과 API URL이 같은경우 혼동이 올수도 있기 때문.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
> 헤더의 정보(세션,쿠키등등)를 이용해서 사용자를 식별한다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
> 민감 정보같은 경우에는 쿠키나 세션 등등을 통해 사용자를 식별해서 사용자에 맞는 정보를 제공해야한다.
