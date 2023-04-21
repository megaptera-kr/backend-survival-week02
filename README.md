# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인
  - `POST /session`
- 로그아웃
  - `DELETE /session`
- 회원가입
  - `POST /users`

### 내 정보

- 내 정보 
  - `GET /users/me`
- 내 정보 수정 
  - `PATCH /users/me`

### 상품

- 상품 목록
  - `GET /products`
- 상품 상세
  - `GET /products/{productId}`

### 상품 리뷰

- 상품에 리뷰 작성
  - `POST /products/{productId}/reviews`
- 상품에 리뷰 수정
  - `PATCH /products/{productId}/reviews/{reviewId}`
- 상품에 리뷰 삭제
  - `DELETE /products/{productId}/reviews/{reviewId}`

### 장바구니

- 장바구니에 상품 추가
  - `POST /carts/{cartId}/items`
- 장바구니에 상품 삭제
  - `DELETE /carts/{cartId}/items/{itemId}`
- 장바구니 (담긴 상품 목록)
  - `GET /carts/{cartId}/items`

### 주문하기

- 주문하기
  - `POST /orders`
- 주문 목록
  - `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
- 굳이 일치해야 할 필요는 없다고 생각한다. 그 이유는 RESTful api 관점에서 API의 URL을 설계할때는 리소스 중심으로 설계하여 개발자가 직관적으로 알아볼 수 있도록 하는데 목적을 두고, 화면 URL은 굳이 리소스 중심이 아닌 웹 페이지의 구조나 사용자의 관점에서 설계하기 때문에 일치하지 않아도 생각한다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
- 클라이언트가 서버에 API를 요청할 때, header에 사용자의 정보가 담긴 암호화된 토큰을 포함시켜 전달하여 서버는 해당 토큰을 받아 decode해서 사용자의 정보를 가져와 어떤 사용자가 api를 요청했는지 확인할 수 있다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
- 클라이언트는 API 요청할떄 header에 암호화된 토큰(AccessToken)을 전달하여 서버에서 암호화된 토큰을 api를 요청한 사용자가 sign했는지 확인하는 인증 절차가 있으면 될 것 같다.
  - 예를 들어 사용자가 다른 api를 요청할때 decode한 토큰의 사용자 ID와 요청한 사용자 ID를 비교해 다르면 다른 사용자로 판단해 정보를 보여주지 않도록 한다.
