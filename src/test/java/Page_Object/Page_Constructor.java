package Page_Object;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Page_Constructor {
WebDriver driver;
Page_Constructor(WebDriver driver){
this.driver=driver;
PageFactory.initElements(driver, this);
}
}


