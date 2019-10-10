
public class Lista {
	Nod prim;

	Lista() {
		prim = null;
	}

	void ad_incep(int el) {
		Nod p = new Nod(el);
		p.urm = prim;
		prim = p;
	}

	void ad_sf(int el) {
		Nod p = new Nod(el);
		Nod q = new Nod(el);
		p.info = el;
		p.urm = null;
		if (prim == null)
			prim = p;
		else
			q = prim;
		while (q.urm != null) {
			q = q.urm;
		}
		q.urm = p;
	}

	int stergere() throws Exception {

		if (prim == null)
			throw new Exception("Lista vida");
		else {
			int x = prim.info;
			prim = prim.urm;
			return x;
		}

	}

	void sterge(int el) throws Exception {
		Nod q = new Nod(el);
		if (prim == null)
			throw new Exception("Lista vida");
		else {
			if (prim.info == el)
				prim = prim.urm;
			else {
				q = prim;
				while ((q.urm == null) && (q.urm.info != el)) {
					q = q.urm;
				}
			}
			if (q.urm != null)

				q.urm = q.urm.urm;
			else {

				System.out.println("elementul nu e in lista");

			}
		}
	}


	void afis() {
		for (Nod p = prim; p != null; p = p.urm) {
			System.out.println(p.info + " ");
		}
	}

}
