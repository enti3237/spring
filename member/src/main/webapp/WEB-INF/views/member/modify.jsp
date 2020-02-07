<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>modify</title>
		<style>
		table {
		width: 400px;
		border-top: 1px solid #444444;
		border-collapse: collapse;
		}
		th, td {
		border-bottom: 1px solid #444444;
		padding: 10px;
		}
		th {background-color:#cccccc}
		td:first-of-type {font-weight: bold;}
		tr:last-of-type td {border-bottom:0;}
		a {text-decoration: none;}
	
	</style>
</head>
<body>
	<h3>member 수정</h3>
	
	<form action="/member/member/modify" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid" readonly="readonly" value="${member.uid}" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="${member.name}"/></td>
			</tr>
			<tr>
				<td>휴대폰</td>
				<td><input type="text" name="hp"  value="${member.hp}" /></td>
			</tr>
			<tr>
				<td>직급</td>
				<td><input type="text" name="pos"  value="${member.pos}"/></td>
			</tr>
			<tr>
				<td>부서</td>
				<td><input type="text" name="dep"  value="${member.dep}"/></td>
			</tr>
			<tr>
				<td>입사일</td>
				<td><input type="text" name="rdate"  value="${member.rdate}"/></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="수정하기"/></td>
			</tr>
		</table>
	</form>
	
</body>
</html>