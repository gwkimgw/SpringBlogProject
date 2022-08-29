<%@include file="../layout/header.jsp"%>

 <div class="container">
     <button class="btn btn-secondary" onclick="history.back()">return</button>
     <c:if test="${board.user.id == principal.user.id}">
         <a href="/board/${board.id}/updateForm" class="btn btn-warning">Edit</a>
         <button id = "btn-delete" class="btn btn-danger">Delete</button>
     </c:if>
     <br/><br/>
     <div>
         article number: <span id="id"><i>${board.id} </i></span>
         writer: <span><i>${board.user.username} </i></span>
     </div>
     <br/>
     <div class="form-group">
         <h3>${board.title}</h3>
     </div>
     <hr/>
     <div class="form-group">
         <div>
             ${board.content}
         </div>
     </div>
     <hr/>
     <div class="card">
         <input type="hidden" id="userId" value="${principal.user.id}"/>
         <input type="hidden" id="boardId" value="${board.id}"/>
         <form>
             <div class="card-body">
                 <textarea id="reply-content" class="form-control" rows="1"></textarea>
             </div>
             <div type="button" id="btn-reply-save" class="card-footer"><button class="btn btn-primary">Submit</button></div>
        </form>
     </div>
     <br/>
     <div class="card">
         <div class="card-header">Comment list</div>
         <ul id="comment--box" class="list-group">
             <c:forEach var="reply" items="${board.replies}">
                 <li id="comment--${reply.id}" class="list-group-item d-flex justify-content-between">
                     <div>${reply.content}</div>
                     <div class="d-flex">
                         <div class="font-italic">Writer: ${reply.user.username} &nbsp</div>
                         <button onclick="index.replyDelete(${board.id}, ${reply.id})" class="badge">Delete</button>
                     </div>
                 </li>
             </c:forEach>
         </ul>
     </div>
 </div>

<script src = "/js/user/board.js"></script>
<%@ include file="../layout/footer.jsp"%>