package baseTest;

import static urls.Urls.getUrl;
import org.testng.annotations.BeforeSuite;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

abstract public class BaseTest {
    protected String baseUrl;

    public BaseTest() {
        baseUrl = getUrl();
    }
 
    @BeforeSuite
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = baseUrl;
        Configuration.browserSize = "1920x1080";
        Selenide.open(baseUrl);
    }
    
    abstract public String setUrl();
}