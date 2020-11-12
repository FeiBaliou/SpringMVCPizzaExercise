package emergon.service;

import emergon.dao.PaymentDao;
import emergon.entity.Payment;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentDao pdao;
    
    @Override
    public List<Payment> findAll() {
        return pdao.findAll();
    }

    @Override
    public Payment findById(int id) {
         return pdao.findById(id);
    }
    
}
