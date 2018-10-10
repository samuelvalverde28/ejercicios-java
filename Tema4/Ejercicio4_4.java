public class Ejercicio4_4{
  public static void main(String[] arg){
  String horas;
  
  System.out.println("Por favor, introduzca el numero de horas trabajadas durante la semana:");
  
  horas = System.console().readLine();
  int numero = Integer.parseInt(horas);
  int restante;
  int total2;
  int total1;
  
  
  restante = numero - 40;
  total2 = (40 * 12)+(restante * 16);
  
  total1 = numero * 12;
  
  if (numero > 40){
    
    System.out.println("El sueldo semanal que le corresponde es de "+ total2 +" euros"); 
    
    } else {
      
      System.out.println("El sueldo semanal que le corresponde es de "+ total1 +" euros"); 
      
      }
  
  
    
  }
}
