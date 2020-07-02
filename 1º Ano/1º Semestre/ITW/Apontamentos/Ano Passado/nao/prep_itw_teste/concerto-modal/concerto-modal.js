$(document).ready(function () {
    $("form").submit(function () {
        var retVal = true;
        var max = 0;
        //--- remove todos os erros antigos.
        $("#myModal ul").empty();
        for (var i = 1; i <= $('input[type="checkbox"]').length; i++) {
            var elementName = "#inputOption" + i;
            if ($(elementName).prop('checked')) {
                max = Math.max($(elementName).val(), max);
            }
        }
        $("#maxValue").val(max);
        if ($('#inputName').val().length < 3 || $('#inputName').val().length > 100) {
            $("#myModal ul").append('<li>O nome deve ter entre 3 e 100 letras.</li>');
            retVal = false;
        }
        if ($('#inputAddress').val().length < 20 || $('#inputAddress').val().length > 200) {
            $("#myModal ul").append('<li>A morada deve ter entre 20 e 200 letras.</li>');
            retVal = false;
        }
        if ($('#inputEmail').val().length < 10 || $('#inputEmail').val().length > 100 ||
            $('#inputEmail').val().indexOf('@') == -1) {
            $("#myModal ul").append('<li>O e-mail deve ter entre 10 e 100 letras e possuir o caracter @.</li>');
            retVal = false;
        }
       if ($('input[type="checkbox"]:checked').length < 2){
            $("#myModal ul").append('<li>Deverá escolher, pelo menos, 2 opções.</li>');
           retVal = false;
       }
       if (retVal == false) $("#myModal").modal();
        return retVal;
    });

    $('input[type="checkbox"]').click(function () {
        var max = 0;
        for (var i = 1; i <= $('input[type="checkbox"]').length; i++) {
            var elementName = "#inputOption" + i;
            if ($(elementName).prop('checked')) {
                max = Math.max($(elementName).val(), max);
            }
        }
        $("#maxValue").val(max);
    });
});