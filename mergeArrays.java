public class mergeArrays {
    public static void rearrange(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        // Moving all non-zero elements of X[] to the end
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k--] = X[i];
            }
        }

        int i = n; 
        int j = 0;
        k = 0; 
         

        while (k < m) {
            if ((i < m && X[i] <= Y[j]) || (j == n)) {
                X[k] = X[i++];
            }
            else {
                X[k] = Y[j++];
            }
            k++;
        }
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };
        
        rearrange(X,Y);
        

        for(int i = 0; i < X.length; i++){
            System.out.print(X[i] + " ");
        }
    }
}
