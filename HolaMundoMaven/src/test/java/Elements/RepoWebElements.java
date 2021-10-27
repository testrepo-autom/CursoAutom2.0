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

    //Elemento Input TestActividad
    public By byFechaInActividad =By.xpath("//div/input[@id='fechaPrueba0']");
    public WebElement FechaInActividad(WebDriver driver){
        WebElement fechaInActividad = driver.findElement(byFechaInActividad);
        return fechaInActividad;
    }

    //Elemento lista desplegable Horas _Ini
    public By bySelectItem = By.id("txtHorasIni0");
    public WebElement SelectItem (WebDriver driver)
    {
        WebElement selectItem = driver.findElement(bySelectItem);
        return selectItem;
    }

    //txtHorasFin0
    public By bySelectItemFin = By.id("txtHorasFin0");
    public WebElement SelectItemFin (WebDriver driver)
    {
        WebElement selectItemF = driver.findElement(bySelectItemFin);
        return selectItemF;
    }

    //txtMinutosFin0
    public By byInputMin =By.id("txtMinutosFin0");
    public WebElement InputMin(WebDriver driver){
        WebElement inputMin = driver.findElement(byInputMin);
        return inputMin;
    }
     // UserActivity
     public By byUserAct =By.xpath("//div/a[@class='dropdown-toggle']");
    public WebElement UserAct(WebDriver driver){
        WebElement userAct = driver.findElement(byUserAct);
        return userAct;
    }

    //EmpEX425960 UserSelect
    public By byUserSelect =By.id("EmpEX425960");
    public WebElement UserSelect(WebDriver driver){
        WebElement userSelect = driver.findElement(byUserSelect);
        return userSelect;
    }

    // BTn Cerrar

    public By byBtnCerrar =By.xpath("//a/strong/span[@title='Cerrar']");
    public WebElement BtnCerrarct(WebDriver driver){
        WebElement btnCerrar = driver.findElement(byBtnCerrar);
        return btnCerrar;
    }

    //comentario
    public By byComment =By.id("comentario");
    public WebElement Comment(WebDriver driver){
        WebElement commentAct = driver.findElement(byComment);
        return commentAct;
    }

    //btnGuardarActividad
    public By byGuardar =By.id("btnGuardarActividad");
    public WebElement GuardaAct(WebDriver driver){
        WebElement guardaAct= driver.findElement(byGuardar);
        return guardaAct;
    }


}
