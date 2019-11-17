package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.PageBase;

public class ZamanlarPage extends PageBase {

    //*********Constructor*********
    public ZamanlarPage(WebDriver driver) {
        super(driver);
    }
    
    //*********Dynamic Variables*********

    
	//*********Web Elements*********
	
    By btnMasraflarBy = By.id("masraflar");
    By btnEkleBy = By.cssSelector("a.btn-add ");
	By ImgLoadingBy = By.cssSelector("div.main-loader");
    By btnIlgiliCalisanBy = By.cssSelector("span[aria-labelledby='select2-TimeInsertModalOrganizationEmployeeId-container']");
    By btnDosyaNoBy = By.cssSelector("span[aria-labelledby='select2-TimeInsertModalModalId-container']");
    By btnAktiviteTuruBy = By.cssSelector("span[aria-labelledby='select2-TimeInsertModalPrmOfficeActivityTypeId-container']");
    By txtHarcananSureSaatBy = By.id("TimeInsertModalTSHour");
	By txtHarcananSureDakikaBy = By.id("TimeInsertModalTSMinute");
	By txtFaturalanacakSureSaatBy = By.id("TimeInsertModalTCHour");
	By txtFaturalanacakSureDakikaBy =By.id("TimeInsertModalTCMinute");
	By txtAciklamaBy = By.id("TimeInsertModalExplanation");
	By btnFaturalanacakmiEvetBy = By.id("TimeInsertModalIsToBeInvoicedEvet");
	By txtFillTextFieldBy = By.cssSelector("input.select2-search__field");
	By cmbAraniyorBy =  By.cssSelector("div[aria-live='Assertive']");
	By btnKaydetBy =  By.cssSelector("i.gi-save-action");
	
	
	
    public ZamanlarPage yeniZamanEkle(
    		String Zamanlar_ilgili_calisan,
    		String Zamanlar_dosya_no,
    		String Zamanlar_aktivite_turu,
    		String Zamanlar_aciklama) {

    	waitAllRequest();
    	sleep(1);
    	click(btnEkleBy);  
    	
    	//ilgili çalışan
    	click(btnIlgiliCalisanBy, 0);
    	sleep(1);
    	writeText(txtFillTextFieldBy, 0, Zamanlar_ilgili_calisan);
        writeText(txtFillTextFieldBy, 0, Keys.ENTER.toString());

        //firma adi
    	click(btnDosyaNoBy, 0);
    	sleep(1);  
    	writeText(txtFillTextFieldBy, 0, Zamanlar_dosya_no);  //bunu konuş
    	waitVolatileElement(cmbAraniyorBy, 10);
        writeText(txtFillTextFieldBy, 0, Keys.ENTER.toString());

        //aktivite turu
    	click(btnAktiviteTuruBy, 0);
    	sleep(1);
    	writeText(txtFillTextFieldBy, 0, Zamanlar_aktivite_turu);
        writeText(txtFillTextFieldBy, 0, Keys.ENTER.toString());
        
    	writeText(txtHarcananSureSaatBy,"1");
    	writeText(txtHarcananSureDakikaBy, "15");
    	writeText(txtFaturalanacakSureSaatBy,"1");
    	writeText(txtFaturalanacakSureDakikaBy, "15");
    	writeText(txtAciklamaBy, Zamanlar_aciklama);
    	click(btnKaydetBy, 3);
    	waitSweetAlert();
    	waitAllRequest();
    	sleep(2);
    	System.out.println("yeni zaman ekleme basarili.");
    return this;
   
}
    public ZamanlarPage goToMasraflar() {
    	click(btnMasraflarBy);
    	return this;
    }
}
