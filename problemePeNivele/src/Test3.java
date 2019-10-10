import java.util.Scanner;

public class Test3 {
    public static Scanner sc=new Scanner(System.in);

    public static void scrie_mat(int[][] a,int n){
        System.out.println("Matricea este :");
        for (int i = 0; i <n ; i++) {
            System.out.println();
            for (int j = 0; j <n ; j++) {
                System.out.print(a[i][j]+" ");
            }
        }
    }
    public  static boolean testmatrice(int[][] a, int n){
        boolean ok=false;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i+j <n && a[i][j]==i+j+1)
                    ok=true;
                else
                    if(i+j >n && a[i][j]==i+j+1-n)
                        ok=true;
                    else
                        ok=false;
            }
        }
        return ok;
    }

    public static void main (String[] args){
        int n;
        System.out.println("n=");
        n=sc.nextInt();
        int[][] a=new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        boolean ok=testmatrice(a, n);
        if (ok==true)
            System.out.println("Matricea este patratica.");
                    else
                        System.out.println("Matricea nu este patratica.");
        scrie_mat(a,n);
        }
}
