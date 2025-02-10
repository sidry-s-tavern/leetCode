//[1,2,3] -> [1,2,4]
//[4,3,2,1] -> [4,3,2,2]
//[9] -> [1,0]
public class PlusOne {
    public int[] plusOne(int[] digits) {
        System.out.println(arrayOfIntToStr(digits));
        long integer = Long.parseLong(arrayOfIntToStr(digits)) + 1;
        digits = stringToArrayOfInt(Long.toString(integer));
        return digits;
    }

    public String arrayOfIntToStr(int[] arrayOfInt) {
        StringBuilder temp = new StringBuilder();
        for (int e : arrayOfInt) temp.append(e);
        return temp.toString();
    }

    public int[] stringToArrayOfInt(String str) {
        int[] result = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i)-48;
        }
        return result;
    }
}
