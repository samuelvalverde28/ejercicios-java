public class Ejercicio7_4{
  public static void main(String[] arg){
    
  System.out.println("Se va a introducir 20 numeros de entre 0 a 100 aleatorios y se va a decir el cuadrado y el cubo del numero:");
  
  int[] num = new int[20];
  int[] cuadrado = new int[20];
  int[] cubo = new int[20];
  
  for (int i = 0;i<=19;i++){
    num[i] = (int)((Math.random()*101));
    }
  
  
  for (int j = 0;j<=19;j++){
    cuadrado[j] = num[j]*num[j];
    }
    
  for (int x = 0;x<=19;x++){
    cubo[x] = (num[x]*num[x])*num[x];
    }
  
  for (int t = 0;t<=19;t++){
    System.out.println("numero: "+num[t]+"  cuadrado: "+cuadrado[t]+"  cubo: "+cubo[t]);
    }
  
  
  
  }
}
