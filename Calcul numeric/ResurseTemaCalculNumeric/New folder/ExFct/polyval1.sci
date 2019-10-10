function r=polyval1(x,c)
  [l,n]=size(c);
  r=c(1);
  for i=2:n 
    r=r*x+c(i);
  end
endfunction
