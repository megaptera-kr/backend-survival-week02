# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인   `POST /session`
- 로그아웃  `DELETE /session `
- 회원가입 `POST  /user`

### 내 정보

- 내 정보  `GET /user/me`
- 내 정보 수정  `PATCH /user/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET  /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /reviews?product_id={product_id}`
- 상품에 리뷰 수정 `PATCH /reviews/{id}`
- 상품에 리뷰 삭제 `DELETE /reviews/{id}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart-items?product_id={product_id}&quantity={quantity}`
- 장바구니에 상품 삭제 `DELETE /cart-items/{product_id}`
- 장바구니 (담긴 상품 목록) `GET /cart-items`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
달라야한다.
화면 URL은 복잡한경우가 있는데 서버에 보내는 API에 보내는 URL을 보내는건 그렇게 복잡할필요가 없고 한 화면내에서 여러 API요청이 오고 갈수있는데 그때 화면 URL 하나로 해결할수 없기 때문이다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
간단하게는 바디나 쿼리파라미터에 사용자정보를 넣어서 서버에 보낼수있고
세션, 로컬스토리지, 쿠키등 현재 사용자의 정보를 헤더에 넣어서 서버에보내면 서버에서 알수있다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
처음부터 다른사람의 정보를 요청할수없게 URL을 만드는 방법이 있고
다른사람의 정보를 요청을 했을때 header에 있는 사용자 정보와 요청하는 사용자 정보가 일치하지 않는다면 사용자정보를 서버에서 넘겨주지 않는 방법이있다.
