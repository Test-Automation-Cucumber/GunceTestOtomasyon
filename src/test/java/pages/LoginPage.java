

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PageBase;

public class LoginPage extends PageBase {

    //*********Constructor*********
    public LoginPage(WebDriver driver) {
        super(driver);
    }
        
    
	//*********Web Elements*********
    
	By txtEmailBy = By.id("Email");
    By txtPasswordBy = By.id("password-field");
	By btnContinueBy = By.cssSelector("#form0 > div.row.no-gutters > div > button");
	

	//*********Page Methods*********
    //Go to LoginPage
	public LoginPage goToUrl(String url) throws Exception {
		goToWebPage(url);
		return this;
	}

	//DKullanici_Adi=yenicehazer@yahoo.com -DParola=Test123test
    public LoginPage Login(String user, String pass)  {
    	writeText(txtEmailBy, user);
    	writeText(txtPasswordBy, pass);
    	click(btnContinueBy);
    	waitAllRequest();
    	return this;
    }
}

