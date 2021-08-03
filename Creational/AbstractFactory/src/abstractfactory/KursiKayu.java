package abstractfactory;

public class KursiKayu implements Kursi{

    @Override
    public void JumlahKaki() {
      System.out.println("Memiliki 4 kaki");
    }

    @Override
    public void Tinggi() {
      System.out.println("95 cm");
    }

    @Override
    public void Nama() {
      System.out.println("EKEDALEN Kursi kayu oak");
    }

    @Override
    public void Berat() {
      System.out.println("6.5 kg");
    }

    @Override
    public void Lebar() {
      System.out.println("43 cm");
    }

    @Override
    public void Harga() {
      System.out.println("Rp874.500");
    }
    
}
