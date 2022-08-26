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
         <div class="card-body"><textarea class="form-control" rows="1"></textarea></div>
         <div class="card-footer"><button class="btn btn-primary">Submit</button></div>
     </div>
     <br/>
     <div class="card">
         <div class="card-header">Comment list</div>
         <ul id="comment--box" class="list-group">
            <li id="comment--1" class="list-group-item d-flex justify-content-between">
                <div>Comment</div>
                <div class="d-flex">
                    <div class="font-italic">User &nbsp;</div>
                    <button class="badge">Delete</button>
                </div>
            </li>
         </ul>
     </div>
 </div>

<script src = "/js/user/board.js"></script>
<%@ include file="../layout/footer.jsp"%>