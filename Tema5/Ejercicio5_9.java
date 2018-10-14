public class Ejercicio5_9{
  public static void main(String[] arg){
    
    
    System.out.print("Introduce un numero: ");
    int numero = Integer.parseInt(System.console().readLine());
    int digitos = 1;
   
   if (numero <10){
     
     System.out.println("Tu numero tiene "+digitos+" digitos");
     
    }else{
   
      do {
        numero = numero/10;
        digitos++;
     
      } while (numero > 10);
      
     System.out.println("Tu numero tiene "+digitos+" digitos");
     
    }
    
  }
}
