define(['durandal/app'], function (app) {
dados = []
function processArray(arr) {
    dados = arr;
}
function autor() {
    var arrSelect = document.getElementById("dat");
    var aut = arrSelect.options[arrSelect.selectedIndex].value;
    done = [];
    for (var i = 0; i < dados.length; i++) {
        repetido = false
        for (var z = 0; z < done.length; z++) {
            if (done[z].title == dados[i].title) {
                repetido = true
            }
        }
        if (repetido == false) {
            done.push(dados[i]);

        }

    }

    if (aut == "todos") {
        var out = "<table class=\"col-xs-12 col-sm-6 col-lg-8 table table-responsive table-bordered\">";
        out += "<thead  style= \"font-size: medium; color: white; background-color: dimgrey\" ><tr><th><i class=\"fa fa-book\"></i> Título</th><th class=\"col-md-2\"><i class=\"fa fa-user\"></i> Autores</th>" +
            "<th><i class=\"fa fa-pencil\"></i> Género</th><th><i class=\"fa fa-calendar\"></i> Publicação</th><th><i class=\"fa fa-eur\"></i>Preço</th><th><i class=\"fa fa-comments\"></i>  Notas</th></tr></thead>";
        out += "<tbody>";
        for (var i = 0; i < done.length; i++) {
            out += "<tr><td><i>" + done[i].title + "</i></td><td>" + done[i].authors + "</td><td>" + done[i].type + "</td><td>" + done[i].pubdate + "</td><td>" + done[i].price + "</td><td>" + done[i].notes + "</td></tr>";
        }
        out += "</tbody>";
        out += "</table>";
        document.getElementById("tab-1").innerHTML = out;
    }
    else {
        var out = "<table class=\"col-xs-12 col-sm-6 col-lg-8 table table-responsive table-bordered\">";
        out += "<thead  style= \"font-size: medium; color: white; background-color: dimgrey\" ><tr><th><i class=\"fa fa-book\"></i> Título</th><th class=\"col-md-2\"><i class=\"fa fa-user\"></i> Autores</th>" +
                    "<th><i class=\"fa fa-pencil\"></i> Género</th><th><i class=\"fa fa-calendar\"></i> Publicação</th><th><i class=\"fa fa-eur\"></i>Preço</th><th><i class=\"fa fa-comments\"></i>  Notas</th></tr></thead>";
        out += "<tbody>";
        for (var i = 0; i < done.length; i++) {
            if (aut == done[i].title) {
                out += "<tr><td><i>" + done[i].title + "</i></td><td>" + done[i].authors + "</td><td>" + done[i].type + "</td><td>" + done[i].pubdate + "</td><td>" + done[i].price + "</td><td>" + done[i].notes + "</td></tr>";
            }
        }
        out += "</tbody>";
        out += "</table>";
        document.getElementById("tab-1").innerHTML = out;
    }


}
    var dados = [];
    //função para disponibilizar todos os títulos
    function processArray(arr) {
        dados = arr;
        var arrSelect = document.getElementById("dat");
        var option = document.createElement("option");
        option.text = "Todos os Livros";
        option.value = "todos";
        arrSelect.add(option);

        done = [];
        for (var i = 0; i < arr.length; i++) {
            repetido = false
            for (var z = 0; z < done.length; z++) {
                if (done[z].title == arr[i].title) {
                    repetido = true
                }
            }
            if (repetido == false) {
                var option = document.createElement("option");
                option.text = arr[i].title.replace("&#39;", "'");
                option.value = arr[i].title;
                arrSelect.add(option);
                done.push(arr[i]);

            }

        }


        var i;
        var out = "<table class=\"col-xs-12 col-sm-6 col-lg-8 table table-responsive table-bordered\">";
        out += "<thead  style= \"font-size: medium; color: white; background-color: dimgrey\" ><tr><th><i class=\"fa fa-book\"></i> Título</th><th class=\"col-md-2\"><i class=\"fa fa-user\"></i> Autores</th>" +
            "<th><i class=\"fa fa-pencil\"></i> Género</th><th><i class=\"fa fa-calendar\"></i></th><th><i class=\"fa fa-eur\"></i></th><th><i class=\"fa fa-comments\"></i>  Notas</th></tr></thead>";
        out += "<tbody>";
        for (var i = 0; i < done.length; i++) {
            out += "<tr><td><i>" + done[i].title + "</i></td><td>" + done[i].authors + "</td><td>" + done[i].type + "</td><td>" + done[i].pubdate + "</td><td>" + done[i].price + "</td><td>" + done[i].notes + "</td></tr>";
        }
        out += "</tbody>";
        out += "</table>";
        document.getElementById("tab-1").innerHTML = out;




    }

    return {
        activate: function () { },
        compositionComplete: function () {
            var myUrl = "http://192.168.160.36/JSON/getTitles.aspx"
            $.ajax({
                type: "GET",
                url: myUrl,
                dataType: "jsonp",
                success: processArray,
                error: function (xhr, status, err) {
                    alert("Erro ao aceder. Conecte-se à VPN da UA por favor.");
                }
            });
        },
        modal: function openmodal() {

        }
    };

});