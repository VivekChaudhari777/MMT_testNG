package Test_Cases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Page_Object.Cabs;
import Page_Object.Hotel;

public class Hotel_TestNg extends BaseClass{
	List<String> list= new ArrayList<String>();
    Hotel hh= new Hotel(driver);
    

	 @Test(priority=15)
	 public void popup() {
		 try {
				driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");	
				if(hh.PopUp().isDisplayed()) {
					hh.PopUp().click();
					System.out.println("Pop Up Displayed and closed successfully.");
				}else {
					System.out.println("Pop up not found");
				}
				driver.switchTo().defaultContent();
				}catch (Exception e) {
					System.out.println("Pop up not found");
				}
	 	logger.info("*****POPUP Handle successfully******");
	 }
	
	
	@Test(priority=16)
	 public void hotels()throws InterruptedException  {
		Hotel hh = new Hotel(driver);
		//driver.navigate().back();	
//		Cabs cb = new Cabs(driver);
//		cb.PopUp();
		 hh.hotels();
			logger.info("Click on Hotels");

	 }
	 
	
	
	 @Test(priority=18)
	 public void Guest() {
		 Hotel hh = new Hotel(driver);
			hh.Guest();
			logger.info("Click on guest");

	 }
	 
	 @Test(priority=19)
		public void adult() {
		 Hotel hh = new Hotel(driver);
		 logger.info("Click on Adults");
		 logger.info("Print the list Successfully");
		 for(WebElement li1:hh.adults()) {
			 list.add(li1.getText());

		 }
		
	 
		// System.out.println("list of adult: "+list);
		 for(String li2:list) {
			 System.out.println("list of adults: "+ li2);
}
}
	 }