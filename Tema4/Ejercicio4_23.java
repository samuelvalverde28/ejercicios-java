public class Ejercicio4_23{
  public static void main(String[] arg){
  
  System.out.println("Introduce la base imponible");
  double base = Double.parseDouble(System.console().readLine());

  System.out.println("Introduce el tipo de IVA (general, reducido, superreducido)");
  String tipoiva = System.console().readLine();
  
  System.out.println("Introduce el codigo promocional (nopro, mitad, meno5, 5porc)");
  String tipopromo = System.console().readLine();
  
  double basedeliva = 0;
  double baseconiva = 0;
  int iva = 0;
  
  if (tipoiva.equals("general")){
    iva = 21;
    basedeliva = base * 0.21;
    baseconiva = basedeliva + base;
    
    } else if (tipoiva.equals("reducido")){
      iva = 10;
      basedeliva = base * 0.10;
      baseconiva = basedeliva + base;
      
      } else if (tipoiva.equals("superreducido")){
        iva = 4;
        basedeliva = base * 0.04;
        baseconiva = basedeliva + base;
        
        }else {
          System.out.println("Has metido mal el iva");
          }
  
  double promocion = 0;
  double resultadototal = 0;
  
  if (tipopromo.equals("nopro")){
    promocion = 0;
    resultadototal = baseconiva - promocion;
    
    } else if (tipopromo.equals("mitad")){
      promocion =  baseconiva/2;
      resultadototal = baseconiva - promocion;
      
      } else if (tipopromo.equals("meno5")){
        promocion = 5;
        resultadototal = baseconiva - promocion;
        
        }else if (tipopromo.equals("5porc")){
          promocion = baseconiva*0.05;
          resultadototal = baseconiva - promocion;
          
          } else {
            System.out.println("Has metido mal el codigo de promocion");
            }  
  
  
  
  System.out.println("Base imponible :      "+base);
  System.out.println("IVA  ("+iva+"%):        "+basedeliva);
  System.out.println("Precio con iVA:       "+baseconiva);
  System.out.println("Cód. Promocion ("+tipopromo+"):    -"+promocion);
  System.out.println("Total:        "+resultadototal);
  

    
  }
}
