%%Tabela de estados
%%      I NI
%%    I
%%    NI
%%Ve= ( I, NI)

T = [ 0.7   0.8;
      0.3   0.2];

%%Exercicio 1
printf ("Exercicio 1\n");
   
%%a)
Ve = [ 1 ; 0 ];
pA = (T^2 * Ve)(1,1)

%%b)
Ve = [ 0 ; 1 ];
pB = (T^2 * Ve)(1,1)

%%c)
Ve = [ 1 ; 0 ];
pB = (T^(2*15) * Ve)(1,1)

%%d)
pFaltar = zeros(1,30);
Ve = [ 0.85 ; 0.15];

for k=1:30
  pFaltar(1,k) = (T^k * Ve)(2,1);
endfor
plot(pFaltar)

%%Exercicio 4
printf ("Exercicio 4\n");

%%Variaveis
p = 0.4;
q = 0.6;
%%Matriz
T = [   p^2       0     0        q^2;
      (1-p)^2     0     0     q*(1-q);
      p*(1-p)      0     0    q*(1-q);
      p*(1-p)      1     1    (1-q)^2;];

%%Alinea B
ve = [ 1 ; 0 ; 0 ; 0];
pB=(T^10*ve)(2,1)

%%Exercicio 6
printf ("\n --- Exercicio 6 --- \n");

T = [ 0.8   0     0.3   0;
      0.2   0.9   0.2   0;
      0     0.1   0.4   0;
      0     0     0.1   1;];

%%Alinea b
ve = [ 1;0;0;0];
pB = (T^1000 * ve)(2,1)

%%Alinea c
T1 = T
T2 = T^2
T10 = T^10
T100 = T^100

%%Alinea d
Q = T(1:3,1:3)

%%Alinea e
F = inv(eye(3)-Q)

%%Alinea f
mediasPassos = sum(F)

%%Alinea g
tAbsorcao = F'*ones(3,1)

%%Alinea h

T = [ 0.8   0     0.99   0;
      0.2   0.9   0   0;
      0     0.1   0   0;
      0     0     0.01   1;];

Q = T(1:3,1:3);
F = inv(eye(3)-Q);
tAbsorcao_maior = F'*ones(3,1)


%%Exercicio 7
printf ("\n --- Exercicio 7 --- \n");

T = [ 80    10    5 ;
      20    60    20;
      0     30    75;];
      
T=T/100;

%%Alinea a
ve=[100 ; 200; 30];
T4Jan = T^3 * ve

%%Alinea b
TpassagemAno = T^365*ve

%%Alinea c
dia = 0;
k=0;
while 1
  k++;
  M = T^k*ve;
  if M (3,1) >130
    dia=k;
    break
  endif
endwhile
dia+1;
printf("Dia 10 de Janeiro")



