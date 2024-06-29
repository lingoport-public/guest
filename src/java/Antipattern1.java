package org.example.antipattern;
import java.util.HashMap;
import java.util.Map;
public class AntiPattern1 {
  /**
  * Using hard coding
  text strings for languages.
  */
  final String prefixMsg= "(재입고)"; // TestScene 1
  final StringprefixMsgTW = "() ";
  final StringprefixMsgUS = "Available";
  String message2 ="China";
  
  public void Test01() {
    Map<String, Object> contents = new HashMap<String, Object>();
    contents.put("prefixMsg", true? prefixMsg : prefixMsgTW);
    contents.put("prefixMsg2", "재입고"); //TestScene 2
  }
  
  public void Test02 (String msg) {
    switch (msg) {
      case "": //TestScene 3
       break;
     case "":
      break;
    default:
     break;
    }
}
  
public void Test03 (String msg) {
  if (msg == "한국") {
    // TestScene 4
  }
}

}
