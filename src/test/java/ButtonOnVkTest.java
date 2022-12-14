import static org.junit.Assert.assertTrue;

import org.junit.Test;
import page.HomePage;

public class ButtonOnVkTest extends BaseTest {

  @Test
  public void checkButtonRegistrationIsDisplayed() {
    assertTrue(new HomePage().openGooglePage()
        .setTextInSearchField("vk")
        .clickFirstResultLink().isRegistrationButtonDisplayed());
  }
}
