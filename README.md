# 백엔드 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인   `POST /session`
- 로그아웃 `DELETE /session`
- 회원가입 `POST /users`

### 내 정보

- 내 정보 조회 `GET /users/me`
- 내 정보 수정 `PATCH /users/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /products/{productId}/reviews`
- 상품에 리뷰 수정 `PATCH /products/{productId}/reviews/{id}`
- 상품에 리뷰 삭제 `DELETE /products/{productId}/reviews/{id}`
f
### 장바구니

- 장바구니에 상품 추가 `POST /cart/items`
- 장바구니에 상품 삭제 `DELETE /cart/items/{id}`
- 장바구니 (담긴 상품 목록) `GET /cart`

### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> **화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?**<br>
- 일치하지 않을 수 있다.
- jsp/servlet과 같이 F/E와 B/E가 구분되지 않은 환경이라면, 화면 URL과 API URL이 같을 확률이 크다. 이 경우에는 사용자가 브라우저를 통해 요청하는 URL이 그대로 서버에 전달되며, 화면 URL과 API URL이 따로 구분되지 않는다. <br>
- 하지만 F/E와 B/E로 Tier와 Layer를 구분한 아키텍쳐라면 다른 경우가 더 많을 수 있다. 사용자가 화면 URL을 통해 1차적으로 하는 요청은 F/E로 가게 되는데 만약 단순히 페이지를 렌더링하는 화면 URL을 요청한다면 F/E에서는 HTML, Javascript, CSS 등과 같은 정보들을 API에 요청하지 않고 직접 접근하여 처리하는 경우가 많기 때문에 API URL이 불필요하며 화면 URL만 사용할 수도 있다.<br>
- 또한 REST를 따르는 API라면, REST가 제공하는 상호운용성에 의해서 F/E와 B/E라는 컴퓨터 시스템은 서로 종속적이지 않고 서로의 변화에서 독립될 수 있다. 상호운용성이란 하나의 시스템이 동일 또는 이기종의 다른 시스템과 아무런 제약없이 서로 호환되어 사용할 수 있는 성질인데, 화면 URL에서(F/E)변경이 일어나더라도 API URL(B/E)에서는 변경이 필요하지 않을 수 있게 된다. 예를 들어서, 화면에 나타난 글자의 색깔을 바꾸는 것은 F/E의 영역이며 이것은 화면 URL을 통해 응답받은 정보에만 관련이 있다. 화면의 색깔이 변경된다고 해서 API URL(B/E)에는 아무런 영향이 가지 않는다.

> **서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?**<br>
- HTTP 프로토콜 헤더 정보에서 얻을 수 있는 IP정보를 통해 1차적으로 식별할 수 있다.
- 사용자가 서버를 통해 인증(Authorization)을 거친 후 서버에서 발급한 고유한 세션ID를 쿠키에 저장하여 클라이언트가 요청 시마다 사용자 식별 정보로 사용할 수 있다.

> **API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?**<br>
- Spring에서는 HandlerInterceptor를 구현하여 Authentication을 위한 interceptor를 사용할 수 있다. 이를 통해 요청마다 요청자가 본인인지 여부를 확인할 수 있고, 인가(Authorization)의 정도를 따져서 차등적으로 정보를 제공할 수 있다. 