
package poo.investigaciondecorator;

/**
 *
 * @author adha2
 */
public class Pineapple extends ToppingDecorator{

    public Pineapple(Pizza newPizza) {
        super(newPizza);
        
        System.out.println("Adding Pineapple");
    }
    
    public String getDescription() {
        return tempPizza.getDescription() + ", Pineapple";
    }
    
    public int getCost() {
        return tempPizza.getCost() + 700;
    }
}