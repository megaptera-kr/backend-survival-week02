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
- 회원가입 `POST /members`

### 내 정보

- 내 정보 `POST /members/mypage`
- 내 정보 수정 `PATCH /members/mypage`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{products_id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{products_id}/reviews`
- 상품에 리뷰 수정 `PATCH /products/{products_id}/reviews/{reviews_id}`
- 상품에 리뷰 삭제 `DELETE POST /products/{products_id}/reviews/{reviews_id}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart/items`
- 장바구니에 상품 삭제 `DELETE /cart/items/{card_item_number}`
- 장바구니 (담긴 상품 목록) `GET /cart/items`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
상황에 따라 같아도 되고 달라도 된다고 생각한다. 메인페이지의 경우 화면 URL은 하나지만 여러개의 API를 호출해야 할수도 있다.
> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
이로 인해 쿠키/세션 혹은 JWT와 같은 인증 인가를 사용한다
> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
인터셉터, 필터, 혹은 스프링 시큐리티를 사용하여 해당 URL에 대하여 인증 없는 접근은 제한해야한다.
