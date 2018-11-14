public class Ejercicio7B_1{
  public static void main(String[] arg){
    
  System.out.println("Introduce 8 numeros:");
  
  int[][] num = new int[4][7];
  
  
  num[0][0] = 0;
  num[0][1] = 30;
  num[0][2] = 2;
  num[0][5] = 5;
  num[1][0] = 75;
  num[1][4] = 0;
  num[2][2] = -2;
  num[2][3] = 9;
  num[2][5] = 11;
  
  System.out.println("Array num    Col0 col1 col2 col3 col4 col5");
  
    System.out.print("Fila 0     ");
  for (int i=0;i<=5;i++){
    System.out.printf("%5d",num[0][i]);
    } 
  System.out.println();
  System.out.print("Fila 1     ");
  for (int i=0;i<=5;i++){
    System.out.printf("%5d",num[1][i]);
    }
  System.out.println();
  System.out.print("Fila 2     ");
  for (int i=0;i<=5;i++){
    System.out.printf("%5d",num[2][i]);
    }
  System.out.println();
  
  
  
  }
}
