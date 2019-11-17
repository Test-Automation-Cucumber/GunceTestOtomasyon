package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.PageBase;

public class MasraflarPage extends PageBase {

	// *********Constructor*********
	public MasraflarPage(WebDriver driver) {
		super(driver);
	}

	// *********Dynamic Variables*********

	// *********Web Elements*********

	By btnEkleBy = By.cssSelector("a.btn-add");
	By btnKaydetBy =  By.cssSelector("i.gi-save-action");
	By ImgLoadingBy = By.cssSelector("div.main-loader");
	By btnMasraflarBy = By.id("masraflar");
	By btnAvanslarBy = By.id("avanslar");
	By btnDosyaNoBy = By.cssSelector("span[aria-labelledby='select2-ExpenseInsertModalFileCaseId-container']");
	By txtFillTextFieldBy = By.cssSelector("input.select2-search__field");
	String txtToplamTutarBy = "input#ExpenseInsertModalTotalAmount";
	By txt18KdvliToplamBy = By.id("ExpenseInsertModalAmountWithVAT18");
	By txt8KdvliToplamBy = By.id("ExpenseInsertModalAmountWithVAT8");
	By txt1KdvliToplamBy = By.id("ExpenseInsertModalAmountWithVAT1");
	By txtKdvsizOranBy = By.id("ExpenseInsertModalAmountWithVAT0");
	By txtAciklamaBy = By.id("ExpenseInsertModalExplanation");
	By btnBelgesizBy = By.cssSelector("label[for='ExpenseInsertModalIsDocumentedBelgesiz']");
	By txtNedenBelgesizBy = By.id("ExpenseInsertModalReasonForNoDocument");
	By cmbAraniyorBy =  By.cssSelector("div[aria-live='Assertive']");

	public MasraflarPage masrafEkle(
			String Masraflar_masraf_yapan_kisi,
			String Masraflar_dosya_no,
			String Masraflar_aciklama,
			String Masraflar_neden_belgesiz,
			String Masraflar_para_birimi) {
		click(btnEkleBy);
		
		//dosya no
		click(btnDosyaNoBy);
		writeText(txtFillTextFieldBy, 0, Masraflar_dosya_no);
    	waitVolatileElement(cmbAraniyorBy, 10);
        writeText(txtFillTextFieldBy, 0, Keys.ENTER.toString());

        sleep(1);
        writeElementJs(txtToplamTutarBy, 0, "166,88");
		writeText(txt18KdvliToplamBy, "37,90");
		writeText(txt8KdvliToplamBy, "127,48");
		writeText(txt1KdvliToplamBy, "1,50");
		writeText(txtAciklamaBy, Masraflar_aciklama);
		click(btnBelgesizBy);
		click(txtNedenBelgesizBy, 0);
		writeText(txtNedenBelgesizBy, 0, Masraflar_neden_belgesiz);
		click(btnKaydetBy, 2);
    	waitSweetAlert();
		waitAllRequest();
		System.out.println("masraf ekleme basarili.");
		return this;
	}

	public MasraflarPage goToAvanslar() {
		click(btnAvanslarBy, 0);
		return this;
	}

}
