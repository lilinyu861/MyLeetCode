package test.lily.web;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class TestWeb {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        //设置chrome浏览器驱动位置以及浏览器位置

        System.setProperty("webdriver.chrome.driver","D:\\software\\QQBrowser\\chromedriver.exe");
        System.setProperty("webdriver.chrome.bin","D:\\software\\QQBrowser\\QQBrowser.exe");
        //定义驱动对象为 ChromeDriver 对象
//        ChromeOptions options = new ChromeOptions();
//        options.setBinary("D:\\software\\QQBrowser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //驱动的网址
        driver.get("http://www.baidu.com/");
        //关闭驱动
        driver.quit();
    }
        /*
public static void main(String[] args) {

    //指定IEDriverServer.exe的位置
    System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe");
    //定义驱动对象为IE对象
    WebDriver driver = new InternetExplorerDriver();
    //驱动的网址
    driver.get("http://www.baidu.com/");
    //关闭驱动
    driver.quit();
}*/
        /*
public static void main(String[] args) {
    //打开默认路径的firefox（路径指的是 firefox 的安装路径）
//    WebDriver diver = new FirefoxDriver();
    //打开指定路径的firefox,方法1
    System.setProperty("webdriver.firefox.bin","D:\\ProgramFiles\\Mozilla Firefox\\firefox.exe");
    WebDriver dr = new FirefoxDriver();
}
*/
}


