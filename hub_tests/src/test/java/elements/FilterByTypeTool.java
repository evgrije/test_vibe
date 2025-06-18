package elements;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FilterByTypeTool {
    public void checkComboBoxFilterToolsIsVisible(){
        $("div[id*='mat-select-4-panel']")
                .shouldBe(visible, Duration.ofSeconds(5));
        $$("mat-option[class*='mat-option mat-focus-indicator']")
                .shouldHave(sizeGreaterThanOrEqual(0));
    }

    public void inputSearchToolInFilterByTool(String value){
        $("div[id*='mat-select-4-panel'] input[aria-label*='dropdown search']")
                .shouldBe(visible, Duration.ofSeconds(5))
                .setValue(value);
    }

    public void chooseCheckBoxInFilterByTool(){
        $("mat-option[class*='mat-active']")
                .shouldBe(visible, Duration.ofSeconds(5))
                .click();
    }

    public void chooseToolInComboBoxWithUsedTextSearch(String value){
        checkComboBoxFilterToolsIsVisible();
        inputSearchToolInFilterByTool(value);
        chooseCheckBoxInFilterByTool();
    }

}
