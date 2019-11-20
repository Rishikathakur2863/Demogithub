package cucumberproject.cucuberTest01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pages {
	WebDriver driver;
/*	By username = By.name("userName");
	By password = By.name("password");
	By loginbutton = By.name("login");*/

	public Pages(WebDriver driver) {
		this.driver = driver;
	}

	public void do_login(String uid, String pass) {
		driver.findElement(By.name("username")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("loginbutton")).click();

	}

}
