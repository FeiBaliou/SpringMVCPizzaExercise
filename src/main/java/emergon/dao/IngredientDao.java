package emergon.dao;

import emergon.entity.Ingredient;
import java.util.List;

public interface IngredientDao {
    
    List<Ingredient> findAll();
    
}
