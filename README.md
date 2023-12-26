# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인 : `POST /`
- 로그아웃 : `DELETE /`
- 회원 가입 : `POST /users/`

### 내 정보

- 내 정보 : `GET /users/me`
- 내 정보 수정 : `PATCH /users/me`

### 상품

- 상품 목록 : `GET /items`
- 상품 상세 : `GET /items/{item_id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /reviews?item_id={item_id}`
- 상품에 리뷰 수정 `PATCH /reviews/{id}`
- 상품에 리뷰 삭제 `DELETE /reviews/{id}`

### 장바구니

- 장바구니에 상품 추가 : `POST /carts/{cart_id}?item_id={item_id}`
- 장바구니에 상품 삭제 : `DELETE /carts/{cart_id}?item_id={item_id}`
- 장바구니 (담긴 상품 목록) : `GET /carts/{cart_id}`

### 주문하기

- 주문하기 : `POST /orders`
- 주문 목록 : `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?

반드시 일치할 필요는 없다. API의 클라이언트와 화면 URL을 통해 접속하는 클라이언트가 다르기 때문이다. API의 클라이언트는 협업 관계지 애플리케이션 서비스의 고객은 아니기 때문이다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?

인증(Authentication) 메커니즘을 사용해 클라이언트를 식별할 수 있다. 아래는 여러 인증 절차이다.

1. API 키(API Key): 클라이언트는 서버로부터 고유한 API 키를 발급받고 이를 각 요청에 포함시켜 서버에 보낸다. 서버는 해당 API 키를 통해 사용자를 식별한다.

2. 토큰 기반 인증(Token-Based Authentication): 사용자는 로그인 후 서버로부터 액세스 토큰을 받는다. HTTP의 stateless한 성질에 따라 사용자는 요청할 때마다 토큰을 포함해서
   보낸다.

3. 기본 인증(Basic Authentication): 클라이언트는 HTTP 요청 헤더에 자격 증명을 Base64로 인코딩하여 포함시킨다. 이 방법은 HTTPS와 함께 사용될 때 상대적으로 안전하나, 보안 이슈가
   있을 수 있다.

4. 세션 기반 인증(Session-Based Authentication): 사용자는 로그인 후 서버에서 세션을 유지한다. 클라이언트에서 요청할 때 세션 ID를 포함해서 요청하고 서버는 이를 통해 사용자를
   식별합니다. 쿠키를 통해 세션 ID를 전송하는 것이 일반적이다.

5. 클라이언트 인증(Client Certificate Authentication): 클라이언트는 고유한 인증서를 사용하고, 서버는 클라이언트 인증서를 검증하여 사용자를 확인할 수 있다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?

인가(Authorization)를 통해서 사용자가 인증되었다고 해도, 해당 사용자가 특정 리소스에 접근할 권한이 있는지를 확인하면 된다. 권한은 역할(Role) 기반이나 규칙(Rule) 기반으로 관리될 수 있다.
