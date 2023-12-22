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
- 상품 상세 `GET /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{post_id}/comments`
- 상품에 리뷰 수정 `PATCH /products/{post_id}/comments/{id}`
- 상품에 리뷰 삭제 `DELETE /products/{post_id}/comments/{id}`

### 장바구니

- 장바구니에 상품 추가 `POST /basket`
- 장바구니에 상품 삭제 `DELETE /basket/{id}`
- 장바구니 (담긴 상품 목록) `GET /basket`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?    
> -> API의 URL은 리소스를 표시하는 것이고, 화면 URL은 화면을 그려주는 것이므로 다를수 밖에 없다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?   
> -> 쿠키에 있는 세션ID 또는 헤더에 있는 토큰으로 구별한다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?   
> -> 세션ID 또는 헤더 토큰값으로 권한이 있는 요청인지 체크를 한다.