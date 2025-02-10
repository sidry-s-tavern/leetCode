//a (2) + b (2) = sum(2)
// 11(2) + 1(2) = 100(2)
public class AddBinary {
    public String addBinary(String a, String b) {
        Integer res = parseBin(a) + parseBin(b);
        return Integer.toBinaryString(res);
    }

    public int parseBin(String a) {
        int res = 0;
        for (int i = 0; i < a.length(); i++) {
            switch (a.charAt(i)) {
                case '1': {
                    res += (int) Math.pow(2, a.length() - i - 1);
                    break;
                }
                case '0': {
                    break;
                }
                default: {
                    return -1;
                }
            }
        }
        return res;
    }

}
