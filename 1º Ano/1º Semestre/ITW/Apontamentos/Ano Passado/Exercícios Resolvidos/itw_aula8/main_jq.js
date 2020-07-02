 $(document).ready(function(){
     $(".check").change(function(){
         var selected = [];
         $("input:checkbox:checked").each(function()
            {
                selected.push(parseInt($(this).attr("name")));
            });
         if (selected.length <= 0)
            {
                $(val_max).val("0 euros");
            }
         else
            {
                $(val_max).val((Math.max.apply(null,selected)) + " euros"); 
            }
     })
     $("#butao").click(function(){  
         if ($("input:checkbox:checked").length < 2)
            {
                alert("escolha pelo menos dois locais");    
            }
         if (!(10 <= $("#nome").val().length))
              {
                  alert("Nome errado");
              }
         if (!(20 <= $("#morada").val().length))
              {
                  alert("Morada errado");
              }
         if (!(10 <= $("#email").val().length))
              {
                  alert("email errado");
              } 
        
     })
 })