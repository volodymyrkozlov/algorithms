package leetcode.easy;

import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        int i = romanToInt("LVIII");
        System.out.println(i);
    }

    private static final Map<Character, Integer> VOCABULARY = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    private static final Map<Character, Character> SUBTRACTION_VOCABULARY = Map.of(
            'V', 'I',
            'X', 'I',
            'L', 'X',
            'C', 'X',
            'D', 'C',
            'M', 'C'
    );

    public static int romanToInt(String s) {
        var result = 0;
        var charArray = s.toCharArray();
        for (var i = charArray.length - 1; i >= 0; i--) {
            if (i > 0
                    && SUBTRACTION_VOCABULARY.containsKey(charArray[i])
                    && (SUBTRACTION_VOCABULARY.get(charArray[i]).equals(charArray[i - 1]))) {
                result = result + (VOCABULARY.get(charArray[i]) - VOCABULARY.get(SUBTRACTION_VOCABULARY.get(charArray[i])));
                i--;
            } else {
                if (VOCABULARY.containsKey(charArray[i])) {
                    result = result + VOCABULARY.get(charArray[i]);
                }
            }
        }

        return result;
    }
}
