import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int[] newArray = new int[]{};
        newArray = removeDup(nums);
        replaceArray(nums,newArray);
        return nums.length;
    }

    public int[] removeDup(int[]nums) {
        int curr=-1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int num : nums) {
            if (curr < num) {
                curr = num;
                list.add(curr);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i]=list.get(i);
        }
        return result;
    }

    public void replaceArray(int[] curr, int[] next) {
        int i=0;
        for(int e: next)
        {
            curr[i] = e;
            i++;
        }
    }

    public void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println(nums[nums.length - 1] + "]");
    }
}
