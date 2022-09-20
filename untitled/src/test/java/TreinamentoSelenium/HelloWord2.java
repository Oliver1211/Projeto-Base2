package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWord2 {
    @Test
    public void helloW2(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pichau\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        Assert.assertEquals("Google",driver.getTitle());
        driver.quit();
    }
}
