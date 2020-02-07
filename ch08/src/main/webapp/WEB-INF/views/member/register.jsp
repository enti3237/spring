<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>register</title>
</head>
<body>
	<h3>member 등록</h3>
	
	<form action="/ch08/member/register" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>휴대폰</td>
				<td><input type="text" name="hp" /></td>
			</tr>
			<tr>
				<td>직급</td>
				<td>
					<select name="pos">
						<option value="">직급을 선택하시오</option>
						<option value="부장">부장</option>
						<option value="과장">과장</option>
						<option value="차장">차장</option>
						<option value="대리">대리</option>
						<option value="사원">사원</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>부서</td>
				<td>
					<select name="dep">
						<option value="">부서를 선택하시오</option>
						<option value="101">101</option>
						<option value="102">102</option>
						<option value="103">103</option>
						<option value="104">104</option>
						<option value="105">105</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>입사일</td>
				<td><input type="date" name="rdate" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="등록하기"/></td>
			</tr>
		</table>
	</form>

	<a href="/ch08/index">돌아가기</a>	
	
</body>
</html>