# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인
### Request
```javascript
POST /session
```
| Parameter | Type    | Description |
| :---------|:--------|:------------|
| username | String  | 아이디         |
| password | String  | 비밀번호        |

- 로그아웃
### Request
```javascript
DELETE /session
```

- 회원가입
### Request
```javascript
POST /users
```
| Parameter | Type    | Description |
|:----------|:--------|:------------|
| nickname  | String  | 닉네임         |
| username  | String  | 아이디         |
| password  | String  | 비밀번호        |

### 내 정보
- 내 정보 
### Request
```javascript
GET /users/me
```

- 내 정보 수정 
### Request
```javascript
PATCH /users/me
```
| Parameter | Type    | Description |
|:----------|:--------|:------------|
| nickname      | String  | 닉네임         |
| password  | String  | 비밀번호        |


### 상품

- 상품 목록
### Request
```javascript
GET /orders
```

- 상품 상세
### Request
```javascript
GET /orders/1
```

### 상품 리뷰

- 상품에 리뷰 작성
### Request
```javascript
POST /orders/1/reviews
```

- 상품에 리뷰 수정
### Request
```javascript
PATCH /reviews/1
```

- 상품에 리뷰 삭제
### Request
```javascript
DELETE /reviews/1
```

### 장바구니
- 장바구니에 상품 추가
### Request
```javascript
POST /carts/1/products
```
| Parameter | Type    | Description |
|:----------|:--------|:------------|
| productId | String  | 상품아이디       |


- 장바구니에 상품 삭제
```javascript
DELETE /carts/1/products
```
| Parameter | Type    | Description |
|:----------|:--------|:------------|
| productId | String  | 상품아이디       |


- 장바구니 (담긴 상품 목록)
```javascript
GET /carts
```


### 주문하기
- 주문하기
```javascript
POST /orders
```

- 주문 목록
```javascript
GET /orders
```

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?
화면 URL 과 API 의 URL은 서로 달라야 합니다. 화면은 HTTP 메서드의 GET 을 사용하는데, HTTP REST API 에서도 GET 메서드를 사용하여 해당 리소스에 대한 조회하는 기능을 설계하고 구현하는데, 이 경우 화면과 API 응답이 서로 겹처서 충돌이 발생합니다. 

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?
요청정보에 사용자가 자신의 자격증명 정보를 포함하여 요청하면, 서버에서는 그 자격증명에 대한 값을 읽어서 그 사용자를 인식할 수 있습니다. 즉, 서버가 인증에 대한 상태 세션을 유지하는 것이 아니고, 클라이언트가 요청할 때 세션에 대한 값을 넘겨주는 방식이 사용됩니다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?
해당 사용자가 해당 API 와 해당 리소스를 접근할 수 있는 권한이 있는지를 체크한 뒤 접근할 수 있도록 하여 구현할 수 있습니다.
> 