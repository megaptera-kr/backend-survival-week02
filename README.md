# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인
POST /session
- 로그아웃
DELETE /session
- 회원가입
POST /users

### 내 정보

- 내 정보 
GET /users/me
- 내 정보 수정
PUT /users/me

### 상품

- 상품 목록
GET /products
- 상품 상세
GET /products/{product_id}

### 상품 리뷰

- 상품에 리뷰 작성
POST /products/{product_id}/reviews
- 상품에 리뷰 수정
PUT /products/{product_id}/reviews/{comment_id}
- 상품에 리뷰 삭제
DELETE /products/{product_id}/reviews/{comment_id}

### 장바구니

- 장바구니에 상품 추가
PUT /cart/items
- 장바구니에 상품 삭제
DELETE /cart/items/{id}
- 장바구니 (담긴 상품 목록)
GET /cart

### 주문하기

- 주문하기
POST /orders
- 주문 목록
GET /orders

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
화면 단위의 리소스를 구현할 수도 있지만, 이름만 다르고 내용은 같은 리소스들이 대량으로 만들어지게 될 것이다.
인터페이스를 통해 통신을 하지만 백엔드와 프론트엔드 각각의 프로그램으로 관리되고 확장성, 보안, 유지보수성을 확보해왔던 것들이 서로에게 밀접하고 깊은 영향을 주고 받는 일이 발생하게 된다.
화면의 URL과 API의 URL이 일치될 수는 있겠지만, 일치해야한다는 설계를 바탕으로 진행하는 것은 이미 프로그램 간 인터페이스를 통해 통신을 하는 이유가 없다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
세션을 통해 연결을 유지하는 것처럼 구현을 하고 각각의 사용자를 구별할 수 있다.
토큰을 통해서도 비슷한 구현이 가능하다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
세션이나 토큰 등 각 신원을 확인 할 수 있을 때, 권한을 확인하며 리소스를 제공해야한다.
