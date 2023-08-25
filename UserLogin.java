package Java1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class UserLogin extends TestAutomation {
	private ChromeDriver driver;

    public UserLogin  (ChromeDriver driver) {
        this.driver = driver;
    }

    public void ValidLogin(String username, String password) {
    	driver.get("https://www.saucedemo.com/");
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void InValidLogin(String username, String password) {
    	driver.get("https://www.saucedemo.com/");
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
    
}
