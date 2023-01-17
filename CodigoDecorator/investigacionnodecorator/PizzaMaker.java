/**
 * Main para el output
 */
package poo.investigacionnodecorator;

/**
 *
 * @author adha2
 */
public class PizzaMaker {
    
    public static void main(String[] args){
        //crea la pizza de 3 quesos
        Pizza tresqueso = new ThreeCheesePizza();
        
        System.out.println("Ingredients: " + tresqueso.getDescription());
        System.out.println("Price: " + tresqueso.getCost());
        
        //crea la pizza suprema
        Pizza suprema = new SupremPizza();
        
        System.out.println("Ingredients: " + suprema.getDescription());
        System.out.println("Price: " + suprema.getCost());
        
        //crea la pizza hawaiana
        Pizza hawiana = new HawaianaPizza();
        
        System.out.println("Ingredients: " + hawiana.getDescription());
        System.out.println("Price: " + hawiana.getCost());
        
        
    }
    
}
