package patientCarePartnerProject;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	public static void main(String args[]) {
		
		
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:/Users/ZML-WIN-ShwetaS-01/OneDrive - zimetrics.com/Documents/chromedriver-win64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://carelink-test1.minimed.eu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("landing-registration-button-id")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='mat-legacy-form-field-outline ng-tns-c2570170354-4 ng-star-inserted']"))).click().perform();
		//driver.findElement(By.xpath("//div[@class='mat-legacy-form-field-outline ng-tns-c2570170354-4 ng-star-inserted']")).click();
		driver.findElement(By.xpath("//span[@id='select-country-value-gb']")).click();
		System.out.println("Country is selected");
		driver.findElement(By.id("su-button-next")).click();
		System.out.println("Waiting for moving to the next page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.id("mat-legacy-radio-2")).click();
		driver.findElement(By.id("su-button-next")).click();
		driver.close();
	}

}
