import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nishant\\Desktop\\selenium components\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
	//	driver.get("http:\\www.google.com");
		//driver.manage().window().maximize();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishant\\Desktop\\selenium components\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("http:\\www.google.com");
		//System.getProperty("webdriver.ie.driver","C:\\Users\\Nishant\\Desktop\\selenium components\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		//driver.get("http:\\www.google.com");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Nishant\\Desktop\\selenium components\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		// TODO Auto-generated method stub

	}

}
