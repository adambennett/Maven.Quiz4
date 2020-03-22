package rocks.zipcode.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        int middle = string.length() / 2;
        return string.toCharArray()[middle];
    }

    public static String capitalizeMiddleCharacter(String str) {
        int middle = str.length() / 2;
        String output = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (i == middle) {
                String temp = ""+chars[i];
                temp = temp.toUpperCase();
                output += temp;
            } else {
                output += chars[i];
            }
        }
        return output;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int middle = str.length() / 2;
        String output = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (i == middle) {
                String temp = ""+chars[i];
                temp = temp.toLowerCase();
                output += temp;
            } else {
                output += chars[i];
            }
        }
        return output;
    }

    public static Boolean isIsogram(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (freq.containsKey(c)) {
                return false;
            } else {
                freq.put(c, 1);
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (i + 1 < c.length) {
                if (c[i] == c[i+1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        char[] c = str.toCharArray();
        String output = "";
        for (int i = 0; i < c.length; i++) {
            if (i + 1 < c.length) {
                if (c[i] == c[i+1]) {
                    i++;
                } else {
                    output += c[i];
                }
            } else {
                output += c[i];
            }
        }
        return output;
    }

    public static String invertCasing(String str) {
        String output = "";
        for (char c : str.toCharArray()) {
            Character ca = c;
            if (Character.isUpperCase(ca)) {
               output += Character.toLowerCase(ca);
            } else {
                output += Character.toUpperCase(ca);
            }
        }
        return output;
    }
}