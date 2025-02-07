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
        System.out.println("s:" + s);
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
        System.out.println("result:" + result);
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

    public boolean isValid(String s, char c,int indexOfClosed) {
        System.out.println("isValid:"+"");
        return (
                ((s.indexOf(c) - indexOfClosed) % 2 != 0) &&
                ((s.indexOf(c) - indexOfClosed) < 0)
        );
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
        if ((isExist(s, c)) && (isExist(s, getClosed(c)))) {
            System.out.println(((isExist(s, c)) && (isExist(s, getClosed(c)))));
            return (s.substring(0, s.indexOf(c))
                    + s.substring(s.indexOf(c) + 1, s.lastIndexOf(getClosed(c)))
                    + s.substring(s.lastIndexOf(getClosed(c)) + 1));
        }
        return s;
    }

    public String cleanString(String s, char c, int indexOfClosed) {
        System.out.println("---");
        System.out.println("new cleanString");
        System.out.println("---");
        System.out.println("s:"+s+"->"+(s.substring(0, s.indexOf(c))
                + s.substring(s.indexOf(c) + 1, indexOfClosed))
                + s.substring(indexOfClosed));
        if ((isExist(s, c)) && (isExist(s, getClosed(c)))) {
            return (s.substring(0, s.indexOf(c))
                    + s.substring(s.indexOf(c) + 1, indexOfClosed))
                    + s.substring(indexOfClosed);
        }
        return s;
    }


    private String checkBrackets(String s, char c) {
        if (s.isEmpty()) return s;
        if (isExist(s, c))
            if (isPaired(s, c))
                if (isValid(s, c))
                    return cleanString(s, c);
        return s;
    }

    private String checkBrackets(String s, char c, int indexOfClosed) {
        System.out.println("new checkBrackets with s:" + s + " c:" + c + " indexOfClosed:" + indexOfClosed);
        if (s.isEmpty()) return s;
        if (isExist(s, c))
            if (isPaired(s, c))
                if (isValid(s, c,indexOfClosed))
                    return cleanString(s, c, indexOfClosed);
        return s;
    }

    public String foo(String s) {
        //new define of pair
        String result = "";
        if ((s.charAt(0) == '(') || (s.charAt(0) == '[') || (s.charAt(0) == '{')) {
            int countOpenBeforeFindClosed = 0;
            int indexOfClosed = 0;
            int countClosed = 0;
            for (int i = 0; i < s.length(); i++) {
                if (isExist(s, paired(s.charAt(0)))) {
                    if (s.charAt(i) == s.charAt(0)) countOpenBeforeFindClosed++;
                    if (s.charAt(i) == paired(s.charAt(0))) {
                        indexOfClosed = i;
                        countClosed++;
                        if (countClosed == countOpenBeforeFindClosed) break;
                    }
                } else return s;
            }
            result = checkBrackets(s, s.charAt(0), indexOfClosed);// refuse check brackets
        }
        if (!result.isEmpty()) return result;
        foo(result);
        return s;
    }

    public char paired(char c) {
        return switch (c) {
            case '(' -> ')';
            case '[' -> ']';
            case '{' -> '}';
            default -> 0;
        };
    }
}
