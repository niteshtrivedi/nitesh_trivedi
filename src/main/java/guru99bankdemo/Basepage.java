package guru99bankdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Basepage {
	
		WebDriver driver;

		By manager_link = By.linkText("Manager");
		By new_cust_link = By.linkText("New Customer");
		By edit_cust_link = By.linkText("Edit Customer");
		By delete_cust_link = By.linkText("Delete Customer");
		By new_acct_link = By.linkText("New Account");
		By edit_acct_link = By.linkText("Edit Account");
		By delete_acct_link = By.linkText("Delete Account");
		By deposit_link = By.linkText("Deposit");
		By withdraw_link = By.linkText("Withdrawal");
		By fund_transfer_link = By.linkText("Fund Transfer");
		By change_pass_link = By.linkText("Change Password");
		By balance_enq_link = By.linkText("Balance Enquiry");
		By mini_stat_link = By.linkText("Mini Statement");
		By custom_statmnt_link = By.linkText("Customised Statement");
		By logout_link = By.linkText("Log out");

		public void BasePage() {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			this.driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		}

		public void goto_manager_page() {
			driver.findElement(manager_link).click();
		}

		public void goto_update_customer() {
			driver.findElement(edit_cust_link).click();

		}

		public void goto_delete_customer() {
			driver.findElement(delete_cust_link).click();

		}

		public void goto_create_new_account() {
			driver.findElement(new_acct_link).click();
		}

		public void goto_edit_acct() {
			driver.findElement(edit_acct_link).click();
		}

		public void goto_deposit_amt() {
			driver.findElement(deposit_link).click();
		}

		public void goto_delete_acct() {
			driver.findElement(delete_acct_link).click();
		}

		public void goto_withdraw_amt() {
			driver.findElement(withdraw_link).click();
		}

		public void goto_fund_transfer() {
			driver.findElement(fund_transfer_link).click();
		}

		public void goto_change_password() {
			driver.findElement(change_pass_link).click();
		}

		public void goto_balance_enquiry() {
			driver.findElement(balance_enq_link).click();
		}

		public void goto_mini_statement() {
			driver.findElement(mini_stat_link).click();
		}

		public void goto_customised_statement() {
			driver.findElement(custom_statmnt_link).click();
		}

		public void logout() {
			driver.findElement(logout_link).click();
		}

		public void goto_add_customer() {
			// TODO Auto-generated method stub
			driver.findElement(new_cust_link).click();

		}
	}
