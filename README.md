# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인 `GET /oauth/login`
- 로그아웃 `POST /oauth/logout`
- 회원가입 `POST /oauth/register`

### 내 정보

- 내 정보 `GET /users/me`
- 내 정보 수정 `PATCH /users/me` 

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{product_id}/reviews`
- 상품에 리뷰 수정 `PATCH /products/{product_id}/reviews/{id}`
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

서로 처리하는 부분이 다르기 때문에 달라도 되며 한 화면에서 여러 API를 호출해야 하는 상황이나 한 API를 여러 화면에서 사용하는 상황이 발생할 수 있다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?

API에서 사용자를 식별하는 방법은 API를 사용하는 서비스와 플랫폼에 따라 다양한데,
일반적으로 API를 사용하려는 사용자는 API 서비스에 등록하고 인증을 받아야 한다. 그리고 인증이 완료되면 API 서비스는 사용자에게 인증 토큰 또는 API 키를 발급한다.
이 인증 토큰 또는 API 키로 사용자를 식별할 수 있다.


> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?

가능하면 주소만으로 정보에 접근 가능하지 않도록 만든다. 사용자 정보, 장바구니 등에 ID를 부여하는 걸 피하고 사용자 토큰 등으로 인증을 헤더와 쿠키 등을 이용하여 사용자를 식별해 처리한다.

