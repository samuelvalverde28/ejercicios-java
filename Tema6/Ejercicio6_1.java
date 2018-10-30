public class Ejercicio6_1{
  public static void main(String[] arg){
    
    
  System.out.println("Se va a mostrar el resultado de tres dados al azar y la suma: ");
  
  int numero;
  int aux = 0;
  
  for (int i = 1;i<=3;i++){
  
  numero = (int)((Math.random()*6)+1);
  aux = aux + numero;
  
  System.out.println(numero);
  }
  System.out.println("La suma de los tres dados es "+aux);
  
  
  }
}
