/**
 * 
 */
package Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

/**
 * @author RAGINI MISHRA
 *
 */
public class LaunchChromeSamp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Files\\kt\\practice-ws\\practice\\Selenium\\Resources\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		

	}

}
