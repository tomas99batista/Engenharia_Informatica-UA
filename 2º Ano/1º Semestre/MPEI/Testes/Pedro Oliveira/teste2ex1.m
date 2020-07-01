%Teste2
%ex1
%a)
T =[ 0.9 0.5 0.5; 0.09 0.4 0.4; 0.01 0.1 0.1];

v1 = [0 0 1];
%b)
prob = T^3*v1'

%c)
i = 2;
Ti = T^i;

while (max(abs(Ti - T^(i-1))) > 10^-3)
  Ti = T^i;
  prob = Ti * v1';
  i=i+1;
endwhile

probPerda = prob(3)
probPerdaSemCodigo = prob(2)+prob(3)