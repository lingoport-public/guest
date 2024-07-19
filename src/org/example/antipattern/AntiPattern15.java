package org.example;

import java.util.HashMap;
import java.util.Map;
import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class AntiPattern15 {
    /**
     * Ignoring local specific sorting and comparison
     */

    public class KoreanSortingExample {

        public static void main(String[] args) {
            String[] koreanNames = {"김철수", "박민준", "최민지", "강태희"};

            // Using default string comparison which does not consider Korean locale-specific sorting
            System.out.println("Default comparison:");
            Arrays.sort(koreanNames);   // TestScene 1
            System.out.println(Arrays.toString(koreanNames));
        }
    }

}
