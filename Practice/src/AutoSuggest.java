import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishant\\Desktop\\selenium components\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Nishant Sharma");
		List <WebElement> opt=  driver.findElements(By.xpath("//*[@role='listbox']/li/div/div/span"));
		Thread.sleep(3000);
		System.out.println(opt.get(2).getText());
		
		
		

	}

}
