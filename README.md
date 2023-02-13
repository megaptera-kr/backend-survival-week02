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

- 상품에 리뷰 작성 `POST /products/{productId}/reviews`
- 상품에 리뷰 수정 `PATCH /products/{productId}/reviews/{reviewId}`
- 상품에 리뷰 삭제 `DELETE /products/{productId}/reviews/{reviewId}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart/items`
- 장바구니에 상품 삭제 `DELETE /cart/items/{itemId}`
- 장바구니 (담긴 상품 목록) `GET /cart`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?  
> -> Frontend Module과 Backend Module을 서로 다르게 가져간다 가정했을 때 Backend Module API의 URL을 여러 곳에서 사용한다면, 다르게 가져가도 무방하다.  
그리고, Frontend Module의 단일 페이지 애플리케이션(Single Page Application, SPA)에서는 같은 Backend Module API를 여러 번 호출하거나,  
여러 Backend Module API들을 순서에 맞춰 호출해야하는 상황이 올 수 있다.  
이때, Collection Pattern을 잘 이용하여 API URL만 보고 어떤 동작인지 대략적인 유추가 가능하도록 설계해야 한다.  
또한, API 호출이 인가되지 않은 사용자에게 무분별하게 이루어지지 않도록 그에 따른 보안설정도 철저하게 구성해야 한다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?  
> -> 로그인이 이루어진 세션을 통해 확인 가능하다.
Spring Security에서 제공하는 rememeberMe 토큰을 이용하여 로그인 기억 기능도 이용할 수 있다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?  
> -> 로그인된 사용자의 정보를 확인하여 조회/수정/삭제 권한이 없는 사용자의 접근을 차단해야한다.  
Spring의 경우, Spring Security를 이용하여 API URL별 사용자 접근제어가 가능하다.    
추가 인증이 필요한경우, E-mail 인증이나 SMS 인증 등을 진행할 수 있다.  
