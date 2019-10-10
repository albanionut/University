package Liste_liniare;

public class TestLista {

	public static void main(String[] args) {
		Lista l = new Lista();
		l.ad_incep(7);
		l.ad_incep(9);
		l.afis();
		try { //incearca sa stearga
			int x = l.sterge_incep();
			l.sterge_el_cu_infd(9);
		} catch (Exception e) {//in catch afiseaza exceptia
			System.out.println(e);
		}
	}
}
