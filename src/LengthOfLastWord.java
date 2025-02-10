public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == ' ')
                s = s.substring(0, i);
            else
                break;
        }
        return (s.indexOf(' ') != -1) ?
                (s.length() - s.lastIndexOf(' ') - 1) :
                s.length();
    }
}
