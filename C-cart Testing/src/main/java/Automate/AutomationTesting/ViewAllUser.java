package Automate.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class ViewAllUser 
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
       driver.findElement(By.xpath("/html/body/div/nav[2]/div/div/div/div[2]/a")).click();
       
       Thread.sleep(1000);
       driver.findElement(By.id("product")).click();
       
       Thread.sleep(4000);
       driver.findElement(By.id("name")).click();
       
       Thread.sleep(1000);
       driver.findElement(By.id("logout")).click();
       
      Thread.sleep(2000); //Adding throws InterruptedException
      //Closing the Browser
      driver.close();
    }
}
