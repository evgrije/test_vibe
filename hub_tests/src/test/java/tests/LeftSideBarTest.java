package tests;

import components.LeftSideBarComponent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LogInPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LeftSideBarTest {

    @BeforeEach
    void succesfulLogIn(){
        LogInPage logInPage = new LogInPage();
        logInPage.openPageLogIn();
        logInPage.logIn("abracadabra", "abracadabra");
    }

    @Test
    void checkItemMenuName(){
        LeftSideBarComponent sideBarComponent = new LeftSideBarComponent();
        sideBarComponent.checkVisibleSideBar();

    }

    @Test
    void checkUrlForItemMenu(){
        LeftSideBarComponent leftSideBarComponent = new LeftSideBarComponent();
        leftSideBarComponent.checkWorkspaceDashboardElement();
        leftSideBarComponent.checkUrlForEachItemLeftSideBar();
    }


}
