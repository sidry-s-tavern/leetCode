import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.sort;

class Judge {
    int[] nums = new int[]{3, 2, 2, 3}; // Input array
    int val = 2; // Value to remove
    int[] expectedNums = new int[]{2, 2}; // The expected answer with correct length.

    // It is sorted with no values equaling val.
    public void justice() {
        RemoveElement removeElement = new RemoveElement();
        UsefullMethods.printIntArray(nums, "nums: ");
        System.out.println("val: " + val);
        int k = removeElement.removeElement(nums, val); // Calls your implementation
        assert k == expectedNums.length;

        sort(nums, 0, k); // Sort the first k elements of nums
        UsefullMethods.printIntArray(nums, "new nums: ");
        System.out.println("k:"+k);
        for (int i = 0; i < nums.length; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int num : nums) {
            if (val != num) {
                list.add(num);
            }
        }
        int[] temp = copyIntegerToInt(list.toArray(new Integer[0]));
        System.arraycopy(temp, 0, nums, 0, list.size());
        return temp.length;
    }

    public int[] copyIntegerToInt(Integer[] arrayOfInteger) {
        int[] res = new int[arrayOfInteger.length];
        for (int i = 0; i < arrayOfInteger.length; i++) {
            res[i] = arrayOfInteger[i];
        }
        return res;
    }
}
