package leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TheKWeakestRowInTheMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(kWeakestRows(new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        }, 3)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        var rowSoldiersMap = new HashMap<Integer, Integer>();
        for (var i = 0; i < mat.length; i++) {
            var soldiersCounter = 0;
            for (var j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    soldiersCounter++;
                }
            }
            rowSoldiersMap.put(i, soldiersCounter);
        }

        return rowSoldiersMap.entrySet()
                .stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .limit(k)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
