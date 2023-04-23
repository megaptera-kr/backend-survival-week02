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
- 내 정보 수정 `PUT /users/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{product_id}/reviews`
- 상품에 리뷰 수정 `PUT /products/{product_id}/reviews/{id}`
- 상품에 리뷰 삭제 `DELETE /products/{product_id}/reviews/{id}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart/items`
- 장바구니에 상품 삭제 `DELETE /cart/items/{id}`
- 장바구니 (담긴 상품 목록) `GET /cart`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?

일치할 필요는 없다.
API의 URL은 데이터를 검색하고 조작하기위한 API를 찾을 수 있도록 사용하는 URL이고
화면 URL은 웹 애플리케이션의 주소 체계를 결정하는데 사용되기 떄문이다.
즉, 사용자가 페이지를 쉽게 찾을 수 있는것이 화면 URL이다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?

서버는 API 요청과 함께 전달되는 토큰으로 사용자를 식별한다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?

가능하면 주소만으로 정보에 접근 가능하지 않도록 만든다.
사용자 정보, 장바구니 등에 ID를 부여하는 걸 피하고 사용자 토큰 등으로 인증을 헤더와 쿠키 등을 이용하여 사용자를 식별해 처리한다.