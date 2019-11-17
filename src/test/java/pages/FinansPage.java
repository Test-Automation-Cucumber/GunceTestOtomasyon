
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.PageBase;

public class FinansPage extends PageBase {

	// *********Constructor*********
	public FinansPage(WebDriver driver) {
		super(driver);
	}

	// *********Dynamic Variables*********

	// *********Web Elements*********
	By btnFinansBy = By.id("finans");
	By btnAyarlarBy = By.id("ayarlar");
	By btnBankaHesaplariBy = By.id("sidebarBankaHesaplari");
	By btnHesapHareketleriBy = By.id("sidebarHesapHaraketleri");
	By btnBankaAdiBy = By.cssSelector("span[aria-labelledby='select2-PrmBankId-container']");
	By txtBankaAdiMetniBy = By.cssSelector("input[class='select2-search__field']");
	By btnHesapTipiBy = By.cssSelector("span[aria-labelledby='select2-prmAccountTypeId2-container']");
	By txtHesapTipiMetniBy = By.cssSelector("input[class='select2-search__field']");
	By btnParaBirimiBy = By.cssSelector("span[aria-labelledby='select2-prmCurrencyAccountId-container']");
	By txtParaBirimiMetniBy = By.cssSelector("input[class='select2-search__field']");
	By btnSubeAdiBy = By.cssSelector("span[aria-labelledby='select2-BankBranchName-container']");
	By txtSubeAdiMetniBy = By.cssSelector("input[class='select2-search__field']");
	By txtHesapAdiBy = By.id("AccountName");
	By btnHareketAltTipiBy = By.cssSelector("span[aria-labelledby='select2-BankAccountTransactionSubTypeName-container']");
	By txtHareketAltTipiMetniBy = By.cssSelector("input[class='select2-search__field']");
	By btnHareketTipiBy = By.cssSelector("span[aria-labelledby='select2-PrmBankAccountTransactionTypeId-container']");
	By txtHareketTipiMetniBy = By.cssSelector("input[class='select2-search__field']");
	By btnBankaHesabiBy = By.cssSelector("span[aria-labelledby='select2-FinanceBankAccountId-container']");
	By txtBankaHesabiMetni = By.cssSelector("input[class='select2-search__field']");
	By btnKaydetBy = By.id("saveBtn");
	By btnOlusturBy = By.cssSelector("a[class='btn-add'][href='/FinanceStatement/InsertStatement']");
	By ImgLoadingBy = By.cssSelector("div.main-loader");
	String rdbDosyaSatirBy = "BillableFileCaseList[0].BillStatement";
	By formUcretBildirimOlusturBy = By.id("InsertStatementPostForm");
	By popUpWarningBy = By.cssSelector("div.swal2-header");
	By btnWarningIptalFieldBy = By.cssSelector("div.swal2-actions");
	By btnDurusmaVeGorevlerBy = By.id("sidebarDurusma");
	By btnGorevlerBy = By.id("gorevler");
	By btnEkleTableBy = By.cssSelector("a.btn-add");
	By txtAmountBy = By.id("Amount");
	By cmbAraniyorBy =  By.cssSelector("div[aria-live='Assertive']");

	
	// *********Page Methods*********
	public FinansPage UcretBildirimiOlustur() {
		click(btnOlusturBy);
		clickElementJs("name", rdbDosyaSatirBy);
		click(getChild(formUcretBildirimOlusturBy,"button", 0));
		waitAllRequest();
		System.out.println("ücret bildirimi oluşturma basarili.");
		return this;
	}

	public FinansPage goToBankaHesaplari() {
		click(btnFinansBy);
		click(btnBankaHesaplariBy);
		return this;
	}

	public FinansPage goToFinansHesapHareketleri() {
		click(btnFinansBy);
		click(btnHesapHareketleriBy);
		return this;
	}
	
//	public FinansPage goToAyarlar() {
//		click(btnAyarlarBy);
//		//nomralde emin misiniz popup'ının çıkmaması gerekiyormuş ama çıkarsa diye bu kodu ekledim.
//		if(elementExists(popUpWarningBy, 3)) {
//			click(getChild(btnWarningIptalFieldBy, "button", 0));
//		}
//		return this;
//	}

