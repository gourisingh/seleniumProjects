import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.googleSearchPage;

public class extentReportDemo {
    public static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException{
        //ExtentHtmlReporter htmlReporter = new ExtentReporter("extentReport.html");
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("Report/extentReport.html");
        extent.attachReporter(spark);

        ExtentTest test1 = extent.createTest("Google search test one");

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdirever.chrome.driver", projectPath +"/drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();

        test1.log(Status.INFO, "Searching ");
        driver.get("https://google.com");
        test1.pass("Navigated to Google page");

        WebElement textBox = driver.findElement(By.id("APjFqb"));
        textBox.sendKeys("testing");
        test1.pass("Entered the text in the searchbox");

        Thread.sleep(5);
        googleSearchPage.button_seach(driver).sendKeys(Keys.RETURN);
        Thread.sleep(5);
        test1.pass("Pressed keyboard enter key");

         driver.quit();
         //driver.close();
         test1.info("Test Completed");

         //Calling flush writes everything to the log file.
        extent.flush();

    }
}
