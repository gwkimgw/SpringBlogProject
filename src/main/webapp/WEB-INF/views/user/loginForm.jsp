<%@include file="../layout/header.jsp"%>

<div class="container">
    <form action="/auth/loginProc" method="post">
        <div class="form-group">
            <label for="username">Username:</label>
            <input type="username" name="username" class="form-control" placeholder="Enter username" id="username">
        </div>
        <div class="form-group">
            <label for="pwd">Password:</label>
            <input type="password" name="password" class="form-control" placeholder="Enter password" id="pwd">
        </div>
<%--        <div class="form-group form-check">--%>
<%--            <label class="form-check-label">--%>
<%--                <input class="form-check-input" name="remember" type="checkbox"> Remember me--%>
<%--            </label>--%>
<%--        </div>--%>
        <button id="btn-login" class="btn btn-primary">Login</button>
        <a href="https://kauth.kakao.com/oauth/authorize?client_id=a82e347d7343d944350ad9303dece3ad&redirect_uri=http://localhost:8000/auth/kakao/callback&response_type=code">
            <img height="38" src="/image/kakao_login_btn.png" /></a>
    </form>
</div>

<script src = "/js/user/user.js"></script>
<%@ include file="../layout/footer.jsp"%>