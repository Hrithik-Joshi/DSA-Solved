import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 1, 3, 4, 2, 1 };
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> output = new ArrayList<>();
        if (nums.length == 1) {
            return output;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] = nums[Math.abs(nums[i]) - 1] * (-1);
            } else {
                output.add(Math.abs(nums[i]));
            }
        }
        return output;
    }
}
