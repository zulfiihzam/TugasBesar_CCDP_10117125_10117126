package abstractfactory;

public class MejaKayu implements Meja{

    @Override
    public void JumlahKaki() {
      System.out.println("Memiliki 4 kaki");
    }

    @Override
    public void Tinggi() {
      System.out.println("76 cm");
    }

    @Override
    public void Nama() {
      System.out.println("Meja Makan San Remo");
    }

    @Override
    public void Berat() {
      System.out.println("-");
    }

    @Override
    public void Panjang() {
      System.out.println("160cm");
    }

    @Override
    public void Lebar() {
      System.out.println("85 cm");
    }

    @Override
    public void Harga() {
      System.out.println("Rp 3.150.000");
    }
    
}
