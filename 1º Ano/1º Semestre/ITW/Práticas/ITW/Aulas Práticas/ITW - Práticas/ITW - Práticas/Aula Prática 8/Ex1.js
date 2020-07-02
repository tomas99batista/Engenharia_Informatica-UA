function validateForm() {
    var retval = true;

    //Nome
    var nome = document.getElementById("nome");
    var nome_Error = document.getElementById("nome_Error");
    if ((nome.value.trim().length <= 10) || (nome.value.trim().length >= 100)) {
        if (nome_Error.classList.contains("no_error"))
            nome_Error.classList.remove("no_error");
        if (!nome_Error.classList.contains("error"))
            nome_Error.classList.add("error");
        retval = false;
    }
    else {
        if (nome_Error.classList.contains("error"))
            nome_Error.classList.remove("error");
        if (!nome_Error.classList.contains("no_error"))
            nome_Error.classList.add("no_error");
    }

    //Morada
    var morada = document.getElementById("morada");
    var morada_Error = document.getElementById("morada_Error");
    if ((morada.value.trim().length <= 20) || (morada.value.trim().length >= 200)) {
        if (morada_Error.classList.contains("no_error"))
            morada_Error.classList.remove("no_error");
        if (!morada_Error.classList.contains("error"))
            morada_Error.classList.add("error");
        retval = false;
    }
    else {
        if (morada_Error.classList.contains("nerror"))
            morada_Error.classList.remove("nerror");
        if (!morada_Error.classList.contains("no_error"))
            morada_Error.classList.add("no_error");
    }

    //Email
    var email = document.getElementById("email");
    var email_Error = document.getElementById("email_Error");
    if (email.value.trim().length <= 10 || email.value.trim().length >= 100 || email.value.indexOf("@") > email.value.indexOf(".")) {
        if (email_Error.classList.contains("no_error"))
            email_Error.classList.remove("no_error");
        if (!email_Error.classList.contains("error"))
            email_Error.classList.add("error");
        retval = false;
    }
    else {
        if (email_Error.classList.contains("error"))
            email_Error.classList.remove("error");
        if (!email_Error.classList.contains("no_error"))
            email_Error.classList.add("no_error");
    }

    //Local
    var num;
    var count = 0;
    for (num = 1; num <= 4; num++) {
        if (document.getElementById("local" + String(num)).checked)
            count += 1;
    }

    if (count < 2) {
        if (local_Error.classList.contains("no_error"))
            local_Error.classList.remove("no_error");
        if (!local_Error.classList.contains("error"))
            local_Error.classList.add("error");
        retval = false;
    }
    else {
        if (local_Error.classList.contains("error"))
            local_Error.classList.remove("error");
        if (!local_Error.classList.contains("no_error"))
            local_Error.classList.add("no_error");
    }
    return retval;
}

function valor() {
    var local_Error = document.getElementById("local_Error");
    var num;
    var value = 0;
    for (num = 1; num <= 4; num++) {
        if (document.getElementById("local" + String(num)).checked) {
            if (parseInt(document.getElementById("local" + String(num)).value) > parseInt(value))
                value = parseInt(document.getElementById("local" + String(num)).value);
        }
        document.getElementById("val_max").value = value;
    }
}