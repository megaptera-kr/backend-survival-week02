# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인 `POST/login`
- 로그아웃 `DELETE/logout`
- 회원가입 `POST/join`

### 내 정보 

- 내 정보 `GET/member/{u_id}`
- 내 정보 수정 `POST/member/{u_id}`

### 상품

- 상품 목록 `GET/products`
- 상품 상세 `GET/products/{pro_id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST/comments`
- 상품에 리뷰 수정 `POST/comments/{co_id}`
- 상품에 리뷰 삭제 `DELETE/comments/{co_id}`

### 장바구니

- 장바구니에 상품 추가 `POST/cart/{pro_id}`
- 장바구니에 상품 삭제 `DELETE/cart/{pro_id}`
- 장바구니 (담긴 상품 목록) `GET/cart/{u_id}`

### 주문하기

- 주문하기 `POST/order/{pro_id}`
- 주문 목록 `GET/order/{u_id}`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까? <br>
  : 사용자 입장에서의 정보 가독성 때문에 달라야 할 것 같다.
> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까? <br>
  : 세션정보
> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까? <br>
  : 비밀번호 설정
