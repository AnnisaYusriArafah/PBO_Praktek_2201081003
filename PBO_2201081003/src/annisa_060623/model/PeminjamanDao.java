/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annisa_060623.model;
import java.util.*;
/**
 *
 * @author Slime1
 */
public class PeminjamanDao {
    private List<Peminjaman> data = new ArrayList();
    
    public PeminjamanDao(){
        data.add(new Peminjaman ("02","annisa","12","malin kundang","12","23"));
        data.add(new Peminjaman ("68","annisa","68","anak durhaka","26","30"));
        
    }
    
    public void insert(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    public void update(int index,Peminjaman peminjaman){
        data.set(index,  peminjaman);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    
    public List<Peminjaman>getAll(){
        return data;
    }
}
