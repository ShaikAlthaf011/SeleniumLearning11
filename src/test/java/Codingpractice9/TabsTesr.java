package Codingpractice9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TabsTesr {
    public static void main(String[] args) {
        try{
            System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("https://qatabs.ccbp.tech/");
            driver.manage().window().maximize();
    //TestCase:1:
            WebElement el1=driver.findElement(By.xpath("//button[starts-with(@id,'about')]"));
            el1.click();
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(@id,'about')]")));
           WebElement el2=driver.findElement(By.xpath("//p[@id='aboutTabContent']"));
           String Str1=el2.getText();
           System.out.println(Str1);
           WebElement el3=driver.findElement(By.xpath("//p[contains(text(),'Varanasi is one of the oldest living cities in the world')]"));
           String Str2=el3.getText();
           if(Str1.equals(Str2)){
               System.out.println("About Content Matches");
           }else{
               System.out.println("Mismatch in the 'About' Content");
           }
    //TestCase:2:
           WebElement el4=driver.findElement(By.xpath("//button[starts-with(@id,'timeToVisit')]"));
           el4.click();
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(@id,'timeToVisit')]")));
           WebElement el5=driver.findElement(By.xpath("//p[starts-with(@id,'timeToVisit')]"));
           String Str3=el5.getText();
           System.out.println(Str3);
           WebElement el6=driver.findElement(By.xpath("//p[contains(text(),'October to March')]"));
           String Str4=el6.getText();
           if(Str3.equals(Str4)){
               System.out.println("Time to Visit Content Matched");
           }else{
               System.out.println("Mismatch in the 'Time to Visit' Content");
           }
    //TestCase:3:
         WebElement el7=driver.findElement(By.xpath("//button[starts-with(@id,'attractions')]"));
           el7.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(@id,'attractions')]")));
            WebElement el8=driver.findElement(By.xpath("//p[starts-with(@id,'attractions')]"));
            String Str8=el8.getText();
            System.out.println(Str8);
            WebElement e19=driver.findElement(By.xpath("//p[contains(text(),'When visiting Varanasi')]"));
            String Str10=e19.getText();
            if(Str8.equals(Str10)){
                System.out.println("Attractions Content Matched");
            }else{
                System.out.println("Mismatch in the 'Attractions' Content");
            }
            driver.quit();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}
