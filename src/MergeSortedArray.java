//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
//To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
// and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[nums1.length];
        int indexNum1 = 0, indexNum2 = 0;
        if (m == 0) temp = nums2;
        else if (n == 0) temp = nums1;
        else {
            for (int i = 0; i < temp.length; i++) {
                System.out.println("indexNum1:"+indexNum1+" indexNum2:"+indexNum2);
                if (indexNum1 < m) {
                    if (nums1[indexNum1] < nums2[indexNum2]) {
                        temp[i] = nums1[indexNum1];
                        indexNum1++;
                    } else {
                        if (indexNum2 < n) {
                            temp[i] = nums2[indexNum2];
                            indexNum2++;
                        }
                    }
                } else {
                    temp[i] = nums2[indexNum2];
                    indexNum2++;
                }
            }
        }
        replaceArray(nums1, temp);
    }

    public static void replaceArray(int[] curr, int[] next) {
        System.arraycopy(next, 0, curr, 0, next.length);
    }
}
