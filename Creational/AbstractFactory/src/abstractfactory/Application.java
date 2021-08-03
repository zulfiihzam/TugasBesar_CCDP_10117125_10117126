package abstractfactory;

public class Application {
  private Kursi kursi;
  private Meja meja;

  public Application(FactoryPerabotan factoryPerabotan) {
    kursi = factoryPerabotan.BuatKursi();
    meja = factoryPerabotan.BuatMeja();
  }
  
  public void TampilMenu(){
    System.out.println("Daftar perabotan dengan material yang tersedia");
  }
  
  public void TampilKursi(){
    System.out.println("##### Daftar Kursi #####");
    System.out.print("Nama        : ");
    kursi.Nama();
    System.out.print("##### Spesifikasi #####\n");
    System.out.print("Tinggi      : ");
    kursi.Tinggi();
    System.out.print("Berat       : ");
    kursi.Berat();
    System.out.print("Lebar       : ");
    kursi.Lebar();
    System.out.print("Jumlah Kaki : ");
    kursi.JumlahKaki();
    System.out.print("Harga       : ");
    kursi.Harga();
  }
  
  public void TampilMeja(){
    System.out.println("\n##### Daftar Meja #####");
    System.out.print("Nama        : ");
    meja.Nama();
    System.out.print("##### Spesifikasi #####\n");
    System.out.print("Panjang     : ");
    meja.Tinggi();
    System.out.print("Tinggi      : ");
    meja.Tinggi();
    System.out.print("Berat       : ");
    meja.Berat();
    System.out.print("Lebar       : ");
    meja.Lebar();
    System.out.print("Jumlah Kaki : ");
    meja.JumlahKaki();
    System.out.print("Harga       : ");
    meja.Harga();
  }
}
