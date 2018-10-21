public class Ejercicio5_20{
  public static void main(String[] arg){
    
  System.out.print("Introce la altura que tenga la piramide: ");
  int altura = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introce el caracter con el es que va a ver: ");
  String caracter = System.console().readLine();
  
  int espacios = altura - 1;
  int espacios2 = 0;
  
  for (int i = 1;i < altura;i++){
    
    for (int j = 1;j <= espacios ;j++){
      System.out.print(" ");
      }
      
    System.out.print(caracter);
    
    for (int j = 1;j < espacios2 ;j++){
      System.out.print(" ");
      }
    
    if (i >1){
      System.out.print(caracter);
      }  
     
      
    System.out.println();
    espacios--;
    espacios2 +=2;
    
    
    
    }
 
  for (int j = 1;j < (altura*2);j++){
      System.out.print(caracter);
      } 
  
  
  }
} 
