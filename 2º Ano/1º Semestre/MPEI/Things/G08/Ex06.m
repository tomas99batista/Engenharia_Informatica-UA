#
# Al�nea a)
#

H = [ 0.8, 0.0, 0.3, 0.0;
      0.2, 0.9, 0.2, 0.0;
      0.0, 0.1, 0.4, 0.0;
      0.0, 0.0, 0.1, 1.0];

      
#
# Al�nea b)
#

prob = (H^1000)(1,2);


#
# Al�nea c)
#

passos1 = (H^1);
passos2 = (H^2);
passos10 = (H^10);
passos1000 = (H^1000);


#
# Al�nea d)
#

numEstadosAbsorventes = 1;
Q = H(1:size(H,1)-numEstadosAbsorventes,1:size(H,1)-numEstadosAbsorventes);


#
# Al�nea e)
#

F = inv(eye(size(H,1)-numEstadosAbsorventes)-Q);
         
#crawl(H,from,to);
#da num de passos
#fazer mts x o cralw fazemos simulacao dos valores de F
H1=[ 0.8  0  0.3 0; 0.2 0.9 0.2 0; 0 0.1 0.4 0; 0 0 0.1 1];
from = 1;
to = 4;
for i = 1:100
  state = crawl(H1,from,to);
  t(i)=length(state);
endfor
mean(t);

#
# Al�nea f) e g)
#

sum(F)


#
# Al�nea h)
#

H = [ 0.8, 0.0, 0.39, 0.0;
      0.2, 0.9, 0.2, 0.0;
      0.0, 0.1, 0.4, 0.0;
      0.0, 0.0, 0.01, 1.0];
      
Q = H(1:size(H,1)-numEstadosAbsorventes,1:size(H,1)-numEstadosAbsorventes);

F = inv(eye(size(H,1)-numEstadosAbsorventes)-Q);

sum(F)


#
# Al�nea i)
#

H = [ 0.8, 0.0, 0.3, 0.0;
      0.2, 0.9, 0.2, 0.0;
      0.0, 0.1, 0.4, 0.0;
      0.0, 0.0, 0.1, 1.0];
      
Q = H(1:size(H,1)-numEstadosAbsorventes,1:size(H,1)-numEstadosAbsorventes);

F = inv(eye(size(H,1)-numEstadosAbsorventes)-Q);