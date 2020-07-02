function validateForm() {
    var retVal = true;
    var userNumber = document.getElementById('userNumber');
    var userNumber_Error = document.getElementById('userNumber_Error');

    var userName = document.getElementById('userName');
    var userName_Error = document.getElementById('userName_Error');

    var partial = document.getElementById('partial');
    var full = document.getElementById('full');
    //--- TODO: escrever o código em falta aqui...

    //User Number
    if (userNumber.value.trim().length < 10000) {
        if (userNumber_Error.classList.contains("no_error"))
            userNumber_Error.classList.remove("no_error");

        if (!userNumber_Error.classList.contains("error"))
            userNumber_Error.classList.add("error");
        retVal = false;
    }

    else {
        if (userNumber_Error.classList.contains("error"))
            userNumber_Error.classList.remove("error");

        if (!userNumber_Error.classList.contains("no_error"))
            userNumber_Error.classList.add("no_error");
    }
    //User Name
    if (userName.value.trim().length < 15) {
        if (userName_Error.classList.contains("no_error"))
            userName_Error.classList.remove("no_error");

        if (!userName_Error.classList.contains("error"))
            userName_Error.classList.add("error");
        retVal = false;
    }
    else {
        if (userName_Error.classList.contains("error"))
            userName_Error.classList.remove("error");

        if (!userName_Error.classList.contains("no_error"))
            userName_Error.classList.add("no_error");
    }
    alert(retVal);
    return retVal;
}
function clearErrorMessages() {
    //--- TODO: escrever o código em falta aqui...


}