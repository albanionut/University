function t=fib(n)
  t=[1,1];
  for i=3:n
    t(i)=t(i-1)+t(i-2);
  end
endfunction