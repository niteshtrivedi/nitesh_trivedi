package guru99bankdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage extends Basepage {
	WebDriver driver;

	By new_cust_link = By.linkText("New Customer");
	By CustomerName = By.xpath("//input[@name='name']");
	By Gender = By.name("rad1");
	By DateofBirth = By.id("dob");
	By Address = By.name("addr");
	By City = By.name("city");
	By State = By.name("state");
	By PIN = By.name("pinno");
	By MobileNumber = By.name("telephoneno");
	By Email = By.name("emailid");
	By Password = By.name("password");
	By Submit = By.name("sub");
	By reset = By.name("Reset");

	public NewCustomerPage(WebDriver driver) {

		this.driver = driver;

	}

	public void setgoto_add_customer() {
		// TODO Auto-generated method stub
		driver.findElement(new_cust_link).click();

	}

	public void setCustomerName(String strCustomerName) {
		driver.findElement(CustomerName).sendKeys(strCustomerName);
	}

	public void setGender() {
		driver.findElement(Gender).click();
	}

	public void setDateofBirth(String strDateofBirth) {
		driver.findElement(DateofBirth).sendKeys(strDateofBirth);
	}

	public void setAddress(String strAddress) {
		driver.findElement(Address).sendKeys(strAddress);
	}

	public void setCity(String strCity) {
		driver.findElement(City).sendKeys(strCity);
	}

	public void setState(String strState) {
		driver.findElement(State).sendKeys(strState);
	}

	public void setPIN(String strPIN) {
		driver.findElement(PIN).sendKeys(strPIN);
	}

	public void setMobileNumber(String strMobileNumber) {
		driver.findElement(MobileNumber).sendKeys(strMobileNumber);
	}

	public void setEmail(String strEmail) {
		driver.findElement(Email).sendKeys(strEmail);
	}

	public void setPassword(String strPassword) {
		driver.findElement(Password).sendKeys(strPassword);
	}

	public void setSubmit() {
		driver.findElement(Submit).click();
	}

	public void reset() {
		driver.findElement(reset).click();

	}

	public void newcustomertoguru99(String StrCustomerName, String strDateofBirth, String strAddress, String strCity,
			String strState, String StrPIN, String strMobileNumber, String strEmail, String strPassword) {
		this.setgoto_add_customer();
		this.setCustomerName(StrCustomerName);
		this.setGender();
		this.setDateofBirth(strDateofBirth);
		this.setAddress(strAddress);
		this.setCity(strCity);
		this.setState(strState);
		this.setPIN(StrPIN);
		this.setMobileNumber(strMobileNumber);
		this.setEmail(strEmail);
		this.setPassword(strPassword);
		this.setSubmit();
	}
}
