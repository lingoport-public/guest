package org.example;


/**
 * 12. Implementing specific classes of interface for each market instead of using the global class for all markets.
 */
public interface CountryMarketService {
    void displayMarketInfo();
}

// A base class that might contain some common logic
public abstract class BaseMarketService implements CountryMarketService {
    public void displayMarketInfo() {
        System.out.println("Common market information.");
    }
}

// Specific class for the US market
public class USMarketService extends BaseMarketService {
    @Override
    public void displayMarketInfo() {
        // Override to provide US-specific information
        System.out.println("US market information.");
    }
}

// Specific class for the UK market
public class UKMarketService extends BaseMarketService {
    @Override
    public void displayMarketInfo() {
        // Override to provide UK-specific information
        System.out.println("UK market information.");
    }
}

// Specific class for the German market
public class GermanMarketService extends BaseMarketService {
    @Override
    public void displayMarketInfo() {
        // Override to provide German-specific information
        System.out.println("German market information.");
    }
}



