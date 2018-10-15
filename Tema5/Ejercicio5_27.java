public class Ejercicio5_27{
  public static void main(String[] arg){
    
  System.out.print("Introce un numero: ");
  int numero= Integer.parseInt(System.console().readLine());
  int contador = 1;
  int mostrar = 0;
  int suma = 0;
  
  while (contador <= numero){
    
    if (contador % 3 == 0){
      System.out.println(contador);
      mostrar++;
      suma = suma + contador;
      
      }
    
    
    
    contador++;
    
    }
  
  
  System.out.print("Entre el 1 y el "+numero+" van "+mostrar+" numeros y la suma de ellos da "+suma);
  
     
  }
    
}
