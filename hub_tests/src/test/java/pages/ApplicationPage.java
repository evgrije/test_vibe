package pages;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ApplicationPage {

    public void checkOpenAppPage(){
        $("[class*='ui20-main-component-content']")
                .shouldBe(visible, Duration.ofSeconds(5));

    }
}
