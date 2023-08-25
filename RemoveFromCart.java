package Java1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoveFromCart {
	private WebDriver driver;

    public RemoveFromCart(WebDriver driver) {
        this.driver = driver;
    }
    public void RemoveCart() {
  
    	driver.get("https://www.saucedemo.com/v1/inventory.html");
        WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
        WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button"));
        WebElement btn3 = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        btn1.click();
        btn2.click();
        btn3.click();
        //remove 
        WebElement btn4 = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/button"));
        btn4.click();
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
}
}
