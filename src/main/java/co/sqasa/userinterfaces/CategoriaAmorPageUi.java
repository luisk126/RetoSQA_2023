package co.sqasa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriaAmorPageUi extends PageObject {

        public static final Target LBL_AMOR = Target.the("Label_Amor").located(By.xpath("//div[@id='content']/h1[@class='page-title']"));
        public static final String TITLE_AMOR = "AMOR";

        public static final Target BTN_IMAGEN_PRODUCTO_UNO = Target.the("Imagen_Prodcuto1").located(By.cssSelector("a[title='MDF 0001'] > img"));
        public static final Target BTN_AGREGAR_PRODUCTO_UNO = Target.the("Agregar_Producto1").located(By.xpath("//body/div[@id='wrapper-container']/div[@id='tbay-main-content']/section[@id='main-container']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/figure[1]/div[1]/div[1]/a[1]"));
}
