package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo_GoogleSearch {

    public static WebDriver driver = null;

//    public static void main(String[] args) throws InterruptedException {
//        googleSearch();
//
//    }
    @BeforeTest
    public void setUpDriver(){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdirever.chrome.driver", projectPath +"/drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();

    }
    @Test
    public void googleSearch_TstNG() throws InterruptedException {
        //go to google
        driver.get("http://google.com");

        //enter text in search textbox
         driver.findElement(By.name("q")).sendKeys("testing");
        //driver.findElement(By.name("btnk")).click();
         Thread.sleep(5);
         driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

    }

    @AfterTest
    public void tearDownTest(){
        //close browser
        driver.close();
        driver.quit();
        System.out.println("Test Completed Successfully");

    }

    public static void googleSearch() throws InterruptedException{

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdirever.chrome.driver", projectPath +"/drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();

        //go to google
        driver.get("http://google.com");

        //enter text in search textbox
       // driver.findElement(By.name("q")).sendKeys("testing");
        //driver.findElement(By.name("btnk")).click();
       // Thread.sleep(5);
     //   driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

       googleSearchPage.textbox_search(driver).sendKeys("Testing");
        Thread.sleep(5);
        googleSearchPage.button_seach(driver).sendKeys(Keys.RETURN);
        Thread.sleep(5);
        driver.close();


    }

}
