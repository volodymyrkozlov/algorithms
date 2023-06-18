package leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
    }

    public static int maximumWealth(int[][] accounts) {
        var result = 0;
        for (int[] account : accounts) {
            var customerWealth = 0;
            for (int i : account) {
                customerWealth = customerWealth + i;
            }
            result = Math.max(result, customerWealth);
        }

        return result;
    }
}
