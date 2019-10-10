function u=fct(x,t,y)
  //exec("e:\mk\scilab\labnum\Mcmp\GaussNewton\f1.sce", -1);
  u=f1(x,t)-y;
endfunction

function y=f1(x,t)
  y=x(1)*exp(x(2)*t);
endfunction

function u=dfct(x,t,y)
  s=exp(x(2)*t);
  u=[s,x(1).*t.*s];
endfunction