	public FinansPage bankaHesabiEkle(
	String Finans_banka_adi,
	String Finans_sube_adi,
	String Finans_hesap_tipi,
	String Finans_para_birimi,
	String Finans_hesap_adi,
	String Finans_hareket_tipi,
	String Finans_hareket_alt_tipi,
	String Finans_tutar) {
		click(getChild(btnEkleTableBy, "span", 0));
		
		//BANKA ADi
		click(btnBankaAdiBy);
		writeText(txtBankaAdiMetniBy, Finans_banka_adi);
		waitVolatileElement(cmbAraniyorBy, 10);
		writeText(txtBankaAdiMetniBy, Keys.ENTER.toString());

		//sube ADi
		click(btnSubeAdiBy);
		writeText(txtSubeAdiMetniBy, Finans_sube_adi);
		waitVolatileElement(cmbAraniyorBy, 10);
		writeText(txtSubeAdiMetniBy, Keys.ENTER.toString());

		writeText(txtHesapAdiBy, Finans_hesap_adi);

		click(btnHesapTipiBy);
		writeText(txtHesapTipiMetniBy, Finans_hesap_tipi);
		waitVolatileElement(cmbAraniyorBy, 10);
		writeText(txtBankaAdiMetniBy, Keys.ENTER.toString());

		click(btnParaBirimiBy);
		writeText(txtParaBirimiMetniBy, Finans_para_birimi);
		waitVolatileElement(cmbAraniyorBy, 10);
		writeText(txtBankaAdiMetniBy, Keys.ENTER.toString());

		click(btnKaydetBy);
    	waitSweetAlert();
    	waitAllRequest();
    	System.out.println("banka hesabı ekleme basarili.");
		return this;

	}

	public FinansPage hesapHareketiEkle(
			String Finans_banka_adi,
			String Finans_sube_adi,
			String Finans_hesap_tipi,
			String Finans_para_birimi,
			String Finans_hesap_adi,
			String Finans_hareket_tipi,
			String Finans_hareket_alt_tipi,
			String Finans_tutar) {
		
		click(getChild(btnEkleTableBy, "span", 0));
		click(btnHareketTipiBy);
		sleep(1);
		writeText(txtHareketTipiMetniBy, Finans_hareket_tipi);
		waitVolatileElement(cmbAraniyorBy, 10);
		writeText(txtHareketTipiMetniBy, Keys.ENTER.toString());

		click(btnHareketAltTipiBy);
		sleep(1);
		writeText(txtHareketAltTipiMetniBy, Finans_hareket_alt_tipi);
		waitVolatileElement(cmbAraniyorBy, 10);
		writeText(txtHareketAltTipiMetniBy, Keys.ENTER.toString());

		click(btnBankaHesabiBy);
		sleep(1);
		writeText(txtBankaHesabiMetni, Finans_hesap_adi);
		waitVolatileElement(cmbAraniyorBy, 10);
		writeText(txtBankaHesabiMetni, Keys.ENTER.toString());
		writeText(txtAmountBy, Finans_tutar);
		goToTopOfPage();
		click(btnKaydetBy);
    	waitSweetAlert();
		waitAllRequest();
		System.out.println("Hesap hareketi ekleme basarili.");
		return this;
	}
	
	 public FinansPage goToFinansBankaHesaplari() {
	    	
	    	
	    	if(elementExists(popUpWarningBy, 3)) {
				click(getChild(btnWarningIptalFieldBy, "button", 0));
			}
	    	
	    	click(btnFinansBy);
	    	click(getChild(btnBankaHesaplariBy, "span", 0));
	    	return this;
	    }
	
	public FinansPage goToDurusmaVeGorevlerGorevler() {
		click(getChild(btnDurusmaVeGorevlerBy, "i", 0));
		click(btnGorevlerBy);
		return this;
	}
	
	

}
