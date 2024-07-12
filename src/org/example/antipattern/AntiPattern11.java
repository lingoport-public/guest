package org.example;


/**
 * 11. Using hard coding property/parameter values for business logic like campaign ids, brand ids, sale price thresholds.
 */
public class AntiPattern11 {

    private static final String CAMPAIGN_ID = "CAMP123"; // Hard-coded campaign ID
    private static final String BRAND_ID = "BRAND456";   // Hard-coded brand ID
    private static final double SALE_PRICE_THRESHOLD = 100.0; // Hard-coded sale price threshold

    public boolean isEligibleForDiscount(double price) {
        return price < SALE_PRICE_THRESHOLD;
    }

    // Other business logic methods...
}



