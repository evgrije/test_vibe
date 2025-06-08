package components;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftSideBarComponent {

    public void leftSideBarDashboard(){
        $("[data-testid='workspaceRoute']").shouldHave(text("Дашборды"));
        $("[data-testid='workspaceRoute']").shouldBe(visible);
    }

    public void leftSideBarApplication(){
        $("[data-testid='applicationRoute']").shouldHave(text("Приложения"));
        $("[data-testid='applicationRoute']").shouldBe(visible);
    }

    public void leftSideBarScans(){
        $("[data-testid='scansRoute']").shouldHave(text("Сканирования"));
        $("[data-testid='scansRoute']").shouldBe(visible);
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
        leftSideBarDashboard();
        leftSideBarApplication();
        leftSideBarScans();
        leftSideBarDefects();
        leftSideBarIssues();
        leftSideBarReleaseObject();
        leftSideBarSSDL();
        leftSideBarMetrics();
    }

    public void checkUrlItemDashboard(){
        $("[data-testid='workspaceRoute']")
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
        $("[data-testid='scansRoute']").click();
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
        assertEquals(expUrlReleaseObject, WebDriverRunner.url());
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
