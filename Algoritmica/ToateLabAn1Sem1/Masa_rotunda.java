package backtracking;

public class Masa_rotunda {
static int[]x;
	static void backtrack(int k) {
		if(k==x.length) {
			retsol();
		}
		else for(x[k]=0;x[k]<=x.length-1;x[k]++) {
			if( cont(k)) {
				backrec(k+1);
			}
			
		}
	}
	public static void main(String[] args) {
		

	}

}
