package emergon.service;

import emergon.dao.IngredientDao;
import emergon.entity.Ingredient;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IngredientServiceImpl implements IngredientService{

    @Autowired
    private IngredientDao idao;
    
    @Override
    public List<Ingredient> findAll() {
        return idao.findAll();
    }

    @Override
    public Ingredient findById(int id) {
        return null;
       
    }
    
}
