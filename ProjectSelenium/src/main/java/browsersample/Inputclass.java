package browsersample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Inputclass extends BaseClass{
	
	
	public void inputmessagefield()
	{
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement messagefield=driver.findElement(By.id("single-input-field"));
		//System.out.println(messagefield.isEnabled());
		messagefield.sendKeys("Hello");
		
		
		WebElement showbutton=driver.findElement(By.id("button-one"));
		showbutton.click();
		//System.out.println(showbutton.isDisplayed());
	}
		public void gettotal() 
		{
		
		WebElement valueA=driver.findElement(By.id("value-a"));
	    valueA.sendKeys("10");
		
	    WebElement valueB=driver.findElement(By.id("value-b"));
	    valueB.sendKeys("20");
	    
	    WebElement total=driver.findElement(By.id("button-two"));
	    total.click();
		
}
	
	

	public static void main(String[] args) {
		
		 Inputclass obj=new  Inputclass();
		 obj.initializebrowser();
		 obj.inputmessagefield();
		 obj.gettotal();
		
		

	}

}
