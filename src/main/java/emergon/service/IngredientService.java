package emergon.service;

import emergon.entity.Ingredient;
import java.util.List;

public interface IngredientService {

    List<Ingredient> findAll();
      public Ingredient findById(int id);
}
