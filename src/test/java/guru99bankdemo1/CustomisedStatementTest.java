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
import guru99bankdemo.CustomisedStatementPage;

public class CustomisedStatementTest {
	String driverPath = "D:\\selenium jars\\chromedriver.exe";

	WebDriver driver;

	LoginPage objLoginPage;

	HomePage objHomePage;

	CustomisedStatementPage objCustomisedStatementPage;

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
	public void CustomisedStatementSuccessfully() throws InterruptedException {

		// Create Login Page object

		objLoginPage = new LoginPage(driver);

		// login to application

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		objLoginPage.loginToGuru99("mngr253828", "zErAzug");
		objCustomisedStatementPage = new CustomisedStatementPage(driver);
		WebElement element;
		WebDriverWait wait = new WebDriverWait(driver, 100);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Customised Statement")));
		objCustomisedStatementPage.setgoto_customised_statement();
		Thread.sleep(3000);
		objCustomisedStatementPage.setAccountNo("77483");
		objCustomisedStatementPage.setFromDate("21-04-2020");
		objCustomisedStatementPage.setToDate("23-04-2020");
		objCustomisedStatementPage.setMinimumTransactionValue("1000");
		objCustomisedStatementPage.setNumberofTransaction("15");
		objCustomisedStatementPage.setSubmit();
	}

}
