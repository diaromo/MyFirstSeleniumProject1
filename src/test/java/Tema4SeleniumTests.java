import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tema4SeleniumTests {

    //Login Tests

    private WebDriver driver;
    @Before
    public void setupDriver (){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://testfasttrackit.info/selenium-test");

    }
    @Test
    public void testValidLogin(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("a[title*='Log']")).click();
        driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("romosandiana@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("[title=Login]")).click();
        WebElement helloMessage = driver.findElement(By.cssSelector("p strong"));
        Assert.assertTrue(helloMessage.isDisplayed());
        String message = helloMessage.getText();
        Assert.assertEquals("Hello, Diana Romosan!",helloMessage.getText());
    }
    @Test
    public void testInvalidLoginPassword(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("a[title*='Log']")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("romosandiana@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("maumau");
        driver.findElement(By.cssSelector("[title=Login]")).click();
        WebElement errorMessage = driver.findElement(By.cssSelector("li span"));
        Assert.assertEquals("Invalid login or password.",errorMessage.getText());
    }
    @Test
    public void testInvalidLoginEmailInvalid(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("a[title*='Log']")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("romosandianagmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("maumau");
        driver.findElement(By.cssSelector("#send2")).click();
        Assert.assertEquals("Customer Login", driver.getTitle());
    }

    //Register Tests
    @Test
    public void registerTest(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("a[title=Register]")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Diana");
        driver.findElement(By.id("middlename")).sendKeys("Simona");
        driver.findElement(By.name("lastname")).sendKeys("Romosan");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("romosandiana24@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("#is_subscribed")).click();
        driver.findElement(By.cssSelector(".button[title=Register]")).click();
        String message = driver.findElement(By.cssSelector(".success-msg span")).getText();
        Assert.assertEquals("Thank you for registering with Madison Island.",message);

    }
    @Test
    public void registerTestMissingFirstName(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("a[title=Register]")).click();
        //driver.findElement(By.cssSelector("#firstname")).sendKeys("Diana");
        driver.findElement(By.id("middlename")).sendKeys("Simona");
        driver.findElement(By.name("lastname")).sendKeys("Romosan");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("romosandiana7@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("#is_subscribed")).click();
        driver.findElement(By.cssSelector(".button[title=Register]")).click();
        String message = driver.findElement(By.cssSelector(".validation-advice")).getText();
        Assert.assertEquals("This is a required field.",message);

    }
    @Test
    public void registerTestLongFirstName(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("a[title=Register]")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers write once, run anywhere (WORA),[17] meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.[18] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most popular programming languages in use according to GitHub,[19][20] particularly for client-server web applications, with a reported 9 million developers.[21].Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle) and released in 1995 as a core component of Sun Microsystems' Java platform. The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GNU General Public License. Oracle offers its own HotSpot Java Virtual Machine, however the official reference implementation is the OpenJDK JVM which is free open source software and used by most developers and is the default JVM for almost all Linux distributions. As of September 2020, the latest version is Java 15, with Java 11, a currently supported long-term support (LTS) version, released on September 25, 2018. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades. Oracle (and others) highly recommend uninstalling outdated versions of Java because of serious risks due to unresolved security issues.[22] Since Java 9, 10, 12, 13 and 14 are no longer supported, Oracle advises its users to immediately transition to the latest version (currently Java 15) or an LTS release");
        driver.findElement(By.id("middlename")).sendKeys("Simona");
        driver.findElement(By.name("lastname")).sendKeys("Romosan");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("romosandiana29@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("#is_subscribed")).click();
        driver.findElement(By.cssSelector(".button[title=Register]")).click();
        String message = driver.findElement(By.cssSelector(".success-msg span")).getText();
        Assert.assertEquals("Thank you for registering with Madison Island.",message);
    }

    //Wish List Tests
    @Test
    public void addToWishList(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("a[title*='Log']")).click();
        driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("romosandiana@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("[title=Login]")).click();

        driver.findElement(By.cssSelector("li.level0.nav-5.parent")).click();
        driver.findElement(By.cssSelector("[title='View Details']")).click();
        driver.findElement(By.cssSelector(".link-wishlist")).click();
        String message = driver.findElement(By.cssSelector(".success-msg span")).getText();
        Assert.assertEquals("Slim fit Dobby Oxford Shirt has been added to your wishlist. Click here to continue shopping.",message);

    }
    @Test
    public void addToCartFromWhishList(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("a[title*='Log']")).click();
        driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("romosandiana@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("[title=Login]")).click();

        driver.findElement(By.cssSelector("li.level0.nav-5.parent")).click();
        driver.findElement(By.cssSelector("[title='View Details']")).click();
        driver.findElement(By.cssSelector(".link-wishlist")).click();
        driver.findElement(By.cssSelector(".cart-cell .button")).click();
        driver.findElement(By.cssSelector("#swatch27")).click();
        driver.findElement(By.cssSelector("#swatch81")).click();
        driver.findElement(By.cssSelector(".add-to-cart-buttons")).click();
        String message = driver.findElement(By.cssSelector(".success-msg span")).getText();
        Assert.assertEquals("Slim fit Dobby Oxford Shirt was added to your shopping cart.",message);

    }
    @Test
    public void deleteItemFromWishList(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("a[title*='Log']")).click();
        driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("romosandiana@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("[title=Login]")).click();

        driver.findElement(By.cssSelector("li.level0.nav-5.parent")).click();
        driver.findElement(By.cssSelector("[title='View Details']")).click();
        driver.findElement(By.cssSelector(".link-wishlist")).click();
        driver.findElement(By.cssSelector(".cart-cell .button")).click();
        driver.findElement(By.cssSelector("#swatch27")).click();
        driver.findElement(By.cssSelector("#swatch81")).click();
        driver.findElement(By.cssSelector(".add-to-cart-buttons")).click();
        driver.findElement(By.cssSelector(".a-center.product-cart-remove.last [title='Remove Item']")).click();
        String message = driver.findElement(By.cssSelector("div.page-title")).getText();
        Assert.assertEquals("SHOPPING CART IS EMPTY",message);
    }
    @After

   public void close(){
       driver.close();
    }
}

