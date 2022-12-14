package page;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

public class ResultsPage {

  private final SelenideElement firstResultLink = $x("//h3");

  public VkHomePage clickFirstResultLink() {
    firstResultLink.click();
    return new VkHomePage();
  }
}
