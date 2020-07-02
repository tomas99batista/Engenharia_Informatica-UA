//--- função para cálculo da média
function calcula() {
    var ALGA_C = document.getElementById("ALGA_C").value;
    var FIS_C = document.getElementById("FIS_C").value;
    var CALC1_C = document.getElementById("CALC1_C").value;
    var ITW_C = document.getElementById("ITW_C").value;
    var FP_C = document.getElementById("FP_C").value;
    
    var ALGA_N = document.getElementById("ALGA_N").value;
    var FIS_N = document.getElementById("FIS_N").value;
    var CALC1_N = document.getElementById("CALC1_N").value;
    var ITW_N = document.getElementById("ITW_N").value;
    var FP_N = document.getElementById("FP_N").value;
    
    var M1S_C = document.getElementById("M1S_C");
    var M1S_N = document.getElementById("M1S_N");
    
    var MAS_C = document.getElementById("MAS_C").value;
    var CALC2_C = document.getElementById("CALC2_C").value;
    var MD_C = document.getElementById("MD_C").value;
    var IAC_C = document.getElementById("IAC_C").value;
    var POO_C = document.getElementById("POO_C").value;
    
    var MAS_N = document.getElementById("MAS_N").value;
    var CALC2_N = document.getElementById("CALC2_N").value;
    var MD_N = document.getElementById("MD_N").value;
    var IAC_N = document.getElementById("IAC_N").value;
    var POO_N = document.getElementById("POO_N").value;
    
    var M2S_C = document.getElementById("M2S_C");
    var M2S_N = document.getElementById("M2S_N");
    
    M1S_C.value = (ALGA_C * 1.0 + FIS_C * 1.0 + ITW_C * 1.0 + CALC1_C * 1.0 + FP_C * 1.0);
    M1S_N.value = ((ALGA_N * 1.0) * (ALGA_C * 1.0)  + (FIS_N * 1.0) * (FIS_C * 1.0) + (ITW_N * 1.0) * (ITW_C * 1.0) + (CALC1_N * 1.0) * (CALC1_C * 1.0) + (FP_N * 1.0) * (FP_C * 1.0))/(M1S_C.value);
    
    M2S_C.value = (MAS_C * 1.0 + CALC2_C * 1.0 + MD_C * 1.0 + IAC_C * 1.0 + POO_C * 1.0);
    M2S_N.value = ((MAS_N * 1.0) * (MAS_C * 1.0)  + (CALC2_N * 1.0) * (CALC2_C * 1.0) + (MD_N * 1.0) * (MD_C * 1.0) + (IAC_N * 1.0) * (IAC_C * 1.0) + (POO_N * 1.0) * (POO_C * 1.0))/(M2S_C.value);
    
    
    if ((isNaN(ALGA_C*1.0) || isNaN(FIS_C*1.0) || isNaN(CALC1_C*1.0) || isNaN(ITW_C*1.0) || isNaN(FP_C*1.0)))
        {alert("Um dos crédito do 1º semestre é não numérico"); return false;}
    
    if ((isNaN(MAS_C*1.0) || isNaN(CALC2_C*1.0) || isNaN(MD_C*1.0) || isNaN(IAC_C*1.0) || isNaN(POO_C*1.0)))
          {alert("Um dos crédito do 2º semestre é não numérico"); return false;}
    
     if ((isNaN(ALGA_N*1.0) || isNaN(FIS_N*1.0) || isNaN(CALC1_N*1.0) || isNaN(ITW_N*1.0) || isNaN(FP_N*1.0)))
        {alert("Uma das notas do 1º semestre é não numérica"); return false;}
    
    if ((isNaN(MAS_N*1.0) || isNaN(CALC2_N*1.0) || isNaN(MD_N*1.0) || isNaN(IAC_N*1.0) || isNaN(POO_N*1.0)))
          {alert("Uma das notas do 2º semestre é não numérica"); return false;}
    
    
    if ((checkCredit(ALGA_C*1.0) || checkCredit(FIS_C*1.0) || checkCredit(CALC1_C*1.0) || checkCredit(ITW_C*1.0) || checkCredit(FP_C*1.0)))
        {alert("Um dos crédito do 1º semestre não tem o valor correto"); return false;}
    
    if ((checkCredit(MAS_C*1.0) || checkCredit(CALC2_C*1.0) || checkCredit(MD_C*1.0) || checkCredit(IAC_C*1.0) || checkCredit(POO_C*1.0)))
        {alert("Um dos crédito do 2º semestre não tem o valor correto"); return false;}
    
    console.log(M1S_C.value)
    if (M1S_C.value != 30) {alert("O total de créditos do 1º semestre é diferente de 30"); return false;}
    if (M2S_C.value != 30) {alert("O total de créditos do 2º semestre é diferente de 30"); return false;}
    
    return true;
}

function checkCredit(value) {
    return (value < 4 || value > 10);
}

function checkNota(value) {
    return (value < 20 || value > 0);

}

function checkNum(value) {
    
}
