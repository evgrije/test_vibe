package components;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftSideBarComponent {

    private SelenideElement component;

    public LeftSideBarComponent(){
        component = $("div[class=*'ng-trigger-leftMenu']");
    }

    //Elements methods
    private SelenideElement getScanRouteElement() {
        return component.$("[data-testid='scansRoute']");
    }

    private SelenideElement getWorkspaceElement() {
        return component.$("[data-testid='workspaceRoute']");
    }

    //check visible methods
    public void checkWorkspaceDashboardElement(){
        getWorkspaceElement()
                .shouldBe(visible, Duration.ofSeconds(5))
                .shouldHave(text("Дашборды"));
    }

    public void leftSideBarApplication(){
        SelenideElement applicationElement = $("[data-testid='applicationRoute']");
        applicationElement.shouldHave(text("Приложения"));
        applicationElement.shouldBe(visible);
    }

    public void leftSideBarScans(){
        getScanRouteElement().shouldBe(visible);
        $("[data-testid='scansRoute']").shouldHave(text("Сканирования"));
    }



    public void leftSideBarIssues(){
        $("[data-testid='issuesRoute']").shouldHave(text("Уязвимости"));
        $("[data-testid='issuesRoute']").shouldBe(visible);
    }

    public void leftSideBarDefects(){
        $("[data-testid='defectsRoute']").shouldHave(text("Дефекты"));
        $("[data-testid='defectsRoute']").shouldBe(visible);
    }

    public void leftSideBarReleaseObject(){
        $("[data-testid='releaseObjectsRoute']").shouldHave(text("Релизные объекты"));
        $("[data-testid='releaseObjectsRoute']").shouldBe(visible);
    }

    public void leftSideBarSSDL(){
        $("[data-testid='ssdlMenuBtn']").shouldHave(text("SSDL"));
        $("[data-testid='ssdlMenuBtn']").shouldBe(visible);
    }

    public void leftSideBarMetrics(){
        $("[data-testid='metricsMenuBtn']").shouldHave(text("Метрики"));
        $("[data-testid='metricsMenuBtn']").shouldBe(visible);
    }

    public void checkVisibleSideBar(){
        checkWorkspaceDashboardElement();
        leftSideBarApplication();
        leftSideBarScans();
        leftSideBarDefects();
        leftSideBarIssues();
        leftSideBarReleaseObject();
        leftSideBarSSDL();
        leftSideBarMetrics();
    }

    public void checkUrlItemDashboard(){
        getWorkspaceElement()
                .click();
        String expUrlDash = "https://hub.dev.swordfishsecurity.com/#/workspace";
        assertEquals(expUrlDash, WebDriverRunner.url());
        Selenide.back();
    }

    public void checkUrlItemApp(){
        $("[data-testid='applicationRoute']").click();
        String expUrlApp = "https://hub.dev.swordfishsecurity.com/#/application";
        assertEquals(expUrlApp, WebDriverRunner.url());
        Selenide.back();
    }

    public void checkUrlItemScan(){
        getScanRouteElement().click();
        String expUrlScan = "https://hub.dev.swordfishsecurity.com/#/scans";
        assertEquals(expUrlScan, WebDriverRunner.url());
        Selenide.back();
    }

    public void checkUrlItemIssue(){
        $("[data-testid='issuesRoute']").click();
        String expUrlIssue = "https://hub.dev.swordfishsecurity.com/#/issues";
        assertEquals(expUrlIssue, WebDriverRunner.url());
        Selenide.back();
    }

    public void checkUrlItemDefect(){
        $("[data-testid='defectsRoute']").click();
        String expUrlDefect = "https://hub.dev.swordfishsecurity.com/#/defects";
        assertEquals(expUrlDefect, WebDriverRunner.url());
        Selenide.back();
    }

    public void checkUrlItemReleaseObject(){
        $("[data-testid='releaseObjectsRoute']").click();
        String expUrlReleaseObject = "https://hub.dev.swordfishsecurity.com/#/releaseobjects";
        assertEquals(expUrlReleaseObject, WebDriverRunner.url(), "Current url not equals to expected /releaseobjects");
        Selenide.back();
    }

    public void checkUrlForEachItemLeftSideBar(){
        checkUrlItemDashboard();
        checkUrlItemApp();
        checkUrlItemScan();
        checkUrlItemIssue();
        checkUrlItemDefect();
        checkUrlItemReleaseObject();
    }
}
