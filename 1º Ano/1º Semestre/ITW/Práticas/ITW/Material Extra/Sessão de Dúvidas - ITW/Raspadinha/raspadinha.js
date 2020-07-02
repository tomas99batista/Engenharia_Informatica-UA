//--- Variaveis globais



var numArray =[];
var userArray =[];

window.onload = function() {
    random();
};

function random() {
    numArray=[];

    hide();

    for (i = 0; i <5; i++) {
        numArray.push(Math.floor(Math.random() * (21 - 0) + 0));
    }

    /*for (i = 1; i <=5; i++) {
        if(document.getElementById()){
            document.getElementById().value ="";
        }
    }*/
}

function hide(id){

    }






function submeter(){

}


function peek(id) {
    n = id[1];
    document.getElementById("div" + id).style.backgroundImage = "url('peek.jpe')";
    document.getElementById(id).innerText = numArray[n-1];
    document.getElementById(id).style.fontSize = "35px";
    document.getElementById(id).style.textAlign = "center";
}
