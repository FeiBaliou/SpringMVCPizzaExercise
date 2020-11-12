/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.dao;

import emergon.entity.Orders;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class OrdersDaoImpl extends SuperDao implements OrderDao{

    @Override
    public Orders save(Orders order) {
        Session s = sessionFactory.getCurrentSession();
        s.save(order);
        return order;
    }
    
}
