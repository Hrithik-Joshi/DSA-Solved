import java.util.*;

public class SubArraySumEqualK {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        System.out.println(subarraySum(nums, 2));
    }

    public static int subarraySum(int[] nums, int k) {
        // If there is a concept of subarray try to use prefix sum appraoch as mentioned
        // below.
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        int sum = 0;
        hm.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (hm.containsKey(sum - k)) {
                count += hm.get(sum);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
