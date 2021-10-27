package Common;

import Utils.ReadExcelFile;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest
{
    //********** INSTANCIAS **********
    public static WebDriver driver=null;
    public ReadExcelFile readFile;
    Index indexPath =new Index();



    @Before
    public void Login () throws Exception
    {
        //Create Driver
        driver = Config.navegadorChrome();
        driver.manage().window().maximize();
        driver.get(Config.URL_QA);

        readFile = new ReadExcelFile();

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
