package week2.day1;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnWebElementsInteractions {

	public static void main(String[] args) {
		//setting path of the driver
				System.setProperty ("webdriver.chrome.driver","./drivers/chromedriver.exe");
				
				//create object for ChromeDriver class -- To open the browser
				ChromeDriver driver = new ChromeDriver(); 
				
				//Load the URL
				driver.get ("http://leaftaps.com/opentaps/");
				
				//Maximize the browser
				driver.manage().window().maximize(); 
				
				//Enter username
				driver.findElementById("username").sendKeys("demosalesmanager");
				
				//Enter Password
				driver.findElementById("password").sendKeys("crmsfa");
				
				//Click on Login
				driver.findElementByClassName("decorativeSubmit").click();
				
				//Click on link
				driver.findElementByLinkText("CRM/SFA").click();
				driver.findElementByLinkText("Create Lead").click();
				
				//Enter details in Form and Submit
				driver.findElementById("createLeadForm_companyName").sendKeys("FAB");
				driver.findElementById("createLeadForm_firstName").sendKeys("Gayathri Devi");
				driver.findElementById("createLeadForm_lastName").sendKeys("Loganathan");
				//driver.findElementByClassName("smallSubmit").click();
				
				//Dropdown - Define the field Source which has the dropdown values
				WebElement source = driver.findElementById("createLeadForm_dataSourceId");
				//Dropdown - Define dropDown to take the options under Source field
				Select dropDown = new Select(source);
				//Dropdown - Select one of the option
				//Using Visible Text,Value or Index
				//dropDown.selectByVisibleText("Employee");
				//dropDown.selectByValue("LEAD_COLDCALL");
				//dropDown.selectByIndex(1);
				//Dropdown - Get the options and select 
				//List<WebElement> options = dropDown.getOptions();
				//int size = options.size();
				//dropDown.getOptions().get(size-2).click();
				//To get total number of options in dropdown and print
				//System.out.println(size-1);
				dropDown.selectByVisibleText("Employee");
				
				//Select Marketing Campaign
				WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
				Select marketingCampaign = new Select(marketing);
				marketingCampaign.selectByValue("9001");
				
				//Select Industry
				WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
				Select industryOption = new Select(Industry);
				List<WebElement> options1 = industryOption.getOptions();
				int size = options1.size();
				industryOption.getOptions().get(size-2).click();
				
				//Select Ownership
				WebElement Ownership = driver.findElementById("createLeadForm_ownershipEnumId");
				Select ownershipOption = new Select(Ownership);
				ownershipOption.selectByIndex(5);
				
				//Select Country
				WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
				Select countrySelect = new Select(Country);
				countrySelect.selectByVisibleText("India");
				
				//Click on Create Lead button
				driver.findElementByClassName("smallSubmit").click();
				
				//Get Title of the resulting page
				String title = driver.findElementById("sectionHeaderTitle_leads").getText();
				System.out.println(title);
	}

}
