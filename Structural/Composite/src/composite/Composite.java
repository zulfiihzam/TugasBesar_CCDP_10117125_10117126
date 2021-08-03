package composite;

import java.util.ArrayList; 
import java.util.List; 

public class Composite implements Karyawan 
{ 
    private List<Karyawan> ListKaryawan = new ArrayList<Karyawan>(); 
       
    @Override
    public void TampilDataKaryawan()  
    { 
        for(Karyawan karyawan:ListKaryawan) 
        { 
            karyawan.TampilDataKaryawan(); 
        } 
    } 
    
    public void HapusKaryawan(Karyawan karyawan) 
    { 
        ListKaryawan.remove(karyawan); 
    } 
    
    public void TambahKaryawan(Karyawan karyawan) 
    { 
        ListKaryawan.add(karyawan); 
    } 
       
    
} 