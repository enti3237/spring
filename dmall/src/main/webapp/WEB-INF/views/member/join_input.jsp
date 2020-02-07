<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp"%>
<link rel="stylesheet" href="/dmall/css/style_member.css">

<section>
<form action="/dmall/member/join_input" method="post">
    <div class="join_input">
        <article>
            <div class="join">
                <h4>필수 입력</h4>
                <div>
                    <ul>
                        <li>
                            <label>휴대폰번호</label>
                            <input type="text" placeholder="휴대폰" maxlength="11" name="hp">
                            <p class="alert">휴대폰 번호를 입력해주세요.</p>
                        </li>
                        <li>
                            <label>이름</label>
                            <input type="text" placeholder="이름" maxlength="11" name="name">
                            <p>이름을 입력해주세요.</p>
                        </li>
                        <li>
                            <label>아이디</label>
                            <input type="text" placeholder="아이디" maxlength="11" name="id">
                            <p>아이디를 입력해주세요.</p>
                        </li>
                        <li>
                            <label>비밀번호(영문+숫자6~16자)</label>
                            <input type="text" placeholder="비밀번호 (영문+숫자6~16자)" maxlength="11" name="pass">
                        </li>
                        <li>
                            <label>비밀번호 재입력</label>
                            <input type="text" placeholder="비밀번호 재입력" maxlength="11" name="pass2">
                        </li>
                    </ul>
                </div>
            </div>
            <div class="birth">
                <h4>선택 입력</h4>
                <div>
                    <label>생년월일(예:19801231)</label>
                    <input type="text" placeholder="생년월일(예:19801231)" maxlength="8" name="birth">
                </div>
            </div>
            <div class="agree">
                <div>
                    <h4><input type="checkbox"> 다이소몰 전체 이용약관 동의(선택동의 포함)</h4>
                    <ul>
                        <li><input type="checkbox"> 만 14세 이상입니다. <span>(필수)</span></li>
                        <li><input type="checkbox"> 이용약관 동의 <span>(필수)</span></li>
                        <li><input type="checkbox"> 개인정보 수집 및 이용 동의 <span>(필수)</span></li>
                        <li><input type="checkbox"> 개인정보 수집 및 이용 및 마케팅 정보 수신 동의 (선택)</li>
                    </ul>
                    <div>
                        <ul>
                            <li><input type="checkbox"> 이메일</li>
                            <li><input type="checkbox"> 문자(SMS)</li>
                            <li><input type="checkbox"> 전화</li>
                        </ul>
                    </div>
                    <p>광고정보 수신동의를 하시면 상품 및 이벤트 정보를 받으실 수 있습니다.</p>
                </div>
            </div>
            <strong>＊ 선택 수집되는 정보에 대한 동의는 거부하실 수 있으며, 
                거부하시더라도 회원가입등 기본 서비스 이용에는 제한을 받지 않습니다.</strong>
            <button type="submit" class="join_btn">가입하기</button>
        </article>
    </div>
</form>

</section>

<%@ include file="../_footer.jsp"%>