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
        System.out.println(s);
        if (!initialTests(s)) return false;
        return true;
    }

    public boolean initialTests(String s) {
        if (s.isEmpty()) return false;
        if (s.length() % 2 != 0) return false;
        return (s.indexOf('(') != -1) || (s.indexOf(')') != -1) || (s.indexOf('[') != -1) || (s.indexOf(']') != -1) || (s.indexOf('{') != -1) || (s.indexOf('}') != -1);
    }
}
