package co.sqasa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomaPageUi extends PageObject {

        public static final Target BTN_AMOR = Target.the("Boton_Pestaña_Amor").located(By.xpath("//ul[@id='primary-menu']//a[@href='https://www.floristeriamundoflor.com/product-category/amor/']"));
        public static final String TITLE_ = "";

}
