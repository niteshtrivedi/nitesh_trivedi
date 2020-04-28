package guru99bankdemo1;

import org.testng.annotations.Test;
import guru99bankdemo.Basepage;
import guru99bankdemo.HomePage;
import guru99bankdemo.LoginPage;
import guru99bankdemo.NewCustomerPage;

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
public class NewCustomerTest {

	String driverPath = "D:\\selenium jars\\chromedriver.exe";

	WebDriver driver;

	LoginPage objLoginPage;

	HomePage objHomePage;

	NewCustomerPage objNewCustomerPage;
	
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
	public void CreateCustomerSuccessfully() throws InterruptedException{

		// Create Login Page object

		objLoginPage = new LoginPage(driver);

		// login to application

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		objLoginPage.loginToGuru99("mngr253828", "zErAzug");
		
		objNewCustomerPage = new NewCustomerPage(driver);
		WebElement element;
		WebDriverWait wait = new WebDriverWait(driver, 100);
		element= wait.until(ExpectedConditions.elementToBeClickable(By.linkText("New Customer"))); 
		objNewCustomerPage.setgoto_add_customer();
		Thread.sleep(3000);
		objNewCustomerPage.setCustomerName("Rahul Trivedi");
		objNewCustomerPage.setGender();
		objNewCustomerPage.setDateofBirth("22-11-1984");
		objNewCustomerPage.setAddress("A205 Oxy Evolve");
		objNewCustomerPage.setCity("Pune");
		objNewCustomerPage.setState("Maharashtra");
		objNewCustomerPage.setPIN("412207");
		objNewCustomerPage.setMobileNumber("8980001684");
		objNewCustomerPage.setEmail("niteshtrivedi.84@gmail.com");
		objNewCustomerPage.setPassword("rahul");
		objNewCustomerPage.setSubmit();
		
	}
		
	}
