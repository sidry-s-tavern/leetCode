public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i < nums.length-1; i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target) return new int[]{i,j};
            }
        }
        return new int[] { -1, -1 };
    }

    public void printTwoSum(int[] nums, int target){
        int[] res = twoSum(nums, target);
        for (int re : res) {
            System.out.print(re + " ");
        }
    }
}