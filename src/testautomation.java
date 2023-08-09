import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;


public class testautomation {


	public static void main(String[] args) throws InterruptedException, FileNotFoundException, CsvValidationException {
		

		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "E:\\Personal Folder\\chromedriver_win32\\chromedriver.exe");

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the application login page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(9000);

		//LoginPage class 
		loginpage login= new loginpage(driver);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.enterLoginButton();
		Thread.sleep(2000);

		//DashboardtoPIMTab
		Dashboard pim = new Dashboard(driver);
		pim.hoverToPIM();

		//AddEmployees
		AddEmployees Add = new AddEmployees(driver);
		Add.hoverToAddEmp();
		Thread.sleep(3000);

		//Enter Employee Data
		// Replace with the path to your CSV file
		String csvFilePath = ("C:\\Users\\jafe\\eclipse-workspace\\New\\File\\Book1.csv");
		try {
			// Read data from the CSV file
			CSVReader reader = new CSVReader(new FileReader(csvFilePath));
			String[] nextLine;
			EmployeeAddPage employeeAddPage = new EmployeeAddPage(driver);

			while ((nextLine = reader.readNext()) != null) {
				
				for(int i=0;i<1;i++)
				{
					String name = nextLine[0];
					String Initial = nextLine[1];
					String EmpID = nextLine[2];
				
				// Extract employee details from CSV
					

				Employee employee = new Employee(name,Initial,EmpID);

				employeeAddPage.addEmployee(employee);

				Thread.sleep(8000);
			}
		}
		}
		catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

	}
} 



