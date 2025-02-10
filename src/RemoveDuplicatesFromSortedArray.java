import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        replaceArray(nums,removeDup(nums));
        return removeDup(nums).length;
    }

    public int[] removeDup(int[]nums) {
        int curr=-2147000;
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
        System.arraycopy(next,0,curr,0,next.length);
        Arrays.copyOf(curr,next.length);
    }

    public void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println(nums[nums.length - 1] + "]");
    }
}
