<%@include file="layout/header.jsp"%>

 <div class="container">
     <c:forEach var="board" items="${boards}">
        <div class="card m-2">
            <div class="card-body">
                <h4 class="card-title">${board.title}</h4>
                <p class="card-text">Contents</p>
            </div>
        </div>
     </c:forEach>
</div>

<%@ include file="layout/footer.jsp"%>