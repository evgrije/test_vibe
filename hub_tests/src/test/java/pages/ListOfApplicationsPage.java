package pages;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ListOfApplicationsPage {

    public void openPageApplications(){
        open("https://hub.dev.swordfishsecurity.com/#/application");
    }

    public void chooseFirstApplication(){
        $$("[class='mat-row cdk-row new-table__line ng-tns-c745434923-3 ng-star-inserted']")
                .get(0)
                .click();
    }


}
