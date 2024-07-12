package org.example;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * Missing required configurations for services and using KR configurations as default.
 */

@Configuration
@PropertySource("vdc:vdc_kr") // case1
public class AppConfig {
    // Configuration beans and properties
}



@Component
public class MarketService {
    @Value("${active_market}") // case2
    private String activeMarket;
    // Service methods that use activeMarket
}



