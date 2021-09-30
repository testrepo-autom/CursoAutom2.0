package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RepoWebElements
{
    //Se idnetifican todos los elementos web necesarios para inicio de sesión o el path inicial,
    // a fin de no repetir en los multiples casos de prueba

    //Elementos Web de Testing

    public By byActividades =By.id("actividadesUsuario"); //Locator del elemento
    public WebElement Actividades(WebDriver driver){
        WebElement actividadesOption = driver.findElement(byActividades); // variable que almacena el elemento encontrado
        return actividadesOption;
    }

    public By byAgregarActividad =By.xpath("//a/span[@class='glyphicon glyphicon-plus-sign']");
    public WebElement AgregarActividad(WebDriver driver){
        WebElement addActividad = driver.findElement(byAgregarActividad);
        return addActividad;
    }

}
