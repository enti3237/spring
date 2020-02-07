<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp"%>
<%@ include file="../_aside.jsp"%>

<section id="sub" class="movie-register">

    <nav>
        <h3>상품등록</h3>
        <p>상품관리 > 상품등록</p>
    </nav>
                        
    <article>
        <form action="/dmall/admin/goods/register" method="post">
            <div class="field">
                <label for="goods_name">상품명</label>
                <input id="goods_name" type="text" name="goods_name" />
            </div>
             <div class="field">
                <label for="goods_op1">상품옵션 1</label>
                <select name="goods_op1" id="goods_op1">
                    <option value="0">컬러</option>
                    <option value="black">블랙</option>
                    <option value="red">레드</option>
                    <option value="grey">그레이</option>
                    <option value="mint">민트그린</option>
                </select>
            </div> 
             <div class="field">
                <label for="goods_op2">상품옵션 2</label>
                <select name="goods_op2" id="goods_op2">
                    <option value="0">사이즈</option>
                    <option value="small">소형</option>
                    <option value="medium">중형</option>
                    <option value="large">대형</option>
                </select>
            </div> 
             <div class="field">
                <label for="goods_op3">상품옵션 3</label>
                <select name="goods_op3" id="goods_op3">
                    <option value="0">배송</option>
                    <option value="quick">퀵배송</option>
                    <option value="delivery">택배</option>
                    <option value="contact">직접수령</option>
                </select>
            </div> 
            <div class="field">
                <label for="goods_price">상품금액</label>
                <input id="goods_price" type="text" name="goods_price" />
            </div>
            <div class="field">
                <label for="goods_sale">할인금액</label>
                <input id="goods_sale" type="text" name="goods_sale" />
            </div>
            <div class="field">
                <label for="goods_stock">재고수량</label>
                <input id="goods_stock" type="text" name="goods_stock" />
            </div>
            <div class="field">
                <label for="goods_manufacturer">제조사</label>
                <input id="goods_manufacturer" type="text" name="goods_manufacturer" />
            </div>
            <div class="field">
                <label for="goods_callcenter">콜센터</label>
                <input id="goods_callcenter" type="text" name="goods_callcenter" />
            </div>
            <div class="field">
                <label for="goods_image">상품이미지</label>
                <input id="goods_image" type="file" name="goods_image" />
            </div>       
            <div class="field">
                <label for="goods_detail">상품설명</label>
                <textarea name="goods_detail" id="goods_detail" cols="100" rows="16"></textarea>
            </div>
            <button type="submit" class="btnRegister">등록하기</button>
        </form>
    </article>

    

</section>

<%@ include file="../_footer.jsp"%>
                