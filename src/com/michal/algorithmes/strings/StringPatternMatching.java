package com.michal.algorithmes.strings;

/**
 * Problem: Substring text Matching the pattern
 * Input: A text string "text" and a pattern string "pattern".
 * Output: Does "text" contain the pattern "pattern" as a substring, and if so where?
 */
public class StringPatternMatching {

    /**
     *
     * @param pattern a to find in text
     * @param text an article or web page
     * @return should return string found or not found
     */
    public static String findMatch(String pattern, String text) {

        int i, j;   /* counters */
        int m, n;   /* string lengths */

        System.out.println("pattern to find: " + pattern);
        System.out.println("pattern length = " + pattern.length());
        System.out.println("text length = " + text.length());


        m = pattern.length();
        n = text.length();

        for(i = 0; i < (n - m); i++) {

            j = 0;
            while((j < m) && (text.charAt(i + j) == pattern.charAt(j)))
                j = j+1;
            if(j == m) return "Pattern " + pattern +" found and start at position " + (i + j);
        }

        return "Pattern " + pattern +" not found";
    }

    public static void main(String args []) {

        String article = "Article about some ... findMe ... some text...";
        String patternToFind = "findMe";

        System.out.println(findMatch(patternToFind, article));

    }
}
