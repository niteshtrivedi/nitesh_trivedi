package guru99bankdemo1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import guru99bankdemo.Basepage;
import guru99bankdemo.HomePage;
import guru99bankdemo.LoginPage;
import guru99bankdemo.BalanceEquiryPage;

public class BalanceEquiryTest {
	String driverPath = "D:\\selenium jars\\chromedriver.exe";

	WebDriver driver;

	LoginPage objLoginPage;

	HomePage objHomePage;

	BalanceEquiryPage objBalanceEquiryPage;

	Basepage objBasepage;

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
	public void BalanceEquirySuccessfully() throws InterruptedException {

		// Create Login Page object

		objLoginPage = new LoginPage(driver);

		// login to application

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		objLoginPage.loginToGuru99("mngr253828", "zErAzug");
		objBalanceEquiryPage = new BalanceEquiryPage(driver);
		WebElement element;
		WebDriverWait wait = new WebDriverWait(driver, 100);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Balance Enquiry")));
		objBalanceEquiryPage.setgoto_balance_enq_link();
		Thread.sleep(3000);
		objBalanceEquiryPage.setAccountNo("77483");

		objBalanceEquiryPage.setSubmit();
	}
}