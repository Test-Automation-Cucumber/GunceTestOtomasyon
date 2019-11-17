

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.PageBase;

public class EkipArkadaslarimizPage extends PageBase {

    //*********Constructor*********
    public EkipArkadaslarimizPage(WebDriver driver) {
        super(driver);
    }
    
    //*********Dynamic Variables*********

    
	//*********Web Elements*********
	//By.xpath("//a[@title=\"Favorilerim / Listelerim\"]");
    //By.cssSelector("a[title=\"Favorilerim / Listelerim\"]");

	
	By btnEkleBy = By.cssSelector("a[href='/OrganizationEmployee/Insert']");
	By txtAdiBy = By.id("EmployeeInsertName");
	By txtSoyadiBy = By.id("EmployeeInsertSurname");
	By btnCalisanTipiIdariPersonelBy =  By.cssSelector("label[for='İdari Personel']");
	By btnKaydetBy = By.id("saveBtn");
	By btnIliskilerimizBy = By.id("sidebariliskilerimiz");
	By btnKontaklarimizBy = By.id("kontaklarimiz");
	By txtRumuzBy = By.id("NickName");
	By txtSearchListBy =  By.cssSelector("input.dx-texteditor-input");  //2. eleman muvekkil seçimi
	By txtFirstRowBy =  By.cssSelector("tr[aria-rowindex='1']");  //2. eleman muvekkil seçimi
	By btnBuromuzBy = By.id("buromuz");
	By btnEkipArkadaslarimizBy = By.id("ekip_arkadaslarimiz");
	By btnKayitliCalisanBy = By.cssSelector("td[aria-describedby='dx-col-1']");
	By btnYoneticiBy = By.cssSelector("[aria-labelledby='select2-OrganizationManagerEmployeeId-container']");
	By txtTextBoxBy = By.cssSelector("input[class='select2-search__field']");
	By btnCalismaGrubuBy = By.cssSelector("[aria-labelledby='select2-OrganizationWorkGroupId-container']");
	By btnAvukatBy = By.cssSelector("label[for='Avukat']");
    By txtBagliOlduguBaroBy = By.id("BaroTypeName");
    By txtBaroSicilNumarasiBy = By.id("BarMemberNumber");
    By btnParentCalismaAlaniBy = By.id("PrmParticleAreaListId");
    By btnYabanciDilBilgisiBy = By.cssSelector("label[for='Avukat']");
    By btnIletisimBilgileriBy = By.cssSelector("[aria-controls='tabsContactInfo']");
    By ImgLoadingBy = By.cssSelector("div.main-loader");
    By btnAdresEkleBy = By.cssSelector("a[href='#modal-adres-ekle']");
    By txtAdresAdiBy = By.id("AddressName");
    By txtAdresBy = By.id("AddressValue");
    By txtSearchBoxBy = By.cssSelector("input[class='select2-search__field']");
    By btnUlkeBy = By.cssSelector("span[aria-labelledby='select2-GlobalMapCountryIdInsert-container']");
    By btnSehirBy = By.cssSelector("span[aria-labelledby='select2-GlobalMapCityIdInsert-container']");
    By btnIlceBy = By.cssSelector("span[aria-labelledby='select2-GlobalMapCountyIdInsert-container']");
    By chbVarsayilanFaturaAdresiBy = By.cssSelector("label[for='AddressIsDefaultInsert']");
    By btnEkle1By =  By.cssSelector("button.btn-blue");
    By btnEkle2By =  By.cssSelector("div[class='col-12']");
    By btnKaydetByParent = By.cssSelector("div.actionButtons");
    By btnEPostaEkleBy =  By.cssSelector("a[href='#modal-email-ekle']");
    By txtCommunicationNameBy = By.id("CommunicationName");
    By txtCommunicationValueBy = By.id("CommunicationValue");
    By chbVarsayilanEPostaBy = By.id("EmailIsDefaultUpdate");     
    By btnTelefonEkleBy =  By.cssSelector("a[href='#modal-telefon-ekle']");     
    By chbVarsayilanTelefonBy = By.id("PhoneIsDefaultInsertUpdate");   
    By btnAcilDurumKisiEkleBy =  By.cssSelector("a[href='#modal-acildurum-ekle']");    
    By txtAcilKisiAdiSoyadiBy = By.id("EmergencyReachPerson");
    By txtAcilKisiTelefonBy = By.id("EmergencyReachPhone");
    By txtAcilKisiYakinlikDerecesiBy = By.id("EmergencyReachRelation");
    By btnInsanKaynaklariBy = By.cssSelector("[aria-controls='tabsIKInfo']");
    By txtUyrukBy = By.id("NationalityCountry");
    By txtTcKimlikNoBy = By.id("IdentityNumber");	
    By txtDogumYeriBy = By.id("BirthPlace");
    By txtDogumTarihiBy = By.id("BirthDate");
    By btnSurucuBelgesiBy =  By.cssSelector("span[aria-labelledby='select2-PrmDrivingLicenceId-container']");
	By btnCinsiyetErkekBy = By.cssSelector("label[for='Erkek']");
    By btnCalismaSekliBuroDisiBy = By.cssSelector("label[for='Working41']"); 
    By btnAskerlikBy = By.cssSelector("span[aria-labelledby='select2-PrmMilitaryStatusTypeId-cl-container']");
    By btnEgitimBilgileriBy = By.cssSelector("[aria-controls='tabsEducationInfo']");
    By btnEgitimBilgisiEkleBy = By.cssSelector("a[href='#modal-okul-ekle']");
	By btnEgitimTuruBy = By.cssSelector("[aria-labelledby='select2-PrmEducationTypeId-cl-container']");
 	By txtOkulAdiBy = By.id("SchoolName");
	By txtFacultyBy = By.id("Faculty");
	By txtBolumBy = By.id("Department");
	By txtBaslangicTarihiBy = By.id("StartDate");
	By txtMezuniyetTarihiBy = By.id("EndDate");
    By btnCalismaAlaniBy = By.id(""); // OLMADI!!!!
    By btnEvraklarBy = By.cssSelector("[aria-controls='tabsDocuments']");
    By btnEvrakEkleBy = By.cssSelector("a[href='#modal-evrak-ekle']");
    By btnFinansBy = By.cssSelector("[aria-controls='tabsFinance']");	    
    By btnEvrakTipiBy = By.cssSelector("[aria-labelledby='select2-DocumentInsertModalParameterDocumentTypeId-container']");
	By txtEvrakTarihiBy = By.id("DocumentDate");
	By btnBankaHesabiEkleBy = By.cssSelector("a[href='#modal-hesap-ekle']");
	By btnParaBirimiBy = By.cssSelector("[aria-labelledby='select2-ParameterCurrencyId-container']");
	By btnBankaAdiBy = By.cssSelector("[aria-labelledby='select2-PrmBankId-container']");
	By txtIbanBy = By.id("IBAN");
	By txtHesaptakiIsimBy = By.id("AccountName");
	By btnCalismaDurumuBy = By.cssSelector("[aria-controls='tabsWorkingInfo']");
	By btnUnvanEkleBy = By.cssSelector("a[data-target='#modal-title-ekle']");
	By btnUnvanBy = By.cssSelector("[aria-labelledby='select2-InsertPrmTitleTypeInsert-container']");
	By btnKidemBy = By.cssSelector("[aria-labelledby='select2-PrmTitleGradeTypeInsert-container']");
	By txtBitisTarihiBy = By.id("EndDate");	
	By btnDosyaEkleBy = By.id("DocumentFileList");
	By btnSisKullancisiHayirBy = By.cssSelector("label[for='IsSystemUserNo']");
	
