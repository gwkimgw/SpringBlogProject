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
        $.ajax().done().fail();
    }
}

index.init();