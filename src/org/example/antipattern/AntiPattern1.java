package org.example.antipattern;

import java.util.HashMap;
import java.util.Map;

public class AntiPattern1 {
    /**
     * Using hard coding text strings for languages.
     */
    final String prefixMsg = "(재입고)";  // TestScene 1
    final String prefixMsgTW = "(已到貨) ";

    final String prefixMsgUS = "Available";

    String message2 = "China";
    public void Test01() {
        Map<String, Object> contents = new HashMap<String, Object>();
        contents.put("prefixMsg", true? prefixMsg : prefixMsgTW);
        contents.put("prefixMsg2", "재입고"); // TestScene 2
    }

    public void Test02(String msg) {
        switch (msg) {
            case "中国":  // TestScene 3
                break;
            case "한국":
                break;
            default:
                break;
        }
    }

    public void Test03(String msg) {
        if (msg == "한국") {
            // TestScene 4
        }
    }

}
