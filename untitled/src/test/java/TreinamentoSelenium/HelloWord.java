package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWord {
    @Test
    public void helloW(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        Assert.assertEquals("Google",driver.getTitle());
        driver.quit();
    }
}
