import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

public class VkHomePage {

  private static final String URL = "https://vk.com/";

  private final SelenideElement searchField = $x("//input[@id='ts_input']");

  public VkHomePage openPage() {
    Selenide.open(URL);
    return this;
  }

  public VkResultPage typeForSearch(String text) {
    searchField.click();
    searchField.sendKeys(text + Keys.ENTER);
    return new VkResultPage();
  }
}
