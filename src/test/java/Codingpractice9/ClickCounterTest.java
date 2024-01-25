package Codingpractice9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCounterTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaclickcounter.ccbp.tech/");
        driver.manage().window().maximize();
WebElement el1=driver.findElement(By.xpath("//button[contains(text(),'Click Me!')]"));
WebElement el2= driver.findElement(By.xpath("//span[contains(text(),'0')]"));

for(int i=0;i<100;i++){
        el1.click();
    }
String str2=el2.getText();
System.out.println(str2);
String yt="100";
if(str2.equals(yt)){
    System.out.println("Click Counter App: Working as expected");
}else{
    System.out.println("Mismatch in count");
}
driver.quit();
    }

    }

