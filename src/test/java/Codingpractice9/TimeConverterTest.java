package Codingpractice9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeConverterTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qatimeconverter.ccbp.tech/");
        driver.manage().window().maximize();
        //TestCase:1:
        WebElement el1=driver.findElement(By.xpath("//input[@type='text'][position()=1]"));
        el1.sendKeys("2");
        WebElement el2=driver.findElement(By.xpath("//input[@type='text'][position()=2]"));
        el2.sendKeys("30");
        WebElement el3=driver.findElement(By.xpath("//button[contains(text(),'Convert to Seconds')]"));
        el3.click();
        WebElement el4=driver.findElement(By.xpath("//p[starts-with(@id,'timeIn')]"));
        String Str1=el4.getText();
        System.out.println(Str1);
        String Str2="9000s";
        if(Str1.equals(Str2)){
            System.out.println("Conversion Successful");
        }else{
            System.out.println("Conversion Failed");
        }
        el1.clear();
        el2.clear();
        //TestCase2:
        WebElement el5=driver.findElement(By.xpath("//button[contains(text(),'Convert to Seconds')]"));
        el5.click();
        WebElement el6=driver.findElement(By.xpath("//p[starts-with(@id,'error')]"));
        String Str3=el6.getText();
        System.out.println(Str3);
        String Str4="Please enter a valid number of hours.";
        if(Str3.equals(Str4)){
            System.out.println("Expected Error Message Shown");
        }else{
            System.out.println("Unexpected Error Message Shown");
        }
        //TestCase3:
        WebElement el7=driver.findElement(By.xpath("//input[@type='text'][position()=1]"));
        el7.sendKeys("1");
        WebElement el8=driver.findElement(By.xpath("//button[contains(text(),'Convert to Seconds')]"));
        el3.click();
        WebElement el9=driver.findElement(By.xpath("//p[starts-with(@id,'error')]"));
        String Str5=el9.getText();
        System.out.println(Str5);
        String Str6="Please enter a valid number of minutes.";
        if(Str5.equals(Str6)){
            System.out.println("Expected Error Message Shown");
        }else{
            System.out.println("Unexpected Error Message Shown");
        }
        el7.clear();
        //TestCase:4
        WebElement el10=driver.findElement(By.xpath("//input[@type='text'][position()=1]"));
        el10.sendKeys("1");
WebElement el11= driver.findElement(By.xpath("//input[@type='text'][position()=2]"));
        el11.sendKeys("15");
        WebElement el12=driver.findElement(By.xpath("//button[@id='convertBtn']"));
        el12.click();
        WebElement el13=driver.findElement(By.xpath("//p[starts-with(@id,'timeIn')]"));
        String Str18=el13.getText();
        System.out.println(Str18);
        String Str19="4500s";
        if(Str18.equals(Str19)){
            System.out.println("Conversion Successful");
        }else{
            System.out.println("Conversion Failed");
        }
        driver.quit();
    }
}
