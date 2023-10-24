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
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : nums) {
            if (!al.contains(i)) {
                al.add(i);
            }
        }
        int count = nums.length - al.size();
        for(int i=0;i<al.size();i++){
        nums[i]=al.get(i);
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
        return count;

    }
}