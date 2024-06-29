package org.example.antipattern;

public class AntiPattern3 {
  /***
   * Concatenating  strings for messages / Splitting one complete sentence into multiple parts.
  */
 
  public void Test01() {
    String msg = 100 + "yuan"; // TestScene 1
  }
 
  public void Test02() {
   StringBuilder builder = new StringBuilder();
   builder.append (100); // TestScene 2
   builder.append ("yuan");
   System.out.println (builder.toString());
 }

 public void Test03() {
   String.join(" ",  "100", "yuan"); // TestScene 3
 }
}
