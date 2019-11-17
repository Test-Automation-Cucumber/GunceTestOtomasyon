

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PageBase;

public class YetkiRolleriPage extends PageBase {

    //*********Constructor*********
    public YetkiRolleriPage(WebDriver driver) {
        super(driver);
    }
    
    
    //*********Dynamic Variables*********
   
    
	//*********Web Elements*********
    By txtRolAdiBy = By.id("Name");
    By txtRolAciklamasiBy = By.id("Description");
    By btnKaydetBy = By.id("saveBtn");
    By btnBuromuzBy = By.id("büromuz");
    By btnEkipArkadaslarimizBy = By.id("ekiparkadaslarımız");

    By chbCalisanListelemeBy = By.cssSelector("input[name='GlobalUserRoleCheckModel[1].Status'");
    By chbKontakListelemeBy = By.cssSelector("input[name='GlobalUserRoleCheckModel[5].Status'");
    By chbKarsiTarafListelemeBy = By.cssSelector("input[name='GlobalUserRoleCheckModel[6].Status'");
    By chbMuvekkilListelemeBy = By.cssSelector("input[name='GlobalUserRoleCheckModel[7].Status'");
    By chbBuroTeklifDavaDosyaListelemeBy = By.cssSelector("input[name='GlobalUserRoleCheckModel[48].Status'");
    By chbZamanListelemeBy = By.cssSelector("input[name='GlobalUserRoleCheckModel[31].Status'");
    By chbMasrafListelemeBy = By.cssSelector("input[name='GlobalUserRoleCheckModel[37].Status'");
    By chbAvansListelemeBy = By.cssSelector("input[name='GlobalUserRoleCheckModel[43].Status'");
    By chbEvrakListelemeBy = By.cssSelector("input[name='GlobalUserRoleCheckModel[21].Status'");
    By chbGorevListelemeBy = By.cssSelector("input[name='GlobalUserRoleCheckModel[26].Status'");
    By chbOnaySureciListelemeBy = By.cssSelector("input[name='GlobalUserRoleCheckModel[68].Status'");
    //By ImgKaydetBy = By.cssSelector("path[fill-rule='evenodd']");//kaydet yerine kapata bastı !
	By ImgKaydetBy = By.cssSelector("#saveBtn");
    By ImgLoadingBy = By.cssSelector("div.main-loader");
    
		
	//*********Page Methods*********
    
    //Yetki Ekle
    public YetkiRolleriPage clickRolEkle()  {
    	writeText(txtRolAdiBy, SetRandomString(4));
    	writeText(txtRolAciklamasiBy, SetRandomString(14));
    	checked(chbCalisanListelemeBy, 0);
    	checked(chbKontakListelemeBy, 0);
    	checked(chbKarsiTarafListelemeBy, 0);
    	checked(chbMuvekkilListelemeBy, 0);
    	checked(chbBuroTeklifDavaDosyaListelemeBy, 0);
    	checked(chbZamanListelemeBy, 0);
    	checked(chbMasrafListelemeBy, 0);
    	checked(chbAvansListelemeBy, 0);
    	checked(chbEvrakListelemeBy, 0);
    	checked(chbGorevListelemeBy, 0);
    	checked(chbOnaySureciListelemeBy, 0);
    	goToTopOfPage();
    	click(ImgKaydetBy, 0);
     	//waitLoadingImg(ImgLoadingBy);
    	return this;
    }
    
//    public YetkiRolleriPage clickBuromuz() {
//    	
//    	click(btnBuromuzBy);
//    	click(btnEkipArkadaslarimizBy);
//    	    	
//    	return this;
//    }
}
