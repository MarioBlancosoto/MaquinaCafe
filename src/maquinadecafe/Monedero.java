
package maquinadecafe;
/**
 * Abstracción del funcionamiento del monedero de la máquina de café
 */

public class Monedero {
   
    float coste;
      /**
        * 
        * para instanciar un objeto de tipo monedero,nos proporciona el coste con un
        * valor por defecto.
        */
    public Monedero(){
        
        coste = 0.50f;
    }
     
    public Monedero(float coste){
      
        this.coste = coste;
    }
    
  
   /**
    * 
    * @param total recibe la variable que muestra el dinero a devolver.
    */
    public void devolverCambio(float total){
  
        System.out.println("devuelve el cambio del dinero introducido"+total);
    }



    public float getCoste() {
        return coste;
    }

   

    public void setCoste(float coste) {
        this.coste = coste;
    }
    
}
