# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회               `GET /posts`
- 게시글 작성               `POST /posts`
- 게시글 수정               `PATCH /posts/{id}`
- 게시글 삭제               `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인                    `POST /session`
- 로그아웃                  `DELETE /session`
- 회원가입                  `POST /users`

### 내 정보

- 내 정보                   `GET /users/{userid}`
- 내 정보 수정              `PATCH /users/{userid}`

### 상품

- 상품 목록                 `GET /products`
- 상품 상세                 `GET /products/{productid}`

### 상품 리뷰

- 상품에 리뷰 작성          `POST /products/{productid}/reviews`
- 상품에 리뷰 수정          `GET /products/{productid}/reviews/{reviewid}`
- 상품에 리뷰 삭제          `DELETE /products/{productid}/reviews/{reviewid}`

### 장바구니

- 장바구니에 상품 추가      `POST /users/{userid}/carts`
- 장바구니에 상품 삭제      `DELETE /users/{userid}/carts/{cartid}`
- 장바구니 (담긴 상품 목록) `GET /users/{userid}/carts`

### 주문하기

- 주문하기                  `POST /users/{userid}/orders/{orderid}`
- 주문 목록                 `GET /users/{userid}/orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?   
달라야 한다. 
실제 URL로 전달되는 정보들은 외부로 노출이 되어서는 안되는 것들도 있기 때문이다. 예를 들어, id, pw 같은 정보들


> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?   
HTTP의 특징은 Stateless하다는 것이다. 따라서 기본적은 클라이언트가 정보를 전달해주지 않으면 알 수 없다. 
다만, 로그인을 통해서 사용자의 정보를 전달받으면 사용자의 정보를 세션에 저장하기 때문에, 그 이후로 누구인지 알수 있는 것


> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?   
id, pw를 통해 사용자가 확인하는 API 인증 과정을 거치고, 사용할 권한이 있는 경우에만 정보를 볼수 있도록 한다.
