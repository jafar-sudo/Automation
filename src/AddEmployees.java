import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployees {
	public WebDriver driver;
	
		@FindBy(xpath = "(//a[normalize-space()='Add Employee'])[1]")
		WebElement Add;
		
		public AddEmployees(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void hoverToAddEmp() throws InterruptedException {
	        Actions actions = new Actions(driver);
	        actions.moveToElement(Add).click().perform();
	        Thread.sleep(3000);
	    }
    	 
		
		
		
	}


