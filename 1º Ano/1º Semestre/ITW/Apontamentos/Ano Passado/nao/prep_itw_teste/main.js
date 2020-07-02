$("document").ready(function () {
   $("form").submit(function () {
       $("#name_erro").attr("class","hidden");
       $("#morada_erro").attr("class","hidden");
       $("#email_erro").attr("class","hidden");
       $("#local_erro").attr("class","hidden");
       var retVal = true;
       if ($("input:checkbox:checked").length <= 1) {
           $("#local_erro").attr("class","visible");
           retVal = false;
       }
       if ($("#name") < 10 || $("#name") > 100) {
           $("#name_erro").attr("class","visible");
           retVal = false;
       }
       if ($("#email").val().length < 10 || $("#email").val().indexOf("@") == -1) {
           $("#email_erro").attr("class","visible");
           retVal = false;
       }
       return retVal;
   });
        $(".check").change(function() {
            var selected = [];
            $("input:checkbox:checked").each(function (){
                selected.push(parseInt($(this).val()));
            });
            if (selected.length <= 0) {
                $("#preco").val("0 euros")
            }
            else {
                $("#preco").val(Math.max.apply(null,selected) + " euros");
            }
        });
        
});
