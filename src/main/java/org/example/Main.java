package org.example;

import org.example.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
        Session session = null;
        //Create
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        User user  = new User();
        user.setId(1);
        user.setEmail("23");
        user.setMail("2552");
        session.save(user);
        session.getTransaction().commit();

        sessionFactory.close();
    }
}