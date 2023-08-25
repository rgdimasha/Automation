package Java1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckoutProcess {
	private WebDriver driver;

    public CheckoutProcess(WebDriver driver) {
        this.driver = driver;
    }
    public void Checkout(String username, String password, String zipcode) {
    	driver.get("https://www.saucedemo.com/v1/checkout-step-one.html");
            WebElement usernameInput = driver.findElement(By.id("first-name"));
            WebElement passwordInput = driver.findElement(By.id("last-name"));
            WebElement zipcodeInput = driver.findElement(By.id("postal-code"));
           
            usernameInput.sendKeys(username);
            passwordInput.sendKeys(password);
            zipcodeInput.sendKeys(zipcode);
            WebElement checkButton = driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input"));
            checkButton.click();
            WebElement finishButton = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]"));
            try {
                Thread.sleep(5000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
          
           
            finishButton.click();
        
    }

}

