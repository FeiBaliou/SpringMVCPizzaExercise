package emergon.dao;

import emergon.entity.Payment;
import java.util.List;

public interface PaymentDao {
    
    List<Payment> findAll();

    public Payment findById(int id);
    
}
