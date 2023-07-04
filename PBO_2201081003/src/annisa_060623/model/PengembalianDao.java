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
public class PengembalianDao {
    private List<Pengembalian> data = new ArrayList();
    
    public PengembalianDao(){
        data.add(new Pengembalian ("02","annisa","12","malin kundang","12","23","25","2","buku"));
        data.add(new Pengembalian ("68","annisa","68","anak durhaka","26","30","4","4","sapu"));
        
    }
    
    public void insert(Pengembalian Pengembalian){
        data.add(Pengembalian);
    }
    public void update(int index,Pengembalian Pengembalian){
        data.set(index,  Pengembalian);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Pengembalian getPengembalian(int index){
        return data.get(index);
    }
    
    public List<Pengembalian>getAll(){
        return data;
    }
}
