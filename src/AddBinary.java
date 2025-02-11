//a (2) + b (2) = sum(2)
// 11(2) + 1(2) = 100(2)
public class AddBinary {
    public String addBinary(String a, String b) {
        return calcOfBin(a, b);
    }

    public String calcOfBin(String a, String b) {
        StringBuilder aBuilder = new StringBuilder(a);
        aBuilder.reverse();
        StringBuilder bBuilder = new StringBuilder(b);
        bBuilder.reverse();
        StringBuilder c = new StringBuilder();
        System.out.println("a:" + a + " aBuild:" + aBuilder);
        System.out.println("b:" + b + " bBuild:" + bBuilder);
        char mind = '0';
        int x = 0;
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            x = sumOfChars(aBuilder.charAt(i), bBuilder.charAt(i), mind);
            switch (x) {
                case 0: {
                    c.append('0');
                    break;
                }
                case 1: {
                    c.append('1');
                    mind = '0';
                    break;
                }
                case 2: {
                    c.append('0');
                    mind = '1';
                    break;
                }
                case 3: {
                    c.append('1');
                    mind = '1';
                    break;
                }
                default:
                    return null;
            }
        }
        for (int i = Math.min(a.length(), b.length()); i < Math.max(a.length(), b.length()) - 1; i++) {
            x = (a.length() > b.length()) ? sumOfChars(aBuilder.charAt(i), '0', mind) : sumOfChars('0', bBuilder.charAt(i), mind);
            switch (x) {
                case 0: {
                    c.append('0');
                    break;
                }
                case 1: {
                    c.append('1');
                    mind = '0';
                    break;
                }
                case 2: {
                    c.append('0');
                    mind = '1';
                    break;
                }
                case 3: {
                    c.append('1');
                    mind = '1';
                    break;
                }
                default:
                    return null;
            }
        }
        if (mind == '1') c.append('1');
        return c.reverse().toString();
    }

    public int sumOfChars(char c1, char c2, char c3) {
        return Integer.parseInt(String.valueOf(c1)) + Integer.parseInt(String.valueOf(c2)) + Integer.parseInt(String.valueOf(c3));
    }
}
