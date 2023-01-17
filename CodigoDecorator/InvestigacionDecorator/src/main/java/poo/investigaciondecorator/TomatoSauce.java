
package poo.investigaciondecorator;

/**
 *
 * @author adha2
 */
public class TomatoSauce extends ToppingDecorator{

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        
        System.out.println("Adding Sauce");
    }
    
    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato Sauce";
    }
    
    public int getCost() {
        return tempPizza.getCost() + 350;
    }
    
}
