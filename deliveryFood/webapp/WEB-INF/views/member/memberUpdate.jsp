<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>회원정보 수정</h1>

	<form action="/deliveryFood/member/memberUpdateAction" method="post">

		<div id="id">
			ID : <input name="id" value="${id}" readonly="readonly" >
		</div>
		<div id="pw">
			Password : <input type="text" name="password" maxlength="15">
		</div>
		<div id="phoneNum">
			핸드폰 : <input type="text" name="phoneNum" maxlength="13">
		</div>
		<div id="address">
			주소 : <input type="text" name="address" maxlength="100">
		</div>
		<div id="email">
			이메일 : <input type="email" name="email" maxlength="55">
		</div>

		<!-- submit 서버와 통신을 하게 되는 버튼 -->
		<input type="submit" value="정보수정">
		<input type="submit" value="로그아웃"></a>
		<a href="/deliveryFood/member/memberDelete"><input type="button" value="회원탈퇴"></a>

	</form>

</body>
</html>