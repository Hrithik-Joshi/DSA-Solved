public class BuySellStock {
    public static void main(String[] args) {
        int[] var = new int[] { 7, 1, 5, 3, 6, 2 };
        System.out.println(maxProfit(var));
    }

    public static int maxProfit(int[] nums) {
        int minPrice = Integer.MAX_VALUE;
        int maxDiff = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minPrice) {
                minPrice = nums[i];
            }
            int diff = nums[i] - minPrice;
            if (diff > maxDiff) {
                maxDiff = nums[i] - minPrice;
            }
        }
        return maxDiff;
    }
}
