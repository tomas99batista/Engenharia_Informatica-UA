define(['durandal/app'], function (app) {
    function processArray(arr) {
        var out = "<table class=\"col-xs-12 col-sm-6 col-lg-8 table table-hover table-responsive\">";
        out += "<thead  style= \"font-size: x-large; color: dimgrey\" ><tr><th><i class=\"fa fa-book\"></i> Título</th><th class=\"col-md-2\"><i class=\"fa fa-user\"></i> Autores</th>" +
            "<th><i class=\"fa fa-pencil\"></i> Género</th><th><i class=\"fa fa-eur\"></i> Preço</th><th><i class=\"fa fa-tags\"></i> Vendas</th></tr></thead>";
        out += "<tbody>";
        var i;
        for (i = 0; i < arr.length; i++) {
            out += '<tr><td><i>' + arr[i].title + '</i></td><td>';
            for (var j = 0; j < arr[i].authors.length; j++) {
                if (j > 0)
                    out += "<br />";
                out += arr[i].authors[j];
            }
            out += "</td><td style=\"text-align: center\">";
            out += arr[i].type + '</td><td  style=\"text-align: center\">' +
            arr[i].price + '</td><td  style=\"text-align: center\">' +
            arr[i].ytd_sales;
        }
        out += "</tbody>";
        out += "</table>";
        document.getElementById("vendas").innerHTML = out;

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