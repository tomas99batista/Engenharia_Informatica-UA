
T =  rand(20);
T= T./sum(T);
sum(T);

vEstado = zeros(1,20)';
vEstado(1,1)=1;

vinte = T^20  * vEstado;
alinea_a = vinte(20)

final =  vEstado;
for k = 1:40
  final =  T*final;
end
alinea_b = final(20)

cem = T^100  * vEstado;
alinea_c = cem(20)
