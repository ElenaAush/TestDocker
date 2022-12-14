import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

public abstract class BaseTest {

  public void setup() {
    WebDriverManager.chromedriver().setup();
    Configuration.browser = "chrome";
    Configuration.driverManagerEnabled = true;

  }

  @Before
  public void init() {
    setup();
  }

  @After
  public void dropDriver() {
    Selenide.closeWebDriver();
  }
}
