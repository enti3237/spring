<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>list</title>
</head>
<body>
	<h1>직원목록</h1>
	
	<c:forEach var="bbb" items="${aaa}">
		<p>
			아이디 : ${bbb.custid}<br>
			이름 : ${bbb.name }<br>
			주소 : ${bbb.address}<br>
			휴대폰 : ${bbb.phone}<br>
		
		</p>
	
	</c:forEach>
	
</body>
</html>