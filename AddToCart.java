package Java1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart{
	private WebDriver driver;

    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }
    public void addToCart() {
  
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
        WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button"));
        WebElement btn3 = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        btn1.click();
        btn2.click();
        btn3.click();
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
      
    }
}
