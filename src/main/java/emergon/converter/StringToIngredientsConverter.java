
package emergon.converter;

import emergon.entity.Ingredient;
import emergon.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToIngredientsConverter implements Converter<String, Ingredient>{
    
    
    @Autowired
    private IngredientService service;
    
    
    @Override
    public Ingredient convert(String source) {
        //Get the id of the breadSize selection
        //Find the Entity from the Database
        //Return the Entity
        int id = Integer.parseInt(source);
        Ingredient ingr = service.findById(id);
        return ingr;
    }
    
}
