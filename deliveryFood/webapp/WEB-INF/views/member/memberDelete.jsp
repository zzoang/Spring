<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원탈퇴</h1>
	
	<form action="/deliveryFood/member/memberDeleteAction" method="post">

		<div id="id">
			ID :  <input name="id" value="${id}" readonly="readonly">
		</div>
		<div id="pw">
			Password : <input type="text" name="password" maxlength="15">
		</div>

		<!-- submit 서버와 통신을 하게 되는 버튼 -->
		<input type="submit" value="회원탈퇴">

	</form>
	
	
</body>
</html>