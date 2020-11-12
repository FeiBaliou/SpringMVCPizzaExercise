package emergon.dao;

import emergon.entity.Payment;
import java.util.List;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDaoImpl extends SuperDao implements PaymentDao{

    @Override
    public List<Payment> findAll() {
        Query<Payment> query = getSession().createNamedQuery("Payment.findAll", Payment.class);
        List<Payment> list = query.getResultList();
        return list;
    }

    @Override
    public Payment findById(int id) {
       Query<Payment> query = getSession().createNamedQuery("Payment.findById", Payment.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
    
}
