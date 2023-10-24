public class SortColors {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sortColors(arr);
    }

    public static void sortColors(int[] nums) {
        int zero=0;
        int one = 0;
        int two = 0;
        // using swtich case to count the zero one and two and making changes in the
        // array accordingly
        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case 1:
                    one += 1;
                    break;
                case 2:
                    two += 1;
                    break;
                case 0:
                    zero += 1;
                    break;
            }
        }
        int j = 0;
        while (zero > 0) {
            nums[j] = 0;
            zero--;
            j++;
        }
        while (one > 0) {
            nums[j] = 1;
            one--;
            j++;
        }
        while (two > 0) {
            nums[j] = 2;
            two--;
            j++;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
