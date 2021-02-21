package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AboutUs;
import pages.ContactUsPage;
import pages.HomePage;
import pages.JoinUs;
import pages.Programs;

public class SparkFoundationTest {
	
	WebDriver driver;
	HomePage home ;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	//Actions on home page
	@Test(priority=0)
	public void pageOne() {
		home = new HomePage(driver);
		home.checkLogo();
		home.goToAbtUs();	
	}
	
	@Test(priority=1)
	public void pageTwo() {
		AboutUs about = new AboutUs(driver);
		about.abtUs();
		about.guidingPrinciples();
	}
	@Test(priority=2)
	public void pageThree() {
		Programs prg = new Programs(driver);
		home.goToPrograms();
		prg.learnMore();
		prg.mentorshipProgram();
	}
	
	@Test(priority=3)
	public void pageFour() {
		JoinUs join = new JoinUs(driver);
		home.goToJoinUs();
		join.fillForm();
		
	}
	
	@Test(priority=4)
	public void pageFive() {
		ContactUsPage cntct = new ContactUsPage(driver);
		home.goToContactUs();
		cntct.getAddress();
		cntct.getContact();
		cntct.goToHomePage();
		System.out.println("The home page title is  - "+driver.getTitle());
	}
	
	@AfterClass
	public void burnDown() {
		driver.quit();
	}

}
