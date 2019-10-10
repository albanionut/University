package homework2;

import java.util.Scanner;

public class PascalTriangle {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        showPascalTriangle(n);
    }

    public static void showPascalTriangle(int n)
    {
        int[][] matrice = new int[n][n];

        for (int j = 0;j < n; j++)
        {
            for (int i = 0; i <= j; i++)
            {
                // Prima si ultima valoare de pe line e 1
                if (j == i || i == 0)
                    matrice[j][i] = 1;
                else // Restul valorilor e adunarea celor de mai sus
                    matrice[j][i] = matrice[j-1][i-1] + matrice[j-1][i];
                System.out.print(matrice[j][i]);
            }
            System.out.println();
        }
    }
}

