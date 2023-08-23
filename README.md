# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회               `GET /posts`
- 게시글 작성               `POST /posts`
- 게시글 수정               `PATCH /posts/{id}`
- 게시글 삭제               `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인                    `POST /session`
- 로그아웃                  `DELETE /session`
- 회원가입                  `POST /users`

### 내 정보

- 내 정보                   `GET /users/{userid}`
- 내 정보 수정              `PATCH /users/{userid}`

### 상품

- 상품 목록                 `GET /products`
- 상품 상세                 `GET /products/{productid}`

### 상품 리뷰

- 상품에 리뷰 작성          `POST /products/{productid}/reviews`
- 상품에 리뷰 수정          `GET /products/{productid}/reviews/{reviewid}`
- 상품에 리뷰 삭제          `DELETE /products/{productid}/reviews/{reviewid}`

### 장바구니

- 장바구니에 상품 추가      `POST /users/{userid}/carts`
- 장바구니에 상품 삭제      `DELETE /users/{userid}/carts/{cartid}`
- 장바구니 (담긴 상품 목록) `GET /users/{userid}/carts`

### 주문하기

- 주문하기                  `POST /users/{userid}/orders/{orderid}`
- 주문 목록                 `GET /users/{userid}/orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
