package Selenium.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
	
 public	WebDriver driver;
	@Test
    public void Run() throws InterruptedException
    {
        System.out.println( "Hello World!" );
     //   WebDriverManager.chromedriver().setup();
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\RahulAvdheshYadav\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.findElement(By.name("q")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("BrowserStack");
        driver.quit();
        
        
    }
}
