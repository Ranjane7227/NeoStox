package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass4 {
	@Test
	  public void G() 
	  {
		  Reporter.log("Answer is G",true);
	  }
	  @Test
	  public void H() 
	  {
		  Reporter.log("Answer is H",true); 
	  }
	  @Test
	  public void I() 
	  {
		  Reporter.log("Answer is I",true); 
	  }
	  @Test (groups="Regression test")
	  public void Y() 
	  {
		  Reporter.log("Answer is Y",true); 
	  }
	  @Test (groups="Regression test")
	  public void K() 
	  {
		  Reporter.log("Answer is K",true); 
	  }
}
