package logic;


import EntityC.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDaoImpl implements Dao<User, Integer>{

    private final SessionFactory factory;

    public UserDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(User user) {
        try(final Session session = factory.openSession()){
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        }
    }

    @Override
    public User read(Integer integer) {
        try(final Session session = factory.openSession()){
            final User user1 = session.get(User.class, integer);
            return user1 != null ? user1 : new User();
        }
    }

    @Override
    public void update(User user) {
        try (Session session = factory.openSession()){
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(User user) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
        }
    }
}
