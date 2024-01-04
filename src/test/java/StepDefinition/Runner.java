package StepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.Json;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\amala\\eclipse-workspace\\CucumberSimpleAutomation\\src\\test\\resources\\features\\product.feature",
                glue= {"StepDefinition"},
                monochrome=true,
                plugin= {"json:target/cucumber.json",
    
                		"html:target/HTMLReport/report.html",
                		"json:target/JsonReport/report.json",
                		"junit:target/JunitReport/Cucumber.xml"}
		)

public class Runner {
 public void WebProduct() {
	 	 System.out.println("successfull run");
	 
}
 
}
