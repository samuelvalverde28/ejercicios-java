public class Ejercicio5_28{
  public static void main(String[] arg){
    
  System.out.print("Introce un numero para hacer el factorial: ");
  int numero= Integer.parseInt(System.console().readLine());
  int contador = 1;
  int resultado = 1;
  do{
    
    resultado = resultado * contador;
    contador++;
    
    }while (contador <= numero);
  
  System.out.print("Tu factorial es "+resultado);
  
     
  }
    
}
