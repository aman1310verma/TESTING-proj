package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUs {
	
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public AboutUs(WebDriver driver) {
		this.driver=driver;
	}
	
	By titleOne = By.xpath("//*[@id=\"home\"]/div/div[2]/h2");
	By guidPrinciples = By.xpath("//li[@class='button-w3layouts hvr-rectangle-out tsf-button']//a[@href='/about/guiding-principles/']");
	By heading = By.xpath("//h3[@class='tittle-agileits-w3layouts']");
	
	public void abtUs() {
		String expectedHeading = "Vision, Mission and Values";
		String actualHeading = driver.findElement(titleOne).getText();
		if(actualHeading.equalsIgnoreCase(expectedHeading))
			System.out.println("The page title is - " +actualHeading + ". We landed on the right page!");
		else
			System.out.println("The page title is - " +actualHeading+ ". Its an incorrect page!!!");
	}


	public void guidingPrinciples() {
		driver.findElement(guidPrinciples).click();
		System.out.println("The current page url is - " +driver.getCurrentUrl());
		System.out.println("The heading on page is - "+driver.findElement(heading).getText());
	}
}
