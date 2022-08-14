let index  = {
    init: function(){
        $("#btn-save").on("click", ()=>{
            this.save();
        });
    },

    save: function(){
        // alert('user save called');
        let data = {
            username: $("#username").val(),
            password: $("#pwd").val(),
            email: $("#email").val()
        }

        // console.log(data);
        $.ajax({
            type: "POST",
            url: "/api/user",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json"
        }).done(function(resp){
            alert("member joined");
            location.href = "/blog";
        }).fail(function(){
            alert(JSON.stringify(error));
        });
    }
}

index.init();