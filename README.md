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

- 내 정보 `GET /users/me`
- 내 정보 수정 `PATCH /users/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{productId}`

### 상품 리뷰

- 상품에 리뷰 작성 `GET /reviews/{productId}`
- 상품에 리뷰 수정 `PATCH /reviews/{productId}/{reviewId}`
- 상품에 리뷰 삭제 `DELET /reviews/{productId}/{reviewId}`

### 장바구니

- 장바구니에 상품 추가 `POST /carts/{productId}`
- 장바구니에 상품 삭제 `DELETE /carts/{productId}`
- 장바구니 (담긴 상품 목록) `GET /carts`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
A: 아키텍처에 따라 다르다.
위 REST API를 클라이언트가 그대로 활용하여 서버로 요청되도록 설계된다면 같아야할 것이다.
만약 서버 앞에 게이트웨이 역할을하는 서버가 있어, 클라이언트의 요청을 받아 해당 요청을 여러 서버들로 나눈다면 당연히 달라지게된다. (ex. BFF)


> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
요청과 함께 인증(Authorization) 정보를 같이 넘겨주기때문에 서버에서는 요청자를 식별할 수 있다. 그 예시는 다음과 같다.
* Basic(ID:PW) : Elasticsearch 기본 설정 
* Token : Vault
* Key : AWSCLI
* Session : Cookie
* Certification : Kubernetes 컴포넌트 사이 통신


> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
* 유저 조회 시, 실 사용자(클라이언트)가 `/users/{id}` 같은 API를 사용 불가능하도록 설계
* 유저의 RBAC을 통한 제어
