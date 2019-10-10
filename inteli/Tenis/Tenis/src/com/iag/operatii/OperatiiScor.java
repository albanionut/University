package com.iag.operatii;
	import java.util.List;

import com.iag.model.*;
public class OperatiiScor {

	public static int seteazaScor(ScorJoc scor) {
		int nr1 = 0, nr2 = 0;

		for (int i = 0; i < 3; i++) {
			if (nr1 < 2 && nr2 < 2) {

				if (scor.getJoc().getJucator1().equals(OperatiiTurnee.alegeCastigator(scor.getJoc()))) {
					scor.addSet(new Set(6, (int) (Math.random() * 4+1)));
					nr1++;
				} else {
					scor.addSet(new Set((int) (Math.random() * 4+1), 6));
					nr2++;
				}
			}
		}
		scor.getJoc().getJucator1().setSeturi(scor.getJoc().getJucator1().getSeturi()+nr1+nr2);
        scor.getJoc().getJucator2().setSeturi(scor.getJoc().getJucator2().getSeturi()+nr1+nr2);
		
		if(nr1==2)
			return 1;
		return 2;
	}
	public static String setMax(List<Jucator>jucator){
		int max=0, pozMax=0;
		for(int i=0 ; i<jucator.size(); i++)
		{
			if(jucator.get(i).getSeturi()>max)
				{
				 max=jucator.get(i).getSeturi();
				 pozMax = i;
				}
			
		}
		return jucator.get(pozMax).toString();
	}
	

	}

