package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebShop {
	WebDriver driver=new FirefoxDriver();
	@Given("browseropen")
	public void browser_open() {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.name("q")).sendKeys("demowebshop",Keys.ENTER);
	}
	@And("enter the demowebshop and click the link")
	public void enter_the_demowebshop_and_click_the_link() {
		driver.findElement(By.xpath("//h3[contains(@class,'LC20lb MBeuO')]")).click();
	}
	@When("user click thecomputer product and click the note book")
	public void user_click_the_computer_product_and_click_the_notebook() {
		driver.findElement(By.linkText("Computers")).click();
		driver.findElement(By.xpath("//img[@alt='Picture for category Notebooks']")).click();
	}
	@And("click the laptop and addtocart")
	public void click_the_laptop_and_add_to_cart() {
	  driver.findElement(By.xpath("//img[@title='Show details for 14.1-inch Laptop']")).click();
	  driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}
	@And("click the shoppinglist")
	public void click_the_shopping_list() {
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
	}
	@And("click the selectbutton")
	public void click_the_select_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.name("removefromcart")).click();
	}
	@And("click the termagree button")
	public void click_the_term_agree_button() throws InterruptedException {
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(7000);
	}
	@When("user enter the mailid")
	public void user_enter_the_mail_id() {
		driver.findElement(By.id("Email")).sendKeys("mugesh1@gmail.com");
	}

	@When("user enter the pass word")
	public void user_enter_the_password() {
		driver.findElement(By.id("Password")).sendKeys("Mugesh@1");
	}

	@When("user enter the Login button")
	public void user_enter_the_login_button() {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	@And("click the select button 1")
	public void click_the_select_button1() {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
	@And("click the term agree button 1")
	public void click_the_term_agree_button1() throws InterruptedException {
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(7000);
	}
	@And("click the BillingAddress")
	public void click_the_billing_address() {
		driver.findElement(By.xpath("//input[@title='Continue']")).click();
	}
	@And("click instore button andcontinue")
	public void click_instore_button_and_continue() {
		driver.findElement(By.id("PickUpInStore")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[2]")).click();
	}
	@And("click the paycontinue")
	public void click_the_pay_continue() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']//input[1]")).click();
	}
	@And("click the infromcontinue")
	public void click_the_infrom_continue() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='5']/following::input")).click();
	}
	@Then("click the confirmbutton")
	public void click_the_confirm_button() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		Thread.sleep(7000);
		WebElement printout = driver.findElement(By.xpath("//ul[@class='details']//li[1]"));
		String getOrderNo=printout.getText();
		System.out.println(getOrderNo);
		driver.close();
	}


}
