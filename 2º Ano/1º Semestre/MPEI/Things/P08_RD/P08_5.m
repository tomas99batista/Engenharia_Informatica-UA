%Matriz transição: coluna=estado atual e linha=proximo estado
T = [  0.7   0.2   0.3  ;
       0.2   0.3   0.3  ;
       0.1   0.5   0.4  ;
    ]
    
sum(T)
vEstado = [ 1; 0; 0;]

%b)
final =  vEstado;
for k = 1:2
  final =  T*final;
end
final
alinea_b = final(3)

%c)
Tn=T;
matrizFinal1 = [ T(:) ];
for k = 1:20
  Tn =  T*Tn;
  matrizFinal1 =[ matrizFinal1 Tn(:) ];
end
%plot(matrizFinal1')

%d)
Tn=T;
TnAnterior=T;
flag=0;
matrizFinal2 = [ T(:) ];
for k = 1:20
  Tn =  T*Tn;
  for i = 1: 9
      if abs((Tn(:)(i,1) - TnAnterior(:)(i,1))) <  10^(-4)
        flag=1;
        break
      endif
  end
  if flag == 1
    break
  endif
  TnAnterior=Tn;
  matrizFinal2 =[ matrizFinal2 Tn(:) ];
end

subplot(2,1,1)
plot(matrizFinal1')
title("Alinea c")
subplot(2,1,2)
plot(matrizFinal2')
title("Alinea d")

