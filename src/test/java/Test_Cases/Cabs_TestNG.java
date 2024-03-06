package Test_Cases;

	import org.testng.annotations.Test;
	import BaseClass.BaseClass;

import Page_Object.Cabs;
import utility.excel;

import java.io.IOException;

	

	public class Cabs_TestNG extends BaseClass{

		String msg;
		 String pv;
		 
		 
		 
	@Test(priority=1)
	public void popup() {
		Cabs cb= new Cabs(driver);
		try {
			driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");	
			if(cb.PopUp().isDisplayed()) {
				cb.PopUp().click();
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
	
		 
	@Test(priority=2)
	public void cab() {
		Cabs cb= new Cabs(driver);
	cb.cabs();
	logger.info("Click on cabs");
	}
	

	 @Test(priority=3)
	 public void Fromcity(){
		 Cabs cb= new Cabs(driver);
		cb.Fromcity(); 
	logger.info("Select from city");
	 }
	 
	 @Test(priority=4)
	 public void Tocity()throws InterruptedException {
		 Cabs cb= new Cabs(driver);
		 cb.Tocity();
	logger.info("Select To City");
	 }
	 
	 
	 @Test(priority=5)
	 public void selectdate(){
		 Cabs cb= new Cabs(driver);
		 cb.selectdate();
	logger.info("Select Date");	
	 }
	 
	 
	 @Test(priority=6)
		public void Time(){
		 Cabs cb= new Cabs(driver);
		 cb.Time();
		 logger.info("Select the Time And Click on Apply");
	 }
	 
	 
	 @Test(priority=7)
	 public void Search(){
		 Cabs cb= new Cabs(driver);
		 cb.Search();
		 logger.info("Search Button	");
	 }
	 
	 
	 @Test(priority=8)
	 public void SUV() throws InterruptedException{
		 Cabs cb= new Cabs(driver);
		 cb.SUV();
		 logger.info("SUV Select");
	 }
	 
		
	 @Test(priority=9)
	public void printValue() throws IOException {
		 Cabs cb= new Cabs(driver);
	 pv = cb.Printvalue();
	 excel.ExcelPrint(pv);
	 System.out.println("lowest price for SUV :"+ pv);
	 logger.info("Print Lowest Price for SUV ");
	 }
	 
	
	 @Test(priority=10)
	 public void clickforgift() {
		 Cabs cb= new Cabs(driver);
		 cb.clickforgift();
		 logger.info("Click On GiftCard Option");
	 }
	 
	 @Test(priority=11)
	 public void ClickCard() {
		 Cabs cb= new Cabs(driver);
		 cb.ClickCard();
		 logger.info("Scroll successfully till Giftcard and click on Giftcard");
	 }
	 
	 
	 @Test(priority=12)
	 public void Emailbutton() throws InterruptedException	{ 
		 Cabs cb= new Cabs(driver);
		 cb.Emailbutton();
		 logger.info("Click On Email");
	 }
	 
	 
	 @Test(priority=13)
		public void Sendemail() {
		 Cabs cb= new Cabs(driver);
		 cb.Sendemail();
		 logger.info("Wrong Email Send");
	 }
	 
	 @Test(priority=14)
	 public void Buybutton() {
		 Cabs cb= new Cabs(driver);
		 cb.Buybutton();
		 logger.info("Click On Buy Button");
	 }
	 
	 
	 @Test(priority=15)
	 public void error1(){
		 Cabs cb= new Cabs(driver);
		 msg= cb.error();
		System.out.println(msg);
		logger.info("Get Error Message");
	 }
	
	
		
}
