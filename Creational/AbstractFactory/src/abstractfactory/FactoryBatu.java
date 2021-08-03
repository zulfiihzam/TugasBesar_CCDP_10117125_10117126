package abstractfactory;

public class FactoryBatu implements FactoryPerabotan{

    @Override
    public Kursi BuatKursi() {
      return new KursiBatu();
    }

    @Override
    public Meja BuatMeja() {
      return new MejaBatu();
    }
    
}
