# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{posts_id}`
- 게시글 삭제 `DELETE /posts/{posts_id}`

### 로그인/회원가입

- 로그인 `POST /session`
- 로그아웃 `DELETE /session`
- 회원가입 `POST /users`

### 내 정보

- 내 정보 `GET /users/me`
- 내 정보 수정 `PATCH /users/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{products_id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{products_id}/reviews`
- 상품에 리뷰 수정 `PATCH /products/{products_id}/reviews/{reviews_id}`
- 상품에 리뷰 삭제 `DELETE /products/{products_id}/reviews/{reviews_id}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart`
- 장바구니에 상품 삭제 `DELETE /cart/products/{products_id}`
- 장바구니 (담긴 상품 목록) `GET /cart`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

- 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
  - 달라야 합니다. 왜냐하면 화면 URL에서 받아와야 할 정보와 API URL에서 받아와야 할 정보가 다를 수 있기 때문입니다.
  - 예를 들어, 화면 URL을 통해 사용자에 보여줘야 할 HTML, CSS, JavaScript 파일 등을 받아오면서, 
  - 서버 API로부터 화면에 특정 정보를 담은 JSON을 받아와서 화면에 보여줘야 할 수 있습니다.
- 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
  - HTTP Header를 통해 사용자 정보를 특정할 수 있습니다.
  - 예시1) 브라우저(클라이언트)가 서버에 요청을 보내면, 서버는 Cookie 헤더에 세션Id가 있는지 확인 후, 
  - 없다면 고유한 세션Id값을 생성하여 Set-Cookie 헤더를 통해 전달합니다.
  - 클라이언트는 서버로부터 받은 세션Id값을 쿠키로 저장합니다.
  - 이후 요청부터는 클라이언트가 Cookie 헤더에 서버로부터 받았던 세션Id 값을 같이 보내게 됩니다.
  - 서버는 클라이언트로부터 받은 세션Id 정보를 이용해 사용자를 특정할 수 있습니다.
  - 예시2) 클라이언트가 서버에 요청을 보낼 때 Authentication 헤더에 토큰 (예 : Bearer XXXX...)를 함께 보냅니다.
  - 서버는 클라이언트로부터 받은 토큰 정보를 해석하여 유효한지 확인한 후 사용자를 특정할 수 있습니다.
- API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
  - 클라이언트로부터 요청을 받으면 해당 사용자에 해당되는 정보만 제공합니다.
  - 이를 위해 세션Id나 토큰 등을 활용하여 사용자가 누구인지 확인합니다.
