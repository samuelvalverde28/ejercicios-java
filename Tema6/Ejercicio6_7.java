public class Ejercicio6_7{
  public static void main(String[] arg){
    
    
  System.out.println("Se va a mostrar una quiniela: ");
  
  
  for (int i = 1;i<=15;i++){
    
    if (i<=9){
      System.out.print("Partido"+i+"   ");
      }else if (i>=10){
        System.out.print("Partido"+i+"  ");
        }
    

      
      for (int j = 1;j<=3;j++){
      
      int numero1 = (int)((Math.random()*3)+1);
      
      
      
    
    if (numero1 == 1){
      System.out.print(" 1 ");
      } else if (numero1 == 2){
        System.out.print(" X ");
        } else if (numero1 == 3){
          System.out.print(" 2 ");
          }
    }
      
      System.out.println();
     
    }
        

  
  }
}
