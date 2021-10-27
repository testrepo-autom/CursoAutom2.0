package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Config
{
    // Enviromets
    public static String URL_QA = "http://systemtest.telcel.com:18282/MigraPlus2/pantallaActividades/visualizarPantallaActividades/normal/0/vacio#";
    private static String URL_Dev = "http://automationpractice.com/index.php";
    public static String URL_DRAGANDDROP="https://jqueryui.com/droppable/";


    //Credenciales
    public static String user ="EX425960";
    public static String password="30pR2929";

    //Files
    public static String filepath = "src/main/resources/Files/actividades.xlsx";
    public static String nameSheets="Sheet1";
    public static int actRonda=5;


    public static WebDriver navegadorChrome ()
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDriver/chromedriver.exe");
        return new ChromeDriver();
    }

    public static WebDriver navegadorFirefox ()
    {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/Drivers/FirefoxDrivers/geckodriver.exe");
        return new FirefoxDriver();
    }
}
