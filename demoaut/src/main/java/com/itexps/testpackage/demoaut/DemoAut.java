/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.testpackage.demoaut;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Siraj Siddiqui
 */
public class DemoAut {
    
   

    public static void main(String[] args) {
        // TODO code application logic here
       
            
            try{
                System.out.println("start");
                try (FileWriter fw = new FileWriter("c:\\data\\demoaut_data.txt");
                     BufferedWriter bw = new BufferedWriter(fw)) {
                    bw.write("username=mercury");
                    bw.write(";");
                    bw.write("password=mercury");
                }
                try ( //read
                        FileReader fr = new FileReader("c:\\data\\demoaut_data.txt"); 
                        BufferedReader br = new BufferedReader(fr)) {
                    String line = br.readLine();
                    String data[] = line.split(";");
                    System.out.println(data[0]);
                    System.out.println(data[1]);
                    System.out.println(line);
                    //String[] line = br.readLine().split(";");
                    //for (String l: line) {
                    // System.out.println(l);
                    //}
                    // LoginVO login = new LoginVO();
                    // login.setUsername(data[0]);  //username
                    //login.setPassword(data[1]);  //password
                    //System.out.println(login);

                }
            
            System.out.println("Exception");
            
        } catch (IOException e) {
            e.printStackTrace(System.out);

        }finally{
        System.out.println("finally");

        }
    }
    
    
}
