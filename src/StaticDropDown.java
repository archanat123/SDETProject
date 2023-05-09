import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\JavaLearning\\trainingworkspace\\SeliniumProject\\geckodriver-v0.32.0-win64\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement sdd = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dd =new Select(sdd);
		dd.selectByIndex(3);
		System.out.println(dd.getFirstSelectedOption().getText());
		dd.selectByVisibleText("AED");
		System.out.println(dd.getFirstSelectedOption().getText());
		dd.selectByValue("INR");
		System.out.println(dd.getFirstSelectedOption().getText());
		// TODO Auto-generated method stub

	}

}
