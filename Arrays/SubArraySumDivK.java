import java.util.*;

public class SubArraySumDivK {
    public static void main(String[] args) {
        int arr[] = { 2, -6, 3, 1, 2, 8, 2, 1 };
        System.out.println(subarraySum(arr, 7));
    }

    public static int subarraySum(int[] nums, int k) {
        // using prefix like we used in sub array sum equal K but keep in mind of
        // negative remainder.
        // If negative remainder then add it again with the value of k to make it
        // positive.
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int count = 0;
        int prefixSum = 0;
        int rem = 0;
        for (int i : nums) {
            prefixSum += i;
            rem = prefixSum % k;
            if (rem < 0) {
                rem = rem + k;
            }
            if (hm.containsKey(rem)) {
                count += hm.get(rem);
                hm.put(rem, hm.get(rem) + 1);
            } else
                hm.put(rem, 1);

        }
        hm.forEach((key, value) -> System.out.println(key + " " + value));
        return count;
    }
}
