import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Employee {
	 
	private String name;
	    private String names;
	    private String EmpIDs;
		private WebDriver driver;
	    

	    public Employee(String firstname, String lastname, String EmpID) {
	        this.name = firstname;
	        this.names = lastname;
	        this.EmpIDs = EmpID;
	    }
	    public String getName1() {
	        return name;
	    }

	    public String getName2() {
	        return names;
	    }

	    public String getEmpID1() {
	        return EmpIDs;
	    }
	    public Employee(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
	

}
