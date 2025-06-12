package pages;

import com.codeborne.selenide.Configuration;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LogInPage {

    public void openPageLogIn(){
        open("https://hub.dev.swordfishsecurity.com");
    }

    public void loginInput(String login){
        $("[data-testid='loginInput'] input")
                .shouldBe(visible, Duration.ofSeconds(5))
                .scrollIntoCenter()
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
