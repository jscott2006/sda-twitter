package pl.sda.twitter.model;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class UserDao {
    public TbUser getUserByUserName(String userName){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(TbUser.class);
        criteria.add(Restrictions.eq("userName", userName));
        return (TbUser) criteria.uniqueResult();
    }
}
