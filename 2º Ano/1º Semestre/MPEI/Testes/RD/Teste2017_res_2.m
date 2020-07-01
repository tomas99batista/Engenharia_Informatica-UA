%%Teste 2017
clear;
clc;
%%Exercicio 1
printf("---------- Exercício 1 ----------\n");

%Alinea a

T = [   0.9     0.5   0.5;
        0.09    0.4   0.4;
        0.01    0.1   0.1;];
        
ve = [0;0;1];

%%Alinea 2

p_erro_4 = T^4*ve

%%Alinea 3

limiar = 0.001;
k=0;
vp=ve;
while 1
  k++;
  va = vp;
  vp = T^k*ve;
  if sum(abs(vp-va)<limiar) == length(vp')
    break;
  end
end
vp


%%Exercicio 2
printf("---------- Exercício 2 ----------\n");

%%Alinea a

H = [   0     1/2   1/3   1/4   0   ;
        1/2   0     0     1/4   1/2 ;
        1/2   1/2   1/3   1/4   0   ;
        0     0     0     0     1/2 ;
        0     0     1/3   1/4   0   ;];
        
B=0.8;
        
A = B*H + (1-B) * ones(5)/5

%%Alinea b
ve = ones(5,1)/5; 
fim_10_iteracoes = A^10*ve 

%%Exercicio 3
printf("---------- Exercício 3 ----------\n");

%Alinea a
T = [   0.7   0.2   0     0     0   0;
        0.2   0     0.3   0     0   0;
        0     0.6   0.3   0     0   0;
        0.1   0.2   0.3   0.1   0   0;
        0     0     0.1   0.5   1   0;
        0     0     0     0.4   0   1;]

%Alinea b
ve = [1;0;0;0;0;0];
p_10_c = (T^10*ve)(3,1)
p_15_c = (T^15*ve)(4,1)

%Alinea c

Q = T(1:4,1:4);
F = (eye(4) - Q)^(-1);
media_comecadas_em_c = (F'*ones(4))(3,1)

        