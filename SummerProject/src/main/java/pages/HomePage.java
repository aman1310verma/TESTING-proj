package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By Logo = By.xpath("//*[@class=\"col-md-6 navbar-brand\"]//img");
	By AboutUs = By.xpath("//a[text()='About Us']");
	By PoliciesNCode = By.xpath("//a[text()='Policies and Code']");
	By Programs = By.xpath("//a[text()='Programs']");
	By Links = By.xpath("//a[text()='LINKS']");
	By JoinUs = By.xpath("//a[text()='Join Us']");
	By ContactUs = By.xpath("//a[text()='Contact Us']");
	By vision = By.xpath("//a[text()='Vision, Mission and Values']");
	By wrkshp = By.xpath("//li[@class='dropdown menu__item open']//a[@href='/programs/workshops/']");
	By whyUs = By.xpath("//a[text()='Why Join Us']");
	
	//Method to Verify if logo is present
	public void checkLogo() {
	if(driver.findElement(Logo).isDisplayed()) {
		System.out.println("The logo is present....");
	}
	else
		System.out.println("The logo is not present !!!!!");
	}
	
	//Method to go to About Us page
	public void goToAbtUs() {
		driver.findElement(AboutUs).click();
		driver.findElement(vision).click();
		
	}
	
	public void goToPrograms() {
		driver.findElement(Programs).click();
		driver.findElement(wrkshp).click();

		}
	
	public void goToJoinUs() {
		driver.findElement(JoinUs).click();
		driver.findElement(whyUs).click();
		}
	
	public void goToContactUs() {
		driver.findElement(ContactUs).click();
	}
}
