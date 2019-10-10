function x=chebpoints(n,varargin)
    l=-1
    r=1
    if length(varargin)>0 then
      if length(varargin)==2 then 
        l=varargin(1)
        r=varargin(2)
      else
        error('Wrong number of input parameters')
      end    
    end
    k=0:n
    x=l+0.5*(r-l)*(cos(k*%pi/n)+1)
endfunction
