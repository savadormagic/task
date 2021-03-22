package logic;


import EntityC.Author;
import EntityC.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AuthorDaoImpl implements Dao<Author, Integer>{

    private final SessionFactory factory;

    public AuthorDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Author author) {
        try(final Session session = factory.openSession()){
            session.beginTransaction();
            session.save(author);
            session.getTransaction().commit();
        }
    }

    @Override
    public Author read(Integer integer) {
        try(final Session session = factory.openSession()){
            final Author author1 = session.get(Author.class, integer);
            return author1 != null ? author1 : new Author();
        }
    }

    @Override
    public void update(Author author) {
        try (Session session = factory.openSession()){
            session.beginTransaction();
            session.update(author);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Author author) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(author);
            session.getTransaction().commit();
        }
    }
}
