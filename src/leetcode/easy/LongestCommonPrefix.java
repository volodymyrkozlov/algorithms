package leetcode.easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        var longestCommonPrefix = strs[0];

        for (var i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(longestCommonPrefix) != 0) {
                longestCommonPrefix = longestCommonPrefix.substring(0, longestCommonPrefix.length() - 1);
            }
        }

        return longestCommonPrefix;
    }
}
