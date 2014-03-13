package test.java.pk1a;


//tester1
//tester1
//tester1
//tester1
//tester1
//tester2
//tester2

import main.java.pk1.HelloWorld;
import junit.framework.*;

public class  TestHelloWorld extends TestCase {
  public void testSimpleMessage() {
     String message = new HelloWorld("World222").sayHello();
     Assert.assertEquals("Test Hello Machine", "Hello, World222", message);
  }
}

