package seleniumVezb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VezbSelenium {
	
	public static final String URL = "http://localhost:5193/Clients";
	public static final String NEW_CLIENT = "/html/body/div/main/a";
	public static final String TXT_NAME = "/html/body/div/main/form/div[1]/div/input";
	public static final String TXT_EMAIL = "/html/body/div/main/form/div[2]/div/input";
	public static final String TXT_PHONE = "/html/body/div/main/form/div[3]/div/input";
	public static final String TXT_ADDRESS = "/html/body/div/main/form/div[4]/div/input";
	public static final String SUBMIT = "/html/body/div/main/form/div[5]/div[1]/button";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeWebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		driver.manage().window().maximize();
		
		WebElement new_client = driver.findElement(By.xpath(NEW_CLIENT));
		new_client.click();
		
		WebElement name = driver.findElement(By.xpath(TXT_NAME));
		name.sendKeys("Strahinja");
		
		WebElement email = driver.findElement(By.xpath(TXT_EMAIL));
		email.sendKeys("strale11@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath(TXT_PHONE));
		phone.sendKeys("0642345687");
		
		WebElement address = driver.findElement(By.xpath(TXT_ADDRESS));
		address.sendKeys("Cernisevskog 72");
		
		WebElement submit = driver.findElement(By.xpath(SUBMIT));
		submit.click();
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
	}

}
