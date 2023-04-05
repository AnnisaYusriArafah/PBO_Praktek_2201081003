/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annisa040423;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan72NilaiTerbesar2 {
    public static void main(String[] args) {
        BufferedReader masukan = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        int terbesar = 0;
        for (int i = 1; i <= a.length; i++) {
            System.out.println("Masukkan angka " + i + ":");
            try {
                a[i-1] = Integer.parseInt(masukan.readLine());
                if (a[i-1] > terbesar) {
                    terbesar = a[i-1];
                }
            } catch (IOException e) {
            }
        }
        String hasil = "Terbesar adalah " + terbesar;
        System.out.println(hasil);
    }
}
