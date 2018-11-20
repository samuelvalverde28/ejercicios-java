public class Ejercicio7_14{
  public static void main(String[] arg){
    
  System.out.println("Introduce 8 palabras:");
  
  String[] palabra = new String[10];
  String[] aux = new String[10];
  int contador = 0;
  
  for (int i = 0;i<=7;i++){
    palabra[i] = System.console().readLine();
    if (palabra[i].equals("verde")||palabra[i].equals("rojo")||palabra[i].equals("azul")||palabra[i].equals("amarillo")||palabra[i].equals("naranja")||palabra[i].equals("rosa")||palabra[i].equals("negro")||palabra[i].equals("blanco")|| palabra[i].equals("morado")){
      aux[contador] = palabra[i];
      contador++;
      }
    
    }
  
  for (int i = 0;i<=7;i++){
    if (!palabra[i].equals("verde")&&!palabra[i].equals("rojo")&&!palabra[i].equals("azul")&&!palabra[i].equals("amarillo")&&!palabra[i].equals("naranja")&&!palabra[i].equals("rosa")&&!palabra[i].equals("negro")&&!palabra[i].equals("blanco")&&!palabra[i].equals("morado")){
      aux[contador] = palabra[i];
      contador++;
      }
    }
    
    
  System.out.println("original");
  for (int i = 0;i<=7;i++){
   System.out.print(palabra[i]+" ");
  }
  
  System.out.println("resultado");
  for (int i = 0;i<=7;i++){
   System.out.print(aux[i]+" ");
  }
  
  
  
  
  
  
  
  
  
  }
}
