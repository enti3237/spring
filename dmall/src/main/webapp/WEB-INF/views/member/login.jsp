<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp"%>
<link rel="stylesheet" href="/dmall/css/style_member.css">

<section>
    <div class="login">
        <article>
            <div class="login_container">
                <h2><img src="/dmall/img/member/daiso_login_title.gif" alt=""></h2>
                <div class="login_container box">
                    <ul>
                        <li class="login_container left">
                            <div>
                                <ol>
                                    <li><input type="radio"> 회원</li>
                                    <li><input type="radio"> 비회원(주문조회)</li>
                                </ol>
                                <form action="/dmall/member/login" method="post">
	                                <div class="login_container table">
	                                    <table>
	                                        <tr>
	                                            <td><input type="text" name="id" required placeholder="아이디 입력" autocomplete="off" /></td>
	                                            <td rowspan="3">
	                                            	<div class="loginButton">
	                                                	<input type="image" src="/dmall/img/btns/login_button.gif" alt="로그인버튼" onclick="CheckFormPwSubmit(this.form); return false;"/>
	                                            	</div>
		                                        </td>
	                                        </tr>
	                                        <tr>
	                                            <td></td>
	                                        </tr>
	                                        <tr>
	                                            <td><input type="text" name="pass" required placeholder="비밀번호 입력" /></td>
	                                        </tr>
	                                    </table>
	                                </div>
                                </form>
                                <div class="idsave">
                                    <input type="checkbox">아이디저장
                                </div>
                            </div>
                        </li>

                        <li class="login_container right">
                            <div>
                                <table>
                                    <tr>
                                        <td>아직 Dmall 회원이 아니신가요?<br>
                                            회원가입 하시고 <em>다양한 혜택</em>을 받으세요.
                                        </td>
                                        <td>
                                            <a href="">
                                                <img src="/dmall/img/btns/login_button01.gif" alt="">
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2"></td>
                                    </tr>
                                    <tr>
                                        <td><em>아이디</em>와 <em>비밀번호</em>를 잊으셨나요?</td>
                                        <td>
                                            <a href="">
                                                <img src="/dmall/img/btns/login_button02.gif" alt="">
                                            </a>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </li>

                        <li class="login_container bottom">
                            <span>SNS 간편로그인</span>
                            <div class="sns-login">
                                <a href="" data-href="naver" class="naver"><img src="/dmall/img/btns/login_naver.jpg" alt="네이버로그인"></a>
                                <a href="" data-href="kakao" class="kakao"><img src="/dmall/img/btns/login_kakao.jpg" alt="카카오로그인"></a>
                            </div>
                        </li>
                    </ul>
                </div>
                <div class="login_container banner">
                    <a href=""><img src="/dmall/img/banner/login_banner.jpg" alt=""></a>
                </div>
            </div>
        </article>
    </div>


</section>

<%@ include file="../_footer.jsp"%>