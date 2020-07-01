%%Teste prático de 2015 - MPEIs 
clear;
clc;
%%Exercicio 1
printf("---------- Exercício 1 ----------\n");

%%Alinea a

M = [ 0.01    0.07    0.02;
      0.04    0       0.08;
      0.04    0.15    0.09;
      0.01    0.2     0.01;];
      
B = 1 - sum(M(:))

M = [ 0.01    0.07    0.02;
      0.04    B       0.08;
      0.04    0.15    0.09;
      0.01    0.2     0.01;];

%%Alinea b

p_marg_x = sum(M')
p_marg_y = sum(M)

%%Alinea c

ex=0
ex2=0
for x = 1:length(p_marg_x)
  ex += x * p_marg_x(1,x);
  ex2 += x^2 * p_marg_x(1,x);
end

ey=0
ey2=0
for y = 3:length(p_marg_y)
  ey += y * p_marg_y(1,y);
  ey2 += y^2 * p_marg_y(1,y);
end

media_x  = ex
var_x = ex2 - media_x^2
media_y  = ey
var_y = ey2 - media_y^2  
  
%%Alinea e
cov=0;
for x = 1:4
  for y =1:3
    cov+= (y-ey)*(x-ex)*M(x,y);
  end
end

covariancia = cov
correlacao = cov + ex*ey
coef_correlacao = cov/(sqrt(var_x) * sqrt(var_y))

%%Alinea d
if cov == 0
  printf("X e Y são INDEPENDENTES\n");
else
  printf("X e Y NÃO são INDEPENDENTES\n");
end

%%Alinea f

valor_esperado=0;
for x = 1:4
  for y =1:3
    valor_esperado+= (y^2*sqrt(x+1))*M(x,y);
  end
end
valor_esperado  
  

%%Exercicio 2
printf("\n\n---------- Exercício 2 ----------\n\n");


%%Alinea a

T = [ 84    10    0     50;      
      10    70    0     10;
      5     10    80    10;
      1     10    20    30;]/100;

v0 = [1;2;10;5;];
prev_1_agosto = T^7*v0

%%Alinea b

max = v0;
v_post = max;
limiar=1e-5;
k=1;
while 1
  v_ant = v_post;
  v_post = T^k*v0;
  for y = 1 : 4
    if v_post(y,1) > max(y,1)
        max(y,1) = v_post(y,1);
    end
  end  
  if sum(abs(v_post-v_ant) < limiar ) == 4
    break;
  end
  k++;
end
max

%%Alinea c

d_post = v0(4,1); 
k=1;
while 1
  d_ant = d_post;
  d_post = (T^k*v0)(4,1);  
  if d_post < 2
    break;
  end
  k++;
end
quantidade = d_post
dia=1
mes = k