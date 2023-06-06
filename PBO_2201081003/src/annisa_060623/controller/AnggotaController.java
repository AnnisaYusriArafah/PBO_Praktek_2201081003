/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annisa_060623.controller;
import annisa_060623.view.FromAnggota;
import annisa_060623.model.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
/**
 *
 * @author Slime1
 */
public class AnggotaController {
    private FromAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    
    public AnggotaController(FromAnggota formAnggota){
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDao();
        
    }
    public void clearForm(){
        formAnggota.gettxtkode().setText("");
        formAnggota.gettxtnama().setText("");
        formAnggota.gettxtalamat().setText("");
        formAnggota.getcbojenkel().removeAllItems();
        formAnggota.getcbojenkel().addItem("L");
        formAnggota.getcbojenkel().addItem("P");
      
        
    }
    public void tampil(){
       DefaultTableModel tabelModel = (DefaultTableModel) 
               formAnggota.gettabelanggota().getModel();
       tabelModel.setRowCount(0);
       List<Anggota> list =anggotaDao.getAll();
       for (Anggota a : list){
        Object [] row ={
            a.getKodeAnggota(),
            a.getNamaAnggota(),
            a.getAlamat(),
            a.getJenisKelamin(),
            
        };
        tabelModel.addRow(row);
        
    }
           
    }
    
}
