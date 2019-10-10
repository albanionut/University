function P=lq(m,x,y,s)
  [mx,nx]=size(x)
  [my,ny]=size(y)
  if((nx~=ny)|(mx~=1)|(my~=1)),
     disp('data dimension error')
     abort
  end
  u=zeros(m+1,nx)
  for i=1:m+1 do
     for j=1:nx do
        u(i,j)=x(j)^(i-1)
     end
  end
  coef=(u*u')^(-1)*u*y'
  X=poly(0,s)
  P=poly(coef(m+1),s,'coeff')
  for i=1:m do
    P=P*X+coef(m+1-i)
  end
endfunction


