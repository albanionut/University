package Liste_liniare;

public class Lista {
	Nod prim;

	Lista() {
		prim = null;
	}

	int sterge_incep() throws Exception {
		if (prim == null)
			throw new Exception("Lista vida");
		else {
			int x = prim.info;
			prim = prim.urm;
			return x;
		}
	}
	void sortare() {
		
	}

	void sterge_el_cu_infd(int el) throws Exception {
		if (prim == null)
			throw new Exception("Lista vida");
		else {
			Nod q;
			if (prim.info == el)
				prim = prim.urm;
			else {

				for (q = prim; q.urm != null && q.urm.info != el; q = q.urm)
					;
				if (q.urm == null)
					System.out.println("Elementul nu este in lista ");
				else
					q.urm = q.urm.urm;
			}
		}
	}

	void afis() {
		for (Nod p = prim; p != null; p = p.urm)
			System.out.println(p.info + " ");

	}

	void ad_incep(int el) {
		Nod p = new Nod(el);
		p.urm = prim;
		prim = p;
	}

	void ad_sfarsit(int el) {
		Nod p = new Nod(el);
		if (prim == null)
			prim = p;
		else {
			Nod q;
			for (q = prim; q.urm != null; q = q.urm)
				;
			q.urm = p;
		}
	}
}
