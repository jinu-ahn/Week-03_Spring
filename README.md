# ERD
![ERD](https://user-images.githubusercontent.com/66781422/186660075-ff268a2d-432e-4bf1-9076-ccbcf800349c.JPG)


# 유즈케이스
![유즈케이스](https://user-images.githubusercontent.com/66781422/185340535-6fc11ffc-0dde-4d21-8c63-341abbf39460.jpg)


|                       | Method |       URL      |                                            Request                                           |                                                                                                                                                                                                                                        Response                                                                                                                                                                                                                                        |
|-----------------------|:------:|:--------------:|:--------------------------------------------------------------------------------------------:|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| 전체 게시글 | GET    | /api/blog      | -                                                                                            |  {"createdAt": "2022-08-18T14:55:28.779275",                "id": 3,             "name": "안진우",                                                                 "title":"Blog"},{"createdAt": "2022-08-18T05:31:04.293865","id": 2,"name": "안진우","title": "Blog"} |
| 게시글 조회           | GET    | /api/post/{id} | -                                                                                            | {"createdAt": "2022-08-18T12:33:42.894199","name": "안진우","title": "Blog","comment": "MyBlog"}|                                                                                                                                                                                         
| 게시글 작성           | POST   | /api/post      | {"name":"안진우2","title":"Blog2","comment":"MyBlog2","password":"1234"} |{"createdAt": "2022-08-18T14:57:38.4942788","id": 4,"name": "안진우2",\"title": "Blog2"}|
| 게시글 비밀번호 확인  | POST   | /api/post/{id} | { "check_password" :"password" }                                                       |비밀번호가 일치합니다.                                                               
| 게시글 수정           | PATCH(컬럼 하나도 수정가능)    | /api/post/{id} | {   "name" : "name",   "title" : "title",   "comment" : "comment",   "password" : "12345"  }    | 수정되었습니다.                                                                                     |
| 게시글 삭제           | DELETE | /api/post/{id} |                    |             id 번째 게시물이 삭제되었습니다.                                                 |


# ❓ **Why: 과제 제출시에는 아래 질문을 고민해보고 답변을 함께 제출해주세요.**

**1.수정, 삭제 API의 request를 어떤 방식으로 사용하셨나요? (param, query, body)**

@RequestBody를 사용하여 JSON 방식으로 데이터를 넘겨주었습니다.

**2.어떤 상황에 어떤 방식의 request를 써야하나요?**

param - 주소에 포함된 변수를 담습니다. 예를 들면 /api/blogs/{id}라고 url을 설정하였다면 {id}에 해당하는 값을 넘겨주는 역할을 합니다.

query - 경로의 각 쿼리 문자열 매개 변수에 대한 속성이 포함됩니다. url에 ?뒤에 변수에 사용하며 &을 이용하여 추가할 수 있습니다. 저는 사용하지 않았지만 http://localhost:8080/api/search?query= 이라고 사용했으면 query 매개변수 =에 해당하는 값을 의미합니다.

body - 주로 JSON의 데이터를 담을 때 사용하며 XML,Multi Form등에도 사용됩니다. 주소창에서는 확인할 수 없으며 ARC에서 Body부분에 제출된 키-값 데이터 쌍을 포함합니다.
   
**3.RESTful한 API를 설계했나요? 어떤 부분이 그런가요? 어떤 부분이 그렇지 않나요?**

RESTful은 REST API를 제공하는 웹서비스를 RESTful이라고 알고 있는데,
Controller에 HTTP메서드 GET , POST , PATCH(PUT) , DELETE 를 사용하여 GET을 요청하여 지정해놓은 URL을 통해 List값을 보여주도록 하였으며, POST를 통해 서버에 데이터를 전송하였고, PATCH를 통하여 데이터의 전체 또는 일부분을 수정할 수 있도록 하였습니다. DELETE메소드를 통하여 해당되는 id값을 데이터를 삭제하도록하는 메소드를 작성하였습니다.
아직 RESTful한 API라는 용어의 이해가 낮아 그렇지 않은 부분은 어떤 곳인지 잘 모르겠습니다 ㅠ

**4.적절한 관심사 분리를 적용하였나요? (Controller, Repository, Service)**

Packege를 통하여 Controller domain Service 3개의 패키지로 분리하였으며, 그에 해당하는 클래스를 분리하여 사용하였습니다.


**5.작성한 코드에서 빈(Bean)을 모두 찾아보세요!**

Controller , Repository , Service

**6. API 명세서 작성 가이드라인을 검색하여 직접 작성한 명세서와 비교해보세요!**

제가 작성한 API 명세서는 HTTP 요청에 의한 Method, URL, Request, Response만 보여주지만 가이드라인에서는 
호출되는 URL 정보, 적용기술 , 요청변수, 반환값 등 좀 더 세부적으로 나누어 이 변수는 어떤 기능을 담당하는 변수며 어떠한 기능에서 사용한다 등 세부적으로 쪼개서 설명하고 있습니다. 다음에 API명세서를 작성할 때에는 해당 변수가 담당하는 내용도 같이 포함되면 좋을 것 같습니다.
