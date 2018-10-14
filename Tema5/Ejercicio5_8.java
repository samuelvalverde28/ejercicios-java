public class Ejercicio5_8{
  public static void main(String[] arg){
    
    
    System.out.print("Introduce el numero que quieres que sea la tabla de multiplicar: ");
    int numeromult = Integer.parseInt(System.console().readLine());
    int resultado = 0;
   
    for (int numerocontador =1 ;numerocontador <= 10; numerocontador++){
      
      resultado = numerocontador*numeromult;
      System.out.println(numeromult+" x "+numerocontador+" = "+resultado);
      }
    
    
  }
}
