import java.util.*;
import java.util.stream.Collectors;

public class RankTransformOfAnArray {
//    [40,10,20,30]
//    [100,100,100]
//    [37,12,28,9,100,56,80,5,12]

    public int[] arrayRankTransform(int[] arr) {
        return dumpRank(arr);
    }

    public int[] dumpRank(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int k = i + 1;
            if (Arrays.stream(array).filter(e -> e > k).min().isPresent())
                replaseDigitToMin(array, Arrays.stream(array).filter(e -> e > k).min().getAsInt(), i + 1, i);
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

    public void foo(int[] digits) {
        int[][] digitsSqr = new int[digits.length][1];
        for (int i = 0; i < digits.length; i++) {
            digitsSqr[i][0] = digits[i];
        }
        if (Arrays.stream(digits).min().isPresent()) {
            for (int i = 0; i < digitsSqr.length; i++) {
                if (digitsSqr[i][0] == Arrays.stream(digits).min().getAsInt()) {
                    digitsSqr[i][1] = 1;
                }
            }
        }
    }

    public int[] workArray(int[] digits, int[] except) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < digits.length; i++) {
            boolean isExcepted = false;
            for (int j = 0; j < except.length; j++) {
                if (digits[i] == except[j]) isExcepted = true;
            }
            if (!isExcepted) list.add(digits[i]);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return new int[0];
    }
}
