package calculator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

   // MobileDriver driver;
    static AppiumDriver <MobileElement> driver;

    public static void main(String[] args) throws InterruptedException {
        try {
            openCalculator();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println( e.getCause() );
            System.out.println(e.getMessage() );
        }

        try {
            openAbDirect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println(e.getCause() );
            System.out.println(e.getMessage() );
        }

        try {
            openCameraTakeSelfie();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println(e.getCause() );
            System.out.println(e.getMessage());
        }


    }

    public static void openCalculator() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Galaxy Note9");
        cap.setCapability("udid", "288066ca1b047ece");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9");
        cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);

        System.out.println("Application Starts");

        MobileElement five = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
        MobileElement multiply = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul"));
        MobileElement one = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01"));
        MobileElement zero = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_00"));
        MobileElement plus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
        MobileElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
        MobileElement equals = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
        MobileElement result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));

        five.click();
        multiply.click();
        one.click();
        zero.click();
        zero.click();
        zero.click();
        plus.click();
        two.click();
        five.click();
        equals.click();

        String res = result.getText();

        System.out.println("Total : "+ res);
    }

    public static void openAbDirect() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Galaxy Note9");
        cap.setCapability("udid", "288066ca1b047ece");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9");
        cap.setCapability("appPackage", "com.brainstation23.ib.abbl");
        cap.setCapability("appActivity", "com.brainstation23.ib.abbl.ui.activities.SplashActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);

        System.out.println("Application Starts");
    }

    public static void openCameraTakeSelfie() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Galaxy Note9");
        cap.setCapability("udid", "288066ca1b047ece");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9");
        cap.setCapability("appPackage", "com.sec.android.app.camera");
        cap.setCapability("appActivity", "com.sec.android.app.camera.Camera");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);

        System.out.println("Application Starts");

        MobileElement cameraSwivel = driver.findElement(By.xpath("(//GLButton[@content-desc=\"NONE\"])[7]"));
        MobileElement takePictureButton = driver.findElement(By.xpath("(//GLButton[@content-desc=\"NONE\"])[8]"));

        cameraSwivel.click();
        Thread.sleep(3000);
        takePictureButton.click();
    }




}
