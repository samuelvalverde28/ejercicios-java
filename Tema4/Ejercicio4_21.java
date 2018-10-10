public class Ejercicio4_21{
  public static void main(String[] arg){
  
  System.out.println("Se va a calcular tu media del primer trimestre de programacion");
  
  System.out.println("Introduzca la nota del primer examen");
  double notaprimera = Double.parseDouble(System.console().readLine());
  System.out.println("Introduzca la nota del segundo examen");
  double notasegunda = Double.parseDouble(System.console().readLine());
  
  double sumanotas = ((notaprimera + notasegunda)/2);
   
  if (sumanotas < 5){
    System.out.println("Como tu nota media es menor que 5 tienes que hacer examen recuperacion, di si estas apto o no apto");
        String notarecuperacion = System.console().readLine();
        if (notarecuperacion.equals("apto")){
        System.out.println("Tu nota es un 5");
        } else {
          System.out.println("Como no has aprobado se te queda tu suspenso de "+sumanotas);
          }
    
    } else {
      System.out.println("Estas aprobado y tu nota media es de un "+sumanotas);
      } 
  

    
  }
}
