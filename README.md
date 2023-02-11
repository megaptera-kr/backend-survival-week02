# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인 `POST /members/login`
- 로그아웃 `DELETE /members/logout`
- 회원가입 `POST /members`

### 내 정보

- 내 정보 `GET /members/myinfo`
- 내 정보 수정 `PATCH /members/myinfo`
  - /members/뒤에 'myinfo'가 붙었을 때는 HandlerInterceptor를 통해 전달받은 
    userId를 사용하려는 목적으로 설계하였습니다. 혹여나 설계상 오류가 있다면 피드백 부탁드리겠습니다.
### 상품

- 상품 목록 `GET /items`
- 상품 상세 `GET /items/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /items/{item_id}/review`
- 상품에 리뷰 수정 `PATCH /items/{item_id}/review/{id}`
- 상품에 리뷰 삭제 `DELETE /items/{item_id}/review/{id}`

### 장바구니

- 장바구니에 상품 추가 `POST /baskets`
- 장바구니에 상품 삭제 `DELETE /baskets/{id}`
- 장바구니 (담긴 상품 목록) `GET /baskets`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
