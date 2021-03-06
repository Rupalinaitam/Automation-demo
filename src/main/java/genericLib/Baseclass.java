package genericLib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.TestResult;

public class Baseclass implements Autoconstant {
	
	public WebDriver driver;
	public Propertyfiledata p=new Propertyfiledata();
	Photo p1=new Photo();
	public Utilies u=new Utilies();

	@BeforeMethod
	
	public void openApp() throws FileNotFoundException, IOException {
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getData("url"));
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);

	}
	
	
	@AfterMethod
	public void closeApp( ) throws IOException {
		/*int status = r.getStatus();
		String name = r.getName();
		
		if(status==2) 
		{
			p1.getPhoto(driver, name);
		}*/
		
		driver.close();
	}
	
	

}
