import java.util.ArrayList;
import java.util.List;

public class LowestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        List<String> contains = getContainsToList(strs);

        printArray(contains);

        System.out.println(contains.size() + " - size");
        System.out.println(strs.length + " - length");
        if (contains.size() != strs.length) return "Error";

        return null;
    }

    private List<String> getContainsToList(String[] strs) {
        List<String> contains = new ArrayList<>();
        for (int i = 0; i < strs.length-1; i++) {
            if (!containsStartEach(strs[i], strs[i + 1]).isEmpty())
            {
                contains.add(strs[i]);
            }
        }
        return contains;
    }

    public String containsStartEach(String curr, String next) {
        String sub = "";
        for (int i = 0; i < curr.length(); i++) {
            for (int j = 0; j < next.length(); j++) {
                if (curr.charAt(i) == next.charAt(j)) {
                    sub = sub + curr.charAt(i);
                }
                else {
                    return "";
                }
            }
        }
        return sub;
    }

    public void printArray(List<String> strs)
    {
        for(String e: strs)
        {
            System.out.println(e);
        }
    }
}
