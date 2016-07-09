package com.two95.chapter7;

import java.util.*;
public class PropertiesDemo {
public static void main(String args[]) {
Properties p = new Properties();
p.setProperty("driver", "com.test.Driver");
p.setProperty("url", "localhost:8080");
String str = p.getProperty("url");
System.out.println(str);
}
}
