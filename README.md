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

- 내 정보 조회 `GET /users/me`
- 내 정보 수정 `PATCH /users/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{products_id}`

### 상품 리뷰

- 상품에 리뷰 작성
- `POST /products/{products_id}/reviews`
- 상품에 리뷰 수정
- `PATCH /products/{products_id}/reviews/{reviews_id}`
- 상품에 리뷰 삭제
- `DELETE /products/{products_id}/reviews/{reviews_id}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart/items`
- 장바구니에 상품 삭제 `DELETE /cart/items/{items_id}`
- 장바구니 (담긴 상품 목록) `GET /cart`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?

내부구조를 API에 반영하지 않는다는 원칙과 관련이 있다. 내부구조를 API에 노출하면 서버 내부 구조를 변경하기 어렵고, 보안이 취약하게 된다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?

각 사용자가 누구인지 알기위해 OAuth, jwt 등을 통해 인증을 거친다.


> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?

인증을 거친 후에 각 사용자에게 권한부여 및 접근제어를 설정한다.
