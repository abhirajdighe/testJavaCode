public class maximumSum {
    
    public static int findMaxSumPath(int[] X, int[] Y) {
        int sumX = 0, sumY = 0, result = 0;
        int i = 0, j = 0;
        int m = X.length, n = Y.length;

        // Traverse both arrays
        while (i < m && j < n) {
            // If current elements of both arrays are same
            if (X[i] == Y[j]) {
                result += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;

                i++;
                j++;
            } else if (X[i] < Y[j]) {
                sumX += X[i++];
            } else {
                sumY += Y[j++];
            }
        }
        
        // Adding remaining elements of X[]
        while (i < m) {
            sumX += X[i++];
        }

        // Adding remaining elements of Y[]
        while (j < n) {
            sumY += Y[j++];
        }

        // return max  of sumX and sumY
        result += Math.max(sumX, sumY);

        return result;
    }

    public static void main(String[] args) {
        int[] X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 };
        int[] Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 };
        
        int maxSum = findMaxSumPath(X, Y);
        System.out.println("Maximum sum path is: " + maxSum);
    }
}
