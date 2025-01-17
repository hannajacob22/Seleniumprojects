package browsersample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Browserinitialization {
	
	
	
	public void initializebrowser()
	{
		WebDriver driver=new ChromeDriver();
	}

	public static void main(String[] args) {
		
		Browserinitialization obj=new Browserinitialization();
		
		obj.initializebrowser();
	}

}
