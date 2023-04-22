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

- 내 정보 `GET /users/{user_id}`
- 내 정보 수정 `PATCH /users/{user_id}`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{product_id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{product_id}/reviews`
- 상품에 리뷰 수정 `PATCH /products/{product_id}/reviews/{review_id}`
- 상품에 리뷰 삭제 `DELETE /products/{product_id}/reviews/{review_id}`

### 장바구니

- 장바구니에 상품 추가 `POST /carts`
- 장바구니에 상품 삭제 `DELETE /carts/{cart_id}/{product_id}`
- 장바구니 (담긴 상품 목록) `GET /carts`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> Q.화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?     
> A.일치할 수도 있고 아닐 수도 있다고 생각합니다 
> 화면 url은 사용자의 클라이언트 요청이고 api는 서버에서 서버로 요청이 될 수도 있고 클라이언트에서 서버로 요청이 될 수도 있기 떄문입니다 

> Q.서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?   
> A.request시 헤더에 있는 정보나 api토큰, 키 등으로 확인할 수 있을 것 같습니다 

> Q.API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?    
> A.정보의 암호화가 필요할 것 같습니다 
