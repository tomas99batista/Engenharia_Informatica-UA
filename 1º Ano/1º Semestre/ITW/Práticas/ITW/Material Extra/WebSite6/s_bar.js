$(document).ready(function () {



    var url = window.location.href;
    console.log(url);


    // http://localhost:52085/search.html#m-1496
    url = url.split("?")[1];
    if (url === "d")
        url = "http://192.168.160.39/api/Directors";
    if (url === "m")
        url = "http://192.168.160.39/api/Movies";
    if (url === "a")
        url = "http://192.168.160.39/api/Actors";



    $("#search").on("input",function () {
        if($("#search").val().length>=3){
            console.log("start seraching");
            $.ajax({
                url: url +"/Search/"+ $("#search").val(), success: function (result) {
                    console.log(result);
                    data = result;

                }
            }).done(function () {
                
                x.removeAll();
                $.each(data, function (i, e) {
                    x.push(e);
                })
               
                console.log(data);
            });


        } else {
            $.ajax({
                url: url, success: function (result) {
                    //  console.log(result);
                    data = result;

                }
            }).done(function () {
                x.removeAll();
                $.each(data,function(i,e){
                    x.push(e);
                })
            });
            // console.log(data);
        
        }
    })
});