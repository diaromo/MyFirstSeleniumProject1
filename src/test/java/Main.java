import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");


       Wishlist addToWishList1 = new Wishlist();
        addToWishList1.addToWishList();
        addToWishList1.addToCartFromWhishList();
        addToWishList1.deleteItemFromWishList();


        RegisterTest test = new RegisterTest();
        test.registerTest();
        test.registerTestMissingFirstName();
        test.registerTestLongFirstName();

        LoginTest testlogin = new LoginTest();
        testlogin.testValidLogin();
        testlogin.testInvalidLoginPassword();
        testlogin.testInvalidLoginEmailInvalid();
        testlogin.testInvalidLoginEmailMissing();


    }
 }

