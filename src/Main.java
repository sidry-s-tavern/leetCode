public class Main {
    public static void main(String[] args) {
        RankTransformOfAnArray rankTransformOfAnArray = new RankTransformOfAnArray();
//        int[] nums = {40, 10, 20, 30};
//        int[] nums = {100,100,100};
        int[] nums = {37,12,28,9,100,56,80,5,12};
//        int[] nums = {-4};
//    [100,100,100]
//    [37,12,28,9,100,56,80,5,12]

        UsefullMethods.printIntArray(rankTransformOfAnArray.arrayRankTransform(nums));
        rankTransformOfAnArray.foo(nums);
    }
}