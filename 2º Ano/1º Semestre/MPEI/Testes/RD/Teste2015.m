clear;
clc;

%%Exercicio 1
printf ("\n --- Exercicio 1 --- \n");

M = [ 0.01    0.07    0.02;
      0.04    0       0.08;
      0.04    0.15    0.09;
      0.01    0.20    0.01;];

%%Alinea a
beta = 1 - sum(sum(M))   

M = [ 0.01    0.07    0.02;
      0.04    0.28    0.08;
      0.04    0.15    0.09;
      0.01    0.20    0.01;];
      

%%Alinea b
probMarginais_x = sum(M')
probMarginais_y = sum(M)

%%Alinea C
media_X=0;
Ex2=0;
for k=1:4
  media_X += k*probMarginais_x(1,k);
  Ex2 += k^2*probMarginais_x(1,k);
endfor

media_Y=0;
Ey2=0;
for k=1:3
  media_Y += k*probMarginais_y(1,k);
  Ey2 += k^2*probMarginais_y(1,k);

endfor

media_X
var_X = Ex2 - media_X^2
media_Y
var_Y = Ey2 - media_Y^2

%%Alinea d, e 

covariancia=0;
for x = 1:4
  for y = 1:3
    covariancia+=(x-media_X)*(y-media_Y)*M(x,y);
  endfor
endfor
covariancia

printf("Como a covariancia é negativa, as 2 variaveis variam em sentidos contrários\n")
printf("Como a covariancia é diferente de 0, as 2 variaveis não sao independentes\n")

correlacao = covariancia + media_X*media_Y
coeficiente_correlacao = covariancia / ( sqrt(var_X) * sqrt(var_Y))

%%Alinea f

valor_esperado=0;
for x = 1:4
  for y = 1:3
    valor_esperado+=y^2*sqrt(x+1)*M(x,y);
  endfor
endfor
valor_esperado

%%Exercicio 2
printf ("\n --- Exercicio 2 --- \n");

%Alinea a

T = [   84    10    0     50;  
        10    70    0     10;
        5     10    80    10;
        1     10    20    30;];
T = T/100
ve= [ 1;2;10;5];

Agosto_1 = T^7 * ve
%Alinea b

limiar = 1e-7;
k=0;
T_post = T^k*ve;
T_max = zeros(4,1);
while 1
  for x=1:4
    if T_max(x,1) < T_post(x,1)
      T_max(x,1) = T_post(x,1);
    endif
  endfor
  k++;
  T_ant = T_post;
  T_post = T^k*ve;
  if ( sum(abs(T_ant-T_post)<limiar) == length(ve))
    break;
  endif
endwhile

T_max

%Alinea c

mes=1;
valor=0;
while 1
  if (T^mes*ve)(4,1) < 2
    valor = (T^mes*ve)(4,1);
    break;
  endif
  mes++;
endwhile

mes
valor