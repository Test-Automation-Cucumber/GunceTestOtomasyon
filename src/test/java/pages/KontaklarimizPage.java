

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.PageBase;

public class KontaklarimizPage extends PageBase {

    //*********Constructor*********
    public KontaklarimizPage(WebDriver driver) {
        super(driver);
    }
    
    //*********Dynamic Variables*********

    
//*********Web Elements*********


   By btnEkleBy = By.cssSelector("a[class='btn-add']");
   By btnKurumByParent = By.cssSelector("div[x-placement='bottom-start']");
   By txtFirmaAdiBy = By.id("Name");
   By txtKontakTipiBy = By.cssSelector("input.select2-search__field");
   By btnKontakTipiMuvekkilBy = By.id("select2-PrmContactTypeListId-result-dzoq-1"); //belki sıkıntı verebilir.
   By btnAdresBy = By.cssSelector("a[href='#tabsContactInfo']");
   By btnAdresEkleBy = By.cssSelector("a[href='#modal-adres-ekle']");
   By txtAdresAdiBy = By.cssSelector("input[id='AddressName']");
   By txtAdresBy = By.id("AddressValue");
   By btnUlkeBy = By.cssSelector("span[aria-labelledby='select2-GlobalMapCountryIdInsert-container']");
   By btnSehirBy = By.cssSelector("span[aria-labelledby='select2-GlobalMapCityIdInsert-container']");
   By btnIlceBy = By.cssSelector("span[aria-labelledby='select2-GlobalMapCountyIdInsert-container']");
   By chbVarsayilanFaturaAdresiBy = By.id("AddressIsBillingDefaultInsert");
   By btnEkle2By = 	 By.cssSelector("button.btn-blue");
   By btnKaydetByParent = By.cssSelector("div.actionButtons");
   By ImgLoadingBy = By.cssSelector("div.main-loader");
   By btnIslerimizBy = By.id("islerimiz");
   By btnDosyalarBy = By.id("dosyalar");    
   By ImgKaydetBy = By.cssSelector("#saveBtn");

    
//*********Page Methods*********

   public KontaklarimizPage kontakEkle(
		   String Kontaklarimiz_firma_adi,
		   String Kontaklarimiz_kontak_tipi, 
		   String Kontaklarimiz_adres_adi,
		   String Kontaklarimiz_adres, 
		   String Kontaklarimiz_ulke, 
		   String Kontaklarimiz_sehir, 		
		   String Kontaklarimiz_ilce) {
    	
   	click(btnEkleBy);
   	
	click(getChild(btnKurumByParent, "a", 0));
	
   	writeText(txtFirmaAdiBy, Kontaklarimiz_firma_adi);
   	
   	click(txtKontakTipiBy, 0);
    writeText(txtKontakTipiBy, 0, Kontaklarimiz_kontak_tipi);
	writeText(txtKontakTipiBy, 0, Keys.ENTER.toString());

    click(btnAdresBy);
    click(btnAdresEkleBy);
    sleep(3);
    writeText(txtAdresAdiBy, 0, Kontaklarimiz_adres_adi);
    sleep(3);
    
    
    writeText(txtAdresBy, 0, Kontaklarimiz_adres);
   
    //ulke
    click(btnUlkeBy, 0);
    writeText(txtKontakTipiBy, 4, Kontaklarimiz_ulke);
	writeText(txtKontakTipiBy, 4, Keys.ENTER.toString());
	waitAllRequest();
	
    //sehir
    click(btnSehirBy, 0);
    writeText(txtKontakTipiBy, 4, Kontaklarimiz_sehir);
	writeText(txtKontakTipiBy, 4, Keys.ENTER.toString());
	waitAllRequest();
	
    //ilce
    click(btnIlceBy, 0);
    writeText(txtKontakTipiBy, 4, Kontaklarimiz_ilce);
	writeText(txtKontakTipiBy, 4, Keys.ENTER.toString());
	waitAllRequest();

    checked(chbVarsayilanFaturaAdresiBy, 0);
    
    click(btnEkle2By, 0);
    waitAllRequest();
    goToTopOfPage();
    sleep(1);
    removeElementJs("class","closePagePermission");
    click(ImgKaydetBy);
	waitSweetAlert();
	waitAllRequest();
	
	System.out.println("kontak ekleme basarili.");
     return this;
}      
   
public KontaklarimizPage goToDosyalar() {
       click(btnIslerimizBy);
        click(btnDosyalarBy);
        return this;
    }
}

