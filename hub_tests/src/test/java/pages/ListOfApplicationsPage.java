package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ListOfApplicationsPage {

    public void openPageApplications() {
        open("https://hub.dev.swordfishsecurity.com/#/application");
    }

    public void chooseFirstApplication() {
        //new
        checkTableVisible();
        $$("tr[class*='mat-row cdk-row new-table__line']")
                .shouldHave(sizeGreaterThanOrEqual(1))
                .get(0)
                .click();

        //old
        $$("[class='mat-row cdk-row new-table__line ng-tns-c745434923-3 ng-star-inserted']")
                .get(0)
                .click();
    }


    public void chooseApplication(int applicationNumber) {
        //new
        checkTableVisible();
        $$("tr[class*='mat-row cdk-row new-table__line']")
                .shouldHave(sizeGreaterThanOrEqual(applicationNumber))
                .get(applicationNumber - 1)
                .click();


        //old
        $$("[class='mat-row cdk-row new-table__line ng-tns-c745434923-3 ng-star-inserted']")
                .get(applicationNumber - 1)
                .click();
    }

    private static void checkTableVisible() {
        $("table[class='mat-table']").shouldBe(visible, Duration.ofSeconds(5));
    }


}
