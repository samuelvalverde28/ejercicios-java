public class Ejercicio4_15{
  public static void main(String[] arg){
    
    System.out.println("Introduzca un caracter para poder pintar una piramide");
    
  String carac;

    System.out.print("Tu caracter es: ");
    carac = System.console().readLine();
    
    
   
   System.out.print("Indice en uqe posicion quieres la flecha: ");
   System.out.println("1.Arriba");
   System.out.println("2.Abajo");
   System.out.println("3.Derecha");
   System.out.println("4.Izquierda");
    int posicion = Integer.parseInt(System.console().readLine());
    
    
  switch(posicion) {
    case 1:
      System.out.printf("%5s\n",carac);
      System.out.printf("%4s %s\n",carac,carac);
      System.out.printf("%3s %s %s\n",carac,carac,carac); 
      System.out.printf("%2s %s %s %s\n",carac,carac,carac,carac);
      System.out.printf("%s %s %s %s %s\n",carac,carac,carac,carac,carac);  
    break;
    
    case 2:
      System.out.printf("%s %s %s %s %s\n",carac,carac,carac,carac,carac);  
      System.out.printf("%2s %s %s %s\n",carac,carac,carac,carac);
      System.out.printf("%3s %s %s\n",carac,carac,carac); 
      System.out.printf("%4s %s\n",carac,carac);
      System.out.printf("%5s\n",carac);
    break;
    
    case 3:
      System.out.printf("%s\n",carac);
      System.out.printf("%s %s\n",carac,carac);
      System.out.printf("%s %s %s\n",carac,carac,carac);
      System.out.printf("%s %s %s %s\n",carac,carac,carac,carac);
      System.out.printf("%s %s %s %s %s\n",carac,carac,carac,carac,carac);
      System.out.printf("%s %s %s %s\n",carac,carac,carac,carac);
      System.out.printf("%s %s %s\n",carac,carac,carac);
      System.out.printf("%s %s\n",carac,carac);
      System.out.printf("%s\n",carac);


    break;
    
    case 4:
      System.out.printf("        %s\n",carac);
      System.out.printf("      %s %s\n",carac,carac);
      System.out.printf("    %s %s %s\n",carac,carac,carac);
      System.out.printf("  %s %s %s %s\n",carac,carac,carac,carac);
      System.out.printf("%s %s %s %s %s\n",carac,carac,carac,carac,carac);
      System.out.printf("  %s %s %s %s\n",carac,carac,carac,carac);
      System.out.printf("    %s %s %s\n",carac,carac,carac);
      System.out.printf("      %s %s\n",carac,carac);
      System.out.printf("        %s\n",carac);      
    break;

    default:
    System.out.println("No se");
}
    
    
    
    
    
    
    
  }
}
