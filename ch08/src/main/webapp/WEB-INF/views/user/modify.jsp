<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>modify</title>
</head>
<body>
	<h3>user 수정</h3>
	
	<form action="/ch08/user/modify" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="custid" readonly="readonly" value="${user.custid}"/></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="${user.name}"/></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="address" value="${user.address}"/></td>
			</tr>
			<tr>
				<td>휴대폰</td>
				<td><input type="text" name="phone" value="${user.phone}" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="수정하기"/></td>
			</tr>
		</table>
	</form>

	<a href="/ch08/index">돌아가기</a>	
	
</body>
</html>