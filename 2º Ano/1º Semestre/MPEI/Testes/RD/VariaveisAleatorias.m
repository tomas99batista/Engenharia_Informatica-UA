
n=100;
m = 6.5;
d=2.5;
Sn = 600;

% P(Z100 < 600) = P(Z100 > (Sn - un) /(d*sqrt(n))) 
p =  1- cdf("Normal", Sn, m*n,d*sqrt(n))