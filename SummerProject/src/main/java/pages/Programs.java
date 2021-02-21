package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Programs {

WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Programs(WebDriver driver) {
		this.driver=driver;
	}
	
	By lrnBtn = By.xpath("//a[@href='/programs/workshops/glimpses-for-kids-workshop/'][@class='button-w3layouts hvr-rectangle-out']");
	By glimpsesPoster = By.xpath("//img[@src='/images/glimpses-poster.png']");
	By mentorshipBtn = By.xpath("//li[@class='button-w3layouts hvr-rectangle-out tsf-button']//a[text()='Student Mentorship Program']");
	By para = By.xpath("//div[@class='col-md-12 test-grid1']//p[@class='para-w3-agile']");
	
	public void learnMore() {
		
		driver.findElement(lrnBtn).click();
		//Storing window handles in an array list
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    //Switching to the new tab
		driver.switchTo().window(tabs.get(1));
	    //Checking if the expected image is present
		boolean pstr = driver.findElement(glimpsesPoster).isDisplayed();
	    if(pstr=true) {
	    	System.out.println("The poster is present and we are on Glimpses for kidz page.....");
	    }
	    else {
	    	System.out.println("Looks like its not the page we were looking for!!!");
	    }
	    //Closing the tab
	    driver.close();
	    //Switching to the parent window
	    driver.switchTo().window(tabs.get(0));
	}
	public void mentorshipProgram() {
		driver.findElement(mentorshipBtn).click();
		System.out.println("The quote on the page is - "+driver.findElement(para).getText());
		}
	}

	
