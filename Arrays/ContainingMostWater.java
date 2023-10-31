public class ContainingMostWater {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int low = 0;
        int high = height.length - 1;
        int currArea = 0;
        while (low < high) {
            currArea = Math.min(height[low], height[high]) * (high - low);
            if (maxArea < currArea) {
                maxArea = currArea;
            }
            if (height[low] < height[high]) {
                low++;
            }
            else {
                high--;
            }
        }
        return maxArea;
    }
}
