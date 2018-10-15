public class Ejercicio5_18{
  public static void main(String[] arg){
    
  System.out.print("Introce un numero: ");
  int numero1 = Integer.parseInt(System.console().readLine());
  System.out.print("Introce el segundo numero (que sea distinto del primero): ");
  int numero2 = Integer.parseInt(System.console().readLine());
  
  
  
  if (numero1 == numero2){
    System.out.println("Introduce numeros distintos");
    
  }else{
    
    if (numero1 > numero2){
      if ((numero1-numero2)<7){
        
        System.out.println("No hay numeros de 7 en 7 que esten comprendidos entre los numeros que has puesto");
        
        }else{
          
          while (numero1 > numero2){
          System.out.println(numero2);
          numero2 = numero2+7;
          }
          
          }
        
      
      }else{
        
        if ((numero2-numero1)<7){
          System.out.println("No hay numeros de 7 en 7 que esten comprendidos entre los numeros que has puesto");
          }else{
            
            while (numero2 > numero1){
            System.out.println(numero1);
            numero1 = numero1+7;
            }
            
            }
        
        
        }
    
    
      }
  
  
  }
} 
