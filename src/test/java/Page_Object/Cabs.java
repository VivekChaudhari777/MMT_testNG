package Page_Object;
		
		import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


		public class Cabs extends Page_Constructor{
			public Cabs(WebDriver driver) {
			super(driver);
			}
				//locators

				//frame id	
				@FindBy(id="webklipper-publisher-widget-container-notification-frame")WebElement fm_frame;
		
//				@FindBy(xpath="//i[@class='wewidgeticon we_close']")WebElement Pop_Up;

				//frame element
				@FindBy(xpath="//*[@id=\\\"webklipper-publisher-widget-container-notification-close-div\\\"]")WebElement cli_frame;

				//click on cabs
				@FindBy(xpath="(//a[normalize-space()='Cabs'])")WebElement cli_cabs;

				//click on from
				@FindBy(xpath="//*[@for='fromCity']")WebElement cli_from;

				//select city
				@FindBy(xpath="//li[@data-suggestion-index='1']")WebElement sel_delhi;

				//click on to 
				@FindBy(xpath="//div[@data-cy='OutstationOneWayWidget_59']")WebElement cli_To;

				//click on To input text
				@FindBy(xpath="//input[@placeholder='To']")WebElement inp_To;

				//click on 1st suggestion
				@FindBy(xpath="//div[@class='makeFlex column']//p//span")WebElement cli_manali;

				//select date 
				@FindBy(xpath="//div[@aria-label='Mon Apr 01 2024']")WebElement cli_date;

				//apply time
				@FindBy(xpath="//div[@class='applyBtn']")WebElement cli_time;

				//click on search
				@FindBy(xpath="//a[@data-cy='OutstationOneWayWidget_64']")WebElement cli_search;

				//Select SUV
				@FindBy(xpath="//label[normalize-space()='SUV']")WebElement cli_SUV;

				//Lowest price
				@FindBy(xpath="(//div[@class='makeFlex rowReverse alignEnd appendBottom5']//p)[1]")WebElement get_price;

				//click more for option giftcard
				@FindBy(xpath="//span[@class='chNavIcon appendBottom2 chSprite chMore']")WebElement cli_more;

				//click on giftcard option
				@FindBy(xpath="//a[@data-cy='submenu_Giftcards']")WebElement cli_giftcard_option;

				//select giftcard
				@FindBy(xpath="(//div[@class='card__data'])[1]")WebElement select_giftcard;

				//click on email
				@FindBy(xpath="//li[@data-cy='DeliveryModes_444'][2]")WebElement cli_email;

				//send wrong email
				@FindBy(xpath="(//input[@data-cy='FormField_082'])[4]")WebElement send_email;

				//click on buy button
				@FindBy(xpath="//div[@class='booking__sections make-flex column'][3]")WebElement cli_buy;

				//get message of wrong email
				@FindBy(xpath="(//p[@class='red-text font11 append-top5'])[3]")WebElement get_message;
				
				@FindBy(xpath="//i[@class = 'wewidgeticon we_close']")
				public WebElement pop;
				public WebElement PopUp() throws InterruptedException {
						return pop;
					 }
		/*//popup
				public void PopUp() {
					try {
					driver.switchTo().frame("fm_frame");
					if(Pop_Up.isDisplayed()) {
						Pop_Up.click();
				} else {
					System.out.println("Element is not displayed");
					}
					driver.switchTo().defaultContent();
				} catch (Exception e) {
				// Handle the exception here
					 System.out.println("Exception occurred: " + e.getMessage());
					 }
				}
				
				*/
		//select cabs
				public void cabs(){
					cli_cabs.click();
				}
				
		//select from city	
				public void Fromcity(){
					cli_from.click();
					sel_delhi.click();
				}
				
		//select to city
				public void Tocity() throws InterruptedException{
					cli_To.click();
					inp_To.sendKeys("Manali, Himachal Pradesh");
//					WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.elementToBeClickablee(cli_manali));
					Thread.sleep(3000);
					cli_manali.click();		
				}
				
				
		//select date		
				public void selectdate(){
					cli_date.click();
				}
				
		//time apply
				public void Time(){
					cli_time.click();
				}
				
		//search button		
				public void Search(){
					cli_search.click();
				}
				
				
		//suv select	
				public void SUV(){
					cli_SUV.click();
				}
				
					
		//print lowest 
				public String Printvalue() {
				
				return get_price.getText();
				}
				
				
				//CLICK FOR GIFT CARD OPTION
						public void clickforgift() {
							cli_more.click();
							cli_giftcard_option.click();
						}
							
				//SCROLL TO CLICK ON CARD		

						public void ClickCard() {
							JavascriptExecutor js = (JavascriptExecutor)driver;
							js.executeScript("arguments[0].scrollIntoView();", select_giftcard);
							select_giftcard.click();
						}
							
				// CLICK ON EMAIL BUTTON

						public void Emailbutton() throws InterruptedException	{
						
							JavascriptExecutor js = (JavascriptExecutor)driver;
							js.executeScript("arguments[0].scrollIntoView();", cli_email);
							Thread.sleep(2000);
							cli_email.click();
						}
						
						
				//send wrong email
						
						public void Sendemail() {
							send_email.sendKeys("jayghari@challa");
						}
						
				//click on buy button	
						
						public void Buybutton() {
							cli_buy.click();
						}
							
				//Get Error message
					
						public String error(){
						String emailerror =get_message.getText();
						//System.out.println(emailerror);
						//Thread.sleep(2000);
						return emailerror;
						}
					}

		



	


