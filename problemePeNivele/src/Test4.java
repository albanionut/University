import java.util.Scanner;
public class Test4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cate elemente are vectorul 1 ?:");
        int n=sc.nextInt();
        System.out.println("Cate elemente are vectorul 2 ?:");
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        int[] c=new int[n+m];
        int t=-1;
        for (int i = 0; i <=n-1 ; i++) {
            a[i]=sc.nextInt();
            c[i]=a[i];
            t++;
        }
        for (int j = 0; j <=m-1 ; j++) {
        b[j]=sc.nextInt();
        c[t]=b[j];
        }
        for (int i = 0; i <=n+m-1 ; i++) {
            System.out.println(c[i]);
        }
    }
}
