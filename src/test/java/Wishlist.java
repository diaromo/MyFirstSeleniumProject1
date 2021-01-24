import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wishlist {

    public static void addToWishList(){


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://testfasttrackit.info/selenium-test");

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("romosandiana@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();

        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
        String message = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div.my-wishlist > ul > li > ul > li > span")).getText();
        System.out.println(message);

        driver.close();
    }

    public static void addToCartFromWhishList(){


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://testfasttrackit.info/selenium-test");

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("romosandiana@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();

        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("#item_840 > td.wishlist-cell4.customer-wishlist-item-cart > div > button > span > span")).click();
        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click();
        driver.findElement(By.cssSelector("#swatch81 > span.swatch-label")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();
        String message = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.cart.display-single-price > ul > li > ul > li > span")).getText();
        System.out.println(message);

        driver.close();
    }

    public static void deleteItemFromWishList(){


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://testfasttrackit.info/selenium-test");

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("romosandiana@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("lemne18");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();

        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("#item_843 > td.wishlist-cell5.customer-wishlist-item-remove.last > a")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        String message = driver.findElement(By.cssSelector("#wishlist-view-form > div > p")).getText();
        System.out.println(message);

        driver.close();
    }
}
