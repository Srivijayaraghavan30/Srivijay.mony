package matimony.matrimony.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchPOM extends BaseTest{
	
	public searchPOM(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='idEmail']")
    private WebElement MatriID;
	public WebElement getMatriID() {
		return MatriID;
	}
	
	@FindBy(id="passwordClear1")
	private WebElement PasswordClear;
	public WebElement getPasswordClear() {
		return PasswordClear;
	}
	
	
	@FindBy(id="password1")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}

	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement Login_btn;
	public WebElement getLogin_btn() {
		return Login_btn;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Skip to My Matrimony >>')]")
	private WebElement InterMediate_page;
	public WebElement getInterMediate_page() {
		return InterMediate_page;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Skip to Daily Matches >>')]")
	private WebElement InterMediate_page1;	
	public WebElement getInterMediate_page1() {
		return InterMediate_page1;
	}

	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a")
	private WebElement Menu_btn;
	public WebElement getMenu_btn() {
		return Menu_btn;
	}
	
	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img")
	private WebElement Menu_btn1;
	public WebElement getMenu_btn1() {
		return Menu_btn1;
	}
	
	@FindBy(xpath="//a[contains(text(),'Edit Profile')]")
	private WebElement Edit_Profile;
	public WebElement getEdit_Profile() {
		return Edit_Profile;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Edit Partner Preference')]")
	private WebElement Edit_Partner_Preference;
	public WebElement getEdit_Partner_Preference() {
		return Edit_Partner_Preference;
	}
	
	@FindBy(xpath="//a[@class='editIcon font12 clr6']")
	private WebElement PP_Edit_btn;	
	public WebElement getPP_Edit_btn() {
		return PP_Edit_btn;
	}
	
	@FindBy(id="ageFrom")
	private WebElement ageFrom;
	public WebElement getageFrom() {
		return ageFrom;
	}
	
	@FindBy(id="ageTo")
	private WebElement ageTo;
	public WebElement getageTo() {
		return ageTo;
	}
	
	
	@FindBy(id="maritalStatus1")
	private WebElement unmarried;
	public WebElement getunmarried() {
		return unmarried;
	}
	

	@FindBy(id="maritalStatus2")
	private WebElement widow;
	public WebElement getwidow() {
		return widow;
	}
	
	@FindBy(id="maritalStatus3")
	private WebElement divorced;
	public WebElement getdivorced() {
		return divorced;
	}
	
	@FindBy(id="maritalStatus0")
	private WebElement any;
	public WebElement getany() {
		return any;
	}
	
	@FindBy(id="maritalStatus4")
	private WebElement seprated;
	public WebElement getseprated() {
		return seprated;
	}
	
	@FindBy(id="photoOpt")
	private WebElement photoOpt;
	public WebElement getphotoOpt() {
		return photoOpt;
	}
	
	
	@FindBy(id="horoscopeOpt")
	private WebElement horoscopeOpt;
	public WebElement gethoroscopeOpt() {
		return horoscopeOpt;
	}
	
	@FindBy(id="alreadyContOpt")
	private WebElement alreadyContOpt;
	public WebElement getalreadyContOpt() {
		return alreadyContOpt;
	}
	
	@FindBy(id="alreadyViewedOpt")
	private WebElement alreadyViewedOpt;
	public WebElement getalreadyViewedOpt() {
		return alreadyViewedOpt;
	}
	
	@FindBy(id="shortlistOpt")
	private WebElement shortlistOpt;
	public WebElement getshortlistOpt() {
		return shortlistOpt;
	}
	
	@FindBy(id="ignoredOpt")
	private WebElement ignoredOpt;
	public WebElement getignoredOpt() {
		return ignoredOpt;
	}
	
	@FindBy(id="igOpt")
	private WebElement igOpt;
	public WebElement getigOpt() {
		return igOpt;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
