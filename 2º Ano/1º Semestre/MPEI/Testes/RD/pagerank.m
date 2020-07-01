
%%Exercicio de pagerank usando surfer
clear;
clc;
N = 20;
[U,L] = surfer("www.ua.pt",N);
H = full(L);
c = sum(H);
H=H./repmat(c,N,1);

%%Calcular matrix da google
B = 0.85;
A = B*H+(1-B)*ones(N)/N;
A(isnan(A))=1/N;

T=A;
ve = ones(N,1)/N;
k=0;
while 1
  k++;
  T_prev = T^k*ve;
  T_post = T^(k+1)*ve;
  if ( sum(abs(T_prev-T_post)<=0.001) == 20)
    break
  endif
endwhile

x=A;
iter=k;

[xs idx] = sort(x, "descend");
xs
for k = 1:N
  printf("Page rank = %.3f  - %s\n",x(idx(k)),U{idx(k)})
end
