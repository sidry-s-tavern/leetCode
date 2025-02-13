public class Main {
    public static void main(String[] args) {
        MergeSortedArray mSA = new MergeSortedArray();
        int[]nums1 = new int[]{2,0};
        mSA.merge(nums1, 2, new int[]{1}, 1);
        UsefullMethods.printIntArray(nums1);
    }
}