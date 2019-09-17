<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>레스토랑 등록</h1>
	
		<form action="/deliveryFood/restaurant/entollmentAction" method="POST">

			<div id="name">
				레스토랑명 : <input type="text" name="name" maxlength="30">
			</div>
			
			<div id="id">
			ID : <input type="text" name="id" maxlength="10">
		</div>
			<div id="notice">
				레스토랑 정보 : <input type="text" name="notice" mexlength="2000">
			</div>
			
			<div id="phoneNum">
				레스토랑 번호 : <input type="text" name="phoneNum" mexlength="13">
			</div>
			
			<div id="open_time">
				오픈시간: <input type="text" name="open_time">
			</div>
			
			<div id="close_time">
				오픈시간: <input type="text" name="close_time">
			</div>
			
			<!-- submit 서버와 통신을 하게 되는 버튼 -->
		    <input type="submit" value="등록">
		
		</form>
	
	


</body>
</html>