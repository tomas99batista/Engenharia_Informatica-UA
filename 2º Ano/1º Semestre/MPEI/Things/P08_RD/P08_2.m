%P08_2

%Matriz transição: coluna=estado atual e linha=proximo estado
T=[1/3     1/4      0    ;
   1/3  1-1/4-1/5   0.5  ;
   1/3     1/5      0.5  ;]
   
%sum(T)

%b)
%A -> 60
%B -> 15
%C -> 15
vEstado = [ 60 ; 15 ; 15 ];
alinea_b = vEstado

%c)
final =  vEstado;
for k = 1:30
  final =  T*final;
end
alinea_c = final

%d) 
vEstado = [ 30 ; 30 ; 30 ];
final =  vEstado;
for k = 1:30
  final =  T*final;
end
alinea_d = final