import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VkTest extends BaseTest {

  @Test
  public void checkMiniAppsButtonIsDisplayed() {
    assertTrue(new VkHomePage().openPage()
        .typeForSearch("vk")
        .waitMiniAppsButton()
        .isMiniAppsButtonDisplayed());
  }
}
