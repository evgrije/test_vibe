package tests;

import components.FiltersToolByAdminComponent;

import elements.FilterByTypeTool;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.AdminToolsPage;
import pages.LogInPage;

public class AdminFilterByToolTest {

    @BeforeEach
    void succesfulLogIn(){
        LogInPage logInPage = new LogInPage();
        logInPage.openPageLogIn();
        logInPage.logIn();
    }

    @Test
    public void applyingFilterByToolCIFromAdmin(){
        AdminToolsPage adminToolsPage = new AdminToolsPage();
        adminToolsPage.openPageToolsFromAdmin();

        FiltersToolByAdminComponent filtersToolByAdminComponent = new FiltersToolByAdminComponent();
        filtersToolByAdminComponent.clickOnTheFilterButton();
        filtersToolByAdminComponent.clickOnTheByToolFilter();

        FilterByTypeTool filterByTypeTool = new FilterByTypeTool();
        filterByTypeTool.chooseToolInComboBoxWithUsedTextSearch("ci");
    }

}
