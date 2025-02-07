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
        System.out.println("s:"+s);
        if (s.isEmpty()) return true;
        if (!initialTests(s)) return false;
        String result = "";
        switch (s.charAt(0)) {
            case '(': {
                result = checkBrackets(s, '(');
                break;
            }
            case '[': {
                result = checkBrackets(s, '[');
                break;
            }
            case '{': {
                result = checkBrackets(s, '{');
                break;
            }
            default: {
                return false;
            }
        }
        if (result.equals(s)) return false;
        System.out.println("result:"+result);
        return isValid(result);
    }

    public boolean initialTests(String s) {
        if (s.length() % 2 != 0) return false;
        return (s.indexOf('(') != -1) || (s.indexOf(')') != -1) || (s.indexOf('[') != -1) || (s.indexOf(']') != -1) || (s.indexOf('{') != -1) || (s.indexOf('}') != -1);
    }

    // problem with define isValid of pair breckets. Like on start of coding... Just delete this all
    public boolean isValid(String s, char c) {
        return ((s.indexOf(c) - s.lastIndexOf(getClosed(c)) % 2 != 0) &&
                ((s.indexOf(c) - s.lastIndexOf(getClosed(c)) < 0)));
    }

    public char getClosed(char c) {
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
        System.out.println("s:" + s + " c:" + c + "-> " + (s.substring(0, s.indexOf(c))
                + s.substring(s.indexOf(c) + 1, s.lastIndexOf(getClosed(c)))
                + s.substring(s.lastIndexOf(getClosed(c)) + 1)));
        if ((isExist(s, c)) && (isExist(s, getClosed(c)))) {
            System.out.println(((isExist(s, c)) && (isExist(s, getClosed(c)))));
            return (s.substring(0, s.indexOf(c))
                    + s.substring(s.indexOf(c) + 1, s.lastIndexOf(getClosed(c)))
                    + s.substring(s.lastIndexOf(getClosed(c)) + 1));
        }
        return s;
    }

    private String checkBrackets(String s, char c) {
        System.out.println("---");
        System.out.println("checkBrackets:");
        System.out.println("s:"+s+" c:"+c);
        if (s.isEmpty()) return s;
        if (isExist(s, c))
            if (isPaired(s, c))
                if (isValid(s, c))
                    return cleanString(s, c);
        return s;
    }
}
