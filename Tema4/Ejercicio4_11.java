public class Ejercicio4_11{
  public static void main(String[] arg){
    
  String hora;

    System.out.print("Introduzca la hora: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
  
    int segundos = ((horas * 60)*60) + (minutos * 60);
    int total = ((24 * 60) * 60) - segundos;
    
    

    System.out.print("Faltan "+total+" segundos para la medianoche");
    
  }
}
