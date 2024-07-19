package org.example;

import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AntiPattern13 {
    /**
     * Building region specific implementation for generic logic.
     */

    public class GlobalizationExample {

        // This method is supposed to be generic but does not consider regional differences
        public String formatDate(Date date, Locale locale) {   // TestScene 1
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
            return dateFormat.format(date);
        }

        public static void main(String[] args) {
            GlobalizationExample example = new GlobalizationExample();
            Date currentDate = new Date();

            // Assume we have two regions: US and Germany
            Locale usLocale = new Locale("en", "US");
            Locale germanLocale = new Locale("de", "DE");

            // Formatting date for US
            String usFormattedDate = example.formatDate(currentDate, usLocale);
            System.out.println("Date formatted for US: " + usFormattedDate);

            // Formatting date for Germany
            String germanFormattedDate = example.formatDate(currentDate, germanLocale);
            System.out.println("Date formatted for Germany: " + germanFormattedDate);
        }
    }

}
