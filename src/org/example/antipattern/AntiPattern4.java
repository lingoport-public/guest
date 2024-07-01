package org.example.antipattern;

import java.util.Locale;

public class AntiPattern4 {
    public void Test01() {
        LanguageUtils.setLocaleForCurrentRequest(Locale.KOREA); // TestScene 1
    }

    public void Test02() {
        PassThroughHolder.setSiteForCurrentRequest(SiteMappingEnum.KOREA); // TestScene 2
        InitI18nManager.init("KR");
    }

    public void Test03() {
        if (superAppChecker.isSuperApp()) {  // TestScene 4
            LanguageUtils.setLocaleForCurrentRequest(Locale.KOREA); //
        }
    }


    public void Test04() {
        if (OrderProfile.isTaiwanMarket()) {  // TestScene 5

        }
    }
}
