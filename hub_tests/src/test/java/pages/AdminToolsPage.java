package pages;

import static com.codeborne.selenide.Selenide.open;

public class AdminToolsPage {
    public void openPageToolsFromAdmin(){
        open("https://hub.k8s.swordfishsecurity.com/#/administration/tools");
    }
}
