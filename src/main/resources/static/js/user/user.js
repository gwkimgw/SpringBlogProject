let index  = {
    init: function(){
        $("#btn-save").on("click", ()=>{
            this.save();
        });
        $("#btn-edit").on("click", ()=>{
            this.update();
        });
        // $("#btn-login").on("click", ()=>{
        //     this.login();
        // });
    },

    save: function() {
        // alert('user save called');
        let data = {
            username: $("#username").val(),
            password: $("#pwd").val(),
            email: $("#email").val()
        }

        // console.log(data);
        $.ajax({
            type: "POST",
            url: "/auth/joinProc",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json"
        }).done(function (resp) {
            if(resp.status==500){
                alert("member join failed");
            } else {
                console.log(resp)
                location.href = "/";
            }
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },

    update: function() {
        let data = {
            id: $("#id").val(),
            username: $("#username").val(),
            password: $("#pwd").val(),
            email: $("#email").val()
        }

        $.ajax({
            type: "PUT",
            url: "/user",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json"
        }).done(function (resp) {
            alert("member info edited");
            console.log(resp)
            location.href = "/";
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },

    // login: function(){
    //     // alert('user save called');
    //     let data = {
    //         username: $("#username").val(),
    //         password: $("#pwd").val()
    //     }
    //
    //     // console.log(data);
    //     $.ajax({
    //         type: "POST",
    //         url: "/api/login",
    //         data: JSON.stringify(data),
    //         contentType: "application/json; charset=utf-8",
    //         dataType: "json"
    //     }).done(function(resp){
    //         alert("login success");
    //         console.log(resp)
    //         location.href = "/";
    //     }).fail(function(error){
    //         alert(JSON.stringify(error));
    //     });
    // }
}

index.init();