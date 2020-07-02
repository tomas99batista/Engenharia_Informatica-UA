var x;
$(document).ready(function (e) {
    var url = window.location.href;
    console.log(url);


    // http://localhost:52085/search.html#m-1496
    url = url.split("?")[1];
    console.log(url);
    if (url === "d") {
        var data;
        $.ajax({
            url: "http://192.168.160.39/api/Directors", success: function (result) {
                //  console.log(result);
                data = result;

            }
        }).done(function () {
            console.log(data);
            x = ko.observableArray(data);
            ko.applyBindings({ filmes: x }, $("#filmes")[0]);
        });

    } else if (url === "a") {
        var data;
        $.ajax({
            url: "http://192.168.160.39/api/Actors", success: function (result) {
                //  console.log(result);
                data = result;

            }
        }).done(function () {
            console.log(data);
            x = ko.observableArray(data);
            ko.applyBindings({ filmes: x }, $("#filmes")[0]);
        });

    } else {
        var data;
        $.ajax({
            url: "http://192.168.160.39/api/Movies", success: function (result) {
                //  console.log(result);
                data = result;

            }
        }).done(function () {
            console.log(data);
            x = ko.observableArray(data);
            ko.applyBindings({ filmes: x }, $("#filmes")[0]);
        });
    }

    
   // console.log(data);
});

