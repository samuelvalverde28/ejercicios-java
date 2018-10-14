public class Ejercicio5_15{
  public static void main(String[] arg){
    
  System.out.print("Introce un numero que sera la base: ");
  int base = Integer.parseInt(System.console().readLine());
  System.out.print("Introce un numero que sera el exponente: ");
  int exponente = Integer.parseInt(System.console().readLine());
  
  int resultado = 1;
  int basecontador = base;
  int contador = 1;
  
  if (exponente == 0){
    resultado = 1;
    } else if (base == 0){
        resultado = 0;
        } else{
          
          do{
            resultado =resultado*base;
            contador++;
            System.out.print(resultado+" ");
            }while (contador <= exponente);
          
          }
  
  
  }
}  
