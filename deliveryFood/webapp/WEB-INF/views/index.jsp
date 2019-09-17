<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.jogiyo.deliveryFood.controller.member.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String loginId = (String)request.getParameter("id");
	%>

	id: <p><%= loginId %></p>
	<form action="/deliveryFood/memberUpdate" method="post">
	  <input type="submit" value="회원정보수정">
	 </form>
	<a href="/deliveryFood/memberDelete"><input type="button"
		value="로그아웃"></a>
		
		
	<img src="/deliveryFood/assets/images/toystory.jpg" />	
		
</body>
</html>