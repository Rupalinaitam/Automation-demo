package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id="sw_elm_sort_fields")
	private WebElement sortby;
	
	@FindBy(xpath="//a[contains(text(),'Nike Tenkay ')]")
	private WebElement shoe;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getSortby()
	{
		return sortby;
	}
	
	public void selectShoe() {
		shoe.click();
	}
}
