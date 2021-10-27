package Features;

import Common.BaseTest;
import Common.Config;
import Elements.IndexElements;
import Elements.RepoWebElements;
import Utils.SeleniumUtils;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class TestSetA extends BaseTest
{
    //***Instancias


    RepoWebElements elementsRepo= new RepoWebElements();
    SeleniumUtils seleniumUtils= new SeleniumUtils();

    @Test
    public void TestActividades() throws Exception
    {
        //--Se valida la presencia del elemento "Actividades"
        seleniumUtils.waitElement(driver,elementsRepo.byActividades);

        //Se da click en el elemento "Actividades"
        seleniumUtils.clickButton(elementsRepo.Actividades(driver));
        seleniumUtils.loading(driver,3000); // Espera

        //--Se valida la presencia del elemento "Agregar Actividad"
        seleniumUtils.waitElement(driver,elementsRepo.byAgregarActividad);

        //Se da click en el elemento "Agregar Actividades"
        seleniumUtils.clickButton(elementsRepo.AgregarActividad(driver));
        seleniumUtils.loading(driver,4000); // Espera

        //--Se valida la presencia del elemento "Tipo Actividad"
        seleniumUtils.waitElement(driver,elementsRepo.byTipoActividad);

        //Se da click en el elemento "Tipo Actividades"
        seleniumUtils.clickButton(elementsRepo.TipoActividad(driver));
        seleniumUtils.loading(driver,2000); // Espera

        //-- Se valida la presencia del elemento "Titulo Actividad"
        seleniumUtils.waitElement(driver,elementsRepo.byInputActividad);
        seleniumUtils.loading(driver,2000); // Espera

        //Se da click en el elemento "Titulo Actividades"
        seleniumUtils.clickButton(elementsRepo.NameActividad(driver));

        //Se llena el campo "Titulo Actividad"
        String title =readFile.getCellValue(Config.filepath,Config.nameSheets,Config.actRonda,0);
        seleniumUtils.limpiarYLlenarInput(elementsRepo.NameActividad(driver), title);
        seleniumUtils.loading(driver,2000); // Espera

        //-- Se valida la presencia del elemento "Fecha Actividad"
        seleniumUtils.waitElement(driver,elementsRepo.byFechaInActividad);
        seleniumUtils.loading(driver,2000); // Espera

        //Se da click en el elemento "Fecha Actividades"
        //seleniumUtils.clickButton(elementsRepo.FechaInActividad(driver));

        //Se llena el campo "Fecha Actividad"
        String fecha =readFile.getCellValue(Config.filepath,Config.nameSheets,Config.actRonda,1);
        System.out.println(fecha);
        ((JavascriptExecutor) driver).executeScript("document.getElementById('fechaPrueba0').value='"+fecha+"';");
        seleniumUtils.loading(driver, 2000); // Espera



        //Seleeccion de hora Inicio

        seleniumUtils.waitElement(driver, elementsRepo.bySelectItem);
        seleniumUtils.loading(driver,2000);

        String opcionEsperada = readFile.getCellValue(Config.filepath,Config.nameSheets,Config.actRonda,2);
        elementsRepo.SelectItem(driver);
        Select selectLista = new Select(elementsRepo.SelectItem(driver));
        selectLista.selectByVisibleText(opcionEsperada); // cuando el objeto es visible

        //Seleeccion de hora Fin

        seleniumUtils.waitElement(driver, elementsRepo.bySelectItem);
        seleniumUtils.loading(driver,2000);

        String opcionEsperadaF = readFile.getCellValue(Config.filepath,Config.nameSheets,Config.actRonda,3);;
        elementsRepo.SelectItemFin(driver);
        Select selectListaF = new Select(elementsRepo.SelectItemFin(driver));
        selectListaF.selectByVisibleText(opcionEsperadaF); // cuando el objeto es visible

        //Ingresar minutos fin

        seleniumUtils.waitElement(driver, elementsRepo.byInputMin);
        seleniumUtils.loading(driver,2000);

        //Se da click en el elemento "Minutos Fin"
        seleniumUtils.clickButton(elementsRepo.InputMin(driver));

        //Se llena el campo "Minutos Fin"
        String minf = readFile.getCellValue(Config.filepath,Config.nameSheets,Config.actRonda,4);
        //seleniumUtils.limpiarYLlenarInput(elementsRepo.InputMin(driver), minf);
        ((JavascriptExecutor) driver).executeScript("document.getElementById('txtMinutosFin0').value='"+minf+"';");
        seleniumUtils.loading(driver,2000); // Espera

        //-- Se valida la presencia del elemento "Usuario Para Actividad"
        seleniumUtils.waitElement(driver,elementsRepo.byUserAct);
        seleniumUtils.loading(driver,2000); // Espera

        //Se da click en el elemento "Usuario Para Actividad"
        seleniumUtils.clickButton(elementsRepo.UserAct(driver));

        //-- Se valida la presencia del elemento "Selecciona Usuario Para Actividad"
        seleniumUtils.waitElement(driver,elementsRepo.byUserSelect);
        seleniumUtils.loading(driver,2000); // Espera

        //Se da click en el elemento "Selecciona Usuario Para Actividad"
        seleniumUtils.clickButton(elementsRepo.UserSelect(driver));

        //-- Se valida la presencia del elemento "Selecciona Usuario Para Actividad"
        seleniumUtils.waitElement(driver,elementsRepo.byBtnCerrar);
        seleniumUtils.loading(driver,2000); // Espera

        //Se da click en el elemento "Selecciona Usuario Para Actividad"
        seleniumUtils.clickButton(elementsRepo.BtnCerrarct(driver));

        //-- Se valida la presencia del elemento "Comentarios"
        seleniumUtils.waitElement(driver,elementsRepo.byComment);
        seleniumUtils.loading(driver,2000); // Espera
        System.out.println("Elemento encontrado");

        //Se da click en el elemento "Comentarios"
        seleniumUtils.clickButton(elementsRepo.Comment(driver));
        System.out.println("Elemento click");

        //Se llena el campo "Comentarios"
        String comment =readFile.getCellValue(Config.filepath,Config.nameSheets,Config.actRonda,5);
        System.out.println(comment);
        seleniumUtils.limpiarYLlenarInput(elementsRepo.Comment(driver), comment);
        seleniumUtils.loading(driver,2000); // Espera

        //-- Se valida la presencia del elemento "Selecciona Usuario Para Actividad"
        seleniumUtils.waitElement(driver,elementsRepo.byGuardar);
        seleniumUtils.loading(driver,2000); // Espera

        //Se da click en el elemento "Selecciona Usuario Para Actividad"
        seleniumUtils.clickButton(elementsRepo.GuardaAct(driver));
        seleniumUtils.loading(driver,3000); // Espera

    }

}
