# 로그인 회원가입.

http POST localhost:8080/session

http DELETE localhost:8080/session

http POST localhost:8080/users email="test@example.com" address="경기도" nickname="testUser" username="user1" password="
passwordDontDoItLikeThis"

# 내 정보

http GET localhost:8080/users/me

http PUT localhost:8080/users/me email="test@example.com" address="경기도" nickname="testUser"

# 상품

http GET localhost:8080/products

http GET localhost:8080/products/1

http GET localhost:8080/products/-1

# 상품 리뷰

http POST localhost:8080/reviews productId="2" title="너무 좋다 이상품" content="짱짱 추천합니닷"

http PUT localhost:8080/reviews/1 productId="2" title="상품 좋은 줄 알았는데 3일만에 망가짐." content="우우"

http DELETE localhost:8080/reviews/2

# 장바구니

http POST localhost:8080/cart-items/1

http DELETE localhost:8080/cart-items/1

http GET localhost:8080/cart-items

# 주문하기

http POST localhost:8080/orders

http GET localhost:8080/orders