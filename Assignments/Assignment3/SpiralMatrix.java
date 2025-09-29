class Solution{
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
