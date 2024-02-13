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
- 회원가입 `POST /user/{id}`

### 내 정보

- 내 정보 `GET /user/{id}`
- 내 정보 수정 `PATCH /user/{id}`

### 상품

- 상품 목록 `GET /product`
- 상품 상세 `GET /product/{productId}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /product/{productId}/review/{reviewSeq}`
- 상품에 리뷰 수정 `PATCH /product/{productId}/review/{reviewSeq}`
- 상품에 리뷰 삭제 `DELETE /product/{productId}/review/{reviewSeq}`

### 장바구니

- 장바구니에 상품 추가 `POST /user/{id}/cart/{productId}`
- 장바구니에 상품 삭제 `DELETE /user/{id}/cart/{productId}`
- 장바구니 (담긴 상품 목록) `GET /user/{id}/cart`

### 주문하기

- 주문하기 `POST /order/{productId}`
- 주문 목록 `GET /order`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
- 일치시키는 것의 여러가지 약점때문에, 분리하는것이 좋다. 
- 대표적인 이유는 보안 문제가 있다. 
- 화면 URL은 일반적으로 브라우저에서 직접 접근되기 때문에 중요한 데이터 또는 작업에 대한 접근을 API를 통해서만 허용하는 것이 안전하다.
> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
- 일반적으로 JSON Web Token(JWT)기반의 인증토큰을 API 요청 헤더에 포함시켜 사용한다. 서버에서는 이 토큰을 확인하여 사용자를 인식한다.
> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
- 인증 및 토큰 기반 접근으로 서버에서 검증하고 해당권한이 없는 경우에는 요청을 거부하는 방식으로 제어한다.
