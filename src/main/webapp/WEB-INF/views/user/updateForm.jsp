<%@include file="../layout/header.jsp"%>

<div class="container">
    <form>
        <input type="hidden" id="id" value="${principal.user.id}">
        <div class="form-group">
            <label for="username">Username:</label>
            <input type="username" value="${principal.user.username}" class="form-control" placeholder="Enter username" id="username" readonly>
        </div>
        <div class="form-group">
            <label for="email">Email address:</label>
            <input type="email" value="${principal.user.email}" class="form-control" placeholder="Enter email" id="email" readonly>
        </div>
        <c:if test="${empty principal.user.oauth}">
            <div class="form-group">
                <label for="pwd">Password:</label>
                <input type="password" value="${principal.user.password}"class="form-control" placeholder="Enter password" id="pwd">
            </div>
        </c:if>
    </form>
    <button id="btn-edit" class="btn btn-primary">Edit</button>
</div>

<script src = "/js/user/user.js"></script>
<%@ include file="../layout/footer.jsp"%>