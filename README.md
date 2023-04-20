# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인 `POST /auth/login`
- 로그아웃 `POST /auth/logout`
- 회원가입 `POST /auth/register`

### 내 정보

- 내 정보 `GET /users/me'
- 내 정보 수정 `PUT or PATCH /users/me'

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/:id`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/:id/reviews
- 상품에 리뷰 수정 `PATCH /products/:products_id/reviews/:reviews_id'
- 상품에 리뷰 삭제 `DELETE /products/:products_id/reviews/:reviews_id'

### 장바구니

- 장바구니에 상품 추가 `POST /carts/:id/products`
- 장바구니에 상품 삭제 `DELETE /carts/:cart_id/products/:products_id`
- 장바구니 (담긴 상품 목록) `GET /carts/:id/products`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
- 일치할 필요는 없습니다. 프론트와 백이 분리되었다면 화면은 프론트가 구성하고 프론트는 일부 화면 구성에 필요한 정보를 API를 통해 얻을 수 있기 때문입니다. 
- 화면 접근을 위한 클라이언트 URL 요청 시 프론트에선 해당 URL 응답을 화면으로 렌더링할 때 코드를 동작시키면 코드안에 API가 존재할 시 화면 구성에 필요한 데이터를 불러올 수 있습니다. 
- 즉, 프론트가 화면을 구성하는데 API가 꼭 필요하다고 볼 수 없기 때문입니다. (입력폼 화면 같은 경우)
- 하지만 일관되고 논리적인 구조의 URL을 프론트와 백이 구성을 한다면 애플리케이션 유지 관리하는데에 도움이 될거라 생각한다. 
  - 예를 들면.. 
  - 화면 URL : www.shop.com/products
  - API URL : www.api.shop.com/products, ... 등

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
- 세션이나 JWT 인증 메커니즘을 활용해 쿠키, 세션 혹은 payload의 데이터를 확인하거나 인증 데이터를 분석하여 DB조회로 정밀 확인을 할 수 있습니다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
- 세션으로 다른 사용자의 대한 접근을 사전 차단시키거나 JWT 인증 방식을 통해 리소스 주소를 알아도 다른 사람의 정보를 볼 수 없게 접근 차단을 합니다. 인증된 사용자만 접근할 수 있게끔 (401 Unauthorized)
- 권한부여로 차단하는 방법이나 액세스 차단방법 등 ?