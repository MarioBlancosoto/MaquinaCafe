
package maquinadecafe;
/**
 * Abstracción de la pantalla por la que visualizamos cada interacción que se tiene
 * con ella,implementando varios métodos estáticos para poder usarlos
 * sin necesidad de instanciar un objeto en cualquier clase.
 * 
 */

public class Display  {
    /**
     * saca por pantalla la cantidad de dinero devuelto al cliente
     * @param total recibe la cantidad de dinero total que se le ha de devolver al cliente.
     */
    public static void imprimeCambio(float total){
    System.out.println("imprime el cambio devuelto");
    }
    /**
     * muestra por pantalla la cantidad total de dinero que se ha
     * introducido en ese momento.
     * @param credito recibe la cantidad total de dinero se ha introducido.
     */
    public static void imprimeCredito(float credito){
  System.out.println("muestra tu credito actual "+credito);
    }
    /**
     * Imprime una alarma por pantalla avisando de que no quedan productos
     * u o averías.
     */
    public static void imprimeAlarma(){
   System.out.println("Imprime alarma de falta de algún producto o avería");
    }
    
    /**
     * Muestra por pantalla que el producto ha finalizado.
     * 
    */
    public static void productoFinalizado(){
        System.out.println("Imprimo Producto Finalizado");
    }
    /**
     * Muestra por pantalla la cantidad de azúcar seleccionado en el submenú de
     * añadir azúcar
     * 
     * @param azucar recibe la cantidad de azúcar seleccionado
     */
    public static void imprimeCantidadAzucar(int azucar){
        System.out.println("Imprimo Cantidad de azúcar introducido " +azucar);
    }
    /**
     * Muestra por pantalla la cantidad elegida del producto.
     * @param cantidad recibe la cantidad de azúcar introducido
     */
    public static void imprimeCantidadProducto(int cantidad){
        System.out.println("Imprime cantidad de producto " +cantidad);
        /**
         * Muestra por pantalla el paso intermedio tras darle al botón de 
         * elaborar producto y mientras el mismo está elaborándose.
         */
    }
    public static void imprimeElaborandoProducto(){
        System.out.println("Elaborando producto...");
    }
 
}
