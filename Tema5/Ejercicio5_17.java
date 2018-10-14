public class Ejercicio5_17{
  public static void main(String[] arg){
    
  System.out.print("Introce un numero para sumar los 100 siguientes: ");
  int numero = Integer.parseInt(System.console().readLine());
  int aux = numero;
  int contador = 1;
  int resultado = 0;
 
  if (numero >=0){
    do{
      resultado = resultado + aux;
      aux++;
      contador++;    
    
    }while(contador <=100);
    
    System.out.print(resultado);
    
  }else{
    System.out.println("El numero no es postivo, por favor introduzca un numero positivo");
      }
  
  
 
  
  
  }
} 
