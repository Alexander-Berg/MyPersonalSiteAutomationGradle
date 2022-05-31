package org.example.berg;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.safari.SafariDriver; 
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SafariDemoTest { 
@Test
public static void main(String[] args) { 

// Instantiate a SafariDriver class. 
WebDriver driver = new SafariDriver(); 
// Launch Website 
driver.navigate().to("http://www.google.com/"); 

// Click on the search text box and send value 
driver.findElement(By.id("lst-ib")).sendKeys("BrowserStack"); 

// Click on the search button 
driver.findElement(By.name("btnK")).click(); 

// Close the Browser 
driver.close(); 

}
