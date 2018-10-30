public class Ejercicio6_3{
  public static void main(String[] arg){
    
    
  System.out.println("Te voy a decir una carta aleatoria de la baraja Española: ");
  
  int numero;
  int baraja;
  String rnumero = "";
  String rbaraja = "";

  
  numero = (int)((Math.random()*10)+1);
  
  switch (numero){
    
    case 1:
    rnumero = "AS";
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
    rnumero = "sota";
    break;
    
    case 9:
    rnumero = "caballo";
    break;
    
    case 10:
    rnumero = "rey";
    break;
    
    
    }
  
  
  baraja = (int)((Math.random()*4)+1);
  
  switch (baraja){
    
    case 1:
    rbaraja = "Oros";
    break;
    
    case 2:
    rbaraja = "Copas";
    break;
    
    case 3:
    rbaraja = "Espadas";
    break;
    
    case 4:
    rbaraja = "Bastos";
    break;
    
    }
  
  System.out.println(rnumero+" "+rbaraja);
  
 
  
  
  
  
  }
}
