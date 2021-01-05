import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleTest {

        @Test
        void selenideSearchTest() {
            open("https://google.com");
            $(byName("q")).setValue("Selenide").pressEnter();
            $("html").shouldHave(text("selenide.org"));
        }

        @Test
        void selenideSearchYandex() {
            open("https://yandex.ru");
            $(byName("text")).setValue("Selenide").pressEnter();
            $("html").shouldHave(text("selenide.org"));
        }
}
