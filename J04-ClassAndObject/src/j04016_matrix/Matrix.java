package j04016_matrix;

import java.util.Scanner;

public class Matrix {
    private int row, col;
    private int[][] a;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setA(int[][] a) {
        this.a = a;
    }

    public void nextMatrix(Scanner sc) {
        int a[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        this.setA(a);
    }

    public Matrix mul(Matrix b) {
        Matrix ans = new Matrix(this.row, b.col);
        int a[][] = new int[this.row][b.col];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < b.col; j++){
                a[i][j] = 0;
                for (int k = 0; k < b.row; k++) {
                    a[i][j] += this.a[i][k] * b.a[k][j];
                }
            }
        }
        ans.setA(a);
        return ans;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                res += a[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }
}
