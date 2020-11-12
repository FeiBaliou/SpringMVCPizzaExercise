/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package emergon.service;

import emergon.dao.OrderDao;
import emergon.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{
    
    
    @Autowired
    private OrderDao odao;

    @Override
    public Orders save(Orders order) {
        return odao.save(order);
    }
    
}
