public class Ejercicio4_3{
  public static void main(String[] arg){
  String linea;
  
  System.out.println("Introduce el numero:");
  
  linea = System.console().readLine();
  int numero = Integer.parseInt(linea);
  
  if (numero == 1){
    System.out.println("Lunes");
    }else if (numero == 2) { 
    System.out.println("Martes");
     }else if (numero == 3) {
       System.out.println("Miercoles");
      }else if (numero == 4) {
        System.out.println("Jueves");
       }else if (numero == 5) {
         System.out.println("Viernes");
        }else if (numero == 6) {
           System.out.println("Sabado");
         }else if (numero == 7) {
           System.out.println("Domingo");
          }else {
            System.out.println("Te has es quivocado de numero la semana solo tiene 7 dias");
          }
    
    
  }
}
