public class Ejercicio5_11{
  public static void main(String[] arg){
    
  System.out.print("Introce un numero para mostrarte: ");
  int numero = Integer.parseInt(System.console().readLine());
  int numerocuadrado; 
  int numerocubo;
  int numero5 = numero + 4;
  
  
  
  
  do{ 
  numerocuadrado = numero * numero;
  numerocubo = numero * numero * numero;
   
  System.out.println("|"+numero+"|"+numerocuadrado+"|"+numerocubo+"|"); 
  numero++;
  } while (numero <= numero5);
  
  
  }
}
