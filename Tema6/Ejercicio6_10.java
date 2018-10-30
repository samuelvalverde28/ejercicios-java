public class Ejercicio6_10{
  public static void main(String[] arg){
    
    
  System.out.println("Se va a mostrar 10 filas con caracteres especiales y en cada fila de 1 a 40 caracteres: ");
  
  int numero;
  String caracter = "";
  
  for (int i = 1;i<=10;i++){
    
  int fila = (int)((Math.random()*40)+1);
    
    for (int j = 1;j <= fila;j++){
  
  numero = (int)((Math.random()*6)+1);
  
  switch (numero){
    
    case 1:
    caracter = " * ";
    break;
    
    case 2:
    caracter = " - ";
    break;
    
    case 3:
    caracter = " = ";
    break;
    
    case 4:
    caracter = ".";
    break;
    
    case 5:
    caracter = " | ";
    break;
    
    case 6:
    caracter = " @ ";
    break;
  
  
  
      }
  
      System.out.print(caracter);
    }
  
    System.out.println();
  
  }
  
  
}
}
