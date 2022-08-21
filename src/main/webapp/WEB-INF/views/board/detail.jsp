<%@include file="../layout/header.jsp"%>

 <div class="container">
     <button class="btn btn-secondary" onclick="history.back()">return</button>
     <button id = "btn-edit" class="btn btn-warning">edit</button>
     <button id = "btn-delete" class="btn btn-danger">delete</button>
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
 </div>

<script src = "/js/user/board.js"></script>
<%@ include file="../layout/footer.jsp"%>