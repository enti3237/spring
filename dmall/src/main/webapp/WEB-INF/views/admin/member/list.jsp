<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../_header.jsp"%>
<%@ include file="../_aside.jsp"%>

<section id="sub" class="movie-register">

    <nav>
        <h3>회원현황</h3>
        <p>회원관리 > 회원현황</p>
    </nav>
                        
    <article>
	    <h4><i class="fa fa-users" aria-hidden="true"></i>가입회원 리스트</h4>
	    <article>
	        <table>
	            <tr>
	                <th>아이디</th>
	                <th>이름</th>
	                <th>연락처</th>
	                <th>이메일</th>
	                <th>생년월일</th>
	                <th>등급</th>
	                <th>포인트</th>
	                <th>주소</th>
	                <th>아이피</th>
	                <th>가입일</th>
	                <th>수정</th>
	                <th>삭제</th>
	            </tr>
	            <c:forEach var="vo" items="${members }">
		            <tr>
		                <th>${vo.id }</th>
		                <td>${vo.name }</td>
		                <td>${vo.hp }</td>
		                <td>${vo.email }</td>
		                <td>${vo.birth }</td>
		                <td>${vo.grade}</td>
		                <td>${vo.point }</td>
		                <td>${vo.zip } ${vo.addr_main } ${vo.addr_detail }</td>
		                <td>${vo.regip }</td>
		                <td>${vo.rdate.substring(0,10) }</td>
		                <td><a href="/dmall/member/modify?goods_id=${vo.id}" class="mod">정보수정</a></td>
		                <td><a href="/dmall/member/delete?goods_id=${vo.id}" class="del">회원삭제</a></td>
		            </tr>
	            </c:forEach>
	        </table>
	
	    </article>

    </article>

</section>

<%@ include file="../_footer.jsp"%>
                