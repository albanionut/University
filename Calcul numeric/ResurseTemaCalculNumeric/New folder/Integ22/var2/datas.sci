function [fct,a,b,finf,fsup,tol]=datas()
  a=0;
  b=1;
  deff('z=fct(x,y)','z=x.*y')
  deff('y=finf(x)','y=x.^2')
  deff('y=fsup(x)','y=sqrt(x)')
  tol=1e-6;
endfunction

