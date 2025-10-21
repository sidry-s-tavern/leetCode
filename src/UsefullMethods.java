public class UsefullMethods {
    public static void printIntArray(int[] nums) {
        if(nums.length==0)
            return;
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

    public static int[] getIntFromInteger(Integer[] arrayOfInteger) {
        int[] res = new int[arrayOfInteger.length];
        for (int i = 0; i < arrayOfInteger.length; i++) {
            res[i] = arrayOfInteger[i];
        }
        return res;
    }

    public static void printStringArray(String[] strings)
    {
        System.out.println("----");
        for(String s:strings)
        {
            System.out.println(s);
        }
        System.out.println("----");
    }
}
