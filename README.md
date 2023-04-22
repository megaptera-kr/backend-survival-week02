# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인 `POST /session/login`
- 로그아웃 `POST /session/logout`
- 회원가입 `POST /session/signup`

### 내 정보

- 내 정보 `GET /profile`
- 내 정보 수정 `PATCH /profile`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{productsId}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /reviews`
- 상품에 리뷰 수정 `PATCH /reviews/{reviewsId}`
- 상품에 리뷰 삭제 `DELELTE /reviews/{reviewsId}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart/{productsId}`
- 장바구니에 상품 삭제 `DELETE /cart/{productsId}`
- 장바구니 (담긴 상품 목록) `GET /cart`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
- 달라야 합니다.
- 그 이유는 화면을 조회하는 URL도 결국은 GET 요청으로 받아오기 때문에,
- 화면을 받아오는 URL과 데이터를 받아오는 API 주소가 같다면 충돌이 발생합니다.
> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
- 보통 헤더, 쿠키, 세션 등을 사용해서 본인 인증 정보를 API에 함께 보냅니다.
- 이러한 인증정보에는 사용자를 식별할 수 있는 값이 들어있고, 이를 통해 서버는 어떤 사용자인지 파악합니다.
- 그렇기 때문에 인증정보는 암호화 등을 활용해 보안을 강화해서 만들어야 합니다.
> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
- 본인만 볼 수 있는 정보의 경우는 해당 정보의 식별자(id)를 인증 정보에서 꺼내서 사용해야 합니다.
- 예를 들어 `GET /users/{userId}` 방식이 아닌 `GET /users` 방식으로 만들고,
- userId는 인증 정보에서 꺼내서 사용한다면, 본인 정보만 조회할 수 있게 됩니다.
- 물론 인증 정보가 쉽게 탈취되지 않도록 대비해야 합니다.