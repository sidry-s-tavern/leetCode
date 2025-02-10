import java.util.Arrays;

//[1,2,3] -> [1,2,4]
//[4,3,2,1] -> [4,3,2,2]
//[9] -> [1,0]
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int nines = countOfNinesAtEnd(digits);
        if (nines != digits.length) {
            digits[digits.length - nines - 1] += 1;
            for (int i = digits.length - nines; i < digits.length; i++) {
                digits[i] = 0;
            }
        } else {
            digits = voulmeUpArrayOfInt(digits);
            for (int i = 0; i < digits.length; i++) {
                if (digits[i] == 9) digits[i] = 0;
            }
            digits[0]=1;
        }
        return digits;
    }

    private int countOfNinesAtEnd(int[] digits) {
        int nines = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                nines++;
            } else break;
        }
        return nines;
    }

    public int[] voulmeUpArrayOfInt(int[] digits) {
        return Arrays.copyOf(digits, digits.length + 1);
    }

}
