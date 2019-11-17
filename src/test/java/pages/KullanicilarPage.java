//
//
//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import utilities.PageBase;
//
//public class KullanicilarPage extends PageBase {
//
//    //*********Constructor*********
//    public KullanicilarPage(WebDriver driver) {
//        super(driver);
//    }
//    
//    
//    //*********Dynamic Variables*********
//  
//    
//    
//	//*********Web Elements*********
//    
// // UUID email = UUID.randomUUID();
//	
//    By btnEkleBy = By.cssSelector("a[href='/Licence/InsertUser']");
//    By btnCalisanBy = By.id("select2-OrganizationEmployeeId-container");
//    By txtSearchFieldBy = By.cssSelector("input[class='select2-search__field']");
//
//    By txtEmployeeEmailBy = By.id("Email");
//    By txtEmployeePasswordBy = By.id("Password");
//    By txtEmployeePhoneNumberBy = By.id("Phone");
//    By txtEmployeeRoleBy = By.id("Email");
//    By btnEmployeeAnasayfaGorunumuBy = By.id("select2-DashboardId-container");
//    By btnAktifBy =  By.id("IsActiveYes");
//    By btnKaydet4By = By.id("saveBtn");
//    By btnIliskilerimizBy = By.id("sidebarIliskilerimiz");
//    By btnKontaklarimizBy = By.id("kontaklarımız");
//    //By ImgKaydetBy = By.cssSelector("path[fill-rule='evenodd']");//kaydet yerine kapata bastı !
//	By ImgKaydetBy = By.cssSelector("#saveBtn");
//    By ImgLoadingBy = By.cssSelector("div.main-loader");
//    
//	//*********Page Methods*********
//    //Go to Ayarlar
//
//    
//    
//
//    public KullanicilarPage clickKullaniciEkle() {
//
//    	click(btnEkleBy);
//    	click(btnCalisanBy);
//    	writeText(txtSearchFieldBy, "Veli Yılmaz");
//        writeText(txtEmployeeRoleBy, Keys.ENTER.toString());
//        writeText(txtEmployeeEmailBy, SetRandomString(10) +"@gunpartners.com");
//        writeText(txtEmployeePasswordBy, "123456");
//        writeText(txtEmployeePhoneNumberBy, "5355658978");
//        writeText(txtEmployeeRoleBy, "admin");
//        writeText(txtEmployeeRoleBy, Keys.ENTER.toString());
//        writeText(btnEmployeeAnasayfaGorunumuBy, "standart");
//        writeText(btnEmployeeAnasayfaGorunumuBy, Keys.ENTER.toString());
//        click(btnAktifBy);
//    	goToTopOfPage();
//    	click(ImgKaydetBy, 0);
//     	waitLoadingImg(ImgLoadingBy);
//       
//   
//    	
//    	return this;
//    }
//    
//    public KullanicilarPage goToKontaklarimiz() {
//
//        click(btnIliskilerimizBy);
//        click(btnKontaklarimizBy);
//    	
//    	return this;
//    }
//    
//    
//}
