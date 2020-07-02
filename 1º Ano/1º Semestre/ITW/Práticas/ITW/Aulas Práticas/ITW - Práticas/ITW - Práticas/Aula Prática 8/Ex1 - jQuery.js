$(document).ready(function () {
    $("form").submit(function (event) {
        var retval = true;
        if ($.trim($('#nome').val()).length < 10 || $.trim($('#nome').val()).length >= 100) {
            retval = false;
            $("#nome_Error").show();
            //alert(retval);
        }
        else {
            $("#nome_Error").hide();
            //alert(retval);
        }

        if ($.trim($('#morada').val()).length < 20 || $.trim($('#morada').val()).length >= 200) {
            retval = false;
            $("#morada_Error").show();
            //alert(retval);
        }
        else {
            $("#morada_Error").hide();
            //alert(retval);
        }

        if ($.trim($('#email').val()).length < 10 || $.trim($('#email').val()).length >= 100 | $("#email").val().indexOf("@") > $("#email").val().indexOf(".")) {
            retval = false;
            $("#email_Error").show();
            //alert(retval);
        }
        else {
            $("#email_Error").hide();
            //alert(retval);
        }

        var checked = $("input[type='checkbox']:checked").length;
        if (checked < 2) {
            retval = false;
            $("#local_Error").show();
        }
        else {
            $("#local_Error").hide();
        }
        return retval;
    });
    $("#localX").click(function () {
        var num;
        var value = 0;
        $('input:checkbox').each(function () {
            if ($(this).is(':checked'))
                if (parseInt($(this).val()) > value) {
                    value = parseInt($(this).val());

                }
            return value;
        });
        $("input:text[name=Valor_a_pagar]").val(String(value));
        console.log(value);
        //console.log(valMax);
    });
});