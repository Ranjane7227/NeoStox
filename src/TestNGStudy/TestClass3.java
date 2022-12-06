package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass3 {
	@Test (groups="Regression test")
	  public void A() 
	  {
		  Reporter.log("Answer is A",true);
	  }
	  @Test (groups="Regression test")
	  public void B() 
	  {
		  Reporter.log("Answer is B",true); 
	  }
	  @Test (groups="Regression test")
	  public void C() 
	  {
		  Reporter.log("Answer is C",true); 
	  }
	  @Test
	  public void D() 
	  {
		  Reporter.log("Answer is D",true); 
	  }
	  @Test
	  public void E() 
	  {
		  Reporter.log("Answer is E",true); 
	  }

	  
}
