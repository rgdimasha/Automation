package Java1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAutomation {

	public static void main(String[] args) {
		  WebDriverManager.chromedriver().setup();
	        ChromeDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        UserLogin login = new UserLogin(driver);
	        login.ValidLogin("standard_user", "secret_sauce");
	        login.ValidLogin("standard", "secret_sauce");
	        
	        AddToCart addToCart = new AddToCart(driver);
	        addToCart.addToCart();
	        
	        RemoveFromCart Remove= new RemoveFromCart(driver);
	        Remove.RemoveCart();
	        
	        FilterResult FilterR= new FilterResult(driver);
	        FilterR.Filter();
	        
	        CheckoutProcess check= new CheckoutProcess(driver);
	        check.Checkout("harry", "styles","123");
	 
	       
	        driver.quit();
	}

}
