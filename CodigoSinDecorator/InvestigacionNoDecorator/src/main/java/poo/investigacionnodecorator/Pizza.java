/**
 * Clase padre abstract para armar los diferentes tipos de pizza
 * 
 */

package poo.investigacionnodecorator;

/**
 * @author Angelica Harmon
 */

public abstract class Pizza {
    
    public abstract void setDescription(String newDescription);
    
    public abstract String getDescription();
    
    public abstract int getCost();
    
}
