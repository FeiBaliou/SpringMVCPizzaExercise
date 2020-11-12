package emergon.dao;

import emergon.entity.Ingredient;
import java.util.List;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class IngredientDaoImpl extends SuperDao implements IngredientDao{

    @Override
    public List<Ingredient> findAll() {
        Query<Ingredient> query = getSession().createNamedQuery("Ingredient.findAll", Ingredient.class);
        List<Ingredient> list = query.getResultList();
        return list;
    }
    
}
