package Tests_Trello;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase{

    @BeforeMethod
    public void preConditions() {
        if (isLogged()) {
            logout();
        }
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

}
