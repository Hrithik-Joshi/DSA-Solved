/**
 * Duplicate
 */
public class Duplicate {

    public static void main(String[] var0) {
        int[] var1 = new int[] {3,1,3,4,2 };
        System.out.println(findDuplicate(var1));
    }

    public static int findDuplicate(int[] var0) {
        var0[0] *= -1;
        for (int var1 = 0; var1 < var0.length; ++var1) {
            int var2 = Math.abs(var0[var1]);
            if (var0[var2] <= 0) {
                return Math.abs(var0[var1]);
            }

            var0[var2] *= -1;
        }

        return var0.length;
    }
}