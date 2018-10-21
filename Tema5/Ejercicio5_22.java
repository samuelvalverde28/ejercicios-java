public class Ejercicio5_22{
  public static void main(String[] arg){
    
  System.out.print("Numeros primos del 2 al 100: ");
  int numeroprimo = 2;
  int numero = 1;
  int contador = 0;
  int resultado;
  
  do{
  
  contador = 0;
  numero = 1;
  do{
    resultado = numeroprimo%numero;
    numero++;
    
    if (resultado == 0){
      contador++;
      }
    
    }while (numero <= numeroprimo);
    
    if (contador <=2){
      
    System.out.print(numeroprimo+" ");
    }
    
    numeroprimo++;
  
  }while (numeroprimo<=100);
  
  }
}  

