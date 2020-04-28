package guru99bankdemo1;

import org.testng.annotations.Test;
import guru99bankdemo.HomePage;
import guru99bankdemo.LoginPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class LoginTest {
	String driverPath = "D:\\selenium jars\\chromedriver.exe";

	WebDriver driver;

	LoginPage objLoginPage;

	HomePage objHomePage;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		this.driver = new ChromeDriver(options);
		driver.get("http://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
	}

	@Test
	public void test_Home_Page_Appear_Correct() {

		// Create Login Page object

		objLoginPage = new LoginPage(driver);

		// login to application

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		objLoginPage.loginToGuru99("mngr253828", "zErAzug");

	}
}
