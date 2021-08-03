package composite;

public class Client {
  public static void main (String[] args) {
    Pramuniaga pramuniaga1 = new Pramuniaga(102, "Udin", "Senior Pramuniaga");
    Pramuniaga pramuniaga2 = new Pramuniaga(109, "Ujang", "Junior Pramuniaga");
    
    Composite compositepramuniaga = new Composite();
    
    compositepramuniaga.TambahKaryawan(pramuniaga1);
    compositepramuniaga.TambahKaryawan(pramuniaga2);
    
    Kasir kasir1 = new Kasir(728, "Nia Kurnia", "Junior Kasir");
    
    Composite compositekasir = new Composite();
    
    compositekasir.TambahKaryawan(kasir1);
    
    KepalaToko kepalaToko = new KepalaToko(198, "Ko Delwin", "Senior Kepala Toko");
    
    Composite compositekepalatoko = new Composite();
    
    compositekepalatoko.TambahKaryawan(kepalaToko);
    
    Composite composite = new Composite();
    
    composite.TambahKaryawan(compositepramuniaga);
    composite.TambahKaryawan(compositekasir);
    composite.TambahKaryawan(compositekepalatoko);
    
    composite.TampilDataKaryawan();
  }
}
