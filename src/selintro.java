import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class selintro {
	
	public static void main(String[] args) throws InterruptedException
	{
	
	//		System.setProperty("webdriver.chrome.driver", "C:\\JavaLearning\\trainingworkspace\\SeliniumProject\\chromedriver_win32\\chromedriver.exe");
   //  WebDriver driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	System.setProperty("webdriver.gecko.driver","C:\\JavaLearning\\trainingworkspace\\SeliniumProject\\geckodriver-v0.32.0-win64\\geckodriver.exe" );
	WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

	driver.get("https://rahulshettyacademy.com/locatorspractice");
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("aghjf");
		driver.findElement(By.className("submit")).click();
		
		
		//using css
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		
		//using xpath
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
		//using css
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@rsa.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click();
		
		
		
		
		
		//driver.findElement(By.cssSelector("input.btn-primary")).click();
		//driver.findElement(By.xpath("input[text()='Log in']")).click();
		//System.out.println(driver.findElement(By.tagName("h3")).getText());
	//	Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(),"Log in");
				
		
		
		//driver.findElement(By.xpath("//input[@className='btn-primary']")).click();
		
		//class="btn-primary button p-v-2-xs p-h-5-xs m-v-3-xs col-12-xs"
//driver.findElement(By.className("btn-primary")).click();
		//System.out.println(driver.findElement(By.cssSelector("input.")).getText());
	//driver.findElement(By.linkText("Forgot Password")).click();
	
	
	//driver.findElement(By.name("email")).sendKeys("jhfdjh@gmail.com");
/*	try        
	{
	    Thread.sleep(5000);
	} 
	catch(InterruptedException ex) 
	{
	    Thread.currentThread().interrupt();
	}
     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xxxxx@gmail.com");
	*/
//		btn-primary button p-v-2-xs p-h-5-xs m-v-3-xs col-12-xs
		
		
		
		//System.out.println(driver.getTitle());
	//	System.out.println(driver.getCurrentUrl());
	// driver.close();
//	driver.quit();
	
	}



}
