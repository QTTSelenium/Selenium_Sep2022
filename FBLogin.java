package stepdef;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class FBLogin {
	
	WebDriver d;
    @Test
    public void testFBLogin() throws Exception
    {
		// Load web page
		d.get("https://www.facebook.com/");
		// Verify page title
		assertEquals(d.getTitle(),"Facebook – log in or sign up");
		assertTrue(d.findElement(By.id("email")).isDisplayed());
		// Enter user name
		d.findElement(By.id("email")).sendKeys("selenium");
		// Enter password
		d.findElement(By.id("pass")).sendKeys("selenium");
		// Click on Login button
		d.findElement(By.name("login")).click();
		// Pause 3sec
		Thread.sleep(3000);
    }
	@BeforeMethod
	public void setUp()
	{
		// Launch the browser
		d=new FirefoxDriver();
		
	}
    @AfterMethod
    public void tearDown()
    {
		// Close the browser
		d.quit();
    }

}
