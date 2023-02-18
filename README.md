# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인 ('POST /yhjs1211-mall/session')
- 로그아웃 ('DELETE /yhjs1211-mall/session')
- 회원가입 ('POST /yhjs1211-mall/users')

### 내 정보

- 내 정보 ('GET /yhjs1211-mall/users/me') // me 라는 입력값(as userId)이 들어오면 '나 자신'으로 처리
- 내 정보 수정 ('PATCH /yhjs1211-mall/users/me')

### 상품

- 상품 목록 ('GET /yhjs1211-mall/products/')
- 상품 상세 ('GET /yhjs1211-mall/products/{product_id})

### 상품 리뷰

- 상품에 리뷰 작성 ('POST /yhjs1211-mall/products/{product_id}/reviews')
- 상품에 리뷰 수정 ('PATCH /yhjs1211-mall/products/{product_id}/reviews/{re_id}')
- 상품에 리뷰 삭제 ('DELETE /yhjs1211-mall/products/{product_id}/reviews/{re_id}')

### 장바구니

- 장바구니에 상품 추가 ('POST /yhjs1211-mall/cart?product-id={product_id}')
- 장바구니에 상품 삭제 ('DELETE /yhjs1211-mall/cart?product-id={product_id}')
- 장바구니 (담긴 상품 목록) ('GET /yhjs1211-mall/cart')

### 주문하기

- 주문하기 ('POST /yhjs1211-mall/order?cart={cart}')
- 주문 목록 ('GET /yhjs1211-mall/order)

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?

달라야한다 생각합니다. 화면에 보여지는 URL에 API의 URL이 동일하게 될 경우 개인정보가 그대로 노출되는 경우가 발생할 수 있습니다. 즉, 노출되는 정보를 제한해야할 때와 아닌 때가 존재하기 때문입니다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?

위 REST API 설계에서 로그인/로그아웃 에서 사용된 세션을 통해 알수있습니다. 등록된 사용자의 경우, User ID/PW 입력을 통해 인증이 되었을 경우 세션에 그 값을 저장해서 이 서버(브라우저)가 닫히기
전까지는 그 값이 유지되어 내가 어떤 행동을 해도 자동으로 인증이 되게끔 하는것입니다. 혹은 인증이 되었을 경우 액세스토큰을 돌려주어 그 액세스 토큰을 통해 인증하는 방식으로 진행할수도 있습니다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?

인증수단을 활용합니다. 우리가 흔히 활용하는 인증 문자메세지 가 좋은 예인것 같습니다. 아무 인증이 되지 않은 상태(로그인이 안된 상태)일 경우, 서버측에선 접근 시도하는 사람이 정말 본인인지, 아니면 다른 제
3자인지 알수있는 방법이 없습니다. 내가 특정 ID에 대해 정보를 요청할 경우, 등록된 인증수단으로 1회성 인증Key를 발송해 인증이 통과할 경우에만 정보를 노출시키는 방법을 사용하면 될것같습니다.

만약 내가 로그인한 상태에서 다른 객체에 접근을 시도하려는 경우, 그 객체의 인증수단에도 알림이 가게끔 하여, 접근을 허용한다 라는 허가가 떨어질 경우에만 정보를 제공, 그 외엔 차단을 하는 방식도 있을것 같습니다.
