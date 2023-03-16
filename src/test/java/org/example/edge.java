package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge {
    public static void main (String[] args){
        WebDriver driver = new EdgeDriver();
        driver.get("https://codeforces.com/enter?back=%2Fprofile%2Flogin");
        driver.findElement(By.id("handleOrEmail")).sendKeys("klucse2000031772@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Poojitha@123");
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("font-size:1.1rem;")).click();
    }
}