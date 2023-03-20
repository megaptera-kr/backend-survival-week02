## **쇼핑몰 REST API URI 설계**

### **로그인/회원가입**

- 로그인: **`POST /api/login`**
- 로그아웃: **`POST /api/logout`**
- 회원 가입: **`POST /api/signup`**

### **내 정보**

- 내 정보 조회: **`GET /api/myinfo`**
- 내 정보 수정: **`PATCH /api/myinfo`**

### **상품**

- 상품 목록: **`GET /api/products`**
- 상품 상세: **`GET /api/products/{product_id}`**

### **상품 리뷰**

- 상품에 리뷰 작성: **`POST /api/products/{product_id}/reviews`**
- 상품에 리뷰 수정: **`PATCH /api/products/{product_id}/reviews/{review_id}`**
- 상품에 리뷰 삭제: **`DELETE /api/products/{product_id}/reviews/{review_id}`**

### **장바구니**

- 장바구니에 상품 추가: **`POST /api/cart/items`**
- 장바구니에 상품 삭제: **`DELETE /api/cart/items/{item_id}`**
- 장바구니 (담긴 상품 목록): **`GET /api/cart/items`**

### **구매**

- 주문하기: **`POST /api/orders`**
- 주문 목록: **`GET /api/orders`**



### **질의에 대한 답변**

1. 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
   
   - 결론은 일치 하지않아도된다. 화면 URL은 클라이언트에게만 보이는 URL이고 API URL은 데이터를 가져오는 데 사용되는 주소이기떄문입니다.

2. 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까? 
   
   - 서버는 API 요청을 받을 때 HTTP 헤더를 통해 사용자의 인증 정보를 확인할 수 있습니다.  종류는 토큰 기반, 세션 기반, HTTP 기본을 통해서 사용자를 알수가 있습니다.

3.  API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
   
   - API 요청으로 다른 사람의 정보를 보호하기 위해서는 인증(Authentication)과 권한 부여(Authorization) 기능을 구현해야 합니다.
