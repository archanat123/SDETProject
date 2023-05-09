import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.gecko.driver","C:\\JavaLearning\\trainingworkspace\\SeliniumProject\\geckodriver-v0.32.0-win64\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			

		
		String name="rahul";
		
		String password = getPassward(driver);
		System.out.println(password);
		driver.get("https://rahulshettyacademy.com/locatorspractice");
			driver.findElement(By.id("inputUsername")).sendKeys(name);
			driver.findElement(By.name("inputPassword")).sendKeys(password);
			driver.findElement(By.className("submit")).click();
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.tagName("p")).getText());
			Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
			Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
			driver.findElement(By.xpath("//*[text()='Log Out']")).click();
			driver.close();
			
			
			
			
		// TODO Auto-generated method stub

	}
	public static String getPassward(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		
	    String[] passwordArray =  passwordText.split("'");
	    		
	    String password = passwordArray[1].split("'")[0];
	 //   System.out.println(password);return password;
	    
	//    String password =password[0];
		
		
		
		
	
		
	    return password;	
		
              }
	
	
}
