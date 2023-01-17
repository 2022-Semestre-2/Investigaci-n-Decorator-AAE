
package poo.investigaciondecorator;

/**
 *
 * @author adha2
 */
public class Mozzarella extends ToppingDecorator{

    public Mozzarella(Pizza newPizza) {
        super(newPizza);
        
        System.out.println("Adding Mozzarella");
    }
    
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarella";
    }
    
    public int getCost() {
        return tempPizza.getCost() + 500;
    }
    
}
