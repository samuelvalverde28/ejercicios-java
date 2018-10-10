public class Ejercicio4_24{
  public static void main(String[] arg){
  
  
  
  System.out.println("1 - Programador junior");
  System.out.println("2 - Programador senior");
  System.out.println("3 - Jefe de proyecto");  
  
  System.out.print("Introduzca el cargo del empleado (1-3): ");
  String tipoempleado = System.console().readLine();
  System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
  double diasvisita = Double.parseDouble(System.console().readLine());
  System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
  String estadocivil = System.console().readLine();
  
  
  double sueldobase = 0;
  double dinerovisitas = diasvisita*30;
  
  
   switch(tipoempleado) {
      case "1":
        sueldobase = 950;
        break;
      case "2":
        sueldobase = 1200;
        break;
      case "3":
        sueldobase = 1600;
        break;
      default:
        System.out.println("El tipo de cargo no es correcto.");
    }
  
  double sueldobruto = sueldobase + dinerovisitas;
  int irpf = 0;
  double sueldoconirpf = 0;  
    
   switch(estadocivil) {
      case "1":
        irpf = 25;
        sueldoconirpf = sueldobruto * 0.25;
        break;
      case "2":
        irpf = 20;
        sueldoconirpf = sueldobruto * 0.20;
        break;
      default:
        System.out.println("El tipo de estado civil no es correcto.");
    } 

  double sueldofinal = 0;
  sueldofinal = sueldobruto - sueldoconirpf;
  
  
  System.out.println("Sueldo Base:       "+sueldobase);
  System.out.println("Dietas:            "+dinerovisitas);
  System.out.println("-------------------------------");
  System.out.println("Sueldo Bruto:      "+sueldobruto);
  System.out.println("Retencion IRPF ("+irpf+"%)       "+sueldoconirpf);
  System.out.println("-------------------------------");
  System.out.println("Sueldo Neto:       "+sueldofinal);
  
  

    
  }
}
