<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../_header.jsp"%>
<%@ include file="../_aside.jsp"%>
<link rel="stylesheet" href="/dmall/css/style_goods.css">

<section>
    <div class=content_goods>
        <article>
            <div class="category">
                <ul>
                    <li> 홈 </li>
                    <li> > </li>
                    <li>
                        <select name="cate_1">
                            <option value="">다이소 매장상품</option>
                            <option value="">다이소 매장상품</option>
                        </select>
                    </li>
                    <li> > </li>
                    <li>
                        <select name="cate_2">
                            <option value="">다이소 매장상품</option>
                            <option value="">다이소 매장상품</option>
                        </select>
                    </li>
                    <li> > </li>
                    <li>
                        <select name="cate_3">
                            <option value="">다이소 매장상품</option>
                            <option value="">다이소 매장상품</option>
                        </select>
                    </li>
                </ul>
            </div>
            
                        
            <div class="goods_view">
                <div class="line_title">
                    <ul>
                        <li>
                            <p class="goods_title">${goods.goods_name }</p>
                            <p>상품번호 : <span>${goods.goods_id }</span></p>
                        </li>
                        <li>
                            <img src="../img/goods/title_right_01.jpg" alt="">
                        </li>
                    </ul>
                </div>
                <div class="goods_info">
                    <ul>
                        <li class="goods_info_left">
                            <div class="goods_info_img">
                                <img src="../img/goods/${goods.goods_image}" alt="">
                            </div>
                            <div class="goods_info_box">
                                <img src="../img/goods/goods_main_01.gif" alt="">
                                <img src="../img/goods/goods_main_02.gif" alt="">
                                <img src="../img/goods/goods_main_03.gif" alt="">
                                <img src="../img/btns/add_img_good_view.gif" alt="">
                                <img src="../img/btns/add_img_good_view.gif" alt="">
                            </div>
                            <div class="goods_info_bottom">
                                <div class="goods_info_bottom_star">
                                    <span>★★★★★</span>
                                    <span>상품평 : 1건</span>
                                    <span>
                                        <img src="../img/btns/icon_url.gif" alt="">
                                        <img src="../img/btns/icon_kakao.gif" alt="">
                                        <img src="../img/btns/icon_facebook2.gif" alt="">
                                        <img src="../img/btns/icon_twitter2.gif" alt="">
                                    </span>
                                </div>
                                <div class="goods_info_bottom_theme">
                                    <select name="selectbox" id="">
                                        <option value="">[기획전] 올 한해 D몰을 빛낸 인기상품! 2019년 BEST AWARD</option>
                                    </select>
                                </div>
                            </div>
                        </li>
                        <li class="goods_info_right">
                            <form action="#" method="post">
                                <table>
                                    
                                    <tr>
                                        <td colspan="2"></td>
                                    </tr>
                                    <tr>
                                        <td class="tahead">판매가</td>
                                        <td><span><strong>${goods.goods_price }</strong>원</span>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="tahead">제조사/원산지</td>
                                        <td>${goods.goods_manufacturer }</td>
                                    </tr>
                                    <tr>
                                        <td class="tahead">배송비</td>
                                        <td>
                                            <select name="" id="">
                                                <option value="">택배(선불)</option>
                                            </select>
                                            <p>배송비 : 3,000원 / 무료배송조건 (30,000 원 이상 무료)<br>
                                                * 지역별 추가 배송비가 부과될수 있음</p>
                                            <p><img src="../img/btns/delivery_sale.gif"><a href="">묶음배송 상품보기</a></p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="tahead">무이자</td>
                                        <td>5만원 이상 할부카드 안내</td>
                                    </tr>
                                    <tr>
                                        <td class="tahead">혜택</td>
                                        <td><img src="../img/banner/sale_bccard.jpg" alt=""></td>
                                    </tr>
                                    <tr>
                                        <td colspan="2"></td>
                                    </tr>
                                    <tr>
                                        <td class="tahead">수량</td>
                                        <td>
                                            <ul class="pcount">
                                                <li> - </li>
                                                <li><input type="text" name="pcount" value="1" size="4" maxlength="5"></li>
                                                <li> + </li>
                                            </ul>
                                            <div class="price">합계 <span><strong>18,000</strong>원</span></div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2">
                                            <div class="goods_info_right_payment">
                                                <img src="../img/btns/btn_buy.gif" alt="">
                                                <img src="../img/btns/btn_cart.gif" alt="">
                                                <img src="../img/btns/btn_wish.gif" alt="">
                                                <ul class="goods_info_right_banner">
                                                    <li><a href=""><img src="../img/banner/goods_banner_03.jpg" alt=""></a></li>
                                                    <li><a href=""><img src="../img/banner/goods_banner_02.jpg" alt=""></a></li>
                                                    <li><a href=""><img src="../img/banner/goods_banner_01.jpg" alt=""></a></li>
                                                </ul>
                                            </div>
                                            
                                        </td>
                                    </tr>
                                </table>
                            </form>
                        </li>
                    </ul>



                </div>
            </div>

            <div class="goods_minishop">
                <article>
                    <div class="goods_minishop line"></div>
                    <div class="goods_minishop shop">
                        <ul>
                            <li>
                                <dl class="goods_minishop shop_first">
                                    <dt>Dmall 가나다쇼핑</dt>
                                    <dd>상품만족도 ♥♥♥♡♡ <span>22</span></dd>
                                </dl>
                                <dl class="goods_minishop shop_second">
                                    <dt><img src="../img/goods/minishop_logo.gif" alt=""></dt>
                                    <dd>판매상품수 <span>7,029</span> 개<br>
                                        할인상품수 <span>3</span> 개</dd>
                                </dl>
                            </li>
                            <li>
                                <a href="#"><img src="../img/btns/minishop_btn01.gif" alt=""></a>
                            </li>
                        </ul>
                        <div class="goods_minishop slider">
                            <div>
                                <a href="">
                                    <dl>
                                        <dt>
                                            <img src="../img/goods/goods_minishop_slider_01.gif" alt="">
                                        </dt>
                                        <dd>
                                            <p>[Dmall] 멀티박스</p>
                                            <p><strong> 1,000</strong>원</p>
                                        </dd>
                                    </dl>
                                </a>
                                <a href="">
                                    <dl>
                                        <dt>
                                            <img src="../img/goods/goods_minishop_slider_01.gif" alt="">
                                        </dt>
                                        <dd>
                                            <p>[Dmall] 멀티박스</p>
                                            <p><strong> 1,000</strong>원</p>
                                        </dd>
                                    </dl>
                                </a>
                                <a href="">
                                    <dl>
                                        <dt>
                                            <img src="../img/goods/goods_minishop_slider_01.gif" alt="">
                                        </dt>
                                        <dd>
                                            <p>[Dmall] 멀티박스</p>
                                            <p><strong> 1,000</strong>원</p>
                                        </dd>
                                    </dl>
                                </a>
                                <a href="">
                                    <dl>
                                        <dt>
                                            <img src="../img/goods/goods_minishop_slider_01.gif" alt="">
                                        </dt>
                                        <dd>
                                            <p>[Dmall] 멀티박스</p>
                                            <p><strong> 1,000</strong>원</p>
                                        </dd>
                                    </dl>
                                </a>
                                <a href="">
                                    <dl>
                                        <dt>
                                            <img src="../img/goods/goods_minishop_slider_01.gif" alt="">
                                        </dt>
                                        <dd>
                                            <p>[Dmall] 멀티박스</p>
                                            <p><strong> 1,000</strong>원</p>
                                        </dd>
                                    </dl>
                                </a>
                            </div>
                            <div class="goods_minishop btns">
                                <ul>
                                    <li></li>
                                    <li></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    
                </article>
            </div>

            <div class="goods_detail">
                <article>
                    <div class="goods_detail tabs">
                        <ul>
                            <li class="on"><a href=""></a></li>
                            <li><a href=""></a></li>
                            <li><a href="">(일반 <span>16</span>)</a></li>
                            <li><a href="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(<span>5</span>)</a></li>
                            <li><a href=""></a></li>
                        </ul>    
                    </div>
                    <div class="goods_detail wrap">
                        <ul>
                            <li><a href=""><img src="../img/goods/goods_detail_01.jpg" alt=""></a></li>
                            <li><a href=""><img src="../img/goods/goods_detail_02.jpg" alt=""></a></li>
                            <li><a href=""><img src="../img/goods/goods_detail_03.jpg" alt=""></a></li>
                            <li><a href=""><img src="../img/goods/goods_detail_04.jpg" alt=""></a></li>
                        </ul>
                        <h3>상품정보 제공고시</h3>
                        <table>
                            <tr>
                                <td>품명및모델명</td>
                                <td>${goods.goods_name}</td>
                            </tr>
                            <tr>
                                <td>구성품</td>
                                <td>상세페이지참고</td>
                            </tr>
                            <tr>
                                <td>크기</td>
                                <td>20cm 두께 2.1mm</td>
                            </tr>
                            <tr>
                                <td>동일모델의 출시년월</td>
                                <td>2012년 11월</td>
                            </tr>
                            <tr>
                                <td>제조자, 수입품의 경우 수입자를 함께 표기</td>
                                <td>${goods.goods_manufacturer}</td>
                            </tr>
                            <tr>
                                <td>제조국</td>
                                <td>독일</td>
                            </tr>
                            <tr>
                                <td>품질보증기준</td>
                                <td>공정거래위원회고시 소비자분쟁해결기준에 의거함</td>
                            </tr>
                            <tr>
                                <td>A/S 책임자와 전화번호</td>
                                <td>${goods.goods_callcenter}</td>
                            </tr>
                        </table>
                        <div class="goods_detail main">
                            <img src="../img/goods/${goods.goods_detail}" alt="">
                        </div>
                        <div class="goods_detail return">
                            <h3>반품정보</h3>
                            <table>
                                <tr>
                                    <td>반품배송지</td>
                                    <td>가나다라마바사</td>
                                </tr>
                            </table>
                        </div>
                    </div>

                    <div class="goods_detail tabs">
                        <ul>
                            <li><a href=""></a></li>
                            <li class="on"><a href=""></a></li>
                            <li><a href="">(일반 <span>16</span>)</a></li>
                            <li><a href="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(<span>5</span>)</a></li>
                            <li><a href=""></a></li>
                        </ul>    
                    </div>
                    <div class="goods_detail related">
                        <ul>
                            <li><img src="../img/goods/goods_related_01.gif" alt=""><br>
                                [다이소] 20cm 후라이팬(불소코팅) - 56754<br>
                            <span>3,000</span>원
                            </li>
                            <li><img src="../img/goods/goods_related_01.gif" alt=""><br>
                                [다이소] 20cm 후라이팬(불소코팅) - 56754<br>
                            <span>3,000</span>원
                            </li>
                            <li><img src="../img/goods/goods_related_01.gif" alt=""><br>
                                [다이소] 20cm 후라이팬(불소코팅) - 56754<br>
                            <span>3,000</span>원
                            </li>
                            <li><img src="../img/goods/goods_related_01.gif" alt=""><br>
                                [다이소] 20cm 후라이팬(불소코팅) - 56754<br>
                            <span>3,000</span>원
                            </li>
                            <li><img src="../img/goods/goods_related_01.gif" alt=""><br>
                                [다이소] 20cm 후라이팬(불소코팅) - 56754<br>
                            <span>3,000</span>원
                            </li>
                            <li><img src="../img/goods/goods_related_01.gif" alt=""><br>
                                [다이소] 20cm 후라이팬(불소코팅) - 56754<br>
                            <span>3,000</span>원
                            </li>
                        </ul>
                    </div>   
                    
                    <div class="goods_detail tabs">
                        <ul>
                            <li><a href=""></a></li>
                            <li><a href=""></a></li>
                            <li class="on"><a href="">(일반 <span>16</span>)</a></li>
                            <li><a href="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(<span>5</span>)</a></li>
                            <li><a href=""></a></li>
                        </ul>    
                    </div>
                    <div class="goods_detail reviews">
                        <h3>프리미엄 상품평</h3>
                        <table>
                            <tr>
                                <th>상품평</th>
                                <th>작성자/작성일</th>
                                <th>조회수/댓글수</th>
                                <th>평가</th>
                            </tr>
                            <tr>
                                <td>
                                    <dl>
                                        <dt><img src="../img/goods/goods_main_01.gif" alt=""></dt>
                                        <dd><p>[Dmall] 이동식 스마트 빨래바구니 35L</p><br>
                                        <span>좋습니다</span></dd>
                                    </dl>
                                </td>
                                <td>현**<br>
                                2019-03-10</td>
                                <td>조회 0 <br>
                                추천 0</td>
                                <td>♡♡♡♡♡ <br>
                                <span>100</span>%</td>
                            </tr>
                        </table>
                    </div> 
                    
                    <div class="goods_detail tabs">
                        <ul>
                            <li><a href=""></a></li>
                            <li><a href=""></a></li>
                            <li><a href="">(일반 <span>16</span>)</a></li>
                            <li class="on"><a href="">&nbsp;&nbsp;&nbsp;(<span>5</span>)</a></li>
                            <li><a href=""></a></li>
                        </ul>    
                    </div>
                    <div class="goods_detail qna">
                        <h3>상품 Q&A
                        	<span>
                        		상품문의/상품후기/배송관련 궁금사항이 있으시면 언제든 질문해 주세요. 빠르게 답변드리기위해 최선을 다하겠습니다.
                        	</span>
                        </h3>
                        <table>
                            <tr>
                                <th>제목</th>
                                <th>작성자</th>
                                <th>작성일</th>
                                <th>상태</th>
                            </tr>
                            <tr>
                                <td>
                                    <img src="../img/icon/question_img.png" alt="">
                                    <span>주소 변경요</span></td>
                                <td>현**</td>
                                <td>2019.01.10</td>
                                <td><span></span></td>
                            </tr>
                            <tr>
                                <td>
                                    <img src="../img/icon/question_img.png" alt="">
                                    <span>[배송] 재질은 뭔가요?</span></td>
                                <td>김**</td>
                                <td>2019.03.10</td>
                                <td><span></span></td>
                            </tr>
                        </table>
                    </div> 
                    
                    <div class="goods_detail tabs">
                        <ul>
                            <li><a href=""></a></li>
                            <li><a href=""></a></li>
                            <li><a href="">(일반 <span>16</span>)</a></li>
                            <li><a href="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(<span>5</span>)</a></li>
                            <li class="on"><a href=""></a></li>
                        </ul>
                    </div>
                    <div class="goods_detail notice">
                        <img src="../img/detail_notice.jpg" alt="">
                    </div>              
                </article>
            </div>
        </article>
    </div>
</section>

<%@ include file="../_footer.jsp"%>