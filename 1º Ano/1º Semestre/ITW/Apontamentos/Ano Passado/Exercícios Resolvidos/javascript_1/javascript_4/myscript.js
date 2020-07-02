function show_info()
{
    document.getElementById("div1").innerHTML = ('Olá! Eu sou o ' + event.target.id + "<br />"+ 'top: ' + event.target.offsetTop + ' px' + "<br />" + 'left: ' + event.target.offsetLeft + ' px');
    
}
function clear_info()
{
    document.getElementById("div1").innerHTML = "";
}
function new_position()
{ 
    document.getElementById("azul").style.top = Math.floor(Math.random()*100+200).toString()+'px';
    document.getElementById("azul").style.left = Math.floor(Math.random()*1000).toString()+'px';
    document.getElementById("vermelho").style.top = Math.floor(Math.random()*100+200).toString()+'px';
    document.getElementById("vermelho").style.right = Math.floor(Math.random()*1000).toString()+'px';
    document.getElementById("verde").style.top = Math.floor(Math.random()*100+200).toString()+'px';
    document.getElementById("verde").style.right = Math.floor(Math.random()*1000).toString()+'px';
    document.getElementById("amarelo").style.top = Math.floor(Math.random()*100+200).toString()+'px';
    document.getElementById("amarelo").style.right = Math.floor(Math.random()*1000).toString()+'px';
}
