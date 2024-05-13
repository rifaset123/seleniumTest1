import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    @Test
    public void test() {

        // initiate webdriver
        WebDriver driver;
        driver = new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver", "~/chromedriver-mac-arm64/chromedriver");

        // maximize windows browser
        driver.manage().window().maximize();

        // navigate to google homepage
        driver.get("https://youtube.com/");

        // set timeout 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait from selenium

        // get current title of the page
        String title = driver.getTitle();
        System.out.println("title: " + title);

        // get current url
        String url = driver.getCurrentUrl();
        System.out.println("url: " + url);

        driver.quit();
    }
}
