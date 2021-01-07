import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {


        @Test
        void successTest() {
            assertEquals(10/5, 2);
        }

        @Test
        void negativeTest() {
            assertEquals(10/5, 4);

        }

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
