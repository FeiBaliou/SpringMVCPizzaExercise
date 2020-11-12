/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.converter;

import emergon.entity.Payment;
import emergon.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToPaymentConverter implements Converter<String, Payment>{
     
    
    @Autowired
    private PaymentService service;
      
    
    @Override
    public Payment convert(String source) {
    int id = Integer.parseInt(source);
        Payment size = service.findById(id);
        return size;
    
}
    
}
