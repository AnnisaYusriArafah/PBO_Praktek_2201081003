/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annisa040423;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/**
 *
 * @author Slime1
 */
public class latihan72NilaiTerbesar {
    public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] angka = new int[10];

    try {
      for (int i = 0; i < 10; i++) {
        String input = JOptionPane.showInputDialog(null, "Masukkan nomor ke-" + (i+1));
        angka[i] = Integer.parseInt(input);
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(null, "Input harus berupa angka");
      System.exit(1);
    }

    int maxAngka = angka[0];
    for (int i = 1; i < 10; i++) {
      if (angka[i] > maxAngka) {
        maxAngka = angka[i];
      }
    }

    JOptionPane.showMessageDialog(null, "Nomor terbesar yang Anda masukkan adalah " + maxAngka);
  }
}
