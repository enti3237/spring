<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>list</title>
	<style>
		table {
		width: 800px;
		border-top: 1px solid #444444;
		border-collapse: collapse;
		}
		th, td {
		border-bottom: 1px solid #444444;
		padding: 10px;
        text-align: center;
		}
		th {background-color:#cccccc}
		td:first-of-type {font-weight: bold;}
		a {text-decoration: none;}
	
	</style>
</head>
<body>
	<h3>member 목록</h3>

	<table>
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>휴대폰</th>
			<th>직급</th>
			<th>부서</th>
			<th>입사일</th>
			<th>설정</th>
		</tr>
		
		<c:forEach var="member" items="${members}">
			<tr>
				<td>${member.uid }</td>
				<td>${member.name }</td>
				<td>${member.hp }</td>
				<td>${member.pos }</td>
				<td>${member.dep }</td>
				<td>${member.rdate }</td>
				<td>
					<a href="/member/member/modify?uid=${member.uid}">수정 </a> / 
					<a href="/member/member/delete?uid=${member.uid}">삭제 </a>
				</td>
			</tr>
		</c:forEach>
	</table>
	</br>
	<a href="/member/member/register">신규등록</a> / 
	<a href="/member/index">돌아가기</a>
</body>
</html>