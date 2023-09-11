package TestNgPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyClass1 {
  @Test
public void ind() {
	  
	  String n = "India";
	  Assert.assertEquals("India", n);
	  System.out.println("The Country Name correct as : " +n);
  }
  
  @Test
public void uk() {
	  
	  String n = "United Kingdom";
	  Assert.assertEquals("United Kingdom", n);
	  System.out.println("The Country Name correct as : " +n);
  }
  @Test
  public void pak() {
  String n = "Pakistan";
  Assert.assertEquals("Pakistan", n);
  System.out.println("The Country Name correct as : " +n);
}

}
