
package poo.investigacionnodecorator;

/**
 *
 * @author Angelica Harmon
 */
public class HawaianaPizza extends Pizza {

    @Override
    public void setDescription(String newDescription) {
        //setter de la descripccion de la pizza ThreeCheese
    }

    @Override
    public String getDescription() {
        //retorna lo que lleva de topping de este tipo de pizza
        return "Mozzarella, Pinia, Pepperoni";
    }

    @Override
    public int getCost() {
        //retorna el costo de esta pizza
        return 6000;
    }

}
