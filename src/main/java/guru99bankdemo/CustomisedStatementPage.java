package guru99bankdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomisedStatementPage extends Basepage {
	WebDriver driver;
	By custom_statmnt_link = By.linkText("Customised Statement");
	By AccountNo = By.name("accountno");
	By FromDate = By.name("fdate");
	By ToDate = By.name("tdate");
	By MinimumTransactionValue = By.name("amountlowerlimit");
	By NumberofTransaction = By.name("numtransaction");
	By Submit = By.name("AccSubmit");
	By reset = By.name("res");

	public CustomisedStatementPage(WebDriver driver) {

		this.driver = driver;
	}

	public void setgoto_customised_statement() {
		// TODO Auto-generated method stub
		driver.findElement(custom_statmnt_link).click();
	}

	public void setAccountNo(String strAccountNo) {
		driver.findElement(AccountNo).sendKeys(strAccountNo);
	}

	public void setFromDate(String strFromDate) {
		driver.findElement(FromDate).sendKeys(strFromDate);
	}

	public void setToDate(String strToDate) {
		driver.findElement(ToDate).sendKeys(strToDate);
	}

	public void setMinimumTransactionValue(String strMinimumTransactionValue) {
		driver.findElement(MinimumTransactionValue).sendKeys(strMinimumTransactionValue);
	}

	public void setNumberofTransaction(String strNumberofTransaction) {
		driver.findElement(NumberofTransaction).sendKeys(strNumberofTransaction);
	}

	public void setSubmit() {
		driver.findElement(Submit).click();
	}

	public void CustomisedStatementtoguru99(String strAccountNo, String strFromDate, String strToDate,
			String strMinimumTransactionValue, String strNumberofTransaction) {
		this.setgoto_customised_statement();
		this.setAccountNo(strAccountNo);
		this.setFromDate(strFromDate);
		this.setToDate(strToDate);
		this.setMinimumTransactionValue(strMinimumTransactionValue);
		this.setNumberofTransaction(strNumberofTransaction);
		this.setSubmit();
	}

}
