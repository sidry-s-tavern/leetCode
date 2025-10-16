public class RunningSumOf1dArray {
    public int[] foo(int[] array) {

        if (array.length == 0)
            return new int[0];
        else if (array.length == 1)
            return array;

        int[] res = new int[array.length];
        res[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            res[i] = array[i] + res[i - 1];
        }
        return res;
    }
}
