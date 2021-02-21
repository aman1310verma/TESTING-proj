package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class JoinUs {

WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public JoinUs(WebDriver driver) {
		this.driver=driver;
	}
	
	By formName = By.xpath("//input[@name='Name']");
	By formMail = By.xpath("//input[@name='Email']");
	By formRole = By.xpath("//select[@class='form-control']");
	By sbmt = By.xpath("//input[@type='submit']");
	
	//Filling join us form
	public void fillForm() {
		driver.findElement(formName).sendKeys("Srishti");
		driver.findElement(formMail).sendKeys("absowjoil@yopmail.com");
		Select se = new Select(driver.findElement(formRole));
		se.selectByVisibleText("Intern");
		driver.findElement(sbmt).click();
	}
}
