# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인 `POST /login`
- 로그아웃 `POST /logout`
- 회원가입 `POST /join`

### 내 정보

- 내 정보 `GET /users/{id}`
- 내 정보 수정 `PATCH /users/{id}`

### 상품

- 상품 목록 `GET /goods`
- 상품 상세 `GET /goods/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /goods/{id}/reviews`
- 상품에 리뷰 수정 `PATCH /goods/{id}/reviews/{reviewId}`
- 상품에 리뷰 삭제 `DELETE /goods/{id}/reviews/{reviewId}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart/goods`
- 장바구니에 상품 삭제 `DELETE /cart/goods/{id}`
- 장바구니 (담긴 상품 목록) `GET /cart/goods`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
answer: 일치하지 않아도 된다. 화면 URL은 사용자에게 보여지는 웹 페이지의 경로를 나타내면 API URL은 서버에 데이터를 요청할 때 사용되는 경로로 지정된다.
        즉 , 달라야 한다면 그 이유는 API URL은 중요한 데이터를 다루는 경우가 많기 때문에 보안을 위해서라면 화면 URL과 다르게 하는 것이 좋다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
answer: 토큰을 이용해서 해당 사용자가 누구인지 알 수 있다. 예를 들면 JWT나 OAuth을 사용될 수 있다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
answer: 사용자에 따라서 접근 권한을 부여하고 그 권한에 따라서 접근을 허용하거나 막는다. 
        또는 토큰을 이용해서 해당 사용자가 누구인지 알 수 있기 때문에 토큰을 이용해서 해당 사용자의 정보만을 볼 수 있게 한다.
