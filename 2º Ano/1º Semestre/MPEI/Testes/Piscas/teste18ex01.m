
x1 = rand(200,500);
x2 = x1<0.4;
x3 = sum(x2);
x4 = sum(x3>65 & x3<100)
probx5 = x4/500

probx6 = cdf('Normal',100,0.4*200,sqrt(0.4*(0.6)*200)) - cdf('Normal',65,0.4*200,sqrt(0.4*(0.6)*200))