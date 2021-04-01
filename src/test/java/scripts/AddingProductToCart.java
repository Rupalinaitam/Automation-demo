package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.Baseclass;
import pages.AddtoCart;
import pages.HomePage;
import pages.LoginPage;

public class AddingProductToCart extends Baseclass{

	@Test
	public void addingTocart() throws FileNotFoundException, IOException, InterruptedException
	{
		LoginPage l=new LoginPage(driver);	
		l.Search(p.getData("username"), p.getData("password"),p.getData("productnm"));
		
		HomePage h=new HomePage(driver);
		u.dropdown(h.getSortby(),p.getData("sortby"));
		h.selectShoe();
		
		AddtoCart ac=new AddtoCart(driver);
		ac.additem();
		
		
	}
}
