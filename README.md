# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인 `POST /seesion`
- 로그아웃 `Delete /session`
- 회원가입 `POST /users`

### 내 정보

- 내 정보 `GET /users/me`
- 내 정보 수정 `PUT /users/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /reviews`
- 상품에 리뷰 수정 `PUT /reviews/{id}`
- 상품에 리뷰 삭제 `DELETE /reviews/{id}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart`
- 장바구니에 상품 삭제 `DELETE /cart/{id}`
- 장바구니 (담긴 상품 목록)`GET /cart`

### 주문하기

- 주문하기 `POST /order`
- 주문 목록 `GET /order`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
- API는 데이터와 기능을 제공하는 인터페이스이며,화면 URL과 일치할 필요는 없다. 가령 자동차 시동을 걸기 위해 우리가 엔진 내부까지 접근할 필요가 없듯이, 시동버튼 까지만 접근하면 되기 때문이다.
> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
- client 에서 context data ( token , session ) 에 대한 정보를 저장하고 있다가
API 통신을 할 때 해당 정보를 함께 넘겨줘서 알 수 있다 대표적으로 토큰엔 jwt 등이 있다.
> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
- API를 호출 할 때, 인증 및 권한 부여를 구현한 뒤 허가된 사용자만 데이터에 접근할 수 있도록 한다.
