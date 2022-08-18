|                       | Method |       URL      |                                            Request                                           |                                                                                                                                                                                                                                        Response                                                                                                                                                                                                                                        |
|-----------------------|:------:|:--------------:|:--------------------------------------------------------------------------------------------:|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| 전체 게시글 | GET    | /api/blog      | -                                                                                            |  {"createdAt": "2022-08-18T14:55:28.779275",                "id": 3,             "name": "안진우",                                                                 "title":"Blog"},{"createdAt": "2022-08-18T05:31:04.293865","id": 2,"name": "안진우","title": "Blog"} |
| 게시글 조회           | GET    | /api/post/{id} | -                                                                                            | {"createdAt": "2022-08-18T12:33:42.894199","name": "안진우","title": "Blog","comment": "MyBlog"}|                                                                                                                                                                                         
| 게시글 작성           | POST   | /api/post      | {"name":"안진우2","title":"Blog2","comment":"MyBlog2","password":"1234"} |{"createdAt": "2022-08-18T14:57:38.4942788","id": 4,"name": "안진우2",\"title": "Blog2"}|
| 게시글 비밀번호 확인  | POST   | /api/post/{id} | { "check_password" :"password" }                                                       |비밀번호가 일치합니다.                                                               
| 게시글 수정           | PATCH(컬럼 하나도 수정가능)    | /api/post/{id} | {   "name" : "name",   "title" : "title",   "comment" : "comment",   "password" : "12345"  }    | 수정되었습니다.                                                                                     |
| 게시글 삭제           | DELETE | /api/post/{id} |                    |             id 번째 게시물이 삭제되었습니다.                                                 |
