clear;
clc;
%%Exercicio 1
printf ("\n --- Exercicio 1 --- \n");

%Alinea a
T = [   0.9   0.5   0.5;  
        0.09  0.4   0.4;
        0.01  0.1   0.1;];

ve= [0; 0; 1];

%%Alinea b
pB = T^4*ve

%%Alinea c

k=0;
while 1
  k++;
  T_prev = T^k*ve;
  T_post = T^(k+1)*ve;
  if ( sum(sum(abs(T_prev-T_post)<=0.001)) > 0)
    break
  endif
endwhile

prob_c = T_post

%%Exercicio 2
printf ("\n --- Exercicio 2 --- \n");

%Alinea a

H = [ 0     0.5   1/3   0.25  0   ;
      0.5   0     0     0.25  0.5 ;
      0.5   0.5   1/3   0.25  0   ;
      0     0     0     0     0.5 ;
      0     0     1/3   0.25  0   ;];
      
Mnn = ones(5)/5;
B=0.8;
A = B*H + (1-B)*Mnn

%Alinea b

ve = ones(5,1)/5;

pagerank = A^10*ve

%%Exercicio 3
printf ("\n --- Exercicio 3 --- \n");

%%Alinea a

%%      a     b     c     d     .     ?
T = [   0.7   0.2   0     0     0     0;
        0.2   0     0.3   0     0     0;
        0     0.6   0.3   0     0     0;
        0.1   0.2   0.3   0.1   0     0;
        0     0     0.1   0.5   1     0;
        0     0     0     0.4   0     1;];
        
%%Alinea b
ve = [1;0;0;0;0;0];

p2_b_1 = (T^10*ve)(3,1)
p2_b_2 = (T^15*ve)(4,1)

%%Alinea c

Q=T(1:4,1:4);

F=inv(eye(4)-Q);

medias = F'*ones(4,1);

media_c=medias(3,1)