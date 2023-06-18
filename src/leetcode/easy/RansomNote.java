package leetcode.easy;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        boolean b = canConstruct("aa", "aab");

        System.out.println(b);
    }

    public static boolean canConstruct(String ransomNote,
                                       String magazine) {
        var magazineCharacters = new HashMap<Character, Integer>();
        for (var magazineChar : magazine.toCharArray()) {
            if (magazineCharacters.containsKey(magazineChar)) {
                var lettersCounter = magazineCharacters.get(magazineChar);
                lettersCounter = lettersCounter + 1;
                magazineCharacters.put(magazineChar, lettersCounter);
            } else {
                magazineCharacters.put(magazineChar, 1);
            }
        }

        var unknownCharsCounter = 0;
        for (var ransomNoteChar : ransomNote.toCharArray()) {
            if (magazineCharacters.containsKey(ransomNoteChar) && magazineCharacters.get(ransomNoteChar) != 0) {
                var counter = magazineCharacters.get(ransomNoteChar);
                magazineCharacters.put(ransomNoteChar, counter - 1);
            } else {
                unknownCharsCounter++;
            }
        }

        return unknownCharsCounter == 0;
    }
}
