public class Main {
    public static void main(String[] args) {
        LowestCommonPrefix lcp = new LowestCommonPrefix();
//        String[] strs = new String[]{"flower","flow","flight"};
//        String[] strs = new String[]{"dog","racecar","car"};
        String[] strs = new String[]{"a"};
        System.out.println(lcp.longestCommonPrefix(strs));
    }
}