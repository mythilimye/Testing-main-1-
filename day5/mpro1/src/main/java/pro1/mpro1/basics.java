package pro1.mpro1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com");
		dr.findElement(By.name("email")).sendKeys("bavadharinim314@gmail.com");
		dr.findElement(By.name("pass")).sendKeys("");
		dr.findElement(By.partialLinkText("pa")).click();
		Thread.sleep(5000);
		dr.quit();
		
	}

}
