%Matriz transição: coluna=estado atual e linha=proximo estado
T = [  0.8   0.1   0.05  ;
       0.2   0.6   0.2  ;
       0.0   0.3   0.75  ;
    ]
    
sum(T)
vEstado = [ 100; 200; 30]

%b)
%4 de janeiro -> k =3
final =  vEstado;
for k = 1:3
  final =  T*final;
end
alinea_a= final

%c)
%1 de janeiro de 2016-> k =365
final =  vEstado;
for k = 1:365
  final =  T*final;
end
alinea_b= final

%d)
final =  vEstado;
count=0;
while 1
   final =  T*final;
   if final(3) > 130
     break
   endif
   count++;
endwhile

%Count + primeiro dia
count+1
printf("Dia 10 de Janeiro!\n")