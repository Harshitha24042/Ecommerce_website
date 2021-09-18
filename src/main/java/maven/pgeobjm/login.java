package maven.pgeobjm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class login {
	WebDriver driver;
	public login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void launch_url(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void provide_input(String input, String value )
	{
		driver.findElement(By.xpath("//input[@name='"+input+"']")).sendKeys(value);
	}
	public void click_lgin(String link)
	{
		driver.findElement(By.xpath("//button[@id='"+link+"']")).click();
	}
/*	public void shop_dress(String floral) throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.)
	}
*/	
	public void shop_clothes(String dress) throws InterruptedException
	{
		Thread.sleep(4000);
		Actions action=new Actions(driver);
		driver.findElement(By.xpath("//a[@title='"+dress+"']")).click();
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[2]/h5/a"));
		action.moveToElement(a).build().perform();
		WebElement b=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[2]/div[2]/a[1]"));
		action.moveToElement(b).click().perform();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@title='Proceed to checkout']//parent::a")).click();
		Thread.sleep(4000);
	}
	public void Checkout()throws InterruptedException
	{
		driver.findElement(By.xpath("//p[@class=\"cart_navigation clearfix\"]//following::a[@title=\"Proceed to checkout\"]")).click();
        driver.findElement(By.xpath("//button[@name='processAddress']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
        driver.findElement(By.xpath("//a[@title='Pay by check.']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span")).click();
        Thread.sleep(4000);
	}
    public void validateOrder()throws InterruptedException
    {
    	driver.findElement(By.xpath("//a[@title='Back to orders']")).click();
    }
    
			
	
}

