package linear.lists;

public class TestList {

	public static void main(String[] args) {
		Lista l = new Lista();
		l.addIncep(7);
		l.addIncep(5);
		l.addIncep(6);
		l.addIncep(10);
		l.afis();

//		try {
//			int x = l.deleteFirst();
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
		
		
		l.afis();
		l.bubbleSort();
		l.afis();
		
	}
}
