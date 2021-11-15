package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CocosettePage extends BasePage {

    public CocosettePage() {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToGoogle(String url) {

        abrenavegador(url);
    }

    @FindBy(name = "q")
    private WebElement search;

    public void inputSearch(String busqueda) {
        search.sendKeys(busqueda);
    }

    public void btnSearch() {
        search.submit();
    }

    public void cerrar() {
        driver.quit();
    }
}

