/**
* Es saber si el ascensor puede subir o no, maximo de personas 6 y maximo de peso 450;
*
* @author Samuel Valverde Garcia
*/


public class Ejercicio{
  public static void main(String[] arg){
    int salir = 1;
    
    while (salir != 0){
       salir = peso();
      
      }
    
    System.out.println("Ya podeis subir");
  
  }
  
  
  public static int peso(){
  
  System.out.println("Introduce el numero de personas que vais a entrar en el ascensor:");
  int numper = Integer.parseInt(System.console().readLine());
  
  
  int totalpeso = 0;
  
  for (int i=1;i<=numper;i++){
      System.out.println("Introduce el peso de la persona "+i);
      int peso = Integer.parseInt(System.console().readLine());
      totalpeso = totalpeso + peso;
      }
  
  int num = 2;
  if (numper <= 6){
    num = num -1;
    } else {
      System.out.println("En el ascensor hay mas de 6 personas, el maximo es 6, por favor que "+(numper-6)+" se bajen");
      }
    
  if (totalpeso <= 450){
    num = num -1;
    } else {
      System.out.println("En el ascensor hay mas de 450 kilos, el maximo es 450 kilos, por favor se tiene que quedar libre "+(totalpeso-450)+" Kilos");
      }
  
  return num;
  
  }
  
  
  
}




