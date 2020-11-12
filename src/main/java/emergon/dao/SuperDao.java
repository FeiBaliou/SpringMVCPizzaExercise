package emergon.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class SuperDao {
    
    //We need a SessionFactory to create Session Object
    @Autowired//Inject
    protected SessionFactory sessionFactory;
    //We need to Session for queries in DB
    protected Session getSession(){
        Session session = sessionFactory.getCurrentSession();
        return session;
    }
}
