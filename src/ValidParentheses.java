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
        if (isPaired(s,'(')) {
            System.out.println("isPaired (:"+isPaired(s,'('));
            res = isValid(s, '(');
        }
        if (isPaired(s,'[')) {
            System.out.println("isPaired [:"+isPaired(s,'['));
            res = isValid(s, '[');
        }
        if (isPaired(s,'{')) {
            System.out.println("isPaired {:"+isPaired(s,'{'));
            res = isValid(s, '{');
        }
        return res;
    }

    public boolean initialTests(String s) {
        if (s.isEmpty()) return false;
        if (s.length() % 2 != 0) return false;
        return (s.indexOf('(') != -1) || (s.indexOf(')') != -1) || (s.indexOf('[') != -1) || (s.indexOf(']') != -1) || (s.indexOf('{') != -1) || (s.indexOf('}') != -1);
    }

    public boolean isValid(String s, char c) {
        return (s.indexOf(c) - s.indexOf(getClosed(c)) % 2 != 0);
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

    public String cleanString(String s, char c)
    {
        String res;
        res = s.substring(0,s.indexOf(c));
        return res;
    }
}
