public class Ejercicio4_1{
  public static void main(String[] arg){
  System.out.print("¿Que dias deseas saber?");
  String respuesta = System.console().readLine();
  
  if (respuesta.equals("lunes")){
    System.out.println("SI");
    } else if (respuesta.equals("martes")) {
      System.out.println("PROG");
      } else if (respuesta.equals("miercoles")) {
      System.out.println("EED");
      } else if (respuesta.equals("jueves")) {
      System.out.println("EED");
      } else if (respuesta.equals("viernes")) {
      System.out.println("SI");
      } else {
        System.out.println("te has esquivocado de dia");
      }
  
  
    
    
  }
}
