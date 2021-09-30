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

    //Elemento Tipo Actividad
    public By byTipoActividad =By.xpath("//select/option[@value='3' and contains(text(),'ADMIN-ASISTENCIA A JUNTA')]");
    public WebElement TipoActividad(WebDriver driver){
        WebElement tipoActividad = driver.findElement(byTipoActividad);
        return tipoActividad;
    }

    //Elemento Input Actividad
    public By byInputActividad =By.id("titulo-actividades");
    public WebElement NameActividad(WebDriver driver){
        WebElement nameActividad = driver.findElement(byInputActividad);
        return nameActividad;
    }

    //Elemento Input Actividad
    public By byFechaActividad =By.xpath("/html/body/div[11]/div[3]/table/tbody/tr[5]/td[5]");
    public WebElement FechaActividad(WebDriver driver){
        WebElement fechaActividad = driver.findElement(byFechaActividad);
        return fechaActividad;
    }




}
