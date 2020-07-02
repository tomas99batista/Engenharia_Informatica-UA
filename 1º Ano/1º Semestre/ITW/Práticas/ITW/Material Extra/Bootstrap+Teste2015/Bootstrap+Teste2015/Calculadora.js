function res() {
    var fp = document.getElementById("fp")
    var ef = document.getElementById("ef")
    var itw = document.getElementById("itw")
    var c1 = document.getElementById("c1")
    var alga = document.getElementById("alga")
    var media1 = document.getElementById("media1")
    var md = document.getElementById("md")
    var poo = document.getElementById("poo")
    var iac = document.getElementById("iac")
    var c2 = document.getElementById("c2")
    var mas = document.getElementById("mas")
    var media2 = document.getElementById("media2")
    media1.value = (parseFloat(fp.value) + parseFloat(ef.value) + parseFloat(itw.value) + parseFloat(c1.value) + parseFloat(alga.value)) / 5
    media2.value = (parseFloat(mas.value) + parseFloat(c2.value) + parseFloat(iac.value) + parseFloat(md.value) + parseFloat(poo.value)) / 5
}