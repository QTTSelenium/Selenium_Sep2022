package stepdef;

import config.Common;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void beforeScenario()
	{
		System.out.println("********** Before each scenario ***************");
		Common.launchBrowser();
	}
	@After
	public void afterScenario()
	{
		System.out.println("********** After each scenario ***************");
		Common.closeBrowser();
	}
	@Before("@DB")
	public void beforeScenario1()
	{
		System.out.println("********** Connect data base.... ***************");
	}
	@After("@DB")
	public void afterScenario1()
	{
		System.out.println("********** close data base connection ***************");
	}

}
