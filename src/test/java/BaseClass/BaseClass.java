package BaseClass;

import java.io.FileReader;

import java.io.IOException;

import java.time.Duration;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
 


public class BaseClass {

	 public static WebDriver driver;

	 static public Properties p;

	 public Logger logger=LogManager.getLogger(this.getClass());

	@BeforeClass

	public void setup() throws IOException {
		

		//loading log4j file


		//loading properties file

		 FileReader file=new FileReader("C:\\Users\\2304157\\eclipse-workspace\\HACKATHON_PROJECT\\src\\test\\resources\\cofig.properties");

		 p=new Properties();

		 p.load(file);

		String Browser="chrome";


		switch(Browser.toLowerCase()) {

		case "chrome":driver=new ChromeDriver();

		break;

		case "edge":driver=new EdgeDriver();

		break;

		default: System.out.println("No Matching Browser....");

		 return;

		} 

		/*    java.util.Scanner sc = new Scanner(System.in);

			System.out.println(" Enter the driver name");

			String input = sc.nextLine();

			if(input.equalsIgnoreCase("chrome")) {

				driver = new ChromeDriver();

			}

			else {

				driver = new EdgeDriver();

			}  */

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(p.getProperty("appURL"));

	}

	@AfterClass

	public void teardown() {

		driver.quit();
}

}