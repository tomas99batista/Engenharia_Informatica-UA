%%ex1 
%% a)
T= [0.9, 0.5, 0.5;
    0.09 , 0.4 , 0.4;
    0.01, 0.1 , 0.1];

v1 = [0 0 1]'; %ver como se representa o vetor estado inicial;

%% b)
prob= T^3 * v1;

%% c)
n = 2;
while 1         %ao pedro e açores da 7 e a mim 8... ver...
    t1 = T^(n);
    t2 =  T^(n-1);
    Tn = t1 * v1;
    if abs(t1-t2) < 0.001   %a diferença pode dar negativos pk nao dizem que a diferença deve ser positiva ou negativa
        break               %ver se nao tenho de por MAX tho,
    end
    n = n + 1; 
end
n
comCor = Tn(3)
semCor = Tn(2)+Tn(3) %ou Tn(2:3)


if [6,5,0] %se tiver uma 0 a cena condicional nao ta true, esse é o principio aplicado acima..
   disp("ola") 
end