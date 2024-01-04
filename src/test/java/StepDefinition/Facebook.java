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

public class Facebook {
	WebDriver driver = new ChromeDriver();
	@Given("user open thebrowser")
	public void user_open_the_browser() {
      System.out.println("browser is open");
      
      driver.get("https://www.google.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      driver.manage().window().maximize();
      driver.findElement(By.name("q")).sendKeys("facebook",Keys.ENTER);
    
	}

	@And("user click thefacebook")
	public void user_click_the_facebook() {
		System.out.println("browser facebook");
	driver.findElement(By.xpath("//h3[contains(@class,'LC20lb MBeuO')]")).click();
		
	}

	@When("user give thelogin username")
	public void user_give_the_login_username() {
		System.out.println("give login number");
		driver.findElement(By.id("email")).sendKeys("9865053728");
	}

	@And("user give thepassword")
	public void user_give_the_password() {
		System.out.println("give the password");
		driver.findElement(By.id("pass")).sendKeys("Ramesh@123");
	}

	@And("user click thesign button")
	public void user_click_the_sign_button() {
		System.out.println("click the button");
		driver.findElement(By.name("login")).click();
	}

	@Then("close the bowser")
	public void close_the_bowser() throws InterruptedException {
		System.out.println("browser is close");
		Thread.sleep(4000);
		driver.close();

	}

}
