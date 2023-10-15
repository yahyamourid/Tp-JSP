/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ma.projet.service;

import java.util.List;
import ma.projet.dao.IDao;
import ma.projet.entities.User;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author YahyaMrd
 */
public class UserService implements IDao<User>{
    public boolean create(User o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(o);
            tx.commit(); 
            return true;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return false;
        }finally{
            if(session != null)
                session.close();
        }
    }

    @Override
    public boolean delete(User o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.delete(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean update(User o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<User> getAll() {
        List <User> userss = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            userss = session.createQuery("from User ").list();
            tx.commit();
            return userss;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return userss;
        } finally {
            if(session != null)
                session.close();
        }
    }

    @Override
    public User getById(int id) {
       User users = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            users = (User) session.get(User.class, id);
            tx.commit();
            return users;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return users;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    
    public User getByEmail(String email) {
       User user = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            user =  (User) session.createQuery("from User where email = :email ").setParameter("email", email).uniqueResult();
            tx.commit();
            return user;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return user;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    
}

