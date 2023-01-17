/**
 * 
 */
package poo.investigacionnodecorator;

/**
 *
 * @author Angelica Harmon
 */
public class ThreeCheesePizza extends Pizza {

    @Override
    public void setDescription(String newDescription) {
        //setter de la descripccion de la pizza ThreeCheese
    }

    @Override
    public String getDescription() {
        //retorna los 3 quesos que lleva de topping de este tipo de pizza
        return "Mozzarella, Fontina, Parmesan";
    }

    @Override
    public int getCost() {
        //retorna el costo de esta pizza
        return 5000;
    }

}
