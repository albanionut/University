package src1;

public class Salariat {
	public static final double impozit = 0.15;
	public String nume;
	public String functia;
	public int varsta;
	public double salariuBrut;

	public Salariat(String num, String func, int ani, double sal) {
		nume = num;
		functia = func;
		varsta = ani;
		salariuBrut = sal;
	}

	public double salariuNet() {
		return salariuBrut * (1 - impozit);
	}

	public void afisare() {
		System.out.println("Nume salariat: " + nume);
		System.out.println("Functia: " + functia);
		System.out.println("Varsta: " + varsta);
		System.out.println("SalariuBrut: " + salariuBrut + " lei");
		System.out.println("SalariuNet: " + salariuNet() + " lei \n");
	}

	public static void main(String[] args) {
		Salariat s1 = new Salariat("Popa Ion", "contabil", 3,6730);
		Salariat s2 = new Salariat("Rada Alina", "secretara", 2,8600);
		System.out.println("Impozit: " + (int) (Salariat.impozit * 100) + "% \n");
		s1.afisare();
		s2.afisare();

	}

}
