<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../_header.jsp"%>
<%@ include file="../_aside.jsp"%>

<section id="sub" class="movie-register">

    <nav>
        <h3>상품등록</h3>
        <p>상품관리 > 상품현황</p>
    </nav>
                        
    <article>
	    <h4><i class="fa fa-building-o" aria-hidden="true"></i>등록상품 리스트</h4>
	    <article>
	        <table>
	            <tr>
	                <th>상품번호</th>
	                <th>상품명</th>
	                <th>상품가격</th>
	                <th>상품옵션</th>
	                <th>재고수량</th>
	                <th>제조사</th>
	                <th>콜센터</th>
	                <th>상품상세</th>
	                <th>상품이미지</th>
	                <th>등록일</th>
	                <th>수정</th>
	                <th>삭제</th>
	            </tr>
	            <c:forEach var="vo" items="${goods }">
		            <tr>
		                <th>${vo.goods_id}</th>
		                <td>${vo.goods_name }</td>
		                <td>${vo.goods_price }</td>
		                <td>${vo.goods_op1 } / ${vo.goods_op2 } / ${vo.goods_op3 }</td>
		                <td>${vo.goods_stock }</td>
		                <td>${vo.goods_manufacturer }</td>
		                <td>${vo.goods_callcenter }</td>
		                <td>${vo.goods_detail }</td>
		                <td>${vo.goods_image }</td>
		                <td>${vo.goods_rdate.substring(0,10) }</td>
		                <td><a href="/dmall/agmin/goods/modify?goods_id=${vo.goods_id}" class="mod">정보수정</a></td>
		                <td><a href="/dmall/agmin/goods/delete?goods_id=${vo.goods_id}" class="del">상품삭제</a></td>
		            </tr>
	            </c:forEach>
	        </table>
	
	    </article>

    </article>

</section>

<%@ include file="../_footer.jsp"%>
                