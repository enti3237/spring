<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>dmall에 방문해주셔서 감사합니다.</title>
    <link rel="stylesheet" href="/dmall/css/style_common.css">
    <link rel="stylesheet" href="/dmall/css/style_header.css">
    <link rel="stylesheet" href="/dmall/css/style_aside.css">
    <link rel="stylesheet" href="/dmall/css/style_footer.css">
</head>
<body>
    <header>
        <div class="header_top">
            <article>
                <ul>
                    <li><a href="/dmall/shop/goods?goods_id=1"><img src="/dmall/img/banner/header_top_1.jpg" alt="올리빙스탠드옷걸이"></a></li>
                    <li><a href="/dmall/shop/goods?goods_id=2"><img src="/dmall/img/banner/header_top_2.jpg" alt="쓰레기비닐봉투"></a></li>
                    <li><a href="/dmall/shop/goods?goods_id=3"><img src="/dmall/img/banner/header_top_3.jpg" alt="벽걸이"></a></li>
                    <li><a href="/dmall/shop/goods?goods_id=4"><img src="/dmall/img/banner/header_top_4.jpg" alt="코털제거기"></a></li>
                </ul>
            </article>
            <span class="header_top_close"></span>
        </div>
        <div class="header_menu">
            <article>
                <ul>
	                <c:choose>
						<c:when test="${member eq null}">
							<li><a href="/dmall/member/login">로그인</a></li>
		                    <li><a href="/dmall/member/join_select">회원가입</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="/dmall/mypage/mypage">환영합니다 ${member.name}님!<img src="/dmall/img/btns/my_shopping.png" alt="나의쇼핑정보"></a></li>
							<li><a href="/dmall/member/logout">로그아웃</a></li>
						</c:otherwise>
					</c:choose>
                    <li><a href="">장바구니</a></li>
                    <li><a href="">고객센터</a></li>
                </ul>
            </article>
        </div>
        <div class="header_search">
            <article>
                <div class="logo">
                    <a href="/dmall/index"><img src="/dmall/img/shop_logo.gif" alt="LOGO"></a>
                </div>
                <div class="search">
                    <form action="#" name="search_form" method="GET">
                        <input type="text" placeholder="" />
                        <button></button>
                    </form>
                </div>
                <div>
                    <ul>
                        <li><a href="#"><img src="/dmall/img/banner/header_search_01.jpg" alt=""></a></li>
                        <li><a href="#"><img src="/dmall/img/banner/header_search_02.jpg" alt=""></a></li>
                        <li><a href="#"><img src="/dmall/img/banner/header_search_03.png" alt=""></a></li>
                    </ul>
                </div>
            </article>
        </div>
        <nav class="header_category">
            <article>
                <div class="categorys">
                    <ul>
                        <li><a href="#"><img src="/dmall/img/menu/header_new_menu01.png" alt="오늘의딜"></a></li>
                        <li><a href="#"><img src="/dmall/img/menu/header_new_menu02.png" alt="다이소"></a></li>
                        <li><a href="#"><img src="/dmall/img/menu/header_new_menu03.png" alt="수납/정리"></a></li>
                        <li><a href="#"><img src="/dmall/img/menu/header_new_menu04.png" alt="주방/욕실/청소"></a></li>
                        <li><a href="#"><img src="/dmall/img/menu/header_new_menu05.png" alt="가구/인테리어"></a></li>
                        <li><a href="#"><img src="/dmall/img/menu/header_new_menu06.png" alt="사무/문구/디지털"></a></li>
                        <li><a href="#"><img src="/dmall/img/menu/header_new_menu07.png" alt="가전/레저"></a></li>
                        <li><a href="#"><img src="/dmall/img/menu/header_new_menu08.png" alt="유아동/미용/패션"></a></li>
                   </ul>
	            </div>
              </article>
            <!-- 
            <div class="total_cate_box hidden">
                <article>
                    <table>
                        <tr></tr>
                    </table>
                    <span class="total_cate_close"><img src="" alt=""></span>
                </article>
            </div> 
            -->
        </nav>
    </header>

