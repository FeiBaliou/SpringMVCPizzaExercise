package emergon.dao;

import emergon.entity.BreadSize;
import java.util.List;

public interface BreadSizeDao {
    
    List<BreadSize> findAll();

    public BreadSize findById(int id);
    
}
