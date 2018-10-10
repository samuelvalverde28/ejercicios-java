public class Ejercicio4_22{
  public static void main(String[] arg){
  
  System.out.println("Se va a calcular cuanto tiempo falta para el viernes a las 15:00 que es el comienzo del fin de semana");
  System.out.println("Introduce el dia");
  String dia = System.console().readLine();
  
  System.out.println("Introduce la hora");
  int hora = Integer.parseInt(System.console().readLine());
  
  System.out.println("Introduce los minutos");
  int minutos = Integer.parseInt(System.console().readLine());
  int dianumero = 0;
  int minutosahora = 0;
  
   if (dia.equals("lunes") && minutos < 61 && hora < 25){
     dianumero = 0;
     int minutostotales = ((4 * 24) * 60) + (13 * 60);
  minutosahora = (dianumero * 24 * 60) + (hora * 60) + minutos;
  int totalminutos = minutostotales - minutosahora;
  
  System.out.println("Te faltan "+totalminutos+" minutos para el fin de semana");
     
     } else if (dia.equals("martes") && minutos < 61 && hora < 25){
       dianumero = 1;
       int minutostotales = ((4 * 24) * 60) + (13 * 60);
  minutosahora = (dianumero * 24 * 60) + (hora * 60) + minutos;
  int totalminutos = minutostotales - minutosahora;
  
  System.out.println("Te faltan "+totalminutos+" minutos para el fin de semana");
       
       } else if (dia.equals("miercoles") && minutos < 61 && hora < 25){
         dianumero = 2;
         int minutostotales = ((4 * 24) * 60) + (13 * 60);
  minutosahora = (dianumero * 24 * 60) + (hora * 60) + minutos;
  int totalminutos = minutostotales - minutosahora;
  
  System.out.println("Te faltan "+totalminutos+" minutos para el fin de semana");
         
         } else if (dia.equals("jueves") && minutos < 61 && hora < 25){
           dianumero = 3;
           int minutostotales = ((4 * 24) * 60) + (13 * 60);
  minutosahora = (dianumero * 24 * 60) + (hora * 60) + minutos;
  int totalminutos = minutostotales - minutosahora;
  
  System.out.println("Te faltan "+totalminutos+" minutos para el fin de semana");
           
           }else if (dia.equals("viernes") && minutos < 61 && hora < 14){
             dianumero = 4;
             int minutostotales = ((4 * 24) * 60) + (13 * 60);
  minutosahora = (dianumero * 24 * 60) + (hora * 60) + minutos;
  int totalminutos = minutostotales - minutosahora;
  
  System.out.println("Te faltan "+totalminutos+" minutos para el fin de semana");
             
             } else {
               System.out.println("El dia o la hora no es corresta");
               }
  
  
  
  
  

    
  }
}
