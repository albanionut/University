function y=fctlm(x,m)
  exec("e:\scilab\data.sce",-1);
  exec("e:\scilab\f1.sce",-1);
  [t,y]=data(m);
  y=f1(x,t)-y;
endfunction

