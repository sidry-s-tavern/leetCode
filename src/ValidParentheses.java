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
        System.out.print(s+" -> ");
        if (!initialTests(s)) return false;
        boolean res = false;
        if ((isExist(s, '('))&&(isExist(s,')'))) {
            res = isValid(s,'(');
        }if ((isExist(s, '['))&&(isExist(s,']'))) {
            res = isValid(s,'[');
        }if ((isExist(s, '{'))&&(isExist(s,'}'))) {
            res = isValid(s,'{');
        }
        return res;
    }

    public boolean initialTests(String s) {
        if (s.isEmpty()) return false;
        if (s.length() % 2 != 0) return false;
        return (s.indexOf('(') != -1) || (s.indexOf(')') != -1) || (s.indexOf('[') != -1) || (s.indexOf(']') != -1) || (s.indexOf('{') != -1) || (s.indexOf('}') != -1);
    }

    public boolean isPaired(String s) {
        if (s.isEmpty()) return true;
        if (s.indexOf('(') != -1) if (s.indexOf(')') != -1)
            isPaired(s.substring(0, s.indexOf('('))
                    + s.substring(s.indexOf('(') + 1, s.indexOf(')'))
                    + s.substring(s.indexOf(')') + 1));
        return false;
    }

    public boolean isValid(String s, char c) {
        char cClosed = 0;
        switch (c) {
            case '(': {
                cClosed = ')';
                break;
            }
            case '{': {
                cClosed = '}';
                break;
            }
            case '[': {
                cClosed = ']';
                break;
            }
        }
        return (s.indexOf(c) - s.indexOf(cClosed) % 2 != 0);
    }

    public boolean isExist(String s, char c) {
        return s.indexOf(c) != -1;
    }
}
