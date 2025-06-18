package components;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FiltersToolByAdminComponent {

    public void clickOnTheFilterButton(){
        $("button[class*='mat-focus-indicator mat-tooltip-trigger']")
                .shouldBe(visible, Duration.ofSeconds(5))
                .click();
    }

    public void clickOnTheByToolFilter(){
        $("mat-select[id*='mat-select-4']")
                .shouldBe(visible, Duration.ofSeconds(5))
                .click();
    }

}
