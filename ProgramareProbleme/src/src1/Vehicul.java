package src1;

public class Vehicul {
	public String categoria;
	public String marca;
	public int nrRoti;
	public boolean aerCond;
	public boolean volan;
	public String culoare;

	public Vehicul(String nume, boolean aerCond, String culoare) {
		categoria = "automobil";
		marca = nume;
		nrRoti = 4;
		this.aerCond = aerCond;
		volan = true;
		this.culoare = culoare;
	}

	public Vehicul(String nume, String culoare) {
		categoria = "bicicleta";
		marca = nume;
		nrRoti = 2;
		aerCond = false;
		volan = false;
		this.culoare = culoare;
	}

	public void afisare() {
		System.out.println("Categorie vehicul " + categoria);
		System.out.println("Denumire " + categoria + ": " + marca);
		System.out.println("Nr.roti: " + nrRoti);
		System.out.println("Culoare: " + culoare);
		System.out.print("Aer conditionat: ");
		
		if (aerCond)
			System.out.println("da");
		else
			System.out.println("nu");

		System.out.print("Volan: ");
		
		if (volan)
			System.out.println("da");
		else
			System.out.println("nu");
		System.out.println("");
	}

	public static void main(String[] args) {
		Vehicul b1, m1, m2;
		b1 = new Vehicul("Pegas", "rosie");
		m1 = new Vehicul("Dacia", false, "verde");
		m2 = new Vehicul("Cielo", true, "gri");
		b1.afisare();
		m1.afisare();
		m2.afisare();

	}

}
