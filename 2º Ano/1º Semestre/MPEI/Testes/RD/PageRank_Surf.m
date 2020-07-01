
%%Read values
N = 20;
[U,L] = surfer("www.ua.pt",N);

%%Create H
H = full(L);
c = sum(H);
H = H./repmat(c,N,1);

%%Create Google Matrix
B=0.85;
A = B*H + (1-B)*ones(N)/N;
A(isnan(A)) = 1/N;


%%Stabilize values
k=1;
threshold=1e-3;
ve = ones(N,1)/N;
v_post =  ve;

while 1
  v_ant = v_post;
  v_post = A^k*ve;

  if sum(abs(v_ant-v_post) < threshold) == N
    break;
  end
  k++;
end

%%Print ordered values

[xs, indx] =  sort(v_post, "descend"); 

for x = 1:N
  printf ( "Pagerank: %.3f - %s\n", v_post(indx(x)),U{indx(x)});
end
