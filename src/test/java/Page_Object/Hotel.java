package Page_Object;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Hotel extends Page_Constructor{

	public Hotel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	//locators
	
	//popup
	@FindBy(xpath="//i[@class = 'wewidgeticon we_close']")WebElement pop;

	//click hotel
		@FindBy(xpath="(//span[normalize-space()='Hotels'])[1]")WebElement cli_hotel;

		//click on guest
		@FindBy(xpath="//input[@id='guest']")WebElement cli_guest;

		//click on adults
		@FindBy(xpath="(//div[@class='gstSlct'])[2]")WebElement cli_adults;

		//get list 
		@FindBy(xpath="//li[@data-cy='GuestSelect$$_323']")List<WebElement> get_list;


	//Actions
//click on Hotels
		
		public void hotels() throws InterruptedException {	
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",cli_hotel );
		Thread.sleep(2000);
		cli_hotel.click();
		}
		
		
//click on guest

		public void Guest() {
			cli_guest.click();
		}
		
		
//click on adults
		public List<WebElement> adults() {
			cli_adults.click();
			return get_list;

		}
		
		
//close the browser
		public void quit() {
		driver.quit();
		
		}
		
	
public WebElement PopUp() throws InterruptedException {
	return pop;
 }
}
