public class Ejercicio6_9{
  public static void main(String[] arg){
    
    
  System.out.println("Se va a mostrar una lista de numeros va a parar cuando salga el 24 y va a contar cuantos a salido: ");
  
  int numero;
  int contador = 0;
  
  do{
  
  numero = (int)(Math.random()*101);
  if (numero%2 == 0){
    contador++;
  
    System.out.println(numero);
    }
  } while (numero != 24);
  
  
  System.out.println("Han salido "+contador+" numeros");
  
  
  }
}
