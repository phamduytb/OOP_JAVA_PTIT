package demojava;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m, p;
        n = sc.nextInt();
        m = sc.nextInt();
        p = sc.nextInt();
        int a[][] = new int[n][m];
        int b[][] = new int[m][p];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<m; i++){
            for (int j=0; j<p; j++){
                b[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<p; j++){
                int tmp = 0;
                for(int k=0; k<m; k++){
                    tmp +=a[i][k]*b[k][j];
                }
                System.out.print(tmp+" ");
            }
            System.out.println();
        }
    }
}
