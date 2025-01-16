package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class lcwPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;


    static By cerez = By.id("cookieseal-banner-accept");
    static By girisyap = By.xpath("//span[contains(@class,'user-wrapper')]//span[1]");
    static By eposta = By.cssSelector("input[placeholder='E-posta Adresi veya Telefon Numarası']");
    static By devamEt = By.xpath("//button[normalize-space()='Devam Et']");
    static By sifre = By.xpath("//input[@placeholder='Şifreniz']");
    static By girisButonu = By.cssSelector("button[type='submit']");
    static By cocuk = By.xpath("//a[normalize-space()='ÇOCUK & BEBEK']");
    static By kizcocuk = By.xpath("//span[normalize-space()='KIZ ÇOCUK']");
    static By mont = By.xpath("//section[contains(@class,'content-tab')]//a[normalize-space()='Mont ve Kaban']");

    static By besalti = By.xpath("//span[contains(text(),'5-6 Yaş')]");

    static By alti = By.xpath("//div[@class='filter-option']//span[text()='6 Yaş']");
    static By altiyedi = By.xpath("//span[contains(text(),'6-7 Yaş')]");
    static By bej = By.xpath("//span[normalize-space()='BEJ']");
    static By siralamaDropdown = By.xpath("//span[@class='dropdown-button__text']");
    static By enCokSatan = By.cssSelector("div[class='container-fluid desktop-list-options-bar'] a:nth-child(5)");
    static By urundetay = By.xpath("//a[@title='Kapüşonlu Kız Çocuk Mont']//h5[@class='product-card__title'][contains(text(),'Kapüşonlu Kız Çocuk Mont')]");
    static By bostikla = By.xpath("//div[@class='evam-first-screenControl hidden-mobile evam-first-screen-click evam-first-screen']");
    static By yasGrubu = By.xpath("//button[@data-label='5-6 Yaş']");
    static By sepeteEkle = By.xpath("//button[normalize-space()='SEPETE EKLE']");
    static By sepeteTikla = By.xpath("//span[normalize-space()='Sepetim']");
    static By urunAdi = By.xpath("//span[@class='rd-cart-item-code']");
    static By urunAdeti = By.xpath("//input[@value='1']");
    static By odenenTutar = By.xpath("//div[@class='price-info-area']//span[@class='total-grand-box-amount'][normalize-space()='1.499,99 TL']");
    static By urunRengi = By.xpath("//strong[normalize-space()='Koyu Bej']");
    static By favEkle = By.xpath("//i[@class='fa fa-heart-o']");
    static By odemeAdimiButonu = By.xpath("//div[@class='col-md-12 pl-20 pr-20']//a[@class='main-button mt-15'][normalize-space()='ÖDEME ADIMINA GEÇ']");
    static By odemeYontemi = By.xpath("//span[contains(text(),'Banka / Kredi Kartı')]");
    static By lcwtikla = By.xpath("//a[@class='header-logo']");
    static By favTikla = By.xpath("//span[normalize-space()='Favorilerim']");
    static By favorilerdekiUrunAdi = By.xpath("//h5[@class='product-card__title']");










    public lcwPages(WebDriver driver) {
        lcwPages.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        elementHelper = new ElementHelper(driver);



    }

    public void anasayfaAc() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void cereziKabulEt() {
        elementHelper.click(cerez);
    }

    public void GirisButonu() {
        elementHelper.click(girisyap);
    }
    public void eposta() {
        elementHelper.click(eposta);
    }
    public void epostaYaz() {
        elementHelper.sendKey(eposta,"gsozen11@gmail.com");
    }
    public void devamEt() {
        elementHelper.click(devamEt);
    }
    public void sifreAlanı() {
        elementHelper.click(sifre);
    }
    public void sifre() {
        elementHelper.sendKey(sifre,"12345_Ab");
    }
    public void Giris() {
        elementHelper.click(girisButonu);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void montvekaban() {
        Actions actions = new Actions(driver);

        // Çocuk ve Bebek menüsü üzerine gel
        WebElement cocukElement = wait.until(ExpectedConditions.visibilityOfElementLocated(cocuk));
        actions.moveToElement(cocukElement).perform();

        // Kız Çocuk menüsü üzerine gel
        WebElement kizcocukElement = wait.until(ExpectedConditions.visibilityOfElementLocated(kizcocuk));
        actions.moveToElement(kizcocukElement).perform();

        // Mont ve Kaban linkine tıklayın
        WebElement montElement = wait.until(ExpectedConditions.elementToBeClickable(mont));
        montElement.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void bedenfiltesibesalti() {
        elementHelper.click(besalti);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void bedenFiltesiAlti() {
        elementHelper.click(alti);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void bedenFiltresiAltiyedi() {
        elementHelper.click(altiyedi);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void renkFiltresi() {
        elementHelper.click(bej);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public void siralama() {

        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollTo(0, 0)");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.click(siralamaDropdown);

        WebElement enCokSatanOption = wait.until(ExpectedConditions.elementToBeClickable(enCokSatan));
        Actions action = new Actions(driver);
        action.moveToElement(enCokSatanOption).click().perform();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void urundetay() {
        elementHelper.click(urundetay);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //elementHelper.click(bostikla);

    }

    public void yasGrubu() {
        elementHelper.click(yasGrubu);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void sepeteEkle() {
        elementHelper.click(sepeteEkle);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void sepeteTikla() {
        elementHelper.click(sepeteTikla);

        String urunAdiText = driver.findElement(urunAdi).getText();
        String urunRengiText = driver.findElement(urunRengi).getText();
        String urunAdetiText = driver.findElement(urunAdeti).getAttribute("value"); // Adet input olduğunda 'value' ile alırsınız


        String expectedUrunAdi = "Mont"; // Beklenen ürün adı
        String expectedUrunRengi = "Koyu Bej"; // Beklenen renk
        String expectedUrunAdeti = "1"; // Beklenen adet (örnek olarak 1)

        // Doğrulama işlemleri
        if (urunAdiText.equals(expectedUrunAdi)) {
            System.out.println("Ürün adı doğru: " + urunAdiText);
        } else {
            System.out.println("Ürün adı yanlış! Beklenen: " + expectedUrunAdi + ", Gerçek: " + urunAdiText);
        }

        if (urunRengiText.equals(expectedUrunRengi)) {
            System.out.println("Ürün rengi doğru: " + urunRengiText);
        } else {
            System.out.println("Ürün rengi yanlış! Beklenen: " + expectedUrunRengi + ", Gerçek: " + urunRengiText);
        }

        if (urunAdetiText.equals(expectedUrunAdeti)) {
            System.out.println("Ürün adeti doğru: " + urunAdetiText);
        } else {
            System.out.println("Ürün adeti yanlış! Beklenen: " + expectedUrunAdeti + ", Gerçek: " + urunAdetiText);
        }

        // Sepetteki toplam tutarın doğruluğunu kontrol et
        String urunTutar = driver.findElement(odenenTutar).getText(); // Tutarın gösterildiği öğe
        System.out.println("Ödenen Tutar: " + urunTutar);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void favEkle() {
        elementHelper.click(favEkle);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void odemeadiminagec() {
        elementHelper.click(odemeAdimiButonu);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void odemeYontemi() {
        elementHelper.click(odemeYontemi);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void favGit() {
        elementHelper.click(lcwtikla);
        elementHelper.click(favTikla);

        String expectedUrunAdi = "Kapüşonlu Kız Çocuk Mont";
        String actualUrunAdi = driver.findElement(favorilerdekiUrunAdi).getText();

        if (actualUrunAdi.equals(expectedUrunAdi)) {
            System.out.println("Ürün favorilere doğru bir şekilde eklendi: " + actualUrunAdi);
        } else {
            System.out.println("Favorilere eklenen ürün adı eşleşmiyor! Beklenen: " + expectedUrunAdi + ", Gerçek: " + actualUrunAdi);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

