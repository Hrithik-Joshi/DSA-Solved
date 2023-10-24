import java.util.ArrayList;

/**
 * RemoveDuplicates
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = { 0,0,1,1,1,2,2,3,3,4 };
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        // Not using this appraoch beacasue of memory constraint
        // ArrayList<Integer> al = new ArrayList<>();
        // for (int i : nums) {
        //     if (!al.contains(i)) {
        //         al.add(i);
        //     }
        // }
        // for(int i=0;i<al.size();i++){
        // nums[i]=al.get(i);
        // }
        // return al.size();

        // Using two pointer approach. Keep moving forward if the values are same. and replace of it is not same
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}