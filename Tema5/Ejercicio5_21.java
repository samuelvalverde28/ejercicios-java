public class Ejercicio5_21{
  public static void main(String[] arg){
    
    System.out.println("Introduce numeros para parar pon un numero negativo");
    int numero;
    int contador = 0;
    
    double contadormedia = 0;
    double contadorimpar = 0;
    double resultadomedia = 0;
    
    int cuentamayor = 0;
    
    do{
      System.out.print("Introduce numero: ");
      numero = Integer.parseInt(System.console().readLine());
      contador++;
      
      if ((numero%2)!=0 && numero > 0){
        contadorimpar++;
        contadormedia = contadormedia + numero;
        
        }
        
      if (numero%2 == 0){
        
        if(numero > cuentamayor){
          cuentamayor = numero;
          }
        
        }
      
      } while (numero >=0);
    
    resultadomedia = contadormedia/contadorimpar;
    
    System.out.println("Se han introducido "+(contador-1)+" numeros");
    System.out.println("La media de los numeros impares son "+resultadomedia);
    System.out.println("El numero par mas alto es "+cuentamayor);
     
    }
    
  }

