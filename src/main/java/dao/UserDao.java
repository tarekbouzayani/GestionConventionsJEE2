package main.java.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import main.java.model.User;
import main.java.util.HibernateUtil;


public class UserDao  {
        private static String driverName = "com.mysql.jdbc.Driver";
        private static String connectionString = "jdbc:mysql://localhost:3306/GestConv";

        public static void save(User u) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trx = session.beginTransaction();
            session.persist(u);
            trx.commit();
            session.close();

        }

        public static User findByLoginAndMdp(String login, String password) {
            String queryString = " From User u where u.login=:login and u.password=:passwod";
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery(queryString);
            query.setParameter("login", login);
            query.setParameter("password", password);
            List<User> list = query.getResultList();
//

            if (list == null || list.isEmpty()) {
                return null;

            } else {
                return list.get(0);
            }

        }

        public static List<User> findAll() {
            String queryString = "From Utilisateur u ";
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery(queryString);
            List<User> list = query.getResultList();
            session.close();
            if (list == null || list.isEmpty()) {
                return null;

            } else {
                return list;
            }

        }

    }


