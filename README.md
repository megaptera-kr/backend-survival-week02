# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입 - Session

- 로그인 `POST /session`
- 로그아웃 `DELETE /session`
- 회원가입 `POST /user`

### 내 정보 - User

- 내 정보 `GET /users/me`
- 내 정보 수정 `PATCH /users/me`

> user_id를 me로 주면 현재 세션 아이디를 매핑한다.

### 상품 - Products

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{product_id}`

### 상품 리뷰 - Reviews

- 상품에 리뷰 작성 `POST /products/{product_id}/reviews`
- 상품에 리뷰 수정 `PATCH /products/{product_id}/reviews/{reviewId}`
- 상품에 리뷰 삭제 `DELETE /products/{product_id}/reviews/{reviewId}`

### 장바구니 - Cart

- 장바구니에 상품 추가 `POST /carts`
- 장바구니에 상품 삭제 `DELETE /carts/{product_id}`
- 장바구니 (담긴 상품 목록) `GET /carts`

> 장바구니는 사용자에게 1개만 존재할것이므로 단수로 해도 상관없을까요?

### 주문하기 - Order

- 주문하기 `POST /orders`
- 주문목록 `GET /orders`

> 장바구니와 주문하기를 리소스 단위에서 시작하는 것과  
> users/{userId}/를 앞에 명시하는것 중 어느 방향이 좋은 설계인가요?

## 질문과 답변

> Q. 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
>
> A. 달라야 한다. API URL을 화면 URL로 그대로 보여준다면 개발자 도구나,    
> 기타 다른 방법으로 해당 API를 구조를 유추하여 부적절한 방법으로 API를 호출할수도 있기 때문.

> Q. 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
>
> A. 사용자 고유한 값, DB에 저장되는 id 혹은 키값을 API 파라미터로 추가하여 보내거나,  
> 로그인 했을 때 발급받은 세션키 혹은 토큰을 헤더에 추가하여 사용자를 인증할수 있을 것 같다.


> Q. API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
>
> A. 세션에 대한 정보와 해당 API에 담긴 사용자 정보(Key 혹은 토큰)이 같은지 비교하는 로직을 추가한다?
