public class Ejercicio5_12{
  public static void main(String[] arg){
    
  System.out.print("Introce cuantos numeros quieres que se muestren de la serie de Fibonacci: ");
  int contador = Integer.parseInt(System.console().readLine());
  
  
  int numeropresentacion = 0;
  int numeroguardado = 1;
  int aux = 0;
  int numerocontador = 0;
  

  
  do {
    System.out.print(numeropresentacion);
    aux = numeropresentacion + numeroguardado;
    numeropresentacion = numeroguardado;
    numeroguardado = aux;
    numerocontador++;
    
    }while (numerocontador < contador);
  
  
  }
}
