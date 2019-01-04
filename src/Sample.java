
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Sample {
	
	static WebDriver driver;
	static WebElement e;
	By searchbo = By.xpath("//input[@name='q']");
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","./externalfiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		
	String title1 =driver.getTitle();
	String currentURL1 = driver.getCurrentUrl();
	System.out.println("title is:"+title1+" currentURL is:"+currentURL1);
		WebElement search_Box= driver.findElement(By.xpath("//input[@name='q']")); 
		search_Box.sendKeys("toolsqa.com");
		search_Box.sendKeys(Keys.ENTER);
		String title =driver.getTitle();
		String currentURL = driver.getCurrentUrl();
		System.out.println("title is:"+title+" currentURL is:"+currentURL);
		Sample s = new Sample();
		
		driver.findElement(By.tagName("cite")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement e1 =driver.findElement(By.xpath("//a[@title='Facebook']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(e1).perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void close() {
		driver.close();
	}
	
	
	
}