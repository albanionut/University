import java.util.Scanner;

public class Sortare {
    public static Scanner sc = new Scanner(System.in);
    public static int n;
    public static int[] a;

    public static void Citire_v() {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static void Afisare_v() {
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void Sortare_v() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j])
                    int aux=a[i];
                    a[i]=a[j];
                    a[j]=aux;
            }
        }
    }
    public static void main (Strings[] args){
        System.out.println("Cate elemente are vectorul ?:");
        n=sc.nextInt();
        []a =new int[n];
        Citire_v();
        Sortare_v();
        Afisare_v();
        sc.close();
    }
}

