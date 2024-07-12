package org.example;

import java.util.HashMap;
import java.util.Map;
/**
 * 5. Using culture-specific formatting directly for addresses, names, telephone numbers, numbers, currency, date, and time.
 */

public class AddressFormatter {

    public String formatAddress(String recipientName, String street, String city, String postalCode, String country) {
        // This format is specific to the US and may not be appropriate for other cultures
        return recipientName + "\n" + street + "\n" + city + ", " + postalCode + " " + country;
    }
}

public class PhoneNumberFormatter {

    public String formatPhoneNumber(String countryCode, String areaCode, String lineNumber) {
        // This format is specific to the US and may not be appropriate for other countries
        return "(" + areaCode + ") " + lineNumber;
    }
}

public class CurrencyFormatter {

    public String formatCurrency(double amount, String currencyCode) {
        // This format assumes USD and may not be appropriate for other currencies
        return "$" + amount;
    }
}

public class DateAndTimeFormatter {

    public String formatDateAndTime(Date date) {
        // This format is specific to the US (MM/DD/YYYY HH:MM) and may not be appropriate for other cultures
        return String.format("%02d/%02d/%04d %02d:%02d", date.getMonth(), date.getDay(), date.getYear(), date.getHours(), date.getMinutes());
    }
}