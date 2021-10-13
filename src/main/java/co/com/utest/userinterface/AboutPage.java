package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutPage {

    public static final Target FIRST_NAME = Target.the("First Name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Last Name")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Email")
            .located(By.id("email"));
    public static final Target BIRTH_MONTH = Target.the("Birth Month")
            .located(By.id("birthMonth"));
    public static final Target BIRTH_DAY = Target.the("Birth Day")
            .located(By.id("birthDay"));
    public static final Target BIRTH_YEAR = Target.the("Birth Year")
            .located(By.id("birthYear"));
    public static final Target BUTTON_LOCATION = Target.the("Button Location")
            .located(By.xpath("//a[@class='btn btn-blue']"));



}
