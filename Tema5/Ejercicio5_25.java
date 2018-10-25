public class Ejercicio5_25{
  public static void main(String[] arg){
    
  System.out.print("Introduce un numero para que te lo diga al revés: ");
  int numero = Integer.parseInt(System.console().readLine());
  
  
  int aux = numero;
  int numeroalreves = 0;
  
  while (aux > 0){
    numeroalreves  = (numeroalreves*10) + (aux%10);
    aux /=10;
    
    
    
    }
  
  System.out.print("Tu numero al reves es: "+numeroalreves);
  }
}
