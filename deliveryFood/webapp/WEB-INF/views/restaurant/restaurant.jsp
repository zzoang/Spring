 , <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>음식점</h1>
	<div>
		검색 : <input type="search" name="search">
	</div>

	<div style="padding-top: 20px;">
		<input type="button" name="a" value='전체보기' /> 
		<input type="button" name="b" value='한식' /> 
		<input type="button" name="c" value='중식' /> 
		<input type="button" name="d" value='일식' /> 
		<input type="button" name="e" value='분식' />
		<input type="button" name="f" value='프랜차이즈' /> 
		<input type="button" name="g" value='피자/양식' /> 
		<input type="button" name="h" value='야식' />
	</div>

	<h2>name</h2>
	
		<input type="radio" id="rest1" name="rest" checked>
		<label for="rest1">메뉴</label>
		
		<input type="radio" id="rest2" name="rest">
		<label for="rest1">리뷰</label>
		
		<input type="radio" id="rest3" name="rest">
		<label for="rest1">정보</label>

	
	<div class="order">
	<p>주문표</p>
	<input type="submit" value="주문하기">
	</div>

</body>
</html>