package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin {
	@FindBy(xpath="//input[@id='userid']")private WebElement userName;
	@FindBy (xpath="//input[@id='password']")private WebElement password;
	@FindBy (xpath="//button[@type='submit']")private WebElement login;
	@FindBy (xpath="//a[@class='text-light forgot-link']")private WebElement forpass;
	@FindBy (xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement create;
	@FindBy (xpath= "//input[@id='pin']")private WebElement pin;
	@FindBy (xpath="//button[@type='submit']") private WebElement cont;
	public KiteLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void getuserName(String user) 
	{
		userName.sendKeys(user);
		
	}
	public void getPassword(String pass) {
		password.sendKeys(pass);
	}
	public void getlogin() {
		login.click();
	}
	public void getforpass() {
		forpass.click();
	}
	public void getcreate() {
		create.click();
	}
	public void getpin(String p) {
		
	pin.sendKeys(p);
	}
	public void clickcont() {
		cont.click();
	}
	
	



}
