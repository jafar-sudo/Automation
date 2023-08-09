import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	protected WebDriver driver;
    
	
	private By txt_username = By.xpath("(//input[@placeholder='Username'])[1]");

	private By txt_password = By.xpath("(//input[@placeholder='Password'])[1]");
	
	private By Btn_Login = By.cssSelector("button[type='submit']");
	
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
		
	}
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
		
	}
	public void enterLoginButton() {
		driver.findElement(Btn_Login).click();
		
	}
	public loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	








}
