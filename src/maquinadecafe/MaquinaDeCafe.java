
package maquinadecafe;

import javax.swing.JOptionPane;
/**
@author Mario

 
   */

public class MaquinaDeCafe implements Azucar{
    
          
  
    public static void main(String[] args) {
        
        int select;
       MaquinaDeCafe maquina = new MaquinaDeCafe();
      
  
       do{
            select = Integer.parseInt(JOptionPane.showInputDialog(" 1.Introduce moneda \n 2.Selecciona producto"
               + "\n 3.Seleccione cantidad de producto " + "\n 4. seleccione cantidad de azúcar "+"\n 5.elaborar producto "));
            
        switch(select){
            case 1: maquina.introDucirMoneda();
            break;
            case 2: maquina.seleccionProducto();
            break;
            case 3: maquina.cantidadProducto(0);
            break;
            case 4: maquina.anhadirAzucar(0);
            break;
            case 5: maquina.elaborarProducto();
            break;
            case 6: System.exit(0);
          
        }   
           
       }while(select!=0);
       
     
        

    }
    
   /**
    * Posibilita la introducción,validación y visualización del dinero por parte del cliente,en el mismo se valida
    * la cantidad de dinero introducida por el mismo y se calcula la diferencia entre 
    * el dinero introducido y el coste,el credito introducido se visualiza a través del método imprimeCredito
    * y el del total a devolver con el método imprimeCambio.
    *
    * 
    * 
    */
       
    public void introDucirMoneda(){
      
        float credito = Float.parseFloat(JOptionPane.showInputDialog("Introduzca cantidad"));
     Monedero     mon = new Monedero();
        if(credito>mon.getCoste()){
          float total = (credito -mon.getCoste());
            Display.imprimeCambio(total);
            Display.imprimeCredito(credito);
            System.out.println("su cambio es "+total);
        }else{
      System.out.println("Dinero insuficiente");
        
        }
        
   
    }
    /**
     * Nos proporciona la posibilidad de pulsar el botón e iniciar la elaboración del producto 
     * finalmente imprime producto finalizado,llamando a los métodos imprimeElaborandoProducto 
     * y productoFinalizado de la clase Display.
     * 
     */
    public void elaborarProducto(){
     
        Display.imprimeElaborandoProducto();
        Display.productoFinalizado();
    }
    /**
     * el submenú que permite seleccionar la cantidad de producto que se desea obtener
     * @param cantidad la posibilidad de elegir el tamaño del producto
     * se llama al metodo de Display imprimeCantidad que recibe el parámetro cantidad.
     */
    public void cantidadProducto(int cantidad){
        
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("seleccione cantidad "
                + "1. 100ml \n 2. 200ml " ));
        if(cantidad==1){
            System.out.println("seleccion 100ml");
        }
        else if(cantidad==2){
            System.out.println("seleccion 200ml");
        }
              
        else{
             Display.imprimeAlarma();
    }
        Display.imprimeCantidadProducto(cantidad);
    }

    /**
     * 
     * Da la opción de apertura a un submenú en el cual elige la cantidad
     * exacta de azúcar que lleve el producto elegido para,
     * posteriormente mostrar por pantalla la cantidad seleccionada con la llamada
     * al método de display imprimeAzúcar y también cuenta con la opción de comenzar
     * la elaboración del producto desde dicho submenú con la llamada al método elaborarProducto.
     * @param selecionar permite seleccionar entre más o menos azúcar.
     */
  @Override
    public void anhadirAzucar(int selecionar) {
        
        int azucar=0;
        
    int selecciona;
          do{
             selecciona = Integer.parseInt(JOptionPane.showInputDialog("selecciona cantidad azúcar "
            + "\n 1. añadir azúcar  \n  2. restar azúcar  \n 3.elaborar"));
            switch(selecciona){
                
                case 1: azucar++;
                break;
                case 2 : azucar--;
                break;
                case 3 : this.elaborarProducto();
            }
              Display.imprimeCantidadAzucar(azucar);
              
          }while(selecciona!=0);
        
           
              
       
    }
    /**
     * Nos permite el acceso a un submenú en el que el cliente selecciona el producto a elaborar
     * <ul>
     * <li>te.
     * <li>cafe.
     * <li>chocolate.
     * </ul>
     * 
     */
    
    public void seleccionProducto(){
      String te,cafe,chocolate;
        int elige = Integer.parseInt(JOptionPane.showInputDialog(""
                + "1. café \n 2.Chocolate \n 3.Té \n 4.comenzar elaboración"));
        
        switch(elige){
            
            case 1: System.out.println("Ha elegido café");
            break;
            case 2: System.out.println("Ha elegido chocolate");
            break;
            case 3: System.out.println("Ha elegido Té");
            break;
            case 4: System.exit(0);
            break;
           
    }
        
    }
    
}
