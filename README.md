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
- 회원가입 `POST /user`

### 내 정보

- 내 정보 `GET /user/me`
- 내 정보 수정 `PATCH /user/me`

### 상품

- 상품 목록 `GET /product`
- 상품 상세 `GET /product/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /product/{productId}/review`
- 상품에 리뷰 수정 `PATCH /product/{productId}/review/{id}`
- 상품에 리뷰 삭제 `DELETE /product/{productId}/review/{id}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart/item`
- 장바구니에 상품 삭제 `DELETE /cart/item/{id}`
- 장바구니 (담긴 상품 목록) `GET /cart`

### 주문하기

- 주문하기 `POST /order`
- 주문 목록 `GET /order`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
- 꼭 맞춰야 될 필요는 없다. 같은 화면안에 여러가지의 기능과 조회 리스트들이 있을 수 있다.
> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
- 서버에 요청 시 전달된 토큰으로 식별한다.
> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
- 사용자 토큰으로 식별하여 화면을 보여준다.