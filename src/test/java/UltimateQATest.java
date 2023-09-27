import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;


public class UltimateQATest extends Config {

    @Test
    public void checkButtonUsingId() {
        WebElement button = driver.findElementById("idExample");
        button.click();

        WebElement text = driver.findElementByClassName("entry-title");
        Assertions.assertEquals("Button success", text.getText());
    }


    @Test
    public void checkEmailSending() throws InterruptedException {
        WebElement nameInput = driver.findElementById("et_pb_contact_name_0");
        nameInput.sendKeys("Tester");

        WebElement emailInput = driver.findElementById("et_pb_contact_email_0");
        emailInput.sendKeys("Tester@tester.pl");

        Thread.sleep(2000);

        WebElement button = driver.findElementByName("et_builder_submit_button");
        button.click();

        Thread.sleep(3000);

        WebElement text = driver.findElementByXPath("//div[@class='et-pb-contact-message']/p");
        Assertions.assertEquals("Thanks for contacting us", text.getText());
    }

    @Test
    public void checkClickMeButton() throws InterruptedException {
        WebElement button = driver.findElementByXPath("//div[@class='et_pb_button_wrapper']/a");
        button.click();

        WebElement text = driver.findElementByClassName("entry-title");
        Assertions.assertEquals("Button success", text.getText());
    }
}
