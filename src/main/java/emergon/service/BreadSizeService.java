package emergon.service;

import emergon.entity.BreadSize;
import java.util.List;

public interface BreadSizeService {

    List<BreadSize> findAll();

    public BreadSize findById(int id);
    
}
