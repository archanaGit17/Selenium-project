import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDot 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subbian\\eclipse-workspace\\Arch\\WindowsHandling\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		WebElement search=driver.findElement(By.xpath("//input[@id='headerSearch']"));
		search.sendKeys("ceiling fan");
		WebElement enter=driver.findElement(By.xpath("//button[@id='headerSearchButton']"));
		enter.click();
		WebElement fan=driver.findElement(By.xpath("(//span[@class='pod-plp__brand-name'])[1]"));
        fan.click();
		WebElement cart=driver.findElement(By.xpath("(//span[@class='bttn__content'])[4]"));
		cart.click();
		
       
		String par=driver.getWindowHandle();
		Set<String> all=driver.getWindowHandles();
		System.out.println(par+"\n"+all);
//		for(String x:all)
//		{
//			if(!x.equals(par))
//			{
//			driver.switchTo().window(x); 
//			}
//			 
//	    }
		WebElement cartTotal=driver.findElement(By.xpath("//span[@class='price__format']"));
        String name= cartTotal.getText();
        System.out.println(name);
	}		
}
