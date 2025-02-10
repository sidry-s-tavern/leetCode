public class UsefullMethods {
    public static void printIntArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println(nums[nums.length - 1] + "]");
    }

    public static void printIntArray(int[] nums, String start) {
        System.out.print(start);
        printIntArray(nums);
    }
}
