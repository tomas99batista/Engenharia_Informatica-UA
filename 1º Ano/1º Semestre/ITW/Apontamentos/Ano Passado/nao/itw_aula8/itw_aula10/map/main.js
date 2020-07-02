var map = document.getElementById("map");

function change_lugar() {
    var q = document.getElementById("lugar");
    map.src = "https://www.google.com/maps/embed/v1/place?key=AIzaSyDM0ZNlzZS6wulKFOv1s6PARvuXmGI-paM&q="+q.value;
}

function change_categoria() {
    var q = document.getElementById("categoria");
    map.src = "https://www.google.com/maps/embed/v1/search?key=AIzaSyDM0ZNlzZS6wulKFOv1s6PARvuXmGI-paM&q="+q.value;
}


function change_percurso() {
    var origem = document.getElementById("origem");
    var destino = document.getElementById("destino");
    var waypoint = document.getElementById("waypoint");
    map.src = "https://www.google.com/maps/embed/v1/directions?key=AIzaSyDM0ZNlzZS6wulKFOv1s6PARvuXmGI-paM&origin="+origem.value+"&destination="+destino.value+"&waypoints="+waypoint.value;
}
