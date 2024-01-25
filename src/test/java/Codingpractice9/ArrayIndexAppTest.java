package Codingpractice9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayIndexAppTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qanumberindex.ccbp.tech/");
        driver.manage().window().maximize();

        WebElement el1=driver.findElement(By.xpath("//p[contains(text(),' 17, 31, 77, 20, 63 ')]"));
        String Str1=el1.getText();
        System.out.println(Str1);
        WebElement el2=driver.findElement(By.xpath("//p[contains(text(),'17, 31, 77, 20, 63 ')]"));
        String Str3=el2.getText();
        if(Str1.equals(Str3)){
            System.out.println("Default Array Matched");
        }else{
            System.out.println("Mismatch in Default Array");
        }
  //TestCase1:
  WebElement el3=driver.findElement(By.xpath("//input[@id='userInput']"));
        el3.sendKeys("48");
  WebElement el4= driver.findElement(By.xpath("//button[@id='findBtn']"));
  el4.click();
  WebElement el5= driver.findElement(By.xpath("//span[contains(text(),'-1')]"));
  String Str4=el5.getText();
  System.out.println(Str4);
  WebElement el6= driver.findElement(By.xpath("//span[contains(text(),'-1')]"));
  String Str5="-1";
  if(Str4.equals(Str5)){
      System.out.println("Index matched for the number 48");
  }else{
      System.out.println("Index mismatched for the number 48");
  }
  el3.clear();
 //TestCase 2:
        WebElement el7=driver.findElement(By.xpath("//input[@id='userInput']"));
        el3.sendKeys("17");
        WebElement el8= driver.findElement(By.xpath("//button[@id='findBtn']"));
        el4.click();
       WebElement el9=driver.findElement(By.xpath("//span[contains(text(),'0')]"));
       String str45=el9.getText();
       WebElement el10=driver.findElement(By.xpath("//span[contains(text(),'0')]"));
       String Str12="0";
       if(str45.equals(Str12)){
           System.out.println("Index matched for the number 17");
       }else{
           System.out.println("Index mismatched for the number 17");
       }
       el3.clear();
  //TestCase3:

       WebElement el12=driver.findElement(By.xpath("//input[@id='userInput']"));
      el12.sendKeys("77");
        WebElement el17= driver.findElement(By.xpath("//button[@id='findBtn']"));
        el4.click();
        WebElement el18=driver.findElement(By.xpath("//span[contains(text(),'2')]"));
        String str13=el18.getText();
        WebElement el19=driver.findElement(By.xpath("//span[contains(text(),'2')]"));
        String str14="2";
        if(str13.equals(str14)){
            System.out.println("Index matched for the number 77");
        }else{
            System.out.println("Index mismatched for the number 77");
        }
        el3.clear();
  //Testcase4:
  WebElement el50=driver.findElement(By.xpath("//input[@id='userInput']"));
  el50.sendKeys("63");
        WebElement el34= driver.findElement(By.xpath("//button[@id='findBtn']"));
        el4.click();
        WebElement el98= driver.findElement(By.xpath("//span[contains(text(),'4')]"));
        String str76="4";
        if(el98.equals(str76)){
            System.out.println("Index matched for the number 63");
        }else{
            System.out.println("Index mismatched for the number 63");
        }
        driver.quit();

    }
}
