public class Ejercicio5_13{
  public static void main(String[] arg){
    
  System.out.println("Introce 10 numeros y te determinare cuantos son positivos y cuantos negativos: ");
  
  int positivos = 0;
  int negativos = 0;
  int contador = 1;
  
  do{
    
  int numero = Integer.parseInt(System.console().readLine());
  if (numero >= 0){
    positivos++;
    } else {
      negativos++;
      } 
  contador++;
  
    }while (contador <=10);
  

  
  System.out.print("Has puesto "+positivos+" positivos y "+negativos+" negativos");

  
  
  
  
  }
}
