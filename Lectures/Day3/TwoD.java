import java.util.*;

public class TwoD {
    private int n;
    private int m;
    private int[][] arr;

    public TwoD(int n, int m) {
        this.n=n;
        this.m=m;
        arr = new int[n][m];
    }

    public void createArr() {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<n; i++) {
            for (int j= 0; j< m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
    }

    public void rowTraversal() {
        for (int i=0; i<n; i++) {
            for (int j= 0; j< m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void colTraversal() {
        for (int i=0; i<m; i++) {
            for (int j= 0; j< n; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void diaTraversal() {
        for (int i=0; i<Math.min(n, m); i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
    }

    public void spiralTraversal() {
        int minr = 0, minc = 0;
        int maxr = n - 1, maxc = m - 1;
        int k= n*m;
        int c=0;

        while (c < k) {
            for (int i=minc; i <= maxc && c < k; i++) {
                System.out.print(arr[minr][i] + " ");
                c++;
            }
            minr++;

            for (int i=minr; i <= maxr && c < k; i++) {
                System.out.print(arr[i][maxc] + " ");
                c++;
            }
            maxc--;

            for (int i=maxc; i>= minc && c < k; i--) {
                System.out.print(arr[maxr][i] + " ");
                c++;
            }
            maxr--;

            for (int i=maxr; i>= minr && c < k; i--) {
                System.out.print(arr[i][minc] + " ");
                c++;
            }
            minc++;
        }
        System.out.println();
    }
}
