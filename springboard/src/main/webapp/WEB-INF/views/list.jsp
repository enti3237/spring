<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>글목록</title> 
		<link rel="stylesheet" href="./css/style.css" />
	</head>
	<body>
		<div id="board">
			<h3>글목록</h3>
			<!-- 리스트 -->
			<div class="list">
				<p class="logout">${member.nick }님! 반갑습니다. <a href="/springboard/member/logout">[로그아웃]</a><p>
				<table>
					<tr>
						<td>번호</td>
						<td>제목</td>
						<td>글쓴이</td>
						<td>날짜</td>
						<td>조회</td>
					</tr>
					
					<!-- taglib과 forEach를 쓰지 않고 그냥 articles.seq 하면 안 나온다 ㅇㅅㅇ -->
					<c:forEach var="vo" items="${articles}">
						<tr>
							<td>${listCount = listCount-1}</td>
							<td><a href="/springboard/view?seq=${vo.seq}">${vo.title}</a>&nbsp;[${vo.comment}]</td>
							<td>${vo.nick}</td>
							<td>${vo.rdate}</td>
							<td>${vo.hit}</td>
						</tr>
					</c:forEach>
				
					
				</table>
			</div>
			<!-- 페이징 -->
			<nav class="paging">
				<span> 
				<c:if test="${pageStart>1}">
					<a href="/springboard/list?pg=${pageStart-1}" class="prev">이전</a>
				</c:if>
				
				<c:forEach var="p" begin="${pageStart }" end="${pageEnd }">
					<a href="/springboard/list?pg=${p}" class="num">${p}</a>
				</c:forEach>
				
				<c:if test="${pageEnd < pageLast}">
					<a href="/springboard/list?pg=${pageEnd+1}" class="next">다음</a>
				</c:if>
				</span>
			</nav>
			<a href="/springboard/write" class="btnWrite">글쓰기</a>
		</div>
	</body>

</html>


