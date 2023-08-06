package main.java.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class naukri {
    ChromeDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "E:/SeleniumProjects/chromedriver_win32/chromedriver.exe");
    }

    @Test
    public void launchApplication() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.get("https://www.naukri.com");
        driver.findElement(By.id("login_Layer")).click();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("test completed");
        driver.close();
    }

}
