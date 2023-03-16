# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인 'POST /session'
- 로그아웃 'DELETE /session'
- 회원가입 'POST /users'

### 내 정보

- 내 정보 'GET user/me'
- 내 정보 수정 'Pach /user/me'

### 상품

- 상품 목록 'Get /products'
- 상품 상세 'Get /products/{id}'

### 상품 리뷰

- 상품에 리뷰 작성 'POST /products/{id}/reviews'
- 상품에 리뷰 수정 'PATCH /products/{id}/reviews/{review_id}'
- 상품에 리뷰 삭제 'DELETE /products/{id}/reviews/{review_id}'

### 장바구니

- 장바구니에 상품 추가 'POST /cart'
- 장바구니에 상품 삭제 'DELETE /cart/{id}'
- 장바구니 (담긴 상품 목록) 'GET /cart'

### 주문하기

- 주문하기 'POST /orders'
- 주문 목록 'GET /orders'

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?

- 화면의 URL과 API의 URL은 사용하는 경우에 따라 달라져야 한다.

  - 같은 경우
    - 같은 URL 이라면 [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)에 따라, API 서버와 프론트 서버가 같은 도메인이므로. 교차 출처 HTTP 요청을 제한 하는 상황이 일어나지 않는다.
    - 이는 API 서버가 일종의 프록시 서버 및 클라이언트의 파일 서버 역할을 해 줌으로서 연결되는 엔드포인트를 감출 수 있고, API 서버를 통해 Http 요청을 제한하지 않도록 한다.

  - 다른 경우
    - 프론트 엔드에서 엔드포인트를 감출 필요가 없을 경우(Access-Control-Allow-Origin: *) 개발의 편의성을 위해 여러 소스에서 직접 가져올 수 있도록 한다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?

- Header에 Authorization을 통해 사용자를 식별한다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?

- Header에 Authorization안에 포함된 통해 사용자를 식별하고, 약속된 암호화 키를 통해 사용자를 인증한다.
