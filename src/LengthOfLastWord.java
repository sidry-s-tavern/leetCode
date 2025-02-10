public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == ' ')
                s = s.substring(0, i);
            else
                break;
        }
        int res = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) != ' ') {
                res = i;
            } else {
                return (s.length() - res);
            }
        }
        return s.length();
    }
}
