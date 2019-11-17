

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.PageBase;

public class AyarlarPage extends PageBase {

    //*********Constructor*********
    public AyarlarPage(WebDriver driver) {
        super(driver);
    }
    
    //*********Dynamic Variables*********

    
	//*********Web Elements*********
	By btnKullaniciAyarlariBy = By.cssSelector("a[aria-controls='exampleTabsLineLeftTwo']");
	By btnYetkiTanimlariBy = By.cssSelector("a[href='/GlobalUserPermission/GlobalUserRoleList']");
	By btnEkleBy = By.cssSelector("a[href='/GlobalUserPermission/InsertGlobalUserRole']");
	By btnKullanicilarBy = By.cssSelector("a[href='/Licence']");
	By btnFaturalandirmaAyarlariBy = By.cssSelector("a[aria-controls='exampleTabsLineLeftSix']");

	By btnSaatlikUcretlerTableBy =  By.id("exampleTabsLineLeftOne"); 	
	By btnSaatUcretiEkleBy = By.cssSelector("a[data-toggle='add']"); 	
	By btnCalisanBy = By.cssSelector("span[aria-labelledby='select2-Rates_0__OrganizationEmployeeId-container']");
	By txtSearchBoxBy = By.cssSelector("input[class='select2-search__field']");
	By txtSaatUcretiBy = By.id("Rates_0__Rate");
	By btnParaBirimi2By = By.cssSelector("span[aria-labelledby='select2-Rates_0__PrmRateCurrencyId-container']");
	By btnKaydetBy = By.id("saveBtn");
	By btnFinansBy = By.id("finans");
	By btnUcretBildirimleriBy = By.id("ucret_bildirimleri");
	By cmbAraniyorBy =  By.cssSelector("div[aria-live='Assertive']");
	By btnSilBy =  By.cssSelector("a[data-toggle='remove']");
	By btnBankaHesaplariBy =  By.id("sidebarBankaHesaplari");
	
	
	//*********Page Methods*********
    public AyarlarPage clickKullaniciAyarlari() {
    	click(btnKullaniciAyarlariBy);
    	click(btnYetkiTanimlariBy);
    	click(btnEkleBy);
    	return this;
    }
    
    public AyarlarPage clickYetkiTanimla() {
    	click(btnYetkiTanimlariBy);
    	click(btnEkleBy);
    	return this;
    }
    
    public AyarlarPage clickKullanicilar() {
    	click(btnKullaniciAyarlariBy);
    	click(btnKullanicilarBy);
    	return this;
    }
    
    public AyarlarPage saatlikCalismaUcretiEkle(String calisan, String para_birimi) {
    	
    click(getChild(getChild(btnSaatlikUcretlerTableBy, "ul", 0), "li", 3));
    
    if(elementExists(btnSilBy, 2))
    	click(btnSilBy, 0);
    
    click(btnSaatUcretiEkleBy);
    
	click(btnCalisanBy);
	writeText(txtSearchBoxBy, calisan);
	waitVolatileElement(cmbAraniyorBy, 10);
    writeText(txtSearchBoxBy, Keys.ENTER.toString());
    writeText(txtSaatUcretiBy, "10");
    
    
    click(btnParaBirimi2By);
    writeText(txtSearchBoxBy, para_birimi);
	waitVolatileElement(cmbAraniyorBy, 10);
    writeText(txtSearchBoxBy, Keys.ENTER.toString());
    click(btnKaydetBy);
	waitSweetAlert();
	waitAllRequest();
	
	System.out.println("saatlik çalışma ücreti ekleme basarili.");
    return this;	
    }
    
    
    public AyarlarPage goToFinansUcretBildirimleri() {
    	click(btnFinansBy);
    	click(btnUcretBildirimleriBy);
    	return this;
    }
    
   
    
    public AyarlarPage clickFaturalandirmaAyarlari() {
    	click(btnFaturalandirmaAyarlariBy);
    	click(btnKullanicilarBy);
    	return this;
    }
}
