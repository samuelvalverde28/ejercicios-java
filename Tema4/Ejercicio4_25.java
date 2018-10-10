public class Ejercicio4_25{
  public static void main(String[] arg){
  
  System.out.print("Introduzca la altura de la bandera en cm: ");
  double alturabandera = Double.parseDouble(System.console().readLine());
  System.out.print("Ahora introduzca la anchura:");
  double anchobandera = Double.parseDouble(System.console().readLine());
  System.out.print("¿Quiere escudo bordado? (s/n):");
  String escudo = System.console().readLine();
  System.out.println("Gracias. Aquí tiene el desglose de su compra.");
  
  double areabandera = alturabandera * anchobandera;
  double precioarea = areabandera / 100;

  String nombreescudo = "";
  double precioescudo = 0;
  
  if (escudo.equals("s")){
    precioescudo = 2.50;
    nombreescudo = "con escudo";
    } else {
      nombreescudo = "sin escudo";
      }
      
  double gastosenvio = 3.25;
  double total = precioarea+precioescudo+gastosenvio;
  
  
  System.out.println("Bandera de "+areabandera+" cm2:     "+precioarea+"€");
  System.out.println(nombreescudo+":     "+precioescudo+"€");
  System.out.println("Gastos de envio:      3.25€");
  System.out.println("Total:          "+total+"€");
  
  
  

    
  }
}
