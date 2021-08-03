package abstractfactory;

public class FactoryKayu implements FactoryPerabotan{

    @Override
    public Kursi BuatKursi() {
      return new KursiKayu();
    }

    @Override
    public Meja BuatMeja() {
      return new MejaKayu();
    }
    
}
