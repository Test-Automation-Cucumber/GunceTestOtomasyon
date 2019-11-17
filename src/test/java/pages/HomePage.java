package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PageBase;

public class HomePage extends PageBase {

	// *********Constructor*********
	public HomePage(WebDriver driver) {
		super(driver);
	}

	// *********Dynamic Variables*********

	
	
	// ****Web Elements****
	By btnIslerimizBy = By.id("islerimiz");
	By btnDosyalarBy = By.id("dosyalar");
	By btnZamanlarBy = By.id("zamanlar");
	By btnMasraflarBy = By.id("masraflar");
	By btnAvanslarBy = By.id("avanslar");
	By btnFinansBy = By.id("finans");
	By btnUcretBildirimleriBy = By.id("ücretbildirimleri"); 
	By btnAyarlarBy = By.id("ayarlar");
	By TreeSiteMenuBy = By.cssSelector("ul.site-menu");
	By btnParentOfTiklayinizBy = By.cssSelector("p[class='registerUser']");
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
 	By txtPasswordBy = By.id("password-field");
 	By txtPasswordReBy = By.id("password-fieldre");
 	By btnAktifEtBy = By.cssSelector("div.text-center");
 	By btnAtlaBy = By.cssSelector("a.introjs-skipbutton");

 	
 	
 	
 	
 	
	// *********Page Methods*********
	// Go to HomePage
	public HomePage goToUrl(String base_url) {
		goToWebPage(base_url);
		return this;
	}
	
	public HomePage goToEkipArkadaslarimiz() {
		click(getChild(TreeSiteMenuBy, "li", 1));
    	System.out.println("Login islemi basarili");
		click(getChild(getChild(getChild(TreeSiteMenuBy, "li", 1), "ul", 0), "li", 0));
		return this;
	}
	
	public HomePage goToDosyalar() {
	       click(btnIslerimizBy);
	        click(btnDosyalarBy);
	        return this;
	    }
	
	  public HomePage goToHesapOlustur() {
		  click(getChild(btnParentOfTiklayinizBy,"a",0));
		    	return this;
		    }
			
		public HomePage createAccount(String isim, String soyisim, String firma_adi) {
			writeText(txtNameBy, isim);
			writeText(txtSurnameBy, soyisim);
			writeText(txtPhoneBy, "05305300000");
			System.out.println(System.getProperty("ten_minute_email"));
			writeText(txtEmailBy, System.getProperty("ten_minute_email"));
			writeText(txtFirmaAdiBy, firma_adi);
			checked(chbSozlesmeBy, 0);
			click(btnHesapOlusturBy);
			waitAllRequest();
			sleep(20);
			return this;
		}
		
		public HomePage SetPassword(String password) {
			
			writeText(txtPasswordBy, password);
			writeText(txtPasswordReBy, password);
			click(getChild(btnAktifEtBy, "button", 0));
			click(btnAtlaBy);
			waitAllRequest();
			return this;
		}
	
	
}
