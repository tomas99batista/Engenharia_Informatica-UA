function local_check()
{
    var b = true
    if (document.querySelectorAll('input[type="checkbox"]:checked').length < 2)
        {
            alert("Escolha pelo menos 2 locais");
        }
    else
        {
            return true;
        }
}
function check_things()
{
    var name = document.getElementById("nome");
    var morada = document.getElementById("morada");
    var email = document.getElementById("email");
    if (!(10 <= name.value.trim().length >= 100))
        {
            alert("Nome errado");
        }
    if (!(20 <= morada.value.trim().length >= 200))
        {
            alert("Morada errada");
        }
    if (!(10 <= email.value.trim().length >= 100))
        {
            alert("email errado");
        }
}
function max_value()
{
    var val_max = document.getElementById("val_max");
    var boxes = document.querySelectorAll('input[type="checkbox"]:checked');
    for (i = 0; i < boxes.length; i++)
    {
        if(boxes[i].value == "option1")
            {
                val_max.value = "25 euros";
            }
        
        else if(boxes[i].value == "option2")
            {
                val_max.value = "30 euros";
            }
        
        else if(boxes[i].value == "option3")
            {
                val_max.value = "50 euros";
            }
    }    
}