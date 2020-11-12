package emergon.dao;

import emergon.entity.BreadSize;
import java.util.List;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class BreadSizeDaoImpl extends SuperDao implements BreadSizeDao{

    @Override
    public List<BreadSize> findAll() {
        Query<BreadSize> query = getSession().createNamedQuery("BreadSize.findAll", BreadSize.class);
        List<BreadSize> list = query.getResultList();
        return list;
    }

    @Override
    public BreadSize findById(int id) {
        Query<BreadSize> query = getSession().createNamedQuery("BreadSize.findById", BreadSize.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
    
}
