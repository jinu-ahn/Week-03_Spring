|                       | Method |       URL      |                                            Request                                           |                                                                                                                                                                                                                                        Response                                                                                                                                                                                                                                        |
|-----------------------|:------:|:--------------:|:--------------------------------------------------------------------------------------------:|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| 전체 게시글 | GET    | /api/blog      | -                                                                                            |  {"createdAt": "2022-08-18T14:55:28.779275",                "id": 3,             "name": "안진우",                                                                 "title":"Blog"},{"createdAt": "2022-08-18T05:31:04.293865","id": 2,"name": "안진우","title": "Blog"} |
| 게시글 조회           | GET    | /api/post/{id} | -                                                                                            | {"createdAt": "2022-08-18T12:33:42.894199","name": "안진우","title": "Blog","comment": "MyBlog"}|                                                                                                                                                                                         
| 게시글 작성           | POST   | /api/post      | {"name":"안진우2","title":"Blog2","comment":"MyBlog2","password":"1234"} |{"createdAt": "2022-08-18T14:57:38.4942788","id": 4,"name": "안진우2",\"title": "Blog2"}|
| 게시글 비밀번호 확인  | POST   | /api/post/{id} | { "check_password" :"password" }                                                       |비밀번호가 일치합니다.                                                               
| 게시글 수정           | PATCH(컬럼 하나도 수정가능)    | /api/post/{id} | {   "name" : "name",   "title" : "title",   "comment" : "comment",   "password" : "12345"  }    | 수정되었습니다.                                                                                     |
| 게시글 삭제           | DELETE | /api/post/{id} |                    |             id 번째 게시물이 삭제되었습니다.                                                 |


<aside>
❓ **Why: 과제 제출시에는 아래 질문을 고민해보고 답변을 함께 제출해주세요.**

</aside>

1. 수정, 삭제 API의 request를 어떤 방식으로 사용하셨나요? (param, query, body)
2. 어떤 상황에 어떤 방식의 request를 써야하나요?
3. RESTful한 API를 설계했나요? 어떤 부분이 그런가요? 어떤 부분이 그렇지 않나요?
4. 적절한 관심사 분리를 적용하였나요? (Controller, Repository, Service)
5. 작성한 코드에서 빈(Bean)을 모두 찾아보세요!
6. API 명세서 작성 가이드라인을 검색하여 직접 작성한 명세서와 비교해보세요!
