$(document).ready(function () {
    $("form").submit(function (event) {
        var retval = true;
        $(".modal").on("hidden.bs.modal", function () {
            $(".modal-body ul").html("");
        });

        if ($.trim($('#nome').val()).length < 10 || $.trim($('#nome').val()).length >= 100) {
            retval = false;
            $(".modal-body ul").append('<li>The First Name should have, at least, 10 chars and 100 chars tops!</li>');
            //alert(retval);
        }

        if ($.trim($('#morada').val()).length < 20 || $.trim($('#morada').val()).length >= 200) {
            retval = false;
            $(".modal-body ul").append('<li>The Adress should have, at least, 20 chars and, 200 chars tops!</li>');
            //alert(retval);
        }

        if ($.trim($('#email').val()).length < 10 || $.trim($('#email').val()).length >= 100 | $("#email").val().indexOf("@") > $("#email").val().indexOf(".")) {
            retval = false;
            $(".modal-body ul").append('<li>Linha de texto com um mínimo de 10 caracteres  e máximo de 100; Deve possuir o caracter @ e um ponto depois e antes do final!</li>');
            //alert(retval);
        }

        var checked = $("input[type='checkbox']:checked").length;
        if (checked < 2) {
            retval = false;
            $(".modal-body ul").append('<li>Escolher, pelo menos, dois locais!</li>');
        }
        
        if (retval == false) {
            $('#myModal').modal('show');
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