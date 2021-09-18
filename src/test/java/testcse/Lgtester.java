package testcse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.pgeobjm.login;

public class Lgtester {


	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32 (2)\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        login l=new login(driver);
        l.launch_url("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        l.provide_input("email","yeet@gmail.com");
        l.provide_input("passwd", "harshi");
        l.click_lgin("SubmitLogin");
        l.shop_clothes("Women");
        l.Checkout();
        l.validateOrder();

        
        
        

	}

}
