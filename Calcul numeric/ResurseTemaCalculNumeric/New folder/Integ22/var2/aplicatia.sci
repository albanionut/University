function aplicatia(cale)
    exec(cale+'\datas.sci',-1)
    exec(cale+'\integr.sci',-1)
    [fct,a,b,finf,fsup,tol]=datas();
    [integ,er]=integr(fct,a,b,finf,fsup,tol);
    printf('error_code = %d\n',er)
    printf('computed_integral = %f\n',integ)
endfunction
