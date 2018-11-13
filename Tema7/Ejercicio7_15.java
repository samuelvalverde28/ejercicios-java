public class Ejercicio7_15{
  public static void main(String[] arg){
    
 
  
  int tamanio = 10;
  int comensalesPorMesa = 4;
  int[] mesas = new int[10];
  
  
  for (int i = 0;i<tamanio;i++){
    mesas[i] = (int)(Math.random()*5);
    }
 
  int grupoEntrante;
  
  do{
    //presentacion
    System.out.print("Mesa nº:   ");
    for (int i=0;i<tamanio;i++){
      System.out.printf("%3d",i+1);
      
      }
    System.out.println("");
    System.out.print("Ocupacion: ");
    for (int i=0;i<tamanio;i++){
      System.out.printf("%3d",mesas[i]);
      
      }
    System.out.printf("\n\n");
    
    System.out.print("Introduzca el nº de personas del grupo ");
    grupoEntrante = Integer.parseInt(System.console().readLine());
    if (grupoEntrante != -1){
      if (grupoEntrante > comensalesPorMesa){
        System.out.println("Lo siento no admitimos nº de "+grupoEntrante+" , haga grupos de "+comensalesPorMesa+" personas maximo e intentelo de nuevo");
        }
        else {
          //busca la mesa vacia
          boolean grupoSentado = false;
          for (int i=0;(i<tamanio) && (grupoSentado==false);i++){
            if (mesas[i]== 0){
              mesas[i] = grupoEntrante;
              grupoSentado =true;
              System.out.println("Por favor sientese en la mesa"+(i+1));
              
              }
            }
            
            // en caso de no estar sentados, buescar un hueco
           if (grupoSentado==false){
             for (int i=0;(i<tamanio) && (grupoSentado==false);i++){
                if (mesas[i] + grupoEntrante <= comensalesPorMesa){   //
                  mesas[i] += grupoEntrante;
                  grupoSentado =true;
                   System.out.println("Tendrán que compartir mesa, ");
                  System.out.println("Por favor sientese en la mesa"+(i+1));
              
              }
            }
             } 
            //si no los hemos podido sentar, es quenoy hueco para ellos
            if (grupoSentado==false){
               System.out.println("Lo siento en este momento, no hay sitio");
              }
            System.out.printf("\n\n");
          }
      }
    }while (grupoEntrante != -1);
  
  
  }
}
