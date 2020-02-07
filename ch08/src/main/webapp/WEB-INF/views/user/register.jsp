<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>register</title>
</head>
<body>
	<h3>user 등록</h3>
	
	<form action="/ch08/user/register" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="custid" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>휴대폰</td>
				<td><input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="등록하기"/></td>
			</tr>
		</table>
	</form>

	<a href="/ch08/index">돌아가기</a>	
	
</body>
</html>