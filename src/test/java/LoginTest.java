import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void testValidLogin(){


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://testfasttrackit.info/selenium-test");

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("romosandiana@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();


       driver.close();

    }

    public static void testInvalidLoginPassword(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("romosandiana@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("maumau");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        String er = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-login > ul > li > ul > li > span")).getText();
        System.out.println(er);

        driver.close();
    }

    public static void testInvalidLoginEmailInvalid(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("romosandianagmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("maumau");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();

        driver.close();
    }

    public static void testInvalidLoginEmailMissing(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        //driver.findElement(By.cssSelector("#email")).sendKeys("");
        driver.findElement(By.cssSelector("#pass")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        String er = driver.findElement(By.cssSelector("#advice-required-entry-email")).getText();
        System.out.println(er);

        driver.close();
    }
}
