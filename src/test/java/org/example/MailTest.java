package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MailTest {

        public  static void main(String[] args){

            System.setProperty("webdriver.gecko.driver", "C:\\Users\\enzokid\\Documents\\GitHub\\Automated_test_tasks\\drivers\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            driver.get("https://yandex.ru/");

            driver.findElement(By.xpath("//button[@class=\"sc-pNWxx sc-jrsJCI dryRrI emsrNO\"]")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/a")).click();

            driver.findElement(By.xpath("//span[@class=\"Textinput Textinput_view_floating-label Textinput_size_l\"]/input[1]")).sendKeys("leader.test1");

            driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/div[1]/form/div[3]/button")).click();


        }
}

