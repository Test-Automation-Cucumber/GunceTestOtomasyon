package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utilities.PageBase;

public class AvanslarPage extends PageBase {

	// *********Constructor*********
	public AvanslarPage(WebDriver driver) {
		super(driver);
	}

	// *********Dynamic Variables*********


	// ****Web Elements****
	By btnEkleBy = By.cssSelector("a[class='btn-add']");
	By btnKaydetBy = By.cssSelector("button[type='submit']");
	By ImgLoadingBy = By.cssSelector("div.main-loader");
	By btnMasraflarBy = By.id("masraflar");
	By btnAvanslarBy = By.id("avanslar");
	By txtToplamTutarBy = By.id("ExpenseInsertModalTotalAmount");
	By txt18KdvliToplamBy = By.id("ExpenseInsertModalAmountWithVAT18");
	By txt8KdvliToplamBy = By.id("ExpenseInsertModalAmountWithVAT8");
	By txt1KdvliToplamBy = By.id("ExpenseInsertModalAmountWithVAT1");
	By txtKdvsizOranBy = By.id("ExpenseInsertModalAmountWithVAT0");
	By txtAciklamaBy = By.id("ExpenseInsertModalExplanation");
	By btnBelgesizBy = By.id("ExpenseInsertModalIsDocumentedBelgesiz");
	By txtNedenBelgesizBy = By.id("ExpenseInsertModalReasonForNoDocument");
	By btnAvansEkleBy = By.cssSelector("a.btn-add");
	By rdbDaimiIsAvansiBy = By.cssSelector("label[for='AdvanceInsertModal265Daimi İş Avansı']");
	By rdbOzelIsAvansiBy = By.cssSelector("label[for='AdvanceInsertModal266Özel İş Avansı']");
	By btnCalisanBy = By.cssSelector("span[aria-labelledby='select2-AdvanceInsertModalOrganizationEmployeeId-container']");
	By txtAciklama2By = By.id("AdvanceInsertModalExplanation");
	By txtAvansTarihiBy = By.id("AdvanceInsertModalTimeDate");
	By btnParaBirimiBy = By.cssSelector("span[aria-labelledby='select2-AdvanceInsertModalParameterCurrencyId-container']");
	By btnKaydet2By =  By.cssSelector("i.gi-save-action");
	By btnDosyaNo2By = By.cssSelector("span[aria-labelledby='select2-AdvanceInsertModalFileCaseId-container']");
	By btnOzelIsAvansiBy = By.id("idPrefix266Özel İş Avansı");


	By btnOlusturBy = By.cssSelector("a[class='btn-add']");
	By txtFillTextFieldBy = By.cssSelector("input.select2-search__field");
	By txtAvansTutariBy = By.id("AdvanceInsertModalAmount");
	By btnAyarlarPageBy = By.id("ayarlar");
	


	
	// *********Page Methods*********
public AvanslarPage daimiIsAvansiEkle(
		String Avanslar_calisan,
		String Avanslar_aciklama,
		String Avanslar_avans_tutari,
		String Avanslar_para_birimi,
		String Avanslar_dosya_no) {
		
		click(getChild(btnAvansEkleBy, "span", 0));
		click(rdbDaimiIsAvansiBy);
		click(btnCalisanBy);
    	writeText(txtFillTextFieldBy, Avanslar_calisan);
        sleep(1);
        writeText(txtFillTextFieldBy, Keys.ENTER.toString());
        writeText(txtAciklama2By, Avanslar_aciklama);
        writeText(txtAvansTarihiBy, "10.02.2019");
        writeText(txtAvansTutariBy, Avanslar_avans_tutari);
        click(btnParaBirimiBy);
        writeText(txtFillTextFieldBy, Avanslar_para_birimi);
        sleep(1);
        writeText(txtFillTextFieldBy, Keys.ENTER.toString());
        click(btnKaydet2By, 1);
    	waitSweetAlert();
        waitAllRequest();
    	System.out.println("Daimi avans ekleme basarili.");
		return this;
	}


public AvanslarPage ozelIsAvansiEkle(
		String Avanslar_calisan,
		String Avanslar_aciklama,
		String Avanslar_avans_tutari,
		String Avanslar_para_birimi,
		String Avanslar_dosya_no) {
	
	click(getChild(btnAvansEkleBy, "span", 0));
	click(rdbOzelIsAvansiBy);
	
	click(btnCalisanBy);
	writeText(txtFillTextFieldBy, Avanslar_calisan);
    sleep(1);
    writeText(txtFillTextFieldBy, Keys.ENTER.toString());
    
    writeText(txtAciklama2By, Avanslar_aciklama);
    writeText(txtAvansTarihiBy, "10.02.2019");
    
	click(btnDosyaNo2By);
	writeText(txtFillTextFieldBy, Avanslar_dosya_no);
    sleep(2);
    writeText(txtFillTextFieldBy, Keys.ENTER.toString());
    
    click(btnParaBirimiBy);
    writeText(txtFillTextFieldBy, Avanslar_para_birimi);
    sleep(1);
    writeText(txtFillTextFieldBy, Keys.ENTER.toString());
    
    writeText(txtAvansTutariBy, Avanslar_avans_tutari);
    sleep(1);
    click(btnKaydet2By, 1);
	waitSweetAlert();
	waitAllRequest();
	System.out.println("Özel iş avansı ekleme basarili.");
	return this;
}



public void goToAyarlarPage() {
	click(btnAyarlarPageBy);
}
	

}
