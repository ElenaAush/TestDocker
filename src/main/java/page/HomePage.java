package page;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

public class HomePage {

  private static final String URL = "https://www.google.com/";

  private final SelenideElement searchField = $x("//input");

  public HomePage openGooglePage() {
    Selenide.open(URL);
    return this;
  }

  public ResultsPage setTextInSearchField(String text) {
    searchField.sendKeys(text + Keys.ENTER);
    return new ResultsPage();
  }
}
