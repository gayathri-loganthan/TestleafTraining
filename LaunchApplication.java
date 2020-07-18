package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) 
	{
		//setting path of the driver
		System.setProperty ("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//create object for ChromeDriver class -- To open the browser
		ChromeDriver driver = new ChromeDriver(); 
		
		//Load the URL
		driver.get ("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser
		driver.manage().window().maximize(); 
		
		//close the browser
		//driver.close();
	}

}
