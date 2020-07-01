pkg load statistics
Sn = 600;
u = 6.5;
N=100;
o = 2.5;

p =  1 -cdf ("Normal",Sn, u*N, o*sqrt(N))