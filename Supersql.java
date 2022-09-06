package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Supersql {
	WebDriver driver;
	
  @Test(priority=1)
  public void browserInitialize() {
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  System.out.println("Browser launch");
  }
  
  @Test(priority=2)
  public void launchApp() {
	  driver.get("http://demostore.supersqa.com/my-account/");
	  System.out.println(driver.getTitle());
	  System.out.println("Website Enter");
  }
  
  @Test(priority=3)
  public void locate() {
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rathodamol3@gmail.com");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@12345");
	  driver.findElement(By.xpath("//button[@name='login']")).click();
	  System.out.println("Enter All Credentioal");
	  
  }
  
  @Test(priority=4)
  public void verifyLogin() {
	 WebElement dash= driver.findElement(By.xpath("//*[@id=\"post-9\"]/div/div/nav/ul/li[1]/a"));
	 System.out.println(dash.isDisplayed());
	 System.out.println("Verify Login");
	 
  }
  @Test(priority=5)
  public void logOut() {
	  driver.findElement(By.xpath("//*[@id=\"post-9\"]/div/div/div/p[1]/a")).click();
	  driver.close();
	  System.out.println("Browser Exist");
	  
  }
  
  
}
