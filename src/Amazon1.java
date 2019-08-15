import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subbian\\eclipse-workspace\\Arch\\WindowsHandling\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("iphone x");
		WebElement enter=driver.findElement(By.xpath("(//input[@class='nav-input'])[1]"));
		enter.click();
		WebElement iphn=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		iphn.click();
		String par=driver.getWindowHandle();
		Set<String> all=driver.getWindowHandles();
		System.out.println(par+"\n"+all);
		WebElement cart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        cart.click();
       
	
//		for(String x:all)
//		{
//			if(!x.equals(par))
//			{
//			driver.switchTo().window(x);   
//			}
//	    }	
		WebElement chkout=driver.findElement(By.xpath("//span[@class='a-button a-spacing-none a-button-primary checkout-btn']"));
        chkout.click();
	}
}
