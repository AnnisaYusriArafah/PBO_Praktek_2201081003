/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annisa040423;

/**
 *
 * @author Slime1
 */
public class Aritmatika {
    public int tambah(int a, int b){
        return a+b;
    }
    public boolean cekBilanganGanjil(int a){
        return (a % 2==1);
    }
    public static void main (String[] args){
        Aritmatika aritmatika = new Aritmatika();
        int c= aritmatika.tambah(5,6);
        System.out.println("Nilai c = " + c);
         System.out.println("Ganjil ?" + aritmatika.cekBilanganGanjil(c));
         
    }
}
