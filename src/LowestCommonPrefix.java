import java.util.ArrayList;
import java.util.List;

public class LowestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            if (strs[0].isEmpty()){
                return "";
            } else {
                return strs[0];
            }
        }
        List<String> contains = getContainsToList(strs);

        if (contains.size() != strs.length-1) return new String("");

        return getShortestFromList(contains);
    }

    private List<String> getContainsToList(String[] strs) {
        List<String> contains = new ArrayList<>();
        for (int i = 0; i < strs.length-1; i++) {
            if (!containsStartEach(strs[i], strs[i + 1]).isEmpty())
            {
                contains.add(containsStartEach(strs[i], strs[i + 1]));
            }
        }
        return contains;
    }

    public String containsStartEach(String curr, String next) {
        String sub = "";
        int lowest = Math.min(curr.length(), next.length());
        for (int i = 0; i < lowest; i++) {
                if (curr.charAt(i) == next.charAt(i)) {
                    sub = sub + curr.charAt(i);
                }
                else {
                    break;
                }
        }
        return sub;
    }

    public String getShortestFromList(List<String> stringList)
    {
        return stringList.stream().min(String::compareTo).toString().substring(9,stringList.stream().min(String::compareTo).toString().length()-1);
    }
}
