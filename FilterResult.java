package Java1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FilterResult {
	private WebDriver driver;

    public FilterResult(WebDriver driver) {
        this.driver = driver;
    }
    public void Filter() {
    	  
        driver.get("https://www.saucedemo.com/v1/inventory.html");
       
        WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select"));
        Select select = new Select(btn1);
        select.selectByValue("za");
        btn1.click();
}
}
