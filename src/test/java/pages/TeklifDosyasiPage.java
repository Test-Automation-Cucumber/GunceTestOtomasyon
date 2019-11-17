

package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.PageBase;

public class TeklifDosyasiPage extends PageBase {

    //*********Constructor*********
    public TeklifDosyasiPage(WebDriver driver) {
        super(driver);
    }
    
    //*********Dynamic Variables*********

    
	//*********Web Elements*********

//müvekkil adı = ABC
    By btnEkleBy = By.cssSelector("a[class='btn-add ']");
    By btnTeklifByParent = By.cssSelector("div[x-placement='bottom-start']");
	By btnBuroBy = By.cssSelector("a[href='/FileCase/InsertFile']");
    By btnIslerimizBy = By.id("islerimiz");
    By btnDosyalarBy = By.id("dosyalar");    
    By btnZamanlarBy = By.id("zamanlar");
	By txtDosyaKonusuBy = By.id("FileSubject");
	By btnMuvekkilBy = By.cssSelector("span[aria-labelledby='select2-FileCaseContactClientId-container']");
	By btnDosyaSorumlusuBy = By.cssSelector("span[aria-labelledby='select2-OrganizationEmployeeCaseResponsibleId-container']");
	By txtDosyaKonuAciklamasiBy = By.id("SubjectMatterDescription");
	By btnKaydetByParent = By.cssSelector("div.actionButtons");
    By ImgLoadingBy = By.cssSelector("div.main-loader");
    By btnDavaDosyasinaDonusturBy = By.cssSelector("a[href='#modal-dosya-donustur']");
    By btnFaturaBilgileriBy = By.cssSelector("a[aria-controls='tabInvoice']");
    By btnFaturaKiminAdinaBy = By.id("select2-PrmStatementBillingNameId-container");
    By btnFaturaKimeGonderilecekBy = By.id("select2-PrmStatementSentToTypeId-container");
	By btnUcretBildirimiFormatiBy = By.id("select2-ParameterStatementTemplateId-container");
	By txtDosyaAcilisTarihiBy = By.id("FileOpenDate");
	By chbTeklifZamanlariBy = By.cssSelector("input[name='IsTimeEntityBill']");
	By formPopupBy = By.id("form4");
	By btnFaturaEdilecekmiBy = By.cssSelector("label[for='IsBillableYes']");
	By btnUcretVeTarifeBilgileriBy = By.cssSelector("a[aria-controls='tabTariff']");
	By btnParaBirimiBy = By.cssSelector("span[aria-labelledby='select2-ParameterCurrencyId-container']");
	By txtTarifeAciklamasiBy = By.id("TariffDescription");
	By txtFiksUcretTutariBy = By.id("LumpsumAmount");
	By cmbAraniyorBy =  By.cssSelector("div[aria-live='Assertive']");
	By txtSearchListBy =  By.cssSelector("input.dx-texteditor-input");  //2. eleman muvekkil seçimi
	By txtFirstRowBy =  By.cssSelector("tr[aria-rowindex='1']");  //2. eleman muvekkil seçimi
	By popupKaydetBy = By.id("proposalfilecasesave");
	By txtFaturaKiminAdinaBy = By.cssSelector("span[aria-labelledby='select2-PrmStatementBillingNameId-container']");
	By txtFaturaKimeBy = By.cssSelector("span[aria-labelledby='select2-PrmStatementSentToTypeId-container']");
	By txtUcretBildirimBy = By.cssSelector("span[aria-labelledby='select2-ParameterStatementTemplateId-container']");
	By txtFaturaGonderilecekAdresBy = By.cssSelector("span[aria-labelledby='select2-ContactAddressStatementSentToLocationId-container']");
	By txtFillTextFieldBy = By.cssSelector("input.select2-search__field");
	By btnTarifeTipiBy = By.cssSelector("span[aria-labelledby='select2-PrmContactTariffTypeId-container']");
	By ImgKaydetBy = By.cssSelector("#saveBtn");
	By ImgKaydet2By = By.cssSelector("button.saveBtn");

	//*********Page Methods*********
	
	
    public TeklifDosyasiPage dosyaEkle(String Teklifdosyasi_muvekkil,
    		String Teklifdosyasi_konusu,
    		String Teklifdosyasi_sorumlusu,
    		String Teklifdosyasi_konu_aciklamasi) {
    	
    	click(btnEkleBy, 0);
    	sleep(1);
    	click(getChild(btnTeklifByParent, "a", 1));
       	
    	click(btnMuvekkilBy);
    	sleep(1);
    	writeText(txtFillTextFieldBy, 0, Teklifdosyasi_muvekkil);
    	waitVolatileElement(cmbAraniyorBy, 10);
        writeText(txtFillTextFieldBy, 0, Keys.ENTER.toString());
       
        writeText(txtDosyaKonusuBy, Teklifdosyasi_konusu);
        goToTopOfPage();
    	clickToAction(btnDosyaSorumlusuBy, 0);
    	writeText(txtFillTextFieldBy, 1, Teklifdosyasi_sorumlusu);
    	waitVolatileElement(cmbAraniyorBy, 10);
        writeText(txtFillTextFieldBy, 1, Keys.ENTER.toString());

    	
    	writeText(txtDosyaKonuAciklamasiBy, Teklifdosyasi_konu_aciklamasi);
    	goToTopOfPage();
        click(getChild(btnKaydetByParent, "button", 0));
    	waitSweetAlert();
        waitAllRequest();
        
    	System.out.println("teklif dosyasi ekleme basarili.");
    	return this;
    }

