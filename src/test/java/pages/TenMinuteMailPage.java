

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PageBase;

public class TenMinuteMailPage extends PageBase {

    //*********Constructor*********
    public TenMinuteMailPage(WebDriver driver) {
        super(driver);
    }
        
   
 	
 	//*********10minutemail.com elements*************

 	By txt10EmailBy = By.id("mailAddress");
	By btnParentOfLink = By.cssSelector("td[class='cta-block__button']");
	By txtNameBy = By.id("Name");
	By txtSurnameBy = By.id("Surname");
	By txtPhoneBy = By.id("Phone");
    By txtEmailBy = By.id("Email");
	By chbSozlesmeBy = By.cssSelector("input[name='IsServiceAgreement']");
	By txtFirmaAdiBy = By.id("CompanyName");
 	By btnHesapOlusturBy = By.cssSelector("button[type='submit']");
	By btnEmailBy = By.cssSelector("span[class='inc-mail-address']");
	By btnMailDropdownBy = By.id("ui-id-1");

	
	//*********Page Methods*********
    //Go to LoginPage
	public TenMinuteMailPage goToUrl(String url) {
		navigateToURL(url);
		return this;
	}
	
	public TenMinuteMailPage CreateTempMail() {
		goToEndOfPage();
		String mail = getAttiribute(txt10EmailBy);
		System.setProperty("ten_minute_email",mail);
		return this;
	}
	
	public TenMinuteMailPage activateMail() {
		goToEndOfPage();
		click(btnMailDropdownBy);
		sleep(1);
		goToEndOfPage();
		sleep(1);
		click(getChild(btnParentOfLink, "a", 0));
		switchToNewTab(true);
		return this;
	}
	
	
	
	
	

    }
    
    


