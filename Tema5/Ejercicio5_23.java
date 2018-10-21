public class Ejercicio5_23{
  public static void main(String[] arg){
    
  int suma = 0;
  int numerosIN = 0;
  
  while (suma != 10000){
    
    System.out.print("Introduce numeros la suma no puede superar 10000: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero <=10000){
      
    
      suma = suma + numero;
      numerosIN++;
      
      if(suma>10000){
      System.out.println("Has superado los 10000");
      suma = suma - numero;
      numerosIN--;
      }
      
    } else{
      System.out.println("Has superado los 10000");
      }
    
    

    
    }
    double media = (double)suma / (double)numerosIN;
  
  System.out.println("Total acumulado "+suma);
  System.out.println("Numeros introducidos "+numerosIN);
  System.out.println("La media es "+media);
  
  }
}
