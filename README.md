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
- 내 정보 수정 `PATCH /users/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{id}/reviews`
- 상품에 리뷰 수정 `PATCH /products/{id}/reviews/{id}`
- 상품에 리뷰 삭제 `DELETE /products/{id}/reviews/{id}`

### 장바구니

- 장바구니에 상품 추가 `POST /carts`
- 장바구니에 상품 삭제 `DELETE /carts/{id}`
- 장바구니 (담긴 상품 목록) `GET /carts`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
>
> -> SSR이 아닌 경우 화면 URL과 API의 URL이 일치하지 않아도 무방하다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
> 
> -> 인증을 통해 사용자 식별이 가능하다. 인증 헤더에 사용자 정보를 확인 할 수 있다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
>
> -> 인가를 사용하여 권한을 통제할 수 있다. 특정 사용자의 정보를 요청 시 
> 요청하는 사용자가 특정 사용자 정보의 권한 정보를 가지고 있는 지 헤더를 통해 확인 가능하다.