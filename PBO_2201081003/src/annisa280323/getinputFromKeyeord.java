/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annisa280323;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Slime1
 */
public class getinputFromKeyeord {
     public static void main(String[] args){
         BufferedReader dataIn=
                 new  BufferedReader (
                    new InputStreamReader(System.in));
         String name ="";
         int umur =0;
         try {
             System.out.print("Please enter your nsme :");
             name = dataIn.readLine();
             
             System.out.print("Age : ");
             umur =Integer.parseInt(dataIn.readLine()) ;
             
         }catch (IOException ex){
             System.out.println("Error!");
             
         }
         System.out.println("Hrllo "+ name +"!");
         System.out.println("Umur Anda "+ umur +"!");
                        
     }
}
     

