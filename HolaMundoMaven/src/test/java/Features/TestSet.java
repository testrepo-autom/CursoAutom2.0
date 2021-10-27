package Features;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSet
{
    private static WebDriver driver;

    @Before
    public void setUp()
    {
        //System.setProperty("webdriver.gecko.driver","src/main/resources/Drivers/FirefoxDrivers/geckodriver.exe");
        //driver =new FirefoxDriver();
        //driver.manage().window().maximize();
        //driver.get("https://www.amazon.com/");

        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/ChromeDriver/chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

    }

    @Test
    public void Test1() throws InterruptedException
    {
        WebElement inputBusqueda = driver.findElement(By.id("twotabsearchtextbox"));
        inputBusqueda.click();
        inputBusqueda.sendKeys("Alexa");
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
        Thread.sleep(2000);
        WebElement comboSelectfe = driver.findElement(By.id("a-autoid-0-announce"));
        comboSelectfe.click();
        WebElement Selectfeindex = driver.findElement(By.id("s-result-sort-select_2"));
        Selectfeindex.click();
        //inputBusqueda.submit(); a-link-normal a-text-normal
        Thread.sleep(2000);
    }

    @After
    public void tearDown() throws InterruptedException
    {
        driver.quit();
    }
}
