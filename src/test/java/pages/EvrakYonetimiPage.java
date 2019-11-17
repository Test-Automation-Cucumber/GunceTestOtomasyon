

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.PageBase;

public class EvrakYonetimiPage extends PageBase {

    //*********Constructor*********
    public EvrakYonetimiPage(WebDriver driver) {
        super(driver);
    }
    
    //*********Dynamic Variables*********

    
	//*********Web Elements*********

    By btnEvrakYonetimiBy = By.id("evrak_yonetimi");
    By btnEvraklarBy = By.id("evraklar");
    By btnEkleBy = By.cssSelector("a.btn-add");
	By btnEkle2By = By.cssSelector("button[type='submit']");
    By ImgLoadingBy = By.cssSelector("div.main-loader");
    By btnEvrakinNiteligiGidenBy = By.cssSelector("label[for='Giden']");
    By btnKontakTipiMuvekkilBy = By.cssSelector("label[for='Müvekkil']");
    By btnGonderenKurumKisiBy = By.cssSelector("span[aria-labelledby='select2-ContactId-container']");
    By txtUlastigiTarihBy = By.id("ReceiveDate");
    By txtPttMuhurDagitimBy = By.id("PostOfficeStampedDate");
    By btnEvrakTipiBy = By.cssSelector("input.select2-search__field");
    By txtEvrakTarihiBy = By.id("DocumentDate");
    By btnTeslimAlanBy = By.cssSelector("span[aria-labelledby='select2-PersonReceiverSenderEmployeeId-container']");
    By btnDosyaNoBy = By.cssSelector("span[aria-labelledby='select2-FileCaseId-container']");
    By txtInputTextBy = By.cssSelector("input[class='select2-search__field']");
    By btnTeslimAlanGonderenBy = By.cssSelector("span[aria-labelledby='select2-PersonReceiverSenderEmployeeId-container']");
	By cmbAraniyorBy =  By.cssSelector("div[aria-live='Assertive']");
    By btnKaydet = By.id("saveBtn");
    
	

//*********Page Methods*********
    
public EvrakYonetimiPage goToEvrakYonetimi() {
	click(btnEvrakYonetimiBy);
	click(btnEvraklarBy);
	return this;
}

public EvrakYonetimiPage EvrakEkle(
		String muvekkil,
		String Evraklar_teslim_alan_gonderen,
		String Evraklar_evrak_tipi,
		String Evraklar_dosya_no,
		String Evraklar_dosya_sorumlusu) {
	  	
	click(btnEkleBy);
	  
        click(btnEvrakinNiteligiGidenBy);
        click(btnKontakTipiMuvekkilBy);
        sleep(1);
        click(btnGonderenKurumKisiBy);
        sleep(1);
        writeText(txtInputTextBy, muvekkil);
    	waitVolatileElement(cmbAraniyorBy, 10);
    	writeText(txtInputTextBy, Keys.ENTER.toString());
    	writeText(txtUlastigiTarihBy, "10.8.2017");
    	writeText(txtPttMuhurDagitimBy, "11.8.2017");
    	click(btnEvrakTipiBy, 0);
    	  sleep(1);
    	writeText(txtInputTextBy, Evraklar_evrak_tipi);
    	waitVolatileElement(cmbAraniyorBy, 10);
    	writeText(txtInputTextBy, Keys.ENTER.toString());
    	writeText(txtEvrakTarihiBy,"8.8.2017");
    	click(btnTeslimAlanBy);
    	  sleep(1);
    //	writeText(txtInputTextBy, 1, );
    	waitVolatileElement(cmbAraniyorBy, 10);
    	writeText(txtInputTextBy, 1, Keys.ENTER.toString());
    	click(btnDosyaNoBy);
    	  sleep(1);
    	writeText(txtInputTextBy, 1, Evraklar_dosya_no);
    	waitVolatileElement(cmbAraniyorBy, 10);
    	writeText(txtInputTextBy, 1, Keys.ENTER.toString());
    	click(btnTeslimAlanGonderenBy);
    	  sleep(1);
    	writeText(txtInputTextBy, 1, Evraklar_teslim_alan_gonderen);
    	waitVolatileElement(cmbAraniyorBy, 10);
    	writeText(txtInputTextBy, 1, Keys.ENTER.toString());
    	goToTopOfPage();
    	sleep(1);
       	click(btnKaydet);
    	waitSweetAlert();
        waitAllRequest();
        
    	System.out.println("Evrak ekleme basarili.");
    	return this;
    	    	
    }



 

}
