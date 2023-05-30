/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annisa230523;

/**
 *
 * @author Slime1
 */
public class lanjutStudentRecord {
     public static void main(String[] args) {
        // Membuat objek ComputerScienceStudent
        StudentRecordExample student = new StudentRecordExample("Annisa", "Solok", 19, "Java", 3);

        // Mengatur nilai-nilai lainnya
        student.setMathGrade(90);
        student.setEnglishGrade(90);
        student.setScienceGrade(90);

        // Menampilkan informasi siswa
        student.print("Additional Information");

        // Menampilkan rata-rata nilai
        System.out.println("Average Grade:      " + student.getAverage());

        // Menampilkan jumlah total siswa
        System.out.println("Student Count:      " + StudentRecord.getStudentCount());
}
}


