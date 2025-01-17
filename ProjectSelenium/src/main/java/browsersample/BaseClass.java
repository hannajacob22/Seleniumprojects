
package browsersample;

	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class BaseClass {
	
	public WebDriver driver;//Global declaration,
	
	public void initializebrowser()
	{
	driver=new ChromeDriver();//launch chrome
	
	driver.get("https://selenium.qabible.in/index.php");//launch URL
	
	driver.manage().window().maximize();
	}
	
	public void quitAndClose()
	{
       driver.quit();
	
	}
	
	public static void main(String args[])
	{
	BaseClass obj=new BaseClass();
	obj.initializebrowser();
	obj.quitAndClose();
	}
	}

	