	//*********Page Methods*********
    public EkipArkadaslarimizPage ekipArkadasiEkle(String Ekiparkadasimiz_adi, String Ekiparkadasimiz_soyadi, String Ekiparkadasimiz_calisan_tipi) {
    	
    	click(btnEkleBy);
    	writeText(txtAdiBy, Ekiparkadasimiz_adi);
    	writeText(txtSoyadiBy, Ekiparkadasimiz_soyadi);
    	goToEndOfPage();
    	
    	if (Ekiparkadasimiz_calisan_tipi.equals("Idari Personel")) {
    		click(btnCalisanTipiIdariPersonelBy, 0);
		}
    	else
    	{
    		//Avukat seçeneği gelebilir mesela...
    	}
    	
    	sleep(2);
    	
    	//aşağıdaki durum çok istisna. okumak istediğimiz değer HTML olarak sayfada yer almıyor. bu yüzden javascript ile okuyorum.
    	for (int i = 0; i < 30; i++) {
			if (executeJS("return document.getElementById(\"NickName\").value").length() > 0) {
				break;
			}
			else
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
    	
    	goToEndOfPage();
    	click(btnSisKullancisiHayirBy);
    	goToTopOfPage();
    	click(btnKaydetBy);
    	waitSweetAlert();
    	waitAllRequest();
    	System.out.println("ekip arkadasi ekleme basarili.");
    	return this;
    }
    
    public EkipArkadaslarimizPage goToKontaklarimiz() {
    	click(btnIliskilerimizBy);
    	click(btnKontaklarimizBy);
    	return this;
    }
    
 
/////////////////////////////////////////////////////////////////////////

public EkipArkadaslarimizPage goToEkipArkadaslarimiz() {		
	click(btnBuromuzBy);
	click(btnEkipArkadaslarimizBy);
	return this;
}

   public EkipArkadaslarimizPage ekipArkadasiDuzenle(String calisan_adi_soyadi){
		click(txtSearchListBy, 0);
		writeText(txtSearchListBy, 0, calisan_adi_soyadi);
	    writeText(txtSearchListBy, Keys.ENTER.toString());   
	    waitLoadingTableImg();
	    click(getChild(txtFirstRowBy, "td", 0));

	    click(btnYoneticiBy, 0);    	
	    writeText(txtTextBoxBy, calisan_adi_soyadi);
	    sleep(1);
		writeText(txtTextBoxBy, Keys.ENTER.toString());
		click(btnCalismaGrubuBy, 0);    	
	    writeText(txtTextBoxBy, "muhasebe");
	    sleep(1);
		writeText(txtTextBoxBy, Keys.ENTER.toString());
		click(btnAvukatBy);
		writeText(txtTextBoxBy, 0, "Bilişim");
		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
		writeText(txtTextBoxBy, 1, "İngilizce");
		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
		sleep(1);
		writeElementJs("input#BaroTypeName", 0, "istanbul");
		sleep(1);
		writeElementJs("input#BarMemberNumber", 0, "15");
		click(btnKaydetBy);
	    return this;
	    }
   
   public EkipArkadaslarimizPage gotoIletisimTab() {	   
	   goToTopOfPage();
	  waitAllRequest();
	  sleep(1);
	   click(btnIletisimBilgileriBy);
	   return this;
   }

   public EkipArkadaslarimizPage adresEkle(String ulke, String sehir, String ilce) {
		
		click(btnAdresEkleBy);
		 writeText(txtAdresAdiBy, 0, SetRandomString(10));
		    sleep(1);
		    writeText(txtAdresBy, 0, SetRandomString(25));
		    click(btnUlkeBy, 0);
		    writeText(txtSearchBoxBy, 2, ulke);
			writeText(txtSearchBoxBy, 2, Keys.ENTER.toString());
			sleep(2);
		    click(btnSehirBy, 0);
		    writeText(txtSearchBoxBy, 2, sehir);
			writeText(txtSearchBoxBy, 2, Keys.ENTER.toString());
			sleep(2);
		    click(btnIlceBy, 0);
		    writeText(txtSearchBoxBy, 2, ilce);
			writeText(txtSearchBoxBy, 2, Keys.ENTER.toString());
			sleep(2);
			checked(chbVarsayilanFaturaAdresiBy, 0);
		    click(btnEkle1By, 0);
		    goToTopOfPage();
		    sleep(1);
		    

		     return this;
	}
	
	public EkipArkadaslarimizPage ePostaEkle(String kullanici_eposta) {
		
		click(btnEPostaEkleBy);
		writeText(txtCommunicationNameBy, "email");
		writeText(txtCommunicationValueBy, kullanici_eposta);
		checked(chbVarsayilanEPostaBy, 0);
	    click(btnEkle1By,2);
	    goToTopOfPage();
	    sleep(1);

		return this;
	}
	public EkipArkadaslarimizPage telefonEkle() {
		
		click(btnTelefonEkleBy);
		click(txtCommunicationNameBy, 2);
		writeText(txtCommunicationNameBy, 2, "İş Telefonu");
		click(txtCommunicationValueBy, 2);
		writeText(txtCommunicationValueBy, 2,  "5305125566");
		checked(chbVarsayilanTelefonBy, 0);
	    click(btnEkle1By, 4);
	    goToTopOfPage();
	    sleep(1);
		return this;
	}
	public EkipArkadaslarimizPage acilDurumKisiEkle() {
		
		click(btnAcilDurumKisiEkleBy);
		writeText(txtAcilKisiAdiSoyadiBy,"Metin Emre Şen");
		writeText(txtAcilKisiTelefonBy, "5305541236");
		writeText(txtAcilKisiYakinlikDerecesiBy, "kardeşi");
		click(btnEkle1By, 6);
	    goToTopOfPage();
	    sleep(1);
	    
		return this;
	}
	
	public EkipArkadaslarimizPage goToInsanKaynaklariTab() {
		goToTopOfPage();
click(btnInsanKaynaklariBy);
		
		return this;
	}

	public EkipArkadaslarimizPage iKBilgileriEkle() {
		
		writeText(txtUyrukBy,"Türk");
		writeText(txtTcKimlikNoBy, "13244455510");
		writeText(txtDogumYeriBy, "Bakırköy");
		writeText(txtDogumTarihiBy, "01.10.1990");
		click(btnSurucuBelgesiBy);
		writeText(txtSearchBoxBy, 2, "b");
		sleep(1);
		writeText(txtSearchBoxBy, 2, Keys.ENTER.toString());
		click(btnCalismaSekliBuroDisiBy);		
		click(btnCinsiyetErkekBy);
		
		executeJS("$(\"select[name='PrmMilitaryStatusTypeId']\").select2('open');");
		writeText(txtSearchBoxBy,2, "yapmış");
		writeText(txtSearchBoxBy,2, Keys.ENTER.toString());
		goToTopOfPage();
	  	click(getChild(btnKaydetByParent, "button", 0));
		     return this;
	}
	
	public EkipArkadaslarimizPage goToEgitimTab() {
		   goToTopOfPage();
			  waitAllRequest();
			  sleep(1);
	click(btnEgitimBilgileriBy);
	
		return this;
	}
	public EkipArkadaslarimizPage egitimBilgisiEkle() {		
		
		click(btnEgitimBilgisiEkleBy);
		executeJS("$(\"select[name='PrmEducationTypeId']\").select2('open');");
		writeText(txtTextBoxBy,2, "Lisans");
		sleep(1);
		writeText(txtOkulAdiBy, "Bahçeşehir Üniversitesi");
    	writeText(txtTextBoxBy,2, Keys.ENTER.toString());
    	writeText(txtFacultyBy, "Mühendislik");
    	writeText(txtBolumBy, "Bilgisayar Mühendisliği");    	
		writeText(txtBaslangicTarihiBy, "10.9.2008");
		writeText(txtMezuniyetTarihiBy,"15.6.2012");
		click(btnEkle1By, 8);
	    goToTopOfPage();
	    sleep(1);
				
		return this;
	}
	
	public EkipArkadaslarimizPage goToEvraklarTab() {
		
		click(btnEvraklarBy);
		
		return this;
	}

	
	public EkipArkadaslarimizPage evrakEkle() {		
		
		click(btnEvrakEkleBy);
		click(btnEvrakTipiBy);
		writeText(txtTextBoxBy,2, "cv");	
		sleep(1);
    	writeText(txtTextBoxBy,2, Keys.ENTER.toString());
		writeText(txtEvrakTarihiBy, "10.9.2019");
    	writeText(txtEvrakTarihiBy, Keys.ENTER.toString());
		click(btnDosyaEkleBy,1);
		click(btnEkle1By, 12);
	    goToTopOfPage();
	    sleep(1);
				
		return this;
	}
	
	public EkipArkadaslarimizPage goToFinansTab() {
		
		click(btnFinansBy);
		return this;
	}
	public EkipArkadaslarimizPage finansBilgisiEkle() {
		click(btnBankaHesabiEkleBy);
		click(btnParaBirimiBy);
		writeText(txtTextBoxBy,2, "Türk Lirası");
		sleep(1);
    	writeText(txtTextBoxBy,2, Keys.ENTER.toString());
    	click(btnBankaAdiBy);
		writeText(txtTextBoxBy,2, "Ziraat Bankası");
		sleep(1);
    	writeText(txtTextBoxBy,2, Keys.ENTER.toString());
    	writeText(txtIbanBy, "TR320010009999901234567890");
    	writeText(txtHesaptakiIsimBy,"ali yılmaz");
    	
		click(btnEkle1By, 10);
	    goToTopOfPage();
	    sleep(1);
				
		return this;
	}
	
	public EkipArkadaslarimizPage goToCalismaDurumuTab() {
	click(btnCalismaDurumuBy);
		return this;
	}

	public EkipArkadaslarimizPage unvanEkle() {		
		
		click(btnUnvanEkleBy);
		click(btnUnvanBy);
		writeText(txtTextBoxBy,2, "asistan");
		sleep(1);
    	writeText(txtTextBoxBy,2, Keys.ENTER.toString());
    	click(btnKidemBy);
    	writeText(txtTextBoxBy,2, "arastirmaci");
		sleep(1);
    	writeText(txtTextBoxBy,2, Keys.ENTER.toString());
    	click(txtBaslangicTarihiBy,2);
    	writeText(txtBaslangicTarihiBy,2, "10.10.2018");
    	writeText(txtBaslangicTarihiBy,2, Keys.ENTER.toString());
    	click(txtBitisTarihiBy,2);
		writeText(txtBitisTarihiBy,2, "13.10.2019");
		writeText(txtBitisTarihiBy,2, Keys.ENTER.toString());
		click(btnEkle1By, 14);
					
		return this;
	}
	
	


}	


