
public class TestLista {
	public static void main(String[] args) {
		Lista l = new Lista();
		 l.ad_incep(7);
		 l.ad_incep(9);
		 l.ad_sf(6);
		 l.ad_sf(8);
		 try {
			 l.stergere();
			 
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		
		 try {
			 l.sterge(7);
			 
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 l.afis();
	 	}	
	}

