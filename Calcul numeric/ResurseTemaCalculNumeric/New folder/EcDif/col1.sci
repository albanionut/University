function [x,w]=col1()  //col1(path)
   //exec(path+'\fsub.sci',-1)
   //exec(path+'\dfsub.sci',-1)
   //exec(path+'\gsub.sci',-1)
   //exec(path+'\dgsub.sci',-1)
   //exec(path+'\guess.sci',-1)
   n=1;
   m=[4];
   a=1;
   b=2;
   x=a:0.1:b;
   fixpnt=0;
   zeta=[1,1,2,2];
   ipar=zeros(1,11);
   ipar(3)=1;ipar(4)=2;ipar(5)=2000;ipar(6)=200;ipar(7)=1;
   ltol=[1,3];
   tol=[1.e-11,1.e-11];
   z=bvode(x,n,m,a,b,zeta,ipar,ltol,tol,fixpnt,fsub,dfsub,gsub,dgsub,guess);
   w=z(1,:)
endfunction

function f=fsub(x,z)
   f=(1-6*x**2*z(4)-6*x*z(3))/x**3;
endfunction

function df=dfsub(x,z)
   df=[0,0,-6/x**2,-6/x];
endfunction

function g=gsub(i,z)
   g=[z(1),z(3),z(1),z(3)];
   g=g(i);
endfunction

function dg=dgsub(i,z)
   dg=[1,0,0,0;0,0,1,0;1,0,0,0;0,0,1,0];
   dg=dg(i,:);
endfunction

function [z,dmval]=guess(x)
   // nefolosit
   z=0
   dmval=0
endfunction