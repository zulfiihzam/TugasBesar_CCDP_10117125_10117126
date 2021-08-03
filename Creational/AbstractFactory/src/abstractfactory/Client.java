package abstractfactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    
  private static Application PilihMaterial() {
    Application application;
    FactoryPerabotan factoryPerabotan;
    int product = 0;

    Scanner userinput = new Scanner(System.in);

    do{
      try{
        System.out.println("##########################");
        System.out.println("##### KATALOG  MEBEL #####");
        System.out.println("##########################");
        System.out.println("Silahkan pilih material \n" +
                           "[1] Kayu \n"+
                           "[2] Batu");
        System.out.print("Pilih : ");
        product = userinput.nextInt();
      } catch (InputMismatchException e){
        System.err.println("Silahlan masukkan angka yang tersedia "+e.getMessage());
        userinput.next();
        continue;
      }
    }
    while ((product != 1) && (product != 2));

    userinput.close();
    
    if (product == 1) {
      factoryPerabotan = new FactoryKayu();
      application = new Application(factoryPerabotan);
    } else {
      factoryPerabotan = new FactoryBatu();
      application = new Application(factoryPerabotan);
    } 
    return application;
  }
    
  public static void main(String[] args) {
    Application application = PilihMaterial();
    application.TampilKursi();
    application.TampilMeja();
  }
}
