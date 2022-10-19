import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
       Endereço endereçoRestaurantemeu = new Endereço();
       Endereço endereçoRestaurantemeu2 = new Endereço("123546-6565", "Complemento completado");
       Endereço esdd = new Endereço("928536-699", "Complemento XX completado");

        Restaurante restaurante1 = new Restaurante();
        restaurante1.setId(1L); 
        restaurante1.setNomeFantasia("Restaurante Meu");
        restaurante1.setCnpj("000.000.0000-23");
        restaurante1.setEndereço(endereçoRestaurantemeu2);

        
        Restaurante restaurante2 = new Restaurante();
        restaurante2.setId(2L); 
        restaurante2.setNomeFantasia("Restaurante dela");
        restaurante2.setCnpj("000.040.020-23");
        restaurante2.setEndereço(esdd);

        System.out.println(restaurante1);
        System.out.println(restaurante2);
    }
}

