
package poo.investigaciondecorator;

/**
 * @author adha2
 */
public class PizzaMaker {
    
    public static void main(String[] args){
        //crea una pizza basica
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new Dough()));
        
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());
        
        System.out.println("*********************************************************************");
        //crea una pizza hawaiana
        Pizza hawaianaPizza = new TomatoSauce(new Mozzarella(new Pepperoni(new Pineapple(new Dough()))));
        
        System.out.println("Ingredients: " + hawaianaPizza.getDescription());
        System.out.println("Price: " + hawaianaPizza.getCost());
        
        
    }
    
}
