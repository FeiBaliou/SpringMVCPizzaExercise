package emergon.service;

import emergon.dao.BreadSizeDao;
import emergon.entity.BreadSize;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BreadSizeServiceImpl implements BreadSizeService{

    @Autowired
    private BreadSizeDao bdao;
    
    @Override
    public List<BreadSize> findAll() {
        return bdao.findAll();
    }

    @Override
    public BreadSize findById(int id) {
        return bdao.findById(id);
    }
    
}
