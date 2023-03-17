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
- 회원가입 `POST /uesr`

### 내 정보

- 내 정보 `GET /userinfo`
- 내 정보 수정 `PATCH /userinfo`

### 상품

- 상품 목록 `GET /product`
- 상품 상세 `GET /product{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /order/{orderId}/review`
- 상품에 리뷰 수정 `POST /order/{orderId}/review/{reviewId}`
- 상품에 리뷰 삭제 `DELETE /order/{orderId}/review/{reviewId}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart`
- 장바구니에 상품 삭제 `POST /cart/{productId}`
- 장바구니 (담긴 상품 목록) `GET /cart/{userId}`

### 주문하기

- 주문하기 `POST /order/{productId}`
- 주문 목록 `GET /order/{userId}`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까? 꼭 일치할 필요는 없을것 같다. 어느정도의 규칙성은 있어야 겠지만 내부적으로 데이터를 가져오는 방식에 용이한 방법으로 API에서는 구성하는게 좋은거같다.
> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까? - 로그인 할시 쿠키를 발급하면 그 쿠키로 알아낼수 있을 것 같다.
> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까? - 쿠키를 비교해서 본인이 가진 쿠키가 아니면 잘못된 접근으로 처리하면 될것 같다.