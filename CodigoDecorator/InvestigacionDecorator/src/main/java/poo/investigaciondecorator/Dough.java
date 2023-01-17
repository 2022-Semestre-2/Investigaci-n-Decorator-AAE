
package poo.investigaciondecorator;

/**
 * la clase base para crear los diferentes tipos de pizza.
 * Implementa la interfaz de Pizza con solo los métodos necesarios de la interfaz
 * Cada pizza hecha comenzará con la masa
 * 
 * @author adha2
 */
public class Dough implements Pizza{

    @Override
    public String getDescription() {
        return "Dough";
    }

    @Override
    public int getCost() {
        return 400;
    }
    
    
    
}
