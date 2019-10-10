function u=dfct(x,t,y)
  s=exp(x(2)*t);
  u=[s,x(1).*t.*s];
endfunction
