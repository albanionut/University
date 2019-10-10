function u=intg2(a,b,finf,fsup,fct)
    deff('y=k1(x)','y=integrate(fct,''y'',finf(x),fsup(x))')
    u=intg(a,b,k1)
endfunction
