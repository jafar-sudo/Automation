import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

	public class EmployeeAddPage {
	    private WebDriver driver;

	    // Locators
	    private By firstnameInputLocator = By.xpath("(//input[@placeholder='First Name'])[1]");
	    private By lastNameInputLocator = By.xpath("(//input[@placeholder='Last Name'])[1]");
	    private By EmpIDInputLocator = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	    private By SaveButtonLocator = By.xpath("(//button[normalize-space()='Save'])[1]");

	    public EmployeeAddPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
	    
	    
	    public void addEmployee(Employee employee) {
	        // Find and interact with the elements on the website to add an employee
	        WebElement firstnameInput = driver.findElement(firstnameInputLocator);
	        WebElement lastnameInput = driver.findElement(lastNameInputLocator);
	        WebElement EmpIDInput = driver.findElement(EmpIDInputLocator);
	        WebElement SaveButton = driver.findElement(SaveButtonLocator);

	        // Input employee details
	        firstnameInput.sendKeys(employee.getName1());
	        lastnameInput.sendKeys(employee.getName2());
	        EmpIDInput.sendKeys(employee.getEmpID1());

	        // Click the Add button
	        SaveButton.click();
	    }
	    
		
	}


