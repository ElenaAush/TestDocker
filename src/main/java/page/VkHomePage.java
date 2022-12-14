package page;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

public class VkHomePage {

  private final SelenideElement registrationButton = $("div.JoinForm button.FlatButton");

  public boolean isRegistrationButtonDisplayed() {
    return registrationButton.isDisplayed();
  }
}
