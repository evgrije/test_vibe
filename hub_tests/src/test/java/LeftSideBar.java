import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LeftSideBar {

    @BeforeEach
    void succesfulLogIn(){
        open("https://hub.dev.swordfishsecurity.com");
        $("[data-testid='loginInput'] input").setValue("abracadabra");
        $("[data-testid='passwordInput'] input").setValue("abracadabra");
        $("[data-testid='loginButton']").click();
    }

    @Test
    void checkItemMenuName(){
        $("[data-testid='workspaceRoute']").shouldHave(text("Дашборды"));
        $("[data-testid='applicationRoute']").shouldHave(text("Приложения"));
        $("[data-testid='scansRoute']").shouldHave(text("Сканирования"));
        $("[data-testid='issuesRoute']").shouldHave(text("Уязвимости"));
        $("[data-testid='defectsRoute']").shouldHave(text("Дефекты"));
        $("[data-testid='releaseObjectsRoute']").shouldHave(text("Релизные объекты"));
        $("[data-testid='ssdlMenuBtn']").shouldHave(text("SSDL"));
        $("[data-testid='metricsMenuBtn']").shouldHave(text("Метрики"));
    }

    @Test
    void checkUrlForItemMenu(){
        $("[data-testid='workspaceRoute']").click();
        String expUrlDash = "https://hub.dev.swordfishsecurity.com/#/workspace";
        assertEquals(expUrlDash, WebDriverRunner.url());
        Selenide.back();

        $("[data-testid='applicationRoute']").click();
        String expUrlApp = "https://hub.dev.swordfishsecurity.com/#/application";
        assertEquals(expUrlApp, WebDriverRunner.url());
        Selenide.back();

        $("[data-testid='scansRoute']").click();
        String expUrlScan = "https://hub.dev.swordfishsecurity.com/#/scans";
        assertEquals(expUrlScan, WebDriverRunner.url());
        Selenide.back();

        $("[data-testid='issuesRoute']").click();
        String expUrlIssue = "https://hub.dev.swordfishsecurity.com/#/issues";
        assertEquals(expUrlIssue, WebDriverRunner.url());
        Selenide.back();

        $("[data-testid='defectsRoute']").click();
        String expUrlDefect = "https://hub.dev.swordfishsecurity.com/#/defects";
        assertEquals(expUrlDefect, WebDriverRunner.url());
        Selenide.back();

        $("[data-testid='releaseObjectsRoute']").click();
        String expUrlReleaseObject = "https://hub.dev.swordfishsecurity.com/#/releaseobjects";
        assertEquals(expUrlReleaseObject, WebDriverRunner.url());
        Selenide.back();
    }


}
