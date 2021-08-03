package composite;

public class Kasir implements Karyawan{
  private int idkaryawan;
  private String nama;
  private String posisi;
  
  public Kasir(int idkaryawan, String nama, String posisi){
      this.idkaryawan = idkaryawan;
      this.nama = nama;
      this.posisi = posisi;
  }
  
  @Override
  public void TampilDataKaryawan() {
   System.out.println(idkaryawan + " "+ nama + " " + posisi);
  }
}
