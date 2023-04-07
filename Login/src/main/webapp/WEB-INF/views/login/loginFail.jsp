<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>로그인 실패!</h1>
<hr>

세션값 확인 : <%= session.isNew() %> <br>

<a href="/login/login">로그인하기</a>

</body>
</html>