%a)

%Matriz transição: coluna=estado atual e linha=proximo estado

T = [   0.8     0     0.3    0  ;
        0.2    0.9    0.2    0  ;
         0     0.1    0.4    0  ;
         0      0     0.1    1  ;
    ];

sum(T)
vEstado = [ 1; 0; 0; 0; ];
%b)
final =  vEstado;
for k = 1:1000
  final =  T*final;
end

alinea_a = final(2)

%c)
%Basta ver as potencias da matriz T para n = 1, 2 , 10, 100
passos = [ 1 2 10 100]
for i = 1:4
  printf("Passo %d\n",i)
  Tn =  T^passos(1,i)
endfor

%d) 
# the fundamental matrix
Q = T(1:3,1:3)

%e)
F = inv(eye(3)-Q)

%f)
%Numero de vezes, em média, em que ele está nos outros estados antes de chegar ao estado 4
%SAI NO TESTE!
mediaPassos=sum(F)
%começa em 1 -> coluna 1
%começa em 2 -> coluna 2

%g)
t=F' * ones(3,1)

%h)
H1 = [   0.8     0    0.39    0  ;
        0.2    0.9    0.2     0  ;
         0     0.1    0.4     0  ;
         0      0     0.01    1  ;
    ];

Q1 = H1(1:3,1:3)
F1 = inv(eye(3)-Q1)
t1=F1' * ones(3,1)

