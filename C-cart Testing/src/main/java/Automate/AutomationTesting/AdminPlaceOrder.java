package Automate.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class AdminPlaceOrder 
{
    public static void main( String[] args ) throws InterruptedException
    {
       WebDriver driver=new ChromeDriver();
       driver.get("http://localhost:3000");
       //driver makes window full size
       driver.manage().window().maximize();
       
       //driver delete all cookies
       driver.manage().deleteAllCookies();
      
       System.out.println(driver.getTitle());
       System.out.println("You are in testing Phase");
       System.out.println( driver.getCurrentUrl());
      
       //click on login button
       Thread.sleep(2000);
      driver.findElement(By.id("login")).click();
      
      //Filling Email id
       Thread.sleep(1000);
       driver.findElement(By.id("email")).sendKeys("abhayrajsinghpawar@gmail.com");
      
       //Filling Password
       Thread.sleep(1000);
       driver.findElement(By.id("pass")).sendKeys("1229");
       
       //Click on submit button
       Thread.sleep(1000);
       driver.findElement(By.id("btn")).click();
       
       Thread.sleep(1000);
       driver.findElement(By.xpath("/html/body/div/main/div/div/div/div[1]/div/div/div")).click();
      // driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[1]/div/div/div"));
      
      Thread.sleep(1000);
      driver.findElement(By.xpath("/html/body/div/main/div/div/div[2]/div[4]/div/div/div[3]/div/div[2]/select/option[5]")).click();
      
      
      Thread.sleep(1000);
      driver.findElement(By.xpath("/html/body/div/main/div/div/div[2]/div[4]/div/div/div[4]/a")).click();
      
      //click on Proceed to Pay
      Thread.sleep(1000);
      driver.findElement(By.id("ProceedToPay")).click();
      
      //clicking on shipping button 
      Thread.sleep(1000);
      driver.findElement(By.id("ShippingButton")).click();
      
      //pressing payment method button
      Thread.sleep(1000);
      driver.findElement(By.id("btn")).click();
      
      //click on PlaceOrder
      Thread.sleep(1000);
      driver.findElement(By.id("PlaceOrder")).click();
      
      Thread.sleep(1000);
      driver.findElement(By.id("name")).click();
      
      Thread.sleep(1000);
      driver.findElement(By.id("logout")).click();
      
      Thread.sleep(2000); //Adding throws InterruptedException
      //Closing the Browser
      driver.close();
    }
}
