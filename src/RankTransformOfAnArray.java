import java.util.Arrays;

public class RankTransformOfAnArray {
//    [40,10,20,30]
//    [100,100,100]
//    [37,12,28,9,100,56,80,5,12]

    public int[] arrayRankTransform(int[] arr) {
        return dumpRank(arr);
    }

    public int[] dumpRank(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int k = i+1;
            if(Arrays.stream(array).filter(e -> e > k).min().isPresent())
                replaseDigitToMin(array,Arrays.stream(array).filter(e -> e > k).min().getAsInt(),i+1,i);
        }
        return array;
    }

    public void replaseDigitToMin(int[] digits, int min, int replaseble, int except) {
        for (int d : digits) {
            if (d > except) {
                for (int i = 0; i < digits.length; i++) {
                    if (digits[i] == min)
                        digits[i] = replaseble;
                }
            }
        }
    }
}
