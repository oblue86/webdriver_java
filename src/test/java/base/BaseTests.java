package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        // region - Chapter 2(Webdriver), sizing browser part
//        //1 - Maximize the window
//        driver.manage().window().maximize();
//
//        //2 - Fullscreen mode
//        driver.manage().window().fullscreen();

//        //3 - Specific width (show Chrome iPhoneX emulator)
//        Dimension size = new Dimension(375, 812);
//        driver.manage().window().setSize(size);
        // endregion - Chapter 2(sizing browser part)

        // region - Chapter 3 lesson(Finding Web Elements)
//        List<WebElement> links =  driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//
//        WebElement inputsLink =  driver.findElement(By.linkText("Angie"));
//        WebElement inputsLink =  driver.findElement(By.linkText("Angie")); // This will cause a
                                                                           // NoSuchElementException if we uncomment
                                                                           // this inputlinks Webelement initialization
                                                                           // and comment the first initialization
//        inputsLink.click();
        // endregion - Chapter 3 lesson(Finding Web Elements)

        // region - Chapter 3 practice(Finding Web Elements)
//        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
//        shiftingContentLink.click();
//
//        WebElement menuElementLink = driver.findElement(By.linkText("Example 1: Menu Element"));
//        menuElementLink.click();
//
//        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
//        System.out.println("Number of menu items: " + menuItems.size());
        // endregion - Chapter 3 practice(Finding Web Elements)

        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
