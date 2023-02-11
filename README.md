# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인 `POST /login`
- 로그아웃 `POST /logout`
- 회원가입 `POST /sign-up`

### 내 정보

- 내 정보 `GET /user`
- 내 정보 수정 `PATCH /user`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{productId}/reviews`
- 상품에 리뷰 수정 `PUT /products/{productId}/reviews/{reviewId}`
- 상품에 리뷰 삭제 `DELETE /products/{productId}/reviews/{reviewId}`

### 장바구니

- 장바구니에 상품 추가 `POST /carts/products/{productId}`
- 장바구니에 상품 삭제 `DELETE /carts/{cartId}`
- 장바구니 (담긴 상품 목록) `GET /carts`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?  
> -> 다르게 가져가야한다. 화면 URL의 경우, 사용자에게 공개가 된 URL이다.  
URL을 일치시키게 되면, 사용자가 악의적인 목적으로 트래픽을 발생시킬 수 있는 빌미를 제공해준다.  
Frontend 모듈의 화면 URL 호출 시, 그에 따른 Backend API URL 호출을 올바르게 할 수 있도록 구현되어야한다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?  
> -> 로그인이 이루어진 세션을 통해 확인 가능하다.
Spring Security에서 제공하는 rememeberMe 토큰을 이용하여 로그인 기억 기능도 이용할 수 있다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?  
> -> 로그인된 사용자의 정보를 확인하여 조회/수정/삭제 권한이 없는 사용자의 접근을 차단해야한다.  
Spring의 경우, Spring Security를 이용하여 API URL별 사용자 접근제어가 가능하다.    
추가 인증이 필요한경우, E-mail 인증이나 SMS 인증 등을 진행할 수 있다.  
