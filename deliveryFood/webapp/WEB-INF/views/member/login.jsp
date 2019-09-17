<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>로그인</h1>

	<form action="/deliveryFood/member/loginAction" method="POST">

		<div id="id">
			ID : <input type="text" name="id" maxlength="10">
		</div>
		<div id="pw">
			Password : <input type="text" name="password" maxlength="15">
		</div>

		<!-- submit 서버와 통신을 하게 되는 버튼 -->
		<input type="submit" value="로그인">

	</form>



</body>
</html>