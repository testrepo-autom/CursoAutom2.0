package Features;

import Common.BaseTest;
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
        //Se valida la presencia del elemento "Actividades"
        seleniumUtils.waitElement(driver,elementsRepo.byActividades);

        //Se da click en el elemento "Actividades"
        seleniumUtils.clickButton(elementsRepo.Actividades(driver));
        seleniumUtils.loading(driver,3000); // Espera

        //Se valida la presencia del elemento "Agregar Actividad"
        seleniumUtils.waitElement(driver,elementsRepo.byAgregarActividad);

        //Se da click en el elemento "Actividades"
        seleniumUtils.clickButton(elementsRepo.AgregarActividad(driver));
        seleniumUtils.loading(driver,3000); // Espera

    }

}
