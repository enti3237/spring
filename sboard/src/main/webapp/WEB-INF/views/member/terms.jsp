<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../_header.jsp"%>

<div id="terms">
	<section>
		<table>
			<caption>사이트 이용약관</caption>
			<tr>
				<td>
					<textarea readonly></textarea>
					<div>
						<label><input type="checkbox" name="chk1" />&nbsp;동의합니다.</label>        
					</div>
				</td>
			</tr>
		</table>
	</section>			
	<section>
		<table>
			<caption>개인정보 취급방침</caption>
			<tr>
				<td>
					<textarea readonly></textarea>
					<div>
						<label><input type="checkbox" name="chk2" />&nbsp;동의합니다.</label>        
					</div>
				</td>
			</tr>
		</table>
	</section>
	
	<div>
		<a href="#" class="btnCancel">취소</a>
		<a href="#" class="btnNext">다음</a>
	</div>
	
</div>
		
<%@ include file="../_footer.jsp"%>