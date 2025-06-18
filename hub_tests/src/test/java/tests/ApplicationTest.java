package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.ApplicationPage;
import pages.ListOfApplicationsPage;
import pages.LogInPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApplicationTest {


    @BeforeEach
    void succesfulLogIn(){
        LogInPage logInPage = new LogInPage();
        logInPage.openPageLogIn();
        logInPage.logIn();
    }

    @Test
    void chooseFirstApplication(){
        ListOfApplicationsPage applicationsPage = new ListOfApplicationsPage();
        applicationsPage.openPageApplications();
        applicationsPage.chooseFirstApplication();

        ApplicationPage applicationPage = new ApplicationPage();
        applicationPage.checkOpenAppPage();
    }


}
