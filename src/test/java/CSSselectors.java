import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectors {

    private WebDriver driver;

    @Before
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://testfasttrackit.info/selenium-test");

    }

    @Test
    public void searchButtonSelector(){

        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("a[title*='Log']")).click();
        driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("romosandiana@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("[title=Login]")).click();
        driver.findElement(By.cssSelector("#search")).sendKeys("SILVER DESERT NECKLACE");
        driver.findElement(By.cssSelector("div.input-box  button")).click();
        driver.findElement(By.cssSelector("li:nth-child(1) div.actions  button")).click();
        driver.findElement(By.cssSelector("li.level0.nav-5.parent")).click();
        driver.findElement(By.cssSelector("[title='View Details']")).click();
        driver.findElement(By.cssSelector("#swatch27")).click();
        driver.findElement(By.cssSelector("#swatch81")).click();
        driver.findElement(By.cssSelector(".add-to-cart-buttons")).click();
        driver.findElement(By.cssSelector(".a-center.product-cart-remove.last [title='Remove Item']")).click();
        driver.findElement(By.cssSelector(".input-box [type=submit]")).click();
        driver.findElement(By.cssSelector("div.page-title.title-buttons ul li button")).click();

    }


    @After

    public void close() {
        driver.close();
    }
}