%teste2015
%1
%a)
M = [0.01 0.07 0.02; 0.04 0 0.08; 0.04 0.15 0.09; 0.01 0.2 0.01];
b = 1 - sum(sum(M))
M(2,2) = b;

%b)
Y = sum(M)
X = sum(M')

%c)
mediaY=0;
varianciaY = 0;
mediaX=4*X(4);
varianciaX = 16*X(4);
for i = 1:3
  mediaY = mediaY + i*Y(i);
  varianciaY = varianciaY + i^2*Y(i);
  mediaX = mediaX + i*X(i);
  varianciaX = varianciaX + i^2*X(i);
endfor

mediaX
varianciaX = varianciaX - mediaX^2
mediaY
varianciaY = varianciaY - mediaY^2

%d)
ind = zeros(size(M));
for i=1:3
  ind(:,i) = M(:,i) == Y(i)*X(:);
endfor

independente = sum(sum(ind)) == length(X)*length(Y)

%e)
correlacao=0;
for i=1:4
  for j=1:3
    correlacao = correlacao + i*j*M(i,j);
  endfor
endfor
correlacao
covar = correlacao - mediaX*mediaY
coefcorr = covar/(varianciaX*varianciaY)

%f)
F=0;
for i=1:4
  for j=1:3
    F = F + j^2*sqrt(i+1)*M(i,j);
  endfor
endfor
F