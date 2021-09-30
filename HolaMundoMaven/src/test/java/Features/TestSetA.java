package Features;

import Common.BaseTest;
import Common.Config;
import Elements.IndexElements;
import Elements.RepoWebElements;
import Utils.SeleniumUtils;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

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
        seleniumUtils.loading(driver,5000); // Espera

        //--Se valida la presencia del elemento "Tipo Actividad"
        seleniumUtils.waitElement(driver,elementsRepo.byTipoActividad);

        //Se da click en el elemento "Tipo Actividades"
        seleniumUtils.clickButton(elementsRepo.TipoActividad(driver));
        seleniumUtils.loading(driver,3000); // Espera

        //-- Se valida la presencia del elemento "Titulo Actividad"
        seleniumUtils.waitElement(driver,elementsRepo.byInputActividad);
        seleniumUtils.loading(driver,3000); // Espera

        //Se da click en el elemento "Titulo Actividades"
        seleniumUtils.clickButton(elementsRepo.NameActividad(driver));

        //Se llena el campo "Titulo Actividad"
        String title =readFile.getCellValue(Config.filepath,Config.nameSheets,0,0);
        seleniumUtils.limpiarYLlenarInput(elementsRepo.NameActividad(driver), title);
        seleniumUtils.loading(driver,3000); // Espera

        //-- Se valida la presencia del elemento "Fecha Actividad"
        seleniumUtils.waitElement(driver,elementsRepo.byFechaActividad);
        seleniumUtils.loading(driver,3000); // Espera

        //Se da click en el elemento "Fecha Actividades"
        seleniumUtils.clickButton(elementsRepo.FechaActividad(driver));

        //Se llena el campo "Fecha Actividad"
        String fecha =readFile.getCellValue(Config.filepath,Config.nameSheets,0,1);
        System.out.println(fecha);
        seleniumUtils.LlenarInput(elementsRepo.FechaActividad(driver),fecha);
        seleniumUtils.loading(driver,3000); // Espera


    }

}
