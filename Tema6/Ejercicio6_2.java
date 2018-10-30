public class Ejercicio6_2{
  public static void main(String[] arg){
    
    
  System.out.println("Te voy a decir una carta aleatoria de la baraja francesa: ");
  
  int numero;
  int baraja;
  String rnumero = "";
  String rbaraja = "";

  
  numero = (int)((Math.random()*13)+1);
  
  switch (numero){
    
    case 1:
    rnumero = "A";
    break;
    
    case 2:
    rnumero = String.valueOf(2);
    break;
    
    case 3:
    rnumero = String.valueOf(3);
    break;
    
    case 4:
    rnumero = String.valueOf(4);
    break;
    
    case 5:
    rnumero = String.valueOf(5);
    break;
    
    case 6:
    rnumero = String.valueOf(6);
    break;
    
    case 7:
    rnumero = String.valueOf(7);
    break;
    
    case 8:
    rnumero = String.valueOf(8);
    break;
    
    case 9:
    rnumero = String.valueOf(9);
    break;
    
    case 10:
    rnumero = String.valueOf(10);
    break;
    
    case 11:
    rnumero = "J";
    break;
    
    case 12:
    rnumero = "Q";
    break;
    
    case 13:
    rnumero = "K";
    break;
    
    }
  
  
  baraja = (int)((Math.random()*4)+1);
  
  switch (baraja){
    
    case 1:
    rbaraja = "Picas";
    break;
    
    case 2:
    rbaraja = "Corazones";
    break;
    
    case 3:
    rbaraja = "Diamantes";
    break;
    
    case 4:
    rbaraja = "Trevoles";
    break;
    
    }
  
  System.out.println(rnumero+" "+rbaraja);
  
 
  
  
  
  
  }
}
