

public class Ejercicio4_13{
  public static void main(String[] arg){
    
    System.out.println("Introduzca tres numeros para ordenarlos");
    
  String numero;

    System.out.print("Introduzca el primer numero: ");
    int n1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el segundo numero: ");
    int n2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el tercer numero: ");
    int n3 = Integer.parseInt(System.console().readLine());
    
    if (n1 >= n2 && n1>= n3 && n2 >= n3){
      System.out.print("el orden seria "+n1+" despues "+n2+" y luego "+n3);
    } else  if (n1 >= n2 && n1>= n3 && n3 >= n2){
      System.out.print("el orden seria "+n1+" despues "+n3+" y luego "+n2);
    } else  if (n2 >= n1 && n2>= n3 && n1 >= n3){
      System.out.print("el orden seria "+n2+" despues "+n1+" y luego "+n3);
    } else  if (n2 >= n1 && n2>= n3 && n3 >= n1){
      System.out.print("el orden seria "+n2+" despues "+n3+" y luego "+n1);
    } else  if (n3 >= n1 && n3>= n2 && n1 >= n2){
      System.out.print("el orden seria "+n3+" despues "+n1+" y luego "+n2);
    } else  if (n3 >= n1 && n3>= n2 && n2 >= n1){
      System.out.print("el orden seria "+n3+" despues "+n2+" y luego "+n1);
    }else {
      System.out.print("no comprendo");
      }
    
    
  }
}
