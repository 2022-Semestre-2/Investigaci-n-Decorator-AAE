
package poo.investigaciondecorator;

/**
 * Tiene una relación "Tiene una" con Pizza. 
 * Esta es una relación de agregación
 * @author adha2
 */
abstract class ToppingDecorator implements Pizza {
    
    protected Pizza tempPizza;
    /**
     * Asigna la instancia de tipo a este atributo de una pizza
     * Todos los decoradores pueden personalizar dinámicamente la Pizza
     * @param newPizza 
     */
    
    public ToppingDecorator(Pizza newPizza){
        
        tempPizza = newPizza;
        
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public int getCost() {
        return tempPizza.getCost();
    }
    
    
    
    
    
}
