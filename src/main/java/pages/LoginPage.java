package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myaccountbt;
	
	@FindBy(xpath="//a[text()='Sign in']")
	private WebElement signinbt;
	
	@FindBy(id="login_popup4")
	private WebElement usernametf;
	
	@FindBy(id="psw_popup4")
	private WebElement passtf;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement logbt;
	
	@FindBy(xpath="//input[@title='Search products']")
	private WebElement searchtb;
	
	@FindBy(xpath="//button[@title='Search']")
	private WebElement gobt;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void Search(String us,String pass, String product) throws InterruptedException
	{
		myaccountbt.click();
		signinbt.click();
		usernametf.clear();
		usernametf.sendKeys(us);
		passtf.clear();
		passtf.sendKeys(pass);
		Thread.sleep(3000);
		logbt.click();
		searchtb.sendKeys(product);
		gobt.click();
		
	}
		
		
	
	
}
