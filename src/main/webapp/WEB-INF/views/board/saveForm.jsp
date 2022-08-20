<%@include file="../layout/header.jsp"%>

 <div class="container">
     <form>
         <div class="form-group">
             <label for="title">Title:</label>
             <input type="text" class="form-control" placeholder="Enter Title" id="title">
         </div>
         <div class="form-group">
             <label for="content">Comment:</label>
             <textarea class="form-control summernote" rows="5" id="content"></textarea>
         </div>
     </form>
     <button id="btn-save" class="btn btn-primary">Save</button>
 </div>
<script>
    $('.summernote').summernote({
        placeholder: 'Hello Bootstrap 4',
        tabsize: 2,
        height: 300
    });
</script>
<%@ include file="../layout/footer.jsp"%>