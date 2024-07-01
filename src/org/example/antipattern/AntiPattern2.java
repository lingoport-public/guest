package org.example.antipattern;

import java.text.Format;
import java.util.Formatter;

public class AntiPattern2 {
    /**
     * Assuming same word ordering for all languages.
     */
    public void Test01() {
        String msg = String.format("%d %s", 1, "hello"); // TestScene 1
    }

    public void Test02() {
        System.out.printf("%d %s", 1, "hello"); // TestScene 2
    }

    public void Test03() {
        String msg = new String("%d %s"); // TestScene 3
        msg = msg.formatted(1, "hello");
        System.out.println(msg);
    }

    public void Test04() {
       Formatter formatter = new Formatter();
       formatter.format("%d %s", 1, "hello");
       System.out.println(formatter);
    }

    public  static void main(String[] args) {
        AntiPattern2 antiPattern2 = new AntiPattern2();
        antiPattern2.Test04();
    }
}
