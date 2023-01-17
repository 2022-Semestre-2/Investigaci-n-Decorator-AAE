
package poo.investigaciondecorator;

/**
 *
 * @author adha2
 */
public class Pepperoni extends ToppingDecorator{
    
     public Pepperoni(Pizza newPizza) {
        super(newPizza);
        
        System.out.println("Adding Pepperoni");
    }
    
    public String getDescription() {
        return tempPizza.getDescription() + ", Pepperoni";
    }
    
    public int getCost() {
        return tempPizza.getCost() + 800;
    }
    
}
