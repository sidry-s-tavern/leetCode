/*
(){}[]
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.
"()"->true
"()[]{}"->true
"(]"->false
"([])"->true
"({)}"->false
""->false
"ff"->false
*/
public class ValidParentheses {
    public boolean isValid(String s) {
//        System.out.print(s + " -> ");
        if (!initialTests(s)) return false;
        boolean res = false;
        res = foo2(s);
        return res;
    }

//    private boolean foo(String s) {
//        if (checkBrakets(s, '(')) return false;
//        if (checkBrakets(s, '{')) return false;
//        if (checkBrakets(s, '[')) return false;
//        return true;
//    }

//    private boolean checkBrakets(String s, char c) {
//        System.out.println("checkBrakets with s:" + s + " & c:" + c);
//        if (s.isEmpty()) return true;
//        if (isExist(s, c)) {
//            if (isPaired(s, c)) {
//                if (isValid(s, c)) {
//                    System.out.println(s + " > clean > " + cleanString(s, c));
//                    checkBrakets(cleanString(s, c),c);
//                } else {
//                    System.out.println("isValid > false");
//                    return false;
//                }
//            } else return false;
//        }
//        return false;
//    }

    public boolean initialTests(String s) {
        if (s.isEmpty()) return false;
        if (s.length() % 2 != 0) return false;
        return (s.indexOf('(') != -1) || (s.indexOf(')') != -1) || (s.indexOf('[') != -1) || (s.indexOf(']') != -1) || (s.indexOf('{') != -1) || (s.indexOf('}') != -1);
    }

    public boolean isValid(String s, char c) {
        System.out.println("4 s:" + s + " & c:" + c + " isValid: " + ((s.indexOf(c) - s.indexOf(getClosed(c)) % 2 != 0) &&
                ((s.indexOf(c) - s.indexOf(getClosed(c)) < 0))));
        return ((s.indexOf(c) - s.indexOf(getClosed(c)) % 2 != 0) &&
                ((s.indexOf(c) - s.indexOf(getClosed(c)) < 0)));
    }

    private static char getClosed(char c) {
        return switch (c) {
            case '(' -> ')';
            case '{' -> '}';
            case '[' -> ']';
            default -> 0;
        };
    }

    public boolean isExist(String s, char c) {
        return s.indexOf(c) != -1;
    }

    public boolean isPaired(String s, char c) {
        return switch (c) {
            case '(' -> isExist(s, ')');
            case '{' -> isExist(s, '}');
            case '[' -> isExist(s, ']');
            default -> false;
        };
    }

    public String cleanString(String s, char c) {
        if (isExist(s, c)) return (s.substring(0, s.indexOf(c))
                + s.substring(s.indexOf(c) + 1, s.indexOf(getClosed(c)))
                + s.substring(s.indexOf(getClosed(c)) + 1));
        return s;
    }

    public boolean foo2(String s) {
        String result = "";
        if (s.charAt(0) == '(') {
            result = checkBrakets(s, '(');
            System.out.println("result: "+result);
        }
        return result.isEmpty();
    }

    private String checkBrakets(String s, char c) {
        System.out.println("checkBrakets with s:" + s + " & c:" + c);
        if (s.isEmpty()) return s;
        if (isExist(s, c))
            if (isPaired(s, c))
                if (isValid(s, c)) {
                    checkBrakets(cleanString(s, c), c);
                    return s;
                }
        return "";
    }
}
