import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    @Test
    public void test() {
        // initiate webdriver
        WebDriver driver;
        driver = new EdgeDriver();

        // set property untuk versi 4.11 kebawah
        // System.setProperty("webdriver.chrome.driver", "~/msedgedriver");

        // maximize windows browser
        driver.manage().window().maximize();

        // navigate to google homepage
        driver.get("https://sv.ugm.ac.id/");

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
