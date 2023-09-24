# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인
- 로그아웃
- 회원가입

### 내 정보

- 내 정보 GET /user
- 내 정보 수정  PATCH /user/{id}

### 상품

- 상품 목록 GET /products
- 상품 상세 POST /products/{id}

### 상품 리뷰

- 상품에 리뷰 작성 POST /products/{product_id}/review/{id}
- 상품에 리뷰 수정 PATCH /products/{prodict_id}/review/{id}
- 상품에 리뷰 삭제 DELETE /products/{prodict_id}/review{id}

### 장바구니

- 장바구니에 상품 추가 POST /carts/items
- 장바구니에 상품 삭제 DELETE /cart/items/{id}
- 장바구니 (담긴 상품 목록) GET /cart

### 주문하기

- 주문하기 POST /orders
- 주문 목록 Get /orders

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
달라도 됩니다. 

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
요청을 받아들일 때 사용자의 세션 값이 같이 넘어가기 때문입니다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
쿠키나 세션 값으로 사용자를 식별핼 수 있습니다.
