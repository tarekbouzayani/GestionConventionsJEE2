package main.java.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import main.java.model.Convention;
import main.java.util.HibernateUtil;


public class ConventionDao  {
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String connectionString = "jdbc:mysql://localhost:3306/GestConv";

    public static void save(Convention c) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trx = session.beginTransaction();
        session.persist(c);
        trx.commit();
        session.close();

    }

    public static Convention findByType(String type) {
        String queryString = " From Convention c where c.type=:type";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery(queryString);
        query.setParameter("type", type);
        List<Convention> list = query.getResultList();
//

        if (list == null || list.isEmpty()) {
            return null;

        } else {
            return list.get(0);
        }

    }

    public static List<Convention> findAll() {
        String queryString = "From Convention c ";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery(queryString);
        List<Convention> list = query.getResultList();
        session.close();
        if (list == null || list.isEmpty()) {
            return null;

        } else {
            return list;
        }

    }

}



