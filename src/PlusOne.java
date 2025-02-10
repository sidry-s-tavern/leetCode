//[1,2,3] -> [1,2,4]
//[4,3,2,1] -> [4,3,2,2]
//[9] -> [1,0]
public class PlusOne {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1]+=1;
        plusOneIfNine(digits);
        return digits;
    }
    public int[] plusOneIfNine(int[] digits)
    {
        int[]temp = new int[digits.length+1];
        System.arraycopy(digits, 0, temp, 0, digits.length);
        temp[digits.length-1]=1;
        temp[digits.length]=0;
        UsefullMethods.printIntArray(temp);
        return temp;
    }
}
