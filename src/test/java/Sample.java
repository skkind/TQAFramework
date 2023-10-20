import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Sample {
    private WebDriver driver;

    public Sample(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyDetails() {
        driver.get("https://www.google.com/");
        System.out.println("hello");
    }

}
