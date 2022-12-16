import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import java.time.Duration;

public class VkResultPage {

  private final SelenideElement miniAppsButton = $x("//li[@id='l_mini_apps']");

  public VkResultPage waitMiniAppsButton() {
    miniAppsButton.shouldBe(Condition.visible, Duration.ofSeconds(6));
    return this;
  }

  public boolean isMiniAppsButtonDisplayed() {
    return miniAppsButton.isDisplayed();
  }
}
