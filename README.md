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

- 내 정보  `GET /users/me`
- 내 정보 수정  `PATCH /users/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{id}/comment`
- 상품에 리뷰 수정 `PUT /products/{id}/comment/{commentId}`
- 상품에 리뷰 삭제 `DELETE /products/{id}/comment/{commentId}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart`
- 장바구니에 상품 삭제 `DELETE /cart/{id}`
- 장바구니 (담긴 상품 목록) `GET /cart`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까? <br>
> 일치해도 되지만 달라도 된다고 생각한다. View Layer에서 특정화면을 보기 위해 URL로 들어가도 실제 데이터를 받아오기 위해
> 요청 하는 API는 URL이 달라도 되기 때문이다. 한 화면에서 하나의 API로 처리하기 힘든 화면도 많기 때문이다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까? <BR>
> 기본적으로 HTTP는 stateless이기 때문에 사용자가 누구인지 알 수 없다. 하지만 쿠키와 세션을 이용해 상태정보를 기억하여
> HTTP header에 cookie와 sessionId 값을 확인하여 사용자를 식별 할 수 있다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까? <br>
> 일반적으로 URL에 인증을 적용하여 인증과 인가, request시 validation을 통해 에러코드를 반환하게 하여 사용자를 식별해 처리한다.
> + 가능하면 주소만으로 정보에 접근하지 못하도록 만들고 사용자 정보나 장바구니에 ID를 직접 부여하는 것을 피한다.
 
