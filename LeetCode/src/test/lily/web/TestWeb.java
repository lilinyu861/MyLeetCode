package test.lily.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestWeb {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        //如果火狐浏览器没有默认安装在C盘，需要制定其路径ie
//        System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe");
//        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        //定义驱动对象为 FirefoxDriver 对象
//        WebDriver driver = new ChromeDriver();

//        WebDriver driver = new InternetExplorerDriver();
//        WebDriver driver = new FirefoxDriver();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WIN10);
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.110.2/wd/hub"), capabilities);
        //驱动的网址
        driver.get("http://www.baidu.com/");
        driver.findElement(By.id("kw")).sendKeys("hello");
        driver.findElement(By.id("su")).click();
        Thread.sleep(2000);
        //关闭驱动
        driver.quit();
    }
}