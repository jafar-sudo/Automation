import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Dashboard {
	public WebDriver driver;

	@FindBy(xpath ="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM'])[1]")
	private WebElement pim;
	
	
	
	public Dashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 public void hoverToPIM() throws InterruptedException {
	        Actions actions = new Actions(driver);
	        actions.moveToElement(pim).click().perform();
	        Thread.sleep(5000);
	    }
    	 
     }
	









