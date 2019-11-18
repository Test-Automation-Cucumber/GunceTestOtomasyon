package tests.RegressionTestSuite;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.testng.annotations.Test;
import pages.*;
import utilities.TestBase;
import dbmodel.*;;

public class TC_Regression_001_Phase_1 extends TestBase {

	
	Provider provider;
	TenMinuteMailPage tenMinuteMailPage;
	HomePage homePage;
	LoginPage loginPage;
	EkipArkadaslarimizPage ekipArkadaslarimizPage;
	KontaklarimizPage kontaklarimizPage;
	TeklifDosyasiPage teklifDosyasiPage;
	ZamanlarPage zamanlarPage;
	MasraflarPage masraflarPage;
	AvanslarPage avanslarPage;
	FinansPage finansPage;
	AyarlarPage ayarlarPage;
	DurusmaVeGorevlerPage durusmaVeGorevlerPage;
	EvrakYonetimiPage evrakYonetimiPage;



	@Test // (priority = 0)
	public void TC_Regression_001_Phase_1() throws Exception {
		// ***************************************PAGE INSTANTIATIONS***************************************
		provider = new Provider();
		tenMinuteMailPage = new TenMinuteMailPage(driver);
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		ekipArkadaslarimizPage = new EkipArkadaslarimizPage(driver);
		kontaklarimizPage = new KontaklarimizPage(driver);
		teklifDosyasiPage = new TeklifDosyasiPage(driver);
		zamanlarPage = new ZamanlarPage(driver);
		masraflarPage = new MasraflarPage(driver);
		avanslarPage = new AvanslarPage(driver);
		finansPage = new FinansPage(driver);
		ayarlarPage = new AyarlarPage(driver);
		durusmaVeGorevlerPage =new DurusmaVeGorevlerPage(driver);
		evrakYonetimiPage = new EvrakYonetimiPage(driver);

		// ******************************************PARAMETERS**************************************
		String tenMinutesMail = configurationGet.gettenMinutesMail();
		String baseURL = System.getProperty("site_url");
		String env = System.getProperty("env");

 
		
//		String[][] dtNames = provider.GetDataTable("exec GetNameAndSurname", env, "db");
//		String isim = dtNames[1][0];
//		String soyisim = dtNames[1][1];	
		
		//DB'den veri çekilirken tırnak içindeki 'TC_Regression_001_Phase_1' bu değer aslında database'deki tablo ile aynı isimde olmalıdır.
	//	String[][] dtParameters = provider.GetDataTable("exec GetParameters 'TC_Regression_001_Phase_1', '" + env + "'", env, "db");
		
	//	String id =  dtParameters[1][0];
	//	String environment = dtParameters[1][1];
	//	String used = dtParameters[1][2];
		
		//isim ve soy isim değerleri DB üzerindeki "Names" isimli tablodan geliyor..
//		String Ekiparkadasimiz_adi = isim ;// dtParameters[1][3];
//		String Ekiparkadasimiz_soyadi = soyisim; // dtParameters[1][4];
//		String Ekiparkadasimiz_calisan_tipi	= dtParameters[1][5];
//		String Kontaklarimiz_kontak_tipi = dtParameters[1][6];
//		String Kontaklarimiz_firma_adi = provider.checkDBCell("Firma_adi_", dtParameters[1][7]);
//		String Kontaklarimiz_adres_adi = provider.checkDBCell("Adres_adi_", dtParameters[1][8]);
//		String Kontaklarimiz_adres = provider.checkDBCell("Adres_", dtParameters[1][9]);
//		String Kontaklarimiz_ulke = dtParameters[1][10];
//		String Kontaklarimiz_sehir = dtParameters[1][11];
//		String Kontaklarimiz_ilce = dtParameters[1][12];
//		String Teklifdosyasi_muvekkil = Kontaklarimiz_firma_adi;
//		String Teklifdosyasi_konusu = provider.checkDBCell("Teklifdosyası_konusu_", dtParameters[1][13]);
//		String Teklifdosyasi_sorumlusu = Ekiparkadasimiz_adi + " " + Ekiparkadasimiz_soyadi;
//		String Teklifdosyasi_aciklamasi =provider.checkDBCell("Teklif_dosyasi_aciklama_", dtParameters[1][14]);
//		String Dosya_no	= dtParameters[1][15];
//		String Davadosyasi_fatura_kimin_adina = dtParameters[1][16];
//		String Davadosyasi_fatura_kime_gonderilecek = dtParameters[1][17];  
//		String Davadosyasi_ucret_bildirim_formati = dtParameters[1][18];
//		String Davadosyasi_faturanin_gonderilecegi_adres = Kontaklarimiz_adres_adi;
//		String Davadaki_tarife_tipleri = dtParameters[1][19];
//		String Para_birimi = dtParameters[1][20];
//		String Davadaki_tarife_aciklamasi = provider.checkDBCell("Davadosyasi_tarife_aciklama_", dtParameters[1][21]);
//		String Davadosyasi_fiks_ucret_tutari = dtParameters[1][22];
//		String Burodosyasi_konusu =provider.checkDBCell("Buro_dosyasi_konusu_", dtParameters[1][23]);
//		String Burodosyasi_sorumlusu = Ekiparkadasimiz_adi + " " + Ekiparkadasimiz_soyadi;
//		String Burodosyasi_konu_aciklamasi = provider.checkDBCell("Burodosyasi_konu_aciklamasi_", dtParameters[1][24]);
//		String Zamanlar_ilgili_calisan = isim + " " + soyisim;  //25
//		String Zamanlar_aktivite_turu =	dtParameters[1][26];
//		String Zamanlar_aciklama = provider.checkDBCell("Zamanlar_aciklama_", dtParameters[1][27]);
//		String Masraflar_masraf_yapan_kisi = isim + " " + soyisim;  //28
//		String Masraflar_aciklama = provider.checkDBCell("Masraflar_aciklama_", dtParameters[1][29]);
//		String Masraflar_neden_belgesiz = provider.checkDBCell("Masraflar_neden_belgesiz_", dtParameters[1][30]);
//		String Avanslar_calisan = isim + " " + soyisim;  //31
//		String Avanslar_aciklama = provider.checkDBCell("Avanslar_aciklama_", dtParameters[1][32]);
//		String Avanslar_avans_tutari = dtParameters[1][33];
//		String Finans_banka_adi	= dtParameters[1][34];
//		String Finans_sube_adi	= dtParameters[1][35];
//		String Finans_hesap_tipi = dtParameters[1][36];
//		String Finans_hesap_adi	= provider.checkDBCell("Finans_hesap_adi_", dtParameters[1][37]);
//		String Finans_hareket_tipi = dtParameters[1][38];
//		String Finans_hareket_alt_tipi = dtParameters[1][39];
//		String Finans_tutar = dtParameters[1][40];
//		String Durusmagorevler_gorev_verilen_kisi = Ekiparkadasimiz_adi + " " + Ekiparkadasimiz_soyadi;
//		String Durusmagorevler_onay_verecek_kisi = isim + " " + soyisim;  //41
//		String Evraklar_teslim_alan_gonderen = Ekiparkadasimiz_adi + " " + Ekiparkadasimiz_soyadi;
//		String Evraklar_evrak_tipi = dtParameters[1][42];
//		String Evraklar_dosya_sorumlusu = isim + " " + soyisim;  //43
//		String Egitim_turu = dtParameters[1][44];
//		String Okulkurum_adi = dtParameters[1][45];
//		String Fakulte = dtParameters[1][46];
//		String Bolum = dtParameters[1][47];
//		String Iban = dtParameters[1][48];
//		String Unvan = dtParameters[1][49];
//		String Kontaklarimiz_tarife_tipi = dtParameters[1][50];
//		String Herkes_icin_kullanilacak_ucret = dtParameters[1][51];
//		//String Ucret_bildirimi_gonderilecek_eposta = dtParameters[1][52];  bu bilgi temp mail oluşturulunca doldurulur.
//		String gorev_no = dtParameters[1][53];
		
		// *************PAGE METHODS********************
//		tenMinuteMailPage.goToUrl(tenMinutesMail)
//		.CreateTempMail();
//		loginPage.goToUrl(baseURL);
//		homePage.goToHesapOlustur()		
//		.createAccount(isim, soyisim, Kontaklarimiz_firma_adi);
//		tenMinuteMailPage.goToUrl(tenMinutesMail)
//		.activateMail();
//		homePage.SetPassword("Test123test");

		loginPage.goToUrl(baseURL).Login("yenicehazer@yahoo.com", "Test123test");
	
	
		homePage.goToEkipArkadaslarimiz();
		
		ekipArkadaslarimizPage.ekipArkadasiEkle("emre", "sens", "Idari Personel");
	//	.goToKontaklarimiz();
	
//		kontaklarimizPage.kontakEkle(Kontaklarimiz_firma_adi, Kontaklarimiz_kontak_tipi,  Kontaklarimiz_adres_adi, Kontaklarimiz_adres,  Kontaklarimiz_ulke, Kontaklarimiz_sehir, Kontaklarimiz_ilce)
//		.goToDosyalar();
//		
//		teklifDosyasiPage.dosyaEkle(Teklifdosyasi_muvekkil, Teklifdosyasi_konusu, Teklifdosyasi_sorumlusu,Teklifdosyasi_aciklamasi)
//		.teklifDosyasiDuzenle(Teklifdosyasi_konusu, Davadosyasi_fatura_kimin_adina, Davadosyasi_fatura_kime_gonderilecek, Davadosyasi_ucret_bildirim_formati, Davadosyasi_faturanin_gonderilecegi_adres, Davadaki_tarife_tipleri, Para_birimi, Davadaki_tarife_aciklamasi)
//		.buroDosyasiEkle(Davadosyasi_fiks_ucret_tutari, Burodosyasi_konusu, Burodosyasi_sorumlusu, Burodosyasi_konu_aciklamasi)
//		.goToZamanlar();
//		
//		zamanlarPage.yeniZamanEkle(Zamanlar_ilgili_calisan, System.getProperty("dosya_no"), Zamanlar_aktivite_turu, Zamanlar_aciklama)
//		.goToMasraflar();
//		
//		masraflarPage.masrafEkle(Masraflar_masraf_yapan_kisi, System.getProperty("dosya_no"), Masraflar_aciklama, Masraflar_neden_belgesiz, Para_birimi)
//		.goToAvanslar();	
//		
//		avanslarPage.daimiIsAvansiEkle(Avanslar_calisan, Avanslar_aciklama, Avanslar_avans_tutari, Para_birimi, System.getProperty("dosya_no"))
//		.ozelIsAvansiEkle(Avanslar_calisan,Avanslar_aciklama,Avanslar_avans_tutari, Para_birimi, System.getProperty("dosya_no"))
//		.goToAyarlarPage();
//		
//		ayarlarPage.saatlikCalismaUcretiEkle(isim + " " + soyisim, Para_birimi)
//		.goToFinansUcretBildirimleri();
//
//		finansPage.UcretBildirimiOlustur()
//		.goToFinansBankaHesaplari();
//		
//		finansPage.bankaHesabiEkle(Finans_banka_adi,Finans_sube_adi,Finans_hesap_tipi, Para_birimi, Finans_hesap_adi, Finans_hareket_tipi,Finans_hareket_alt_tipi,Finans_tutar)   //tum alanlar doldurulur denmiş ama iban falan onları nasıl yapalım ?)
//		.goToFinansHesapHareketleri()
//		.hesapHareketiEkle(Finans_banka_adi, Finans_sube_adi,Finans_hesap_tipi, Para_birimi, Finans_hesap_adi, Finans_hareket_tipi,Finans_hareket_alt_tipi,Finans_tutar)
//		.goToDurusmaVeGorevlerGorevler();
//		
//		durusmaVeGorevlerPage.GorevEkle(System.getProperty("dosya_no"), Durusmagorevler_gorev_verilen_kisi, Durusmagorevler_onay_verecek_kisi)
//		.ArastirmaGorevEkle(System.getProperty("dosya_no"), Durusmagorevler_gorev_verilen_kisi, Durusmagorevler_onay_verecek_kisi)
//		.goToEvrakYonetimiEvraklar();
//		
//		evrakYonetimiPage.EvrakEkle(Teklifdosyasi_muvekkil,Evraklar_teslim_alan_gonderen, Evraklar_evrak_tipi, System.getProperty("dosya_no"), Evraklar_dosya_sorumlusu);
//
//		
//		//tarih bilgisini getirir.. current date.
//	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
//	    Date date = new Date();  
//	    System.out.println(formatter.format(date));  
//	    
//		Dosya_no = System.getProperty("dosya_no");
//		provider.ExecuteCommand("exec InsertData_Phase_2 '"+ 
//				env + "', '" +
//				System.getProperty("user.name") + "', '" +
//				formatter.format(date) + "', '" +
//				Ekiparkadasimiz_adi + "', '" +
//				Ekiparkadasimiz_soyadi + "', '" +
//				Ekiparkadasimiz_calisan_tipi + "', '" +
//				Kontaklarimiz_kontak_tipi + "', '" +
//				Kontaklarimiz_firma_adi + "', '" +
//				Kontaklarimiz_adres_adi + "', '" +
//				Kontaklarimiz_adres + "', '" +
//				Kontaklarimiz_ulke + "', '" +
//				Kontaklarimiz_sehir + "', '" +
//				Kontaklarimiz_ilce + "', '" +
//				Teklifdosyasi_konusu + "', '" +
//				Teklifdosyasi_aciklamasi + "', '" +
//				Dosya_no + "', '" +
//				Davadosyasi_fatura_kimin_adina + "', '" +
//				Davadosyasi_fatura_kime_gonderilecek + "', '" +
//				Davadosyasi_ucret_bildirim_formati + "', '" +
//				Davadaki_tarife_tipleri + "', '" +
//				Para_birimi + "', '" +
//				Davadaki_tarife_aciklamasi + "', '" +
//				Davadosyasi_fiks_ucret_tutari + "', '" +
//				Burodosyasi_konusu + "', '" +
//				Burodosyasi_konu_aciklamasi + "', '" +
//				Zamanlar_ilgili_calisan + "', '" +
//				Zamanlar_aktivite_turu + "', '" +
//				Zamanlar_aciklama + "', '" +
//				Masraflar_masraf_yapan_kisi + "', '" +
//				Masraflar_aciklama + "', '" +
//				Masraflar_neden_belgesiz + "', '" +
//				Avanslar_calisan + "', '" +
//				Avanslar_aciklama + "', '" +
//				Avanslar_avans_tutari + "', '" +
//				Finans_banka_adi + "', '" +
//				Finans_sube_adi + "', '" +
//				Finans_hesap_tipi + "', '" +
//				Finans_hesap_adi + "', '" +
//				Finans_hareket_tipi + "', '" +
//				Finans_hareket_alt_tipi + "', '" +
//				Finans_tutar + "', '" +
//				Durusmagorevler_onay_verecek_kisi + "', '" +
//				Evraklar_evrak_tipi + "', '" +
//				Evraklar_dosya_sorumlusu + "', '" +
//				Egitim_turu + "', '" +
//				Okulkurum_adi + "', '" +
//				Fakulte + "', '" +
//				Bolum + "', '" +
//				Iban + "', '" +
//				Unvan + "', '" +
//				Kontaklarimiz_tarife_tipi + "', '" +
//				Herkes_icin_kullanilacak_ucret + "', '" +
//				System.getProperty("ten_minute_email") + "', '" +
//				gorev_no + "'", env, "db");
		
		System.out.println("DB' kaydı tamamlandi.");
	}

	

	
//	@Test//(priority = 0)
//	public void case002() {
//		driver.quit();
//	System.out.println("test2");
//	}
}
