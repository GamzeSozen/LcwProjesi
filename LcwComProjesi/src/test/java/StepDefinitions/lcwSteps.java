package StepDefinitions;

import Pages.lcwPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class lcwSteps {
    WebDriver driver = DriverFactory.getDriver();
    lcwPages lcwPages = new lcwPages(driver);


    @Given("kullanici anasayfayi acar")
    public void kullaniciAnasayfayiAcar() {
        lcwPages.anasayfaAc();
    }

    @When("cerezi kabul et")
    public void cereziKabulEt() {
        lcwPages.cereziKabulEt();
    }

    @When("giris yap butonuna tikla")
    public void GirisButonu() {
        lcwPages.GirisButonu();
    }

    @When("Eposta")
    public void eposta() {
        lcwPages.eposta();
    }
    @When("eposta yaz")
    public void epostaYaz() {
        lcwPages.epostaYaz();
    }
    @When("Devam et butonuna tikla")
    public void devamEt() {
        lcwPages.devamEt();
    }
    @When("sifreniz Alanına tikla")
    public void sifreAlanı() {
        lcwPages.sifreAlanı();
    }
    @When("sifreyi gir")
    public void sifre() {
        lcwPages.sifre();
    }
    @When("Giris yap")
    public void Giris() {
        lcwPages.Giris();
    }

    @When("cocuk ve bebek-kız cocuk-mont ve kaban tikla")
    public void cocukVeBebekKızCocukMontVeKabanTikla() {
        lcwPages.montvekaban();
    }

    @When("beden filtesini besalti")
    public void bedenFiltesinibesalti() {
        lcwPages.bedenfiltesibesalti();
    }

    @When("Beden filtesi alti")
    public void bedenFiltesiAlti() {
        lcwPages.bedenFiltesiAlti();
    }

    @When("Beden filtresi altiyedi")
    public void bedenFiltresiAltiyedi() {
        lcwPages.bedenFiltresiAltiyedi();
    }


    @When("Renk Filtresi")
    public void renkFiltresi() {
        lcwPages.renkFiltresi();

    }

    @When("siralama")
    public void siralama() {
        lcwPages.siralama();
    }

    @When("UrunDetay")
    public void urundetay() {
        lcwPages.urundetay();
    }

    @When("yas Grubu Sec")
    public void yasGrubuSec() {
        lcwPages.yasGrubu();
    }

    @When("Sepete ekle butonuna tiklanir")
    public void sepeteEkleButonunaTiklanir() {
        lcwPages.sepeteEkle();

    }

    @When("Sepetime Tikla")
    public void sepetimeTikla() {
        lcwPages.sepeteTikla();
    }

    @When("Favorilere ekle")
    public void favorilereEkle() {
        lcwPages.favEkle();
    }

    @When("odeme adimina gec butonuna tiklanir")
    public void odemeAdiminaGecButonunaTiklanir() {
        lcwPages.odemeadiminagec();
    }

    @When("odeme yöntemini sec")
    public void odemeYönteminiSec() {
        lcwPages.odemeYontemi();
    }

    @When("Favorilerime git")
    public void favorilerimeGit() {
        lcwPages.favGit();
    }
}
