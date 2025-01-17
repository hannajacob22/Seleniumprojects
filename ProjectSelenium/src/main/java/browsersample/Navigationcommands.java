package browsersample;

public class Navigationcommands extends BaseClass {
	
	public void navigationcommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		Navigationcommands nc=new Navigationcommands();
		nc.initializebrowser();
		nc.navigationcommands();
		
		// TODO Auto-generated method stub

	}

}
