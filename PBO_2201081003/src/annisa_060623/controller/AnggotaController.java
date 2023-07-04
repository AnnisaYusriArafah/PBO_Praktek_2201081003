/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annisa_060623.controller;
import annisa_060623.view.FromAnggota;
import annisa_060623.model.Anggota;
import annisa_060623.model.AnggotaDao;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
/**
 * 
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
    public void saveAnggota(){
        anggota = new Anggota();
        anggota.setKodeAnggota(formAnggota.gettxtkode().getText());
        anggota.setNamaAnggota(formAnggota.gettxtnama().getText());
        anggota.setAlamat(formAnggota.gettxtalamat().getText());
        anggota.setJenisKelamin(formAnggota.getcbojenkel().
                getSelectedItem().toString());
        anggotaDao.insert(anggota);
        JOptionPane.showMessageDialog(formAnggota,"insert OK");
        
    }
    
    public void updateAnggota(){
        int index = formAnggota.gettabelanggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        anggota.setKodeAnggota(formAnggota.gettxtkode().getText());
        anggota.setNamaAnggota(formAnggota.gettxtnama().getText());
        anggota.setAlamat(formAnggota.gettxtalamat().getText());
        anggota.setJenisKelamin(formAnggota.getcbojenkel().
                getSelectedItem().toString());
        anggotaDao.update(index, anggota);
        JOptionPane.showMessageDialog(formAnggota,"Update OK");
    }
    
    public void getAnggota(){
        int index = formAnggota.gettabelanggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota!=null){
            formAnggota.gettxtkode().setText(anggota.getKodeAnggota());
            formAnggota.gettxtnama().setText(anggota.getNamaAnggota());
            formAnggota.gettxtalamat().setText(anggota.getAlamat());
            formAnggota.getcbojenkel().addItem(anggota.getJenisKelamin());
        }
    }
    
    public void deleteAnggota(){
        int index = formAnggota.gettabelanggota().getSelectedRow();
        anggotaDao.delete(index);
         JOptionPane.showMessageDialog(formAnggota,"Delete OK");  
    }
    
}
