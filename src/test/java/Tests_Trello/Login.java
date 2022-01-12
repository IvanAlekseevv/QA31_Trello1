package Tests_Trello;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
    WebDriver wd;

    @BeforeMethod
    public void Precondition() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");

    }

    @Test
    public void LoginTest2() {
        click(By.cssSelector("[href='/login']"));
        type1(By.cssSelector("#user"), "aleksivan060@gmail.com");
        click(By.cssSelector("#login"));
        type1(By.cssSelector("#password"), "20111978");
        click(By.cssSelector("#login-submit"));

    }

    @Test
    public void LoginTest3() {
        click(By.cssSelector("[href='/login']"));
        type1(By.cssSelector("#user"), "aleksivan060@gmail.com");
        click(By.cssSelector("#login"));
        click(By.cssSelector(".dlMUdg"));
        type1(By.cssSelector("#password"), "20111978");
        click(By.cssSelector("#login-submit"));
    }

    public void type1(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void logout() {
        click(By.cssSelector("[data-test-id='header-member-menu-button']"));
        click(By.cssSelector("[data-test-id='header-member-menu-logout']"));
        click(By.cssSelector("[data-testid='logout-button']"));
    }

    public boolean isLogged(){

        return wd.findElements(By.cssSelector("._2ft40Nx3NZII2i")).size()>0;
    }



}
