public class Ejercicio5_7{
  public static void main(String[] arg){
    
    
    int contraseña = 0;
    int contador = 4;
    
    do {
      System.out.println("Introduce la contrasela pero solo tienes "+contador+" intentos");
       contraseña = Integer.parseInt(System.console().readLine());
       
       if (contraseña == 1234){
        System.out.println("La caja fuerte se ha abierto satifactoriamente");
        contador++;
        }
      
      contador --;
      }while ((contador !=0)&&(contraseña != 1234));
    
    
    if (contador == 0){
      System.out.println("Lo siento, esa no es la combinacion");
    }
  }
}
