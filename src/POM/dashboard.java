package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import generic.basepage;

public class dashboard extends basepage {
	
	public dashboard(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.pazo.ppz:id/tvsitename']")
	@CacheLookup
	WebElement clientnamelink;
	
	@FindBy(xpath = "//*[@id=\"siteDepartmentDiv\"]/div/div[3]/a")
	@CacheLookup
	WebElement sitedashboardlink;
	
	
	@FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[6]/a/span")
	@CacheLookup
	WebElement manageButton;
	
	@FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[6]/ul/li[3]/a/span")
	@CacheLookup
	WebElement manageDepartment;
	
	@FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[6]/ul/li[1]/a/span")
	@CacheLookup
	WebElement manageCheckList;
	
	@FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[5]/ul/li[5]/a/span")
	@CacheLookup
	WebElement manageIssues;
	
	@FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[6]/ul/li[7]/a")
	@CacheLookup
	WebElement manageSites;
	
	@FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[6]/ul/li[9]/a/span")
	@CacheLookup
	WebElement manageUsers;
	
	@FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[6]/ul/li[13]/a/span")
	@CacheLookup
	WebElement manageSiteGroups;
	
	@FindBy(xpath = "/html/body/div[2]/a[1]/div[2]")
	@CacheLookup
	WebElement dashboard;
	
	public void open_site_dashboard() throws InterruptedException
	{
		Thread.sleep(1000);
		//dashboard.click();
		Thread.sleep(1000);
		clientnamelink.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		sitedashboardlink.click();
	}
	
	public void open_manage_department()
	{
		manageButton.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		manageDepartment.click();
	}
	
	public void open_manage_checklist()
	{
		manageButton.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		manageCheckList.click();
	}
	
	public void open_manage_issues()
	{
		manageButton.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		manageIssues.click();
	}
	
	public void open_manage_sites()
	{
		manageButton.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		manageSites.click();
	}
	
	public void open_manage_users()
	{
		manageButton.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		manageUsers.click();
	}
	
	public void open_manage_sitegroups()
	{
		manageButton.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		manageSiteGroups.click();
	}
}