    public TeklifDosyasiPage teklifDosyasiDuzenle(
    		String Teklifdosyasi_konusu,
    		String Davadosyasi_fatura_kimin_adina,
    		String Davadosyasi_fatura_kime_gonderilecek,
    		String Davadosyasi_ucret_bildirim_formati,
    		String Davadosyasi_faturanin_gonderilecegi_adres,
    		String Davadosyasi_tarife_tipleri,
    		String Davadosyasi_para_birimi,
    		String Davadosyasi_tarife_aciklamasi)
    {   	
    	click(txtSearchListBy, 2);
    	writeText(txtSearchListBy, 2, Teklifdosyasi_konusu);
        writeText(txtSearchListBy, Keys.ENTER.toString());   
        waitLoadingTableImg();
        String dosya_no = readText(getChild(txtFirstRowBy, "td", 0));
		System.setProperty("dosya_no", dosya_no);
        click(getChild(txtFirstRowBy, "td", 0));
    	click(btnDavaDosyasinaDonusturBy);
    	
    	//Davadosyasi_dosya_acilis_tarihi
    	DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    	Date date = new Date();
    	writeText(txtDosyaAcilisTarihiBy, dateFormat.format(date));
    	
    	
        writeText(txtDosyaAcilisTarihiBy, Keys.ENTER.toString());        
    	checked(chbTeklifZamanlariBy, 0);
    	click(popupKaydetBy);
    	click(btnFaturaEdilecekmiBy);
    	goToTopOfPage();
    	click(btnFaturaBilgileriBy);
    	click(txtFaturaKiminAdinaBy);
    	sleep(1);
    	writeText(txtFillTextFieldBy, 1, Davadosyasi_fatura_kimin_adina);
        writeText(txtFillTextFieldBy, 1, Keys.ENTER.toString());
    	            
        //q2
    	click(txtFaturaKimeBy);
    	sleep(1);
    	writeText(txtFillTextFieldBy, 1, Davadosyasi_fatura_kime_gonderilecek);
        writeText(txtFillTextFieldBy, 1, Keys.ENTER.toString());
    	
        //q3
    	click(txtUcretBildirimBy);
    	sleep(1);
    	writeText(txtFillTextFieldBy, 1, Davadosyasi_ucret_bildirim_formati);
        writeText(txtFillTextFieldBy, 1, Keys.ENTER.toString());
    	
        //q4
    	click(txtFaturaGonderilecekAdresBy);
    	sleep(1);
    	writeText(txtFillTextFieldBy, 1, Davadosyasi_faturanin_gonderilecegi_adres);
    	waitVolatileElement(cmbAraniyorBy, 10);
       	sleep(2);
        writeText(txtFillTextFieldBy, 1, Keys.ENTER.toString());
    	
    	click(btnUcretVeTarifeBilgileriBy);
    	
    	//tarife tipe
    	click(btnTarifeTipiBy, 0);
    	sleep(1);
    	writeText(txtFillTextFieldBy, 1, Davadosyasi_tarife_tipleri);
        writeText(txtFillTextFieldBy, 1, Keys.ENTER.toString());
        
        //para birimi
    	click(btnParaBirimiBy, 0);
    	sleep(1);
    	writeText(txtFillTextFieldBy, 1, Davadosyasi_para_birimi);
        writeText(txtFillTextFieldBy, 1, Keys.ENTER.toString());
    	writeText(txtTarifeAciklamasiBy, Davadosyasi_tarife_aciklamasi);
    	
    	writeText(txtFiksUcretTutariBy, "8000");
    	goToTopOfPage();
    	 sleep(1);
    	    click(ImgKaydetBy);
        	waitSweetAlert();
    		waitAllRequest();
    		System.out.println("teklif dosyasi duzenleme ekleme basarili.");
    		return this;
    }
    
    public TeklifDosyasiPage buroDosyasiEkle(
    		String Burodosyasi_fiks_ucret_tutari,
    		String Burodosyasi_konusu,
    		String Burodosyasi_sorumlusu,
    		String Burodosyasi_konu_aciklamasi) {
        click(btnIslerimizBy);
        click(btnDosyalarBy); 
    	click(btnEkleBy, 0);
    	sleep(1);
    	click(getChild(btnTeklifByParent, "a", 2));
        
        writeText(txtDosyaKonusuBy, Burodosyasi_konusu);
    	click(btnDosyaSorumlusuBy, 0);
    	sleep(1);
    	writeText(txtFillTextFieldBy, 0, Burodosyasi_sorumlusu);
        writeText(txtFillTextFieldBy, 0, Keys.ENTER.toString());
        writeText(txtDosyaKonuAciklamasiBy, Burodosyasi_konu_aciklamasi);
        removeElementJs("class","closePagePermission");
        click(ImgKaydet2By, 0);
        waitAllRequest();
        
    	System.out.println("büro dosyası ekleme basarili.");
    	return this;
    }
    public TeklifDosyasiPage goToZamanlar() {
    	
    	click(btnZamanlarBy);
    	return this;
    }
}
