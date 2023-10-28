import java.util.*;

class ThreeSum {
    public static void main(String[] args) {
        int arr[] = { 1, -1, -1, 0 };
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> temp = null;
        for (int i = 0; i < nums.length - 1; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                if (nums[i] + nums[low] + nums[high] == 0) {
                    temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[low]);
                    temp.add(nums[high]);
                    output.add(temp);

                    int one = nums[low];
                    int two = nums[high];
                    while (low < high && nums[low] == one) {
                        low++;
                    }
                    while (low < high && nums[high] == two) {
                        high--;
                    }
                }
                if (nums[i] + nums[low] + nums[high] < 0) {
                    low++;
                }

                if (nums[i] + nums[low] + nums[high] > 0) {
                    high--;
                }
            }
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                i += 1;
            }
        }
        return output;
    }
}
