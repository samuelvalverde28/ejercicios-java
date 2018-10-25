public class Ejercicio5_31{
  public static void main(String[] arg){
    
  System.out.print("Introce la altura con la que quieres la L: ");
  int altura = Integer.parseInt(System.console().readLine());
  
  
  for (int i = 1;i <=altura;i++){
    
    if (i != altura){
      System.out.print("*");
      System.out.println();
      
      } else if (i == altura){
        
        for (int j=1;j<= ((altura/2)+1);j++){
          System.out.print("*");
          }
        
        System.out.println();
        }
    
    
    
    }
  
  
  
  }
}  
