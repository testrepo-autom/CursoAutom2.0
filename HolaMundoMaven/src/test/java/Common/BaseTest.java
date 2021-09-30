package Common;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest
{
    //********** INSTANCIAS **********
    public static WebDriver driver=null;
    Index indexPath =new Index();


    @Before
    public void Login () throws Exception
    {
        //Create Driver
        driver = Config.navegadorFirefox();
        driver.manage().window().maximize();
        driver.get(Config.URL_QA);

        //Llamado del metodo estandar que contiene el flujo automatizado (Ej. Login)
        indexPath.pathStandar(driver);

    }
    @After
    public void tearDown()
    {
        //Cierra la instancia del navegador
        driver.quit();

    }
}
