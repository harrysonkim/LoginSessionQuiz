<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>

<% if( (boolean) session.getAttribute("login") ){ %>
	<form action="/login/login" method="post">
	
		<div>
			<label>ID</label>
			<input type="text" name="id">
		</div>
	
		<div>
			<label>pass</label>
			<input type="text" name="pass">
		</div>
	
		<div id = 'lastDiv'>
			<button name="login">로그인</button>
		</div>
	
	</form>
<% } else { %>

<!-- 	<a href="javascript:a()">로그아웃</a> -->
	<a href="./logout"><button name="logout">로그아웃</button></a>
<!-- 	<button onclick="location.href='./logout'">로그아웃</button> -->
<!-- 	<button onclick="logout()">로그아웃</button> -->
<!-- 	<button id="logoutBtn">로그아웃</button> -->
	
<% } %>
	<script type="text/javascript">
// 	logout() => {
// 		location.href = "./logout"
// 	}
	
// 	logoutBtn.onclick = () => {
// 		location.href = ""
// 	}
	
	</script>

</div>



</body>
</html>