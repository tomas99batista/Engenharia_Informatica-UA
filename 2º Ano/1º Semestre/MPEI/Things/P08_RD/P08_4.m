%P08_4
p = 0.4;
q = 0.6;

%Matriz transição: coluna=estado atual e linha=proximo estado

T = [    p^2      0      0      q^2    ;
       (1-p)^2    0      0     q*(1-q)  ;
       p*(1-p)    0      0     q*(1-q)  ;
       p*(1-p)    1      1     (1-q)^2 ;
    ]
    
sum(T);
vEstado = [ 1; 0; 0; 0; ]

final =  vEstado;
for k = 1:10
  final =  T*final;
end
final;
alinea_b_1 = final(2)
alinea_b_2 = final