public class MaximumCards {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 1 };
        System.out.println(maxScore(arr, 3));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int res = 0;
        // include all elements from start in our window
        for (int i = 0; i < k; i++) {
            res += cardPoints[i];
        }
        int curr = res;
        // Now remove the last element from window and insert the last element of the
        // array
        // here inserting and deleting simply means the sum and minus of the curr
        // variable
        for (int i = k - 1; i >= 0; i--) {
            curr -= cardPoints[i];
            curr += cardPoints[cardPoints.length - k + i];
            res = Math.max(curr, res);
        }
        return res;
    }
}
