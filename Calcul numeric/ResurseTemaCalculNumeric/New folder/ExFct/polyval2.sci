function r=polyval2(x,c)
  [l,n]=size(c);
  i=0:n-1;
  u=x^i;
  r=u*c';
endfunction
