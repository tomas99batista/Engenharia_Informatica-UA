var map = document.getElementById("map");

function changeLocal() {
    var newLocal = document.getElementById("local");
    map.src = "https://www.google.com/maps/embed/v1/place?key=AIzaSyBrKwpbb4f8yLnw50xLSHJpGOwiMmB3OXI&q=" + newLocal.value; 
}

function search() {
    var search = document.getElementById("search");
    map.src = "https://www.google.com/maps/embed/v1/search?key=AIzaSyBrKwpbb4f8yLnw50xLSHJpGOwiMmB3OXI&q=" + search.value;
}

function directions() {
    var origem = document.getElementById("origin");
    var destination = document.getElementById("destination");
    var waypoints = document.getElementById("waypoints");
    map.src = "https://www.google.com/maps/embed/v1/directions?key=AIzaSyBrKwpbb4f8yLnw50xLSHJpGOwiMmB3OXI  " + "&origin=" + origem.value + "&destination=" + destination.value + "&waypoints=" + waypoints.value;
}