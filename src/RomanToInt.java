//        Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
public class RomanToInt {
    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = romanToIntChar(s.charAt(i));
            int next = 0;
            if (i != s.length()-1) {
                next = romanToIntChar(s.charAt(i + 1));
                if (curr < next) {
                    res = res + next - curr;
                    System.out.println("i: "+i);
                    i++;
                    System.out.println("i: "+i);
                } else {
                    res += curr;
                }
            } else {
                res += curr;
            }
            System.out.println("index: "+i);
            System.out.println(s.charAt(i) + " " + romanToIntChar(s.charAt(i)));
            System.out.println("res: "+res);
            System.out.println();
        }
        return res;
    }

    public int romanToIntChar(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }
}
