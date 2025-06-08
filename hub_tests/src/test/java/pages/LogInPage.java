package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LogInPage {

    public void openPageLogIn(){
        open("https://hub.dev.swordfishsecurity.com");
    }

    public void loginInput(String login){
        $("[data-testid='loginInput'] input")
                .setValue(login);
    }
    public void passwordInput(String password){
        $("[data-testid='passwordInput'] input")
                .setValue(password);
    }
    public void buttonLogIn(){
        $("[data-testid='loginButton']")
                .click();
    }

    public void logIn(String login, String password){
        loginInput(login);
        passwordInput(password);
        buttonLogIn();
    }
}
