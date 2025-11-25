package org.example.config;

import org.example.Model.DTO.MemberDTO;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MemberHibernateUtil {

    private static Configuration configuration = new Configuration();
    private static SessionFactory SessionFactory;

    public static SessionFactory getSessionFactory(){
        if (SessionFactory == null){
            configuration.configure();
            configuration.addAnnotatedClass(MemberDTO.class);
            SessionFactory = configuration.buildSessionFactory();
        }
        return SessionFactory;
    }
}
