function aplicatia(cale)
    exec(cale+'\datas.sci',-1)
    exec(cale+'\intg2.sci',-1)
    [fct,a,b,finf,fsup]=datas();
    integ=intg2(a,b,finf,fsup,fct);
    printf('computed_integral = %f\n',integ)
endfunction
