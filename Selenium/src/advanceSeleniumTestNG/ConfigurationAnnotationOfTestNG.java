package advanceSeleniumTestNG;
    import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class ConfigurationAnnotationOfTestNG {
		public class ConfigurationAnnotations {
			@BeforeSuite
			public void beforeSuite() {
				Reporter.log("connection to the server ", true);
				}
			
			@AfterSuite
				public void afterSuite() {
					Reporter.log("disconnect to the server", true);
				}
			
			@BeforeTest
			public void beforeTest() {
				Reporter.log("connect to data base", true);
				}
			
			@AfterTest
			public void afterTest() {
				Reporter.log("disconnect to data base", true);
			}
			
		   @BeforeClass
		   public void beforeClass() {
			   Reporter.log("open the browser", true);
			   
		   }
		   
		   @AfterClass
		   public void afterClass() {
			   Reporter.log("close the browser", true);
			   
		  }
		   
		  @BeforeMethod
		  public void beforeMethod() {
			  Reporter.log("log in", true);
			  
		  }
		    
		  @AfterMethod
		  public void aftermethod() {
			  Reporter.log("log out", true);
		  }
		  
		  @Test
		  public void test() {
			  Reporter.log("test is excecuted", true);	  
			  }
		   
		  
		}
	}




