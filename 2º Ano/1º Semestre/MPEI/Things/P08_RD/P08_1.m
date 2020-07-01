%Estados:
%   Faltar    (F)
%   Presente  (~F)

%Transições anterior_proxima
prob_p_p = 0.7;
prob_p_f = 1-prob_p_p;
prob_f_p = 0.8;
prob_f_f = 1 - prob_f_p;

%Matriz T
%
% f_f p_f
% f_p  p_p
T = [prob_f_f  prob_p_f ;  prob_f_p prob_p_p];

%Vetor de estados
vEstado = [0 1];

% X n+2 = T^2 * vetor_estado
Xn_2 = vEstado.*T^2;
pFaltar = Xn_2(1,2);
pPresente = Xn_2(2,2);
alinea_a = pPresente

%b)
vEstado = [1 0];
Xn_2 = vEstado.*T^2;
pFaltar = Xn_2(1,1);
pPresente = Xn_2(2,1);
alinea_b = pPresente


%c)
vEstado = [0 1];
Xn_2 = vEstado.*T^30;
pFaltar = Xn_2(1,2);
pPresente = Xn_2(2,2);
alinea_c = pPresente


%d)
probGraph_f_f = zeros(1,30);
probGraph_p_f = zeros(1,30);
vEstado = [0.15;0.85];
probGraph_f_f(1) = 0.15;
probGraph_p_f(1) = 0.85;
final = vEstado;

for k = 1:30
  final = T*final;
  probGraph_f_f(1,k+1) = final(1);
  probGraph_p_f(1,k+1) = final(2);
end
plot(probGraph_p_f);
hold on
plot(probGraph_f_f);



