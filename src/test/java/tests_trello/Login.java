package tests_trello;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase{

     @BeforeMethod
    public void preConditions() {
        if (app.getUser().isLogged()) {
           app.getUser().logout();
        }
    }

    @Test
    public void LoginTest2() throws InterruptedException {
        User user = User.builder().email("aleksivan060@gmail.com").password("20111978").build();
        app.getUser().initLogin();
        app.getUser().fillLoginForm(user);
        app.getUser().submitLogin();
        app.getUser().isLoggedSuccess();
        Assert.assertTrue(app.getUser().isLoggedSuccess());
        //Thread.sleep(5000);
    }



  //  @Test
  //  public void LoginTest3() {
   //     click(By.cssSelector("[href='/login']"));
   //     type(By.cssSelector("#user"), "aleksivan060@gmail.com");
   //     click(By.cssSelector("#login"));
   //     click(By.cssSelector(".dlMUdg"));
   //     type(By.cssSelector("#password"), "20111978");
    //    click(By.cssSelector("#login-submit"));
 //   }




}
