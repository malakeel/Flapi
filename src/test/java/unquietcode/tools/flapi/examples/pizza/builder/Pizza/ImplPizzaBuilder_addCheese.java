
package unquietcode.tools.flapi.examples.pizza.builder.Pizza;

import unquietcode.tools.flapi.examples.pizza.DisappearingPizzaExample.Pizza;
import unquietcode.tools.flapi.support.BuilderImplementation;

import javax.annotation.Generated;


/**
 * This class was generated using Flapi, the fluent API generator for Java.
 * Modifications to this file will be lost upon regeneration.
 * You have been warned!
 * 
 * Visit https://github.com/UnquietCode/Flapi for more information.
 * 
 * 
 * Generated on April 19, 2013 18:33:15 PDT using version 0.4
 */
@Generated(value = "unquietcode.tools.flapi", date = "April 19, 2013 18:33:15 PDT", comments = "generated using Flapi, the fluent API generator for Java")
public class ImplPizzaBuilder_addCheese
    implements PizzaBuilder_addCheese<Object> , BuilderImplementation
{
    private final PizzaHelper _helper;
    private final Object _returnValue;

    public ImplPizzaBuilder_addCheese(PizzaHelper helper, Object returnValue) {
        _helper = helper;
        _returnValue = returnValue;
    }

    public BuilderImplementation _getParent() {
        if (_returnValue instanceof BuilderImplementation) {
            return ((BuilderImplementation) _returnValue);
        } else {
            return null;
        }
    }

    private void _transferInvocations(Object next) {
        // nothing
    }

    public void _checkInvocations() {
        // nothing
    }

    public PizzaBuilder addCheese() {
        _helper.addCheese();
        ImplPizzaBuilder step1 = new ImplPizzaBuilder(_helper, _returnValue);
         
        _transferInvocations(step1);
        return step1;
    }

    public Pizza bake() {
        BuilderImplementation cur = this;
        while (cur!= null) {
            cur._checkInvocations();
            cur = cur._getParent();
        }
         
        Pizza intermediateResult = _helper.bake();
         
        return intermediateResult;
    }
}