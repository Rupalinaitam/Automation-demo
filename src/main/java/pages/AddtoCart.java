package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {

	@FindBy(xpath="//a[text()='+']")
	private WebElement plusbt;
	
	@FindBy(id="button_cart_80")
	private WebElement addcart;
	
	@FindBy(name="__privateStripeMetricsController6110")
	private WebElement procced;
	
	public AddtoCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void additem() {
		plusbt.click();
		addcart.click();
		procced.click();
		
	}
}
