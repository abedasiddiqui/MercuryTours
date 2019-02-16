/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Siraj Siddiqui
 */
public class Facebook {
    public static void main (String args[]) throws Exception {
        System.setProperty("webdriver.gecko.driver", "c:\\data\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        String baseUrl="http://www.facebook.com";
        String tagName;
        driver.get(baseUrl);        
        driver.findElement(By.name("email")).sendKeys("majeed_abeda@yahoo.co.in");
        driver.findElement(By.name("pass")).sendKeys("980977");
        driver.findElement(By.id("u_0_2")).click();        
        Thread.sleep(1000);
        driver.close();
    }
}
