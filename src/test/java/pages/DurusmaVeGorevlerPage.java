

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.PageBase;

public class DurusmaVeGorevlerPage extends PageBase {

    //*********Constructor*********
    public DurusmaVeGorevlerPage(WebDriver driver) {
        super(driver);
    }
    
    //*********Dynamic Variables*********

    
	//*********Web Elements*********

    By btnDurusmaVeGorevlerBy = By.id("sidebarDurusma");
    By btnGorevlerBy = By.id("gorevler");
    By btnEkleBy = By.cssSelector("a.btn-add");
	By btnEkle2By = By.cssSelector("button[type='submit']");
    By ImgLoadingBy = By.cssSelector("div.main-loader");

 //	By btnBankaAdiBy = By.cssSelector("span[aria-labelledby='select2-ParentId-container']");
//	By txtBankaAdiMetniBy = By.cssSelector("input[class='select2-search__field']");

By btnDosyaNoBy = By.cssSelector("span[aria-labelledby='select2-FileCaseId-container']");
By txtDosyaNoMetniBy = By.cssSelector("input[class='select2-search__field']");

By btnGorevVerilenSorumlukisiBy = By.cssSelector("span[aria-labelledby='select2-AssignedEmployeeId-container']");
By txtGorevVerilenSorumlukisiMetniBy = By.cssSelector("input[class='select2-search__field']");

By btnKisaTanimBy = By.cssSelector("span[aria-labelledby='select2-PrmTaskTypeId-container']");
By txtKisaTanimBy = By.cssSelector("input[class='select2-search__field']");

By btnOnayVerecekKisiBy = By.cssSelector("span[aria-labelledby='select2-ApproverEmployeeId-container']");
By txtOnayVerecekKisiBy = By.cssSelector("input[class='select2-search__field']");

By txtBaslangicTarihiBy = By.id("StartDateTime");
By txtGorevinBitisTarihiBy = By.id("EndDateTime");

By txtBaslangicSaatiBy = By.id("StartHour");
By txtBaslangicDakikaBy = By.id("EndHour");
By txtGorevinBitisSaatiBy = By.id("StartMinute");
By txtGorevinBitisDakikaBy = By.id("EndMinute");


By btnEvraklarBy = By.id("evraklar");
By cmbAraniyorBy =  By.cssSelector("div[aria-live='Assertive']");
By btnEvrakYonetimiPageBy =  By.id("evrak_yonetimi");


//*********Page Methods*********
    
public DurusmaVeGorevlerPage goToGorevler() {
	click(btnDurusmaVeGorevlerBy);
	click(btnGorevlerBy);
	return this;
}
public DurusmaVeGorevlerPage GorevEkle(
		String Durusmagorevler_dosya_no,
		String Durusmagorevler_gorev_verilen_kisi,
		String Durusmagorevler_onay_verecek_kisi) {

		click(btnEkleBy);
    	click(btnDosyaNoBy, 0);
    	
        writeText(txtDosyaNoMetniBy, Durusmagorevler_dosya_no);
    	waitVolatileElement(cmbAraniyorBy, 10);
    	writeText(txtDosyaNoMetniBy, Keys.ENTER.toString());
    	
    	click(btnGorevVerilenSorumlukisiBy, 0);
    	writeText(txtGorevVerilenSorumlukisiMetniBy, 0, Durusmagorevler_gorev_verilen_kisi);
    	waitVolatileElement(cmbAraniyorBy, 10);
     	writeText(txtGorevVerilenSorumlukisiMetniBy, 0, Keys.ENTER.toString());
     	
     	click(btnKisaTanimBy, 0);
    	writeText(txtKisaTanimBy, 0,  "durusma");
    	waitVolatileElement(cmbAraniyorBy, 10);
     	writeText(txtKisaTanimBy, 0, Keys.ENTER.toString());

     	click(btnOnayVerecekKisiBy, 0);
    	writeText(txtOnayVerecekKisiBy, 0,  Durusmagorevler_onay_verecek_kisi);
    	waitVolatileElement(cmbAraniyorBy, 10);
     	writeText(txtOnayVerecekKisiBy, 0, Keys.ENTER.toString());
     	
     	//writeText(txtBaslangicTarihiBy, "20.10.2019");
     //	writeText(txtGorevinBitisTarihiBy, "30.10.2019");
     	writeText(txtBaslangicSaatiBy,"8");
     	writeText(txtGorevinBitisSaatiBy,"15");
     	writeText(txtBaslangicDakikaBy,"17");
     	writeText(txtGorevinBitisDakikaBy,"15");
     	goToTopOfPage();
     	click(btnEkle2By);
    	waitSweetAlert();
     	waitAllRequest();
     	
    	System.out.println("Görevi ekleme basarili.");
    	return this;
    	    	
    }

public DurusmaVeGorevlerPage ArastirmaGorevEkle(
		String Durusmagorevler_dosya_no,
		String Durusmagorevler_gorev_verilen_kisi,
		String Durusmagorevler_onay_verecek_kisi) {
    click(btnEkleBy);
   

	click(btnDosyaNoBy);
	sleep(1);
    writeText(txtDosyaNoMetniBy, Durusmagorevler_dosya_no);
	waitVolatileElement(cmbAraniyorBy, 10);
	writeText(txtDosyaNoMetniBy, Keys.ENTER.toString());
	
	click(btnGorevVerilenSorumlukisiBy, 0);
	writeText(txtGorevVerilenSorumlukisiMetniBy, 0, Durusmagorevler_gorev_verilen_kisi);
	waitVolatileElement(cmbAraniyorBy, 10);
 	writeText(txtGorevVerilenSorumlukisiMetniBy, 0, Keys.ENTER.toString());
 	
 	click(btnKisaTanimBy, 0);
	writeText(txtKisaTanimBy, 0,  "arastirma");
	waitVolatileElement(cmbAraniyorBy, 10);
 	writeText(txtKisaTanimBy, 0, Keys.ENTER.toString());

 	click(btnOnayVerecekKisiBy, 0);
	writeText(txtOnayVerecekKisiBy, 0, Durusmagorevler_onay_verecek_kisi);
	waitVolatileElement(cmbAraniyorBy, 10);
 	writeText(txtOnayVerecekKisiBy, 0, Keys.ENTER.toString());
 	
 	writeText(txtBaslangicTarihiBy, "20.10.2019");
 	writeText(txtGorevinBitisTarihiBy, "30.10.2019");
 	writeText(txtBaslangicSaatiBy,"8");
 	writeText(txtGorevinBitisSaatiBy,"15");
 	writeText(txtBaslangicDakikaBy,"17");
 	writeText(txtGorevinBitisDakikaBy,"15");
 	goToTopOfPage();
 	click(btnEkle2By);
	waitSweetAlert();
 	waitAllRequest();
 	
	System.out.println("Araştırma görevi ekleme basarili.");
 	
	return this;
	    	
}

public void goToEvrakYonetimiEvraklar() {
	click(getChild(btnEvrakYonetimiPageBy, "span", 0));
	click(btnEvraklarBy);
}

}
