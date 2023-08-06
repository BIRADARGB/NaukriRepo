package NaukriPackage;
//updated new project
        import org.openqa.selenium.By;
        import org.openqa.selenium.chrome.ChromeDriver;

public class naukriClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:/SeleniumProjects/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com");
        driver.findElement(By.id("login_Layer")).click();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title); ////
        driver.findElement(By.xpath("//label[text()='Email ID / Username']/following-sibling::input")).sendKeys("gmail@gmail.com");
        Thread.sleep(2000);
        driver.close();
    }
}
