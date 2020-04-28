package guru99bankdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepositPage extends Basepage {
	WebDriver driver;
	By deposit_link = By.linkText("Deposit");
	By AccountNo = By.xpath("//input[@name='accountno']");
	By Amount = By.name("ammount");
	By Description = By.name("desc");
	By Submit = By.name("AccSubmit");
	By reset = By.name("res");
	
	public DepositPage(WebDriver driver) {

		this.driver = driver;

	}
	public void setgoto_deposit_amt() {
		// TODO Auto-generated method stub
		driver.findElement(deposit_link).click();

	}

	public void setAccountNo(String strAccountNo) {
		driver.findElement(AccountNo).sendKeys(strAccountNo);
	}

	public void setAmount(String strAmount) {
		driver.findElement(Amount).sendKeys(strAmount);
	}
	public void setDescription(String strDescription) {
		driver.findElement(Description).sendKeys(strDescription);
	}
	public void setSubmit() {
		driver.findElement(Submit).click();
	}
	public void Deposittoguru99(String strAccountNo, String strAmount, String strDescription ) {
		this.setgoto_deposit_amt();
		this.setAccountNo(strAccountNo);
		this.setDescription(strDescription);
		this.setSubmit();
	}
}