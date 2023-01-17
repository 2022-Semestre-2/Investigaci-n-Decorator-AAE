/**
 * 
 */
package poo.investigacionnodecorator;

/**
 *
 * @author Angelica Harmon
 */
public class SupremPizza extends Pizza {

    @Override
    public void setDescription(String newDescription) {
        //setter de la descripccion de la pizza ThreeCheese
    }

    @Override
    public String getDescription() {
        //retorna los toppings que lleva de topping de este tipo de pizza
        return "Mozzarella, Pepperoni, Chile, Hongos, Cebolla, Jamon";
    }

    @Override
    public int getCost() {
        //retorna el costo de esta pizza
        return 10000;
    }

}
