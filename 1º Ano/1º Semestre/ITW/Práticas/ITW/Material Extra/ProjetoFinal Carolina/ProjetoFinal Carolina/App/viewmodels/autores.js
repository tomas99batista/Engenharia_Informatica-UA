define(['durandal/app'], function (app) {
    function processArray(arr) {
        var out = "<table class=\"col-xs-12 col-sm-6 col-lg-8 table table-bordered table-responsive\" align = \"center\" style = \"background-color: #FAFAFA\">";
        out += "<tbody>";
        var i;
        for (i = 0; i < arr.length; i++) {
            nome = arr[i].name
            morada = arr[i].address
            telefone = arr[i].phone
            id = arr[i].ID
            cidade = arr[i].city
            estado = arr[i].state
            zip = arr[i].zip
            out += '<tr><td>' + '&nbsp;' + '\ <img src="http://192.168.160.36/images/' + arr[i].ID + '.png" > \ ' + '</td><td>';
            out += '&nbsp;&nbsp;&nbsp;' + nome + '&nbsp;&nbsp;&nbsp;'+ '</td><td>' +
            '<b>Morada: </b>'+ '<p></p>' + morada + "<br />" + cidade + ", " + estado + "<br />" + zip + '</td><td>' +
            '<b>Telefone: </b>' + '<p></p>' + telefone + '&nbsp;';
        }
        out += "</tbody>";
        out += "</table>";
        document.getElementById("autores").innerHTML = out;

    }

    return {
        activate: function () { },
        compositionComplete: function () {
            var myUrl = "http://192.168.160.36/JSON/getAuthors.aspx?numAuthors=23"
            $.ajax({
                type: "GET",
                url: myUrl,
                numAuthors: 23,
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
