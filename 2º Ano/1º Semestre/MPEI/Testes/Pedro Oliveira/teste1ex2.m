T = [0.84 0.1 0.05 0.01; 0.1 0.7 0.1 0.1; 0 0 0.8 0.2; 0.5 0.1 0.1 0.3]';

v = [1 2 10 5];

tonAgosto = T^7*v'

maxi = zeros(4,1);
tonI = T*v';
maxi(:,1) = tonI(:);
i=2;

while (max(abs(T^i - T^(i-1))) > 10^-4)
  Ti = T^i;
  tonI = Ti*v';
  for a=1:4
    if (maxi(a,1) < tonI(a,1))
      maxi(a,1) = tonI(a,1);
    endif
  endfor
  i=i+1;
endwhile

maxi

i=2;
ton = T*v';
while ton(4) >= 2
  Ti = T^i;
  ton = Ti*v';
  i=i+1;
endwhile
i
%janeiro de 2015