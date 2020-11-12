package emergon.service;

import emergon.entity.Payment;
import java.util.List;

public interface PaymentService {

    List<Payment> findAll();

    public Payment findById(int id);
    
}
