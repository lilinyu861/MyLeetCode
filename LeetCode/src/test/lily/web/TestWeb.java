package test.lily.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class TestWeb {

    public static void main(String[] args) {
        //如果火狐浏览器没有默认安装在C盘，需要制定其路径ie
        System.setProperty("webdriver.ie.bin","C:\\Users\\lilin\\AppData\\Local\\SogouExplorer\\IEDriverServer.exe");
        //定义驱动对象为 FirefoxDriver 对象
       // WebDriver driver = new ChromeDriver();
        WebDriver driver = new InternetExplorerDriver();
//        WebDriver driver = new FirefoxDriver();


        //驱动的网址
        driver.get("http://www.baidu.com/");

        //关闭驱动
        driver.quit();


    }
}