package PageObjectUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Augmenter;

public class PageObjectUtil {
	public static WebDriver driver = null;

	public void setup() throws IOException {
		Properties p = new Properties();
		FileInputStream fi = new FileInputStream(
				"D:\\DataLocation\\Developer\\Selenium\\MavenFramework\\src\\main\\java\\global.properties");
		p.load(fi);
		// System.out.println(p.getProperty("browser"));

		if (p.getProperty("browser").contains("firefox")) {
			driver = new FirefoxDriver();

		} else if (p.getProperty("browser").contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					"./src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else {
			// Internet explore
		}
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void takesScreenshot()throws Exception{
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("target/pageShot.png"));
		
		}
		
	
}
