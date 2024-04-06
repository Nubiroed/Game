package org.example.service.serviceImp;
import org.example.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserCRUD {
    private Session session;

    public UserCRUD(Session session) {
        this.session = session;
    }

    public void createUser(User user) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public User readUser(Long userId) {
        return session.get(User.class, userId);
    }

    public void updateUser(User user) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteUser(User user) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}