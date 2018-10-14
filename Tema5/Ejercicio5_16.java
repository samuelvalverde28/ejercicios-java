public class Ejercicio5_16{
  public static void main(String[] arg){
    
  System.out.print("Introce un numero para saber si es primo o no: ");
  int numeroprimo = Integer.parseInt(System.console().readLine());
  int numero = 1;
  int contador = 0;
  int resultado;
  
  do{
    resultado = numeroprimo%numero;
    numero++;
    
    if (resultado == 0){
      contador++;
      }
    
    }while (numero <= numeroprimo);
    
    if (contador >2){
      System.out.print("El numero no es primo");
      }else{
        System.out.print("Es un numero primo");
        }

  
  
  }
}  
