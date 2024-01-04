package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
     WebDriver driver=new ChromeDriver();
	@Given("browser is open")
	public void browser_is_open() {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.name("q")).sendKeys("demowebshop",Keys.ENTER);
	}

	@And("user click onlogin")
	public void user_click_on_login() throws InterruptedException {
		driver.findElement(By.xpath("//h3[contains(@class,'LC20lb MBeuO')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
	}

	@And("user is on loginpage")
	public void user_is_on_login_page() {
		driver.findElement(By.linkText("Log in")).click();
	}

	@When("user enters mugesh1@gmail.comandMugesh@{int}")
	public void user_enters_mugesh1_gmail_com_and_mugesh(Integer int1) {
		driver.findElement(By.name("Email")).sendKeys("mugesh1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Mugesh@1");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//		driver.navigate().to("https://demowebshop.tricentis.com/");;
		Thread.sleep(5000);
		driver.close();
	}
}
