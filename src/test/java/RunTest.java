import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

public class RunTest {

 //   @Test
    public void localTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        String title = driver.getTitle();
        System.out.println(title);
        List<WebElement> elements = driver.findElements(By.xpath("//a"));
        elements.stream().filter(e->!e.getText().isBlank()).forEach(e-> System.out.println(e.getText()));
        driver.quit();
    }

    @Test
    public void selGridChrome() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        //dc.setBrowserName(BrowserType.CHROME);
        dc.setBrowserName("chrome");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), dc);

        driver.get("https://docs.docker.com/desktop/install/windows-install/");
        driver.manage().window().fullscreen();
        String title = driver.getTitle();
        System.out.println(title);
        List<WebElement> elements = driver.findElements(By.xpath("//a"));
        elements.stream().filter(e->!e.getText().isBlank()).forEach(e-> System.out.println(e.getText()));
        driver.quit();
    }
    @Test
    public void selGridFirefox() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        //dc.setBrowserName(BrowserType.FIREFOX);
        dc.setBrowserName("firefox");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), dc);

        driver.get("https://docs.docker.com/desktop/install/windows-install/");
        driver.manage().window().fullscreen();
        String title = driver.getTitle();
        System.out.println(title);
        List<WebElement> elements = driver.findElements(By.xpath("//a"));
        elements.stream().filter(e->!e.getText().isBlank()).forEach(e-> System.out.println(e.getText()));
        driver.quit();
    }
    @Test
    public void selGridEdge() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName(BrowserType.EDGE);
        //dc.setBrowserName("edge");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), dc);

        driver.get("https://docs.docker.com/desktop/install/windows-install/");
        driver.manage().window().fullscreen();
        String title = driver.getTitle();
        System.out.println(title);
        List<WebElement> elements = driver.findElements(By.xpath("//a"));
        elements.stream().filter(e->!e.getText().isBlank()).forEach(e-> System.out.println(e.getText()));
        driver.quit();
    }
}
