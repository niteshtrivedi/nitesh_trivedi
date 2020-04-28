package guru99bankdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BalanceEquiryPage extends Basepage {
	WebDriver driver;
	By balance_enq_link = By.linkText("Balance Enquiry");
	By AccountNo = By.name("accountno");
	By Submit = By.name("AccSubmit");
	By reset = By.name("res");
	
	public BalanceEquiryPage(WebDriver driver) {

		this.driver = driver;

	}
	public void setgoto_balance_enq_link() {
		// TODO Auto-generated method stub
		driver.findElement(balance_enq_link).click();
	}
	public void setAccountNo(String strAccountNo) {
		driver.findElement(AccountNo).sendKeys(strAccountNo);
	}
	public void setSubmit() {
		driver.findElement(Submit).click();
	}
	public void BalanceEnquirytoguru99(String strAccountNo) {
		this.setgoto_balance_enq_link();
		this.setAccountNo(strAccountNo);
		this.setSubmit();

	}
}
