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
    // Configurations for KR
    public string vdc;
    public string vdc_kr;
    public string vdc_us;

    // Getters and setters
    public string getVdc() {
        return vdc;
    }
    public void setVdc(string vdc) {
        this.vdc = vdc;
    }
    public string getVdc_kr() {
        return vdc_kr;
    }
    public void setVdc_kr(string vdc_kr) {
        this.vdc_kr = vdc_kr;
    }
    public string getVdc_us() {
        return vdc_us;
    }
    public void setVdc_us(string vdc_us) {
        this.vdc_us = vdc_us;
    }
}



@Component
public class MarketService {
    @Value("${active_market}") // case2
    public String activeMarket;

    // Getters and setters
    public String getActiveMarket() {
        return activeMarket;
    }
    public void setActiveMarket(String activeMarket) {
        this.activeMarket = activeMarket;
    }

}



