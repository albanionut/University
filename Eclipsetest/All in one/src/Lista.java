package linear.lists;

public class Lista {

	Node prime;

	Lista() {
		prime = null;
	}

	void addIncep(int el) {
		Node p = new Node(el);
		p.next = prime;
		prime = p;

	}

	void afis() {
		for (Node p = prime; p != null; p = p.next) {
			System.out.print(p.info + " " );
			
		}
		System.out.println();

	}

	void addSfarsit(int el) {

		Node p = new Node(el);

		if (prime == null) {

			prime = p;

		} else {

			Node q = prime;
			for (q = prime; q.next != null; q = q.next)
				;
			q.next = p;
		}

	}

	int deleteFirst() throws Exception {

		if (prime == null)
			throw new Exception("Empty list ");

		else {
			int x = prime.info;
			prime = prime.next;
			return x;
		}
	}

	void deleteSomething(int el) {

		if (prime == null) {
			System.out.println("Empty list ");

		} else if (prime.info == el) {
			prime = prime.next;

		} else {

			Node q = prime;
			for (q = prime; q.next != null && q.next.info != el; q = q.next)
				;

			if (q.next == null) {

				System.out.println("Error");

			} else {
				q.next = q.next.next;

			}
		}

	}
	
	void bubbleSort() {
		boolean isSorted;
		
		do {
			isSorted = true;
			for(Node p = prime; p.next!= null; p = p.next) {
				if(p.info > p.next.info) {
					int aux = p.info;
					p.info = p.next.info;
					p.next.info = aux;
					isSorted = false;
				}
			}
		} while(isSorted == false);
	}
	
	
	
	
	
	
	

}
