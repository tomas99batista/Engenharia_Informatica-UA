%Teste2
%% ex1
%% a)
M = [0.01 0.07 0.02;    
    0.04 0 0.08; 
    0.04 0.15 0.09; 
    0.01 0.2 0.01];

b=1-sum(sum(M))
M(2,2)=b;

%% b)
Y = sum(M)
X = sum(M')

%% c) 
y = [0 2 3];

medY=0;
medX=4*X(4);
varY=0;
varX=4^2*X(4); 

for i=1:3
    medY = medY + (y(i)*Y(i));
    medX = medX + (i*X(i));
    varY = varY + (y(i)^2 * Y(i)); %nao é a variancia yet, mas sao calculos necessariios (é E[X^2])
    varX = varX + (i^2 * X(i));
end


medY
medX
varY = varY - (medY^2)
varX = varX - (medX^2)

%% d)
boolMatInd = zeros(size(M));
for i=1:3
   for e=1:4
       boolMatInd(e,i) = M(e,i) == Y(i) * X(e);
   end    
end

sum(sum(boolMatInd)) == 4*3

%% e)
mediaXY=0;
for i=1:3
   for e=1:4
       mediaXY = mediaXY + ( Y(i)*e*M(e,i)); %isto é a correlação... IkR?
   end    
end

% covarancia
cov = mediaXY - medX*medY

% cof cof corre
cof = cov/(sqrt(varY*varX)) %