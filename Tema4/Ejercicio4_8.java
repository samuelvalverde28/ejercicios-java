public class Ejercicio4_8{
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
  
  if (media < 5) {
    System.out.println("Tu nota media : "+media+" , por lo tanto es -Insuficiente-"); 
    } else if (media >=5 && media <6){
     System.out.println("Tu nota media : "+media+" , por lo tanto es -Suficiente-"); 
      } else if (media >=6 && media <7){
     System.out.println("Tu nota media : "+media+" , por lo tanto es -Bien-"); 
      } else if (media >=7 && media <9){
     System.out.println("Tu nota media : "+media+" , por lo tanto es -Notable-"); 
      } else if (media >=9 && media <=10){
     System.out.println("Tu nota media : "+media+" , por lo tanto es -Sobresaliente-"); 
      } else {
          System.out.println("Imposible no puede superar 10"); 
        }
  
    
  }
}
