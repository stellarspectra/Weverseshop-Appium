package io.weverseshop.weverseshopTest;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class weverseshop_TC1 {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Weverseshop";
    //protected AndroidDriver<AndroidElement> driver = null;
    public AndroidDriver driver;
    
    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "");
       // driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testWeverseshop() {
        driver.findElement(By.xpath("//*[@text='Weverse Shop']")).click();
       // new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='BTS GLOBAL 뷁']")));
        //driver.swipe(577, 1522, 491, 758, 1296);
        driver.findElement(By.xpath("//*[@id='saleImageView' and (./preceding-sibling::* | ./following-sibling::*)[@id='optionLayout'] and ./parent::*[@id='product1Layout']]")).click();
        driver.findElement(By.xpath("//*[@text='Buy Now']")).click();
       // new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='plusOptionImageView']")));
        driver.findElement(By.xpath("//*[@id='plusOptionImageView']")).click();
        driver.findElement(By.xpath("//*[@text='Buy Now']")).click();
        driver.findElement(By.xpath("//*[@id='changeTextView']")).click();
        driver.findElement(By.xpath("//*[@id='topNameEditText']")).sendKeys("Paula");
        driver.findElement(By.xpath("//*[@id='bottomNameEditText']")).sendKeys("Almenar");
        driver.findElement(By.xpath("//*[@text='Select country/region']")).click();
        driver.findElement(By.xpath("//*[@text='Argentina']")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        try{Thread.sleep(2000);} catch(Exception ignore){}
        driver.findElement(By.xpath("//*[@id='addressEditText']")).sendKeys("Gaebeler 698");
       // driver.pressKeyCode(AndroidKeyCode.BACK);
       // driver.swipe(388, 2077, 222, -2, 1268);
        driver.findElement(By.xpath("//*[@id='cityEditText']")).sendKeys("Lanus");
        driver.findElement(By.xpath("//*[@id='stateEditText']")).sendKeys("Buenos Aires");
        driver.findElement(By.xpath("//*[@id='zipCodeEditText']")).sendKeys("1824");
        driver.findElement(By.xpath("//*[@id='phoneNumberEditText']")).sendKeys("1137652650");
        driver.findElement(By.xpath("//*[@text='I consent to the Terms of Use above and would like to enter the shipping address.']")).click();
        driver.findElement(By.xpath("//*[@text='Save']")).click();
        driver.findElement(By.xpath("//*[@text='Cancel']")).click();
        driver.findElement(By.xpath("//*[@id='beckImageView']")).click();
        driver.findElement(By.xpath("//*[@id='beckImageView']")).click();
       // driver.pressKeyCode(AndroidKeyCode.BACK);
        driver.findElement(By.xpath("//*[@id='beckImageView']")).click();
       // new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='MEMBERSHIP']")));
        driver.findElement(By.xpath("//*[@text='MEMBERSHIP']")).click();
        //driver.swipe(716, 1488, 652, 600, 1477);
        //driver.swipe(861, 1822, 719, 838, 3480);
        driver.findElement(By.xpath("//*[@id='saleImageView' and (./preceding-sibling::* | ./following-sibling::*)[@id='optionLayout'] and (./preceding-sibling::* | ./following-sibling::*)[@text='MERCH BOX #10'] and ./parent::*[@id='product1Layout']]")).click();
        driver.findElement(By.xpath("//*[@text='Buy Now']")).click();
        driver.findElement(By.xpath("//*[@text='Join Membership']")).click();
       // new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='ARMY MEMBERSHIP: MERCH PACK']")));
        driver.findElement(By.xpath("//*[@text='ARMY MEMBERSHIP: MERCH PACK']")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}