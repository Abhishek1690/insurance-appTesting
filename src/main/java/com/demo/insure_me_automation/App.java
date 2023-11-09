package com.demo.insure_me_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  System.setProperty("webdriver.chrome.driver","C:\\Shallu_Java\\2_QA_Softwares\\chromedriver-win64\\chromedriver.exe");
          // Set up Chrome Parameters
           ChromeOptions ChromeOptions = new ChromeOptions();
           
           //Add configuration
          ChromeOptions.addArguments("--headless");
          //Initialize webdriver
           WebDriver driver = new ChromeDriver(ChromeOptions); 
          //open insure-me app url in browser
           driver.get("http://18.222.115.130:8081/contact.html");
           
          //locate Name and Enter Name 
           driver.findElement(By.id("inputName")).sendKeys("Abhishek");
           
         //locate Number and Enter Number
           driver.findElement(By.id("inputNumber")).sendKeys("123456789");
           
         //locate Mail and Enter mail
           driver.findElement(By.id("inputMail")).sendKeys("admin@admin.com");
           
         //locate Message and Enter Message
           driver.findElement(By.id("inputMessage")).sendKeys("Test cases");
           
         //locate send button and click on it
           driver.findElement(By.id("my-button")).click();
           
           
           String actualTitle= driver.findElement(By.id("response")).getText();
           System.out.println( actualTitle );
           
           String expectedTitle = "Message Sent";
           if (actualTitle.contentEquals(expectedTitle)){
               System.out.println("Test Passed!");
           } else {
               System.out.println("Test Failed");
           }
           
           
           driver.close();
    }
}
