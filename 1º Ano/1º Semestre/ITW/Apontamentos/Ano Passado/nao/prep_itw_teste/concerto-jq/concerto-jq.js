$(document).ready(function () {
    $("form").submit(function () {
        var retVal = true;
        var max = 0;
        for (var i = 1; i <= $('input[type="checkbox"]').length; i++) {
            var elementName = "#inputOption" + i;
            if ($(elementName).prop('checked')) {
                max = Math.max($(elementName).val(), max);
            }
        }
        $("#maxValue").val(max);
        if ($('#inputName').val().length < 3 || $('#inputName').val().length > 100) {
            retVal = false;
            if ($('#inputNameError').hasClass("hidden"))
                $('#inputNameError').removeClass("hidden")
        }
        else {
            if (!$('#inputNameError').hasClass("hidden"))
                $('#inputNameError').addClass("hidden")
        }
        if ($('#inputAddress').val().length < 20 || $('#inputAddress').val().length > 200) {
            retVal = false;
            if ($('#inputAddressError').hasClass("hidden"))
                $('#inputAddressError').removeClass("hidden")
        }
        else {
            if (!$('#inputAddressError').hasClass("hidden"))
                $('#inputAddressError').addClass("hidden")
        }
        if ($('#inputEmail').val().length < 10 || $('#inputEmail').val().length > 100 ||
            $('#inputEmail').val().indexOf('@') == -1) {
            retVal = false;
            if ($('#inputEmailError').hasClass("hidden"))
                $('#inputEmailError').removeClass("hidden")
        }
        else {
            if (!$('#inputEmailError').hasClass("hidden"))
                $('#inputEmailError').addClass("hidden")
        }
       if ($('input[type="checkbox"]:checked').length < 2)
            retVal = false;
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