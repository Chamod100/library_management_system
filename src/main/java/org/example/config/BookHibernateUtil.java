package org.example.config;

import org.example.Model.DTO.BookDTO;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookHibernateUtil {

    private static SessionFactory sessionFactory;

    private static Configuration configuration = new Configuration();

    public static SessionFactory getSessionFactory() {
        if (null == sessionFactory) {
            configuration.configure();
            configuration.addAnnotatedClass(BookDTO.class);
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;

    }
}
