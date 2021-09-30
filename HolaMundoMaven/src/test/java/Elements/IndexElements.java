package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexElements
{
    //Se idnetifican todos los elementos web necesarios para inicio de sesión o el path inicial,
    // a fin de no repetir en los multiples casos de prueba

    //Elementos Web Generales  (Campo de Usuario, Campo de Password, Boton de Logeo)

    public By byUserInput =By.id("numEmpleado"); //Locator del elemento del campo usuario
    public WebElement UserInput(WebDriver driver){
        WebElement userInput = driver.findElement(byUserInput); // variable que almacena el elemento encontrado
        return userInput;
    }

    public By byPasswordInput =By.id("password"); //Locator del elemento del campo password
    public WebElement PasswordInput(WebDriver driver){
        WebElement passwordInput = driver.findElement(byPasswordInput);
        return passwordInput;
    }

    public By byButtonSingIn =By.id("btn-submit"); //Locator del elemento del boton de envio
    public WebElement ButtonSingIn(WebDriver driver){
        WebElement buttonSingIn = driver.findElement(byButtonSingIn);
        return buttonSingIn;
    }

}
