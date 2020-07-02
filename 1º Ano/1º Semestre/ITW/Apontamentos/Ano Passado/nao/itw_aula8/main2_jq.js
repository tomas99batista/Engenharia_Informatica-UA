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
     });
     $("#butao").click(function(){
         $("li").remove();
         var flag = 0;
         if (!(10 <= $("#nome").val().length))
              {
                  $(".Lista_erros").append("<li>Nome inválido</li>");
                  flag = 1;
              }
         if (!(20 <= $("#morada").val().length))
              {
                  $(".Lista_erros").append("<li>Morada inválida</li>");
                  flag = 1;
              }
         if ((!(10 <= $("#email").val().length)) || $("#email").val().indexOf("@") == -1)
              {
                  $(".Lista_erros").append("<li>E-mail inválido</li>");
                  flag = 1;
              }
         if ($("input:checkbox:checked").length < 2)
              {
                  $(".Lista_erros").append("<li>Escolha pelo menos dois locais</li>");
                  flag = 1;   
              }
         if (flag == 1)
             {
                 $("#Error_Modal").modal("show");    
                 return false;
             }
	return true;
     });
 })
