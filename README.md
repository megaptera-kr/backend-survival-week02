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
- 회원가입 `POST /members`

### 내 정보

- 내 정보 `GET /members/my`
- 내 정보 수정 `PATCH /members/my`
  - /members뒤에 '/my'가 붙었을 때는 HandlerInterceptor를 통해 전달받은 
    userId를 사용하려는 목적으로 설계하였습니다. 혹여나 설계상 오류가 있다면 피드백 부탁드리겠습니다.
    
### 상품

- 상품 목록 `GET /items`
- 상품 상세 `GET /items/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /reviews/{orderNo}`
- 상품에 리뷰 수정 `PATCH /reviews/{id}`
- 상품에 리뷰 삭제 `DELETE /reviews/{id}`
  - 상품 리소스와 연관되지만 nested path를 지양하기 위해 별도의 리소스로 구성하였습니다.
  - 내가 주문을 완료한 상품에 대해서만 리뷰를 작성할 수 있기 때문에 리뷰 작성 시
    주문번호(orderNo)를 파라미터로 넘기도록 하는게 자연스러울 것이라고 판단하였습니다. 
    
### 장바구니

- 장바구니에 상품 추가 `POST /cart-items`
- 장바구니에 상품 삭제 `DELETE /cart-items/{id}`
- 장바구니 (담긴 상품 목록) `GET /cart-items`
  - 장바구니는 사용자가 자신의 장바구니만 볼 수 있고 한 사용자당 1개씩 존재하기 때문에
    /cart-items로 설계하였습니다. /members/my-info/cart-items로 해도 말이 되는것처럼 보이나,
    '내 정보'라는 개념과는 분리해서 별도의 리소스로 가져가는게 맞다고 판단하였습니다.
    
### 주문하기

- 주문하기 `POST /orders`
- 주문 목록 `GET /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
- 달라야 한다고 생각합니다.  
  예를들어 한 화면에서 다수의 서버 API를 호출할 수 있기 때문에  
  이때 화면 URL과 API의 URL이 1:1 매핑이 되어버리면 서버의 API를 설계하는데 큰 제약사항이 생길 것으로 생각됩니다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
- 로그인 처리 후 서버에서 사용자 식별을 위한 값(세션 id, 토큰 등)을 제공합니다.  
  이후 클라이언트에서 새로운 요청이 있을 때 마다 request 헤더에 해당 식별값을 실어서 전송하게 되며,  
  서버에서는 헤더에 포함된 값을 확인하여 사용자가 누구인지 알 수 있게 됩니다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
- 사용자 로그인에 성공해야만 해당 사용자에게 맞는 세션 id 또는 토큰을 생성해주기 때문에  
  해당 세션 id 또는 토큰으로 다른 사람의 정보를 함부로 볼 수 없게 처리할 수 있습니다.