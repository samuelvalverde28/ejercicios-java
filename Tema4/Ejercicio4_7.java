public class Ejercicio4_7{
  public static void main(String[] arg){
    
  String numero;
  
  System.out.println("Introduzca la primera nota: ");
  numero = System.console().readLine();
  double numero1 = Double.parseDouble(numero);
  
  System.out.println("Introduzca la segunda nota: ");
  numero = System.console().readLine();
  double numero2 = Double.parseDouble(numero);
  
  System.out.println("Introduzca la tercera nota: ");
  numero = System.console().readLine();
  double numero3 = Double.parseDouble(numero);
  
  double media;
  
  
  media = (numero1+numero2+numero3)/3;
  
    
  System.out.println("La nota media de las tres notas es: "+media); 
  
  
    
  }
}
