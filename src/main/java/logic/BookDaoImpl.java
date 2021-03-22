package logic;

import EntityC.Book;
import com.sun.istack.NotNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BookDaoImpl implements Dao<Book, Integer>{

    private final SessionFactory factory;

    public BookDaoImpl(@NotNull final SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Book book) {
        try(final Session session = factory.openSession()){
            session.beginTransaction();
            session.save(book);
            session.getTransaction().commit();
        }
    }

    @Override
    public Book read(Integer integer) {
        try(final Session session = factory.openSession()){
            final Book book = session.get(Book.class, integer);
            return book != null ? book : new Book();
        }
    }

    @Override
    public void update(Book book) {
        try (Session session = factory.openSession()){
            session.beginTransaction();
            session.update(book);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Book book) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(book);
            session.getTransaction().commit();
        }
    }
}
