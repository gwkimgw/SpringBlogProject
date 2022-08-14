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
            url: "/blog/api/user",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json"
        }).done(function(resp){
            alert("member joined");
            console.log(resp)
            location.href = "/blog";
        }).fail(function(error){
            alert(JSON.stringify(error));
        });
    }
}

index.init();