package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public ContactUsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By add = By.xpath("//div[@class='col-xs-10 agile_contact_grid_right agilew3_contact']//p");
	By contact = By.xpath("//div[@class='col-xs-10 agile_contact_grid_right agileits_w3layouts_right']//p[2]");
	By homeLogo = By.xpath("//a[@class='col-md-6 navbar-brand']");
		
	
	public void getAddress() {
		System.out.println("The address of the organisation is - " +driver.findElement(add).getText());
	}
	
	public void getContact() {
		System.out.println("The contact information of the organisation is - "+driver.findElement(contact).getText());
	}
	
	public void goToHomePage() {
		driver.findElement(homeLogo).click();
		
	}
}
