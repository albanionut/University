function [u,v]=eq2(a,b)
  delta=a*a-4*b
  if delta>=0
    u=0.5*(-a+sqrt(delta))
    v=0.5*(-a-sqrt(delta))
    disp('Real roots')
  else
    u=-a/2
    v=sqrt(-delta)
    disp('Complex conjugate roots')
  end  
endfunction