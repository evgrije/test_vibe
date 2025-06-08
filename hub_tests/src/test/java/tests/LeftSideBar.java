package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import components.LeftSideBarComponent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.ListOfApplicationsPage;
import pages.LogInPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LeftSideBar {

    @BeforeEach
    void succesfulLogIn(){
        LogInPage logInPage = new LogInPage();
        logInPage.openPageLogIn();
        logInPage.logIn("hubadm", "qweasd123");
    }

    @Test
    void checkItemMenuName(){
        LeftSideBarComponent sideBarComponent = new LeftSideBarComponent();
        sideBarComponent.checkVisibleSideBar();

    }

    @Test
    void checkUrlForItemMenu(){
        LeftSideBarComponent leftSideBarComponent = new LeftSideBarComponent();
        leftSideBarComponent.checkUrlForEachItemLeftSideBar();
    }


}
