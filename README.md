전체 게시글 목록 조회	GET	/api/post	-	{ "createdAt": "2022-08-16T15:39:32.825658", "title": "title2",, "author": "test",}, { "createdAt": "2022-08-16T15:40:02.76205", "title": "test", "content": "test", "author": "test" }
게시글 작성	POST	/api/post	{ "title":"test1", "content":"test1", "author":"test1", "password":"test1" }	{ "createdAt": "2022-08-16T15:41:33.9904442", "modifiedAt": "2022-08-16T15:41:33.9904442", "title": "test1", "content": "test1", "author": "test1", "password": "test1" }
게시글 조회	GET	/api/post/{id}	-	{ "createdAt": "2022-08-16T15:39:32.825658" "title": "title2", "content": "test", "author": "test", }
게시글 비밀번호 확인	POST	/api/post/{id}	{ "password" :"password" }	true
게시글 수정	PUT	/api/post/{id}	{ "title" : "test", "content" : "test", "author" : "test", "password" : "test" }	{ "createdAt": "2022-08-16T15:39:32.825658", "modifiedAt": "2022-08-16T15:43:06.250449", "id": 2, "title": "test", "content": "test", "author": "test", "password": "test" }
게시글 삭제	DELETE	/api/post/{id}		
