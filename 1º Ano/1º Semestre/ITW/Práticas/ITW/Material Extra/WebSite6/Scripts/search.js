
$(document).ready(function (e) {
    var url = window.location.href;
    console.log(url);


   // http://localhost:52085/search.html#m-1496
    url = url.split("?")[1];
    console.log(url);
    if (url.split("=")[0] === "m") {
        var data;
       // var table=[];
            $.ajax({
            url: "http://192.168.160.39/api/Movies/" + url.split("=")[1], success: function (result) {
                  console.log(result);
                data = result;

            }
            }).done(function () {
                

               // console.log(table);

               ko.applyBindings({ item: data });
              //  $("#ftable").css("visibility", "visible");
               // $("#floatii").find("img").attr('src',data[0]['poster'])
            console.log(data);
        });
    } else if (url.split("=")[0] === "d") {
        var data;
        $.ajax({
            url: "http://192.168.160.39/api/Directors/" + url.split("=")[1], success: function (result) {
                console.log(result);
                data = result;

            }
        }).done(function () {
            ko.applyBindings({ item: data });
          //  $("#dtable").css("visibility", "visible");
            // $("#floatii").find("img").attr('src',data[0]['poster'])
            console.log(data);
        });
    } else if (url.split("=")[0] === "a") {
        var data;
        $.ajax({
            url: "http://192.168.160.39/api/Actors/" + url.split("=")[1], success: function (result) {
                console.log(result);
                data = result;

            }
        }).done(function () {
            ko.applyBindings({ item: data });
            //  $("#dtable").css("visibility", "visible");
            // $("#floatii").find("img").attr('src',data[0]['poster'])
            console.log(data);
        });
    }



   
});

