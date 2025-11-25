package org.example.Repository;

import org.example.config.MemberHibernateUtil;
import org.example.Model.DTO.MemberDTO;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class MemberRepository {

    Session session = MemberHibernateUtil.getSessionFactory().openSession();

    public void addMember(MemberDTO memberDTO) {
        session.persist(memberDTO);
        Transaction transaction = session.beginTransaction();
        transaction.commit();
    }

    public MemberDTO getMember(String id) {
        return session.find(MemberDTO.class, id);
    }

    public void deleteMember(String id) {
        session.remove(session.find(MemberDTO.class, id));
        Transaction transaction = session.beginTransaction();
        transaction.commit();
    }

    public void updateMember(MemberDTO memberDTO) {
        session.merge(memberDTO);
        Transaction transaction = session.beginTransaction();
        transaction.commit();
    }

    public List<MemberDTO> getAll() {
        List<MemberDTO> memberList = session.createQuery("FROM Member", MemberDTO.class).list();
        return memberList;
    }
}
