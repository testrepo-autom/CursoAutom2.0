package Common;

import Elements.IndexElements;
import Utils.SeleniumUtils;
import org.openqa.selenium.WebDriver;

public class Index
{
    //***Instancias***
    //Se crean instancias de los elementos base y las utilerias
    IndexElements elementsPath = new IndexElements();
    SeleniumUtils seleniumUtils=new SeleniumUtils();

    public void pathStandar(WebDriver driver) throws Exception
    {
        //Script de pasos de flujo estandar (Login)

        //Se llena el formulario de Login
        Thread.sleep(1000); //Espera explicita
        seleniumUtils.clickButton(elementsPath.UserInput(driver));
        seleniumUtils.limpiarYLlenarInput(elementsPath.UserInput(driver),Config.user);
        seleniumUtils.clickButton(elementsPath.PasswordInput(driver));
        seleniumUtils.limpiarYLlenarInput(elementsPath.PasswordInput(driver),Config.password);
        Thread.sleep(5000); //Espera explicita

        //Se da click en el Button Submit para enviar el formulario
        seleniumUtils.clickButton(elementsPath.ButtonSingIn(driver));
        Thread.sleep(5000); //Espera explicita

    }
}
