package viewModule;

import EntityC.Author;
import EntityC.Book;
import EntityC.User;
import logic.AuthorDaoImpl;
import logic.BookDaoImpl;
import logic.Dao;
import logic.UserDaoImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.swing.*;
import java.awt.event.ActionListener;


public class GUI extends JFrame {

    private JButton button1 = new JButton("add");
    private JButton button2 = new JButton("add group");
    private JButton button3 = new JButton("update");
    private JButton button4 = new JButton("delete");
    private JButton button5 = new JButton("add");
    private JButton button6 = new JButton("update");
    private JButton button7 = new JButton("delete");
    private JButton button8 = new JButton("add");
    private JButton button9 = new JButton("delete");
    private JButton button10 = new JButton("return book");
    private JButton button11 = new JButton("update");
    private JButton button12 = new JButton("delete");
    private JTextField textField1 = new JTextField("", 15);
    private JTextField textField2 = new JTextField("", 15);
    private JTextField textField3 = new JTextField("", 15);
    private JTextField textField4 = new JTextField("", 15);
    private JTextField textField5 = new JTextField("", 15);
    private JTextField textField6 = new JTextField("", 15);
    private JTextField textField7 = new JTextField("", 15);
    private JTextField textField8 = new JTextField("", 15);
    private JTextField textField9 = new JTextField("", 15);
    private JTextField textField10 = new JTextField("", 15);
    private JTextField textField11 = new JTextField("", 15);
    private JTextField textField12 = new JTextField("", 15);
    private JTextField textField13 = new JTextField("", 15);
    private JTextField textField14 = new JTextField("", 15);
    private JTextField textField15 = new JTextField("", 15);
    private JTextField textField16 = new JTextField("", 15);
    private JTextField textField17 = new JTextField("", 15);
    private JTextField textField18 = new JTextField("", 15);


    private JLabel label1 = new JLabel();
    private JLabel label2 = new JLabel();
    private JLabel label3 = new JLabel();
    private JLabel label4 = new JLabel();
    private JLabel label5 = new JLabel();
    private JLabel label6 = new JLabel();
    private JLabel label7 = new JLabel();
    private JLabel label8 = new JLabel();
    private JLabel label9 = new JLabel();
    private JLabel label10 = new JLabel();
    private JLabel label11 = new JLabel();
    private JLabel label12 = new JLabel();
    private JLabel label13 = new JLabel();
    private JLabel label14 = new JLabel();
    private JLabel label15 = new JLabel();
    private JLabel label16 = new JLabel();
    private JLabel label17 = new JLabel();
    private JLabel label18 = new JLabel();

    private JTextArea textArea1 = new JTextArea();
    private JScrollPane scroll = new JScrollPane(textArea1);

    public GUI(){
        super("proga");
        this.setBounds(100, 100, 800, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField1.setSize(90, 20);
        textField1.setLocation(100, 45);

        textField2.setSize(90, 20);
        textField2.setLocation(100, 70);

        textField3.setSize(90, 20);
        textField3.setLocation(100, 95);

        textField4.setSize(90, 20);
        textField4.setLocation(100, 120);

        textField5.setSize(90, 20);
        textField5.setLocation(100, 145);

        textField6.setSize(90, 20);
        textField6.setLocation(100, 170);

        textField7.setSize(70, 20);
        textField7.setLocation(260, 45);

        textField8.setSize(70, 20);
        textField8.setLocation(260, 70);

        textField9.setSize(70, 20);
        textField9.setLocation(260, 95);

        textField10.setSize(70, 20);
        textField10.setLocation(260, 120);

        textField11.setSize(70, 20);
        textField11.setLocation(260, 145);

        textField12.setSize(70, 20);
        textField12.setLocation(260, 170);

        textField13.setSize(60, 20);
        textField13.setLocation(360, 170);

        textField14.setSize(70, 20);
        textField14.setLocation(260, 220);

        textField15.setSize(70, 20);
        textField15.setLocation(260, 245);

        textField16.setSize(70, 20);
        textField16.setLocation(260, 270);

        textField17.setSize(60, 20);
        textField17.setLocation(270, 295);

        textField18.setSize(60, 20);
        textField18.setLocation(360, 195);

        label1.setSize(90, 20);
        label1.setText("id of author");
        label1.setLocation(5, 45);

        label2.setSize(90, 20);
        label2.setText("year of release");
        label2.setLocation(5, 70);

        label3.setSize(90, 20);
        label3.setText("name");
        label3.setLocation(5, 95);

        label4.setSize(120, 20);
        label4.setText("genre");
        label4.setLocation(5, 120);

        label5.setSize(90, 20);
        label5.setText("status");
        label5.setLocation(5, 145);

        label6.setSize(90, 20);
        label6.setText("amount");
        label6.setLocation(5, 170);

        label7.setSize(90, 20);
        label7.setText("name");
        label7.setLocation(195, 45);

        label8.setSize(90, 20);
        label8.setText("surname");
        label8.setLocation(195, 70);

        label9.setSize(90, 20);
        label9.setText("patronymic");
        label9.setLocation(195, 95);

        label10.setSize(120, 20);
        label10.setText("address");
        label10.setLocation(195, 120);

        label11.setSize(90, 20);
        label11.setText("phone");
        label11.setLocation(195, 145);

        label12.setSize(90, 20);
        label12.setText("book id");
        label12.setLocation(195, 170);

        label13.setSize(30, 20);
        label13.setText("id");
        label13.setLocation(340, 170);

        label14.setSize(50, 20);
        label14.setText("name");
        label14.setLocation(195, 220);

        label15.setSize(60, 20);
        label15.setText("surname");
        label15.setLocation(195, 245);

        label16.setSize(70, 20);
        label16.setText("patronymic");
        label16.setLocation(195, 270);

        label17.setSize(70, 20);
        label17.setText("year of born");
        label17.setLocation(195, 295);

        label18.setSize(120, 20);
        label18.setText("id");
        label18.setLocation(340, 195);

        //add book
        button1.setSize(180, 30);
        button1.setLocation(10, 200);

        //update book
        button3.setSize(180, 30);
        button3.setLocation(10, 240);

        //delete book
        button4.setSize(180, 35);
        button4.setLocation(10, 280);

        //add user
        button5.setSize(89, 45);
        button5.setLocation(330, 45);

        //update user
        button6.setSize(89, 45);
        button6.setLocation(330, 95);

        //delete user
        button7.setSize(89, 20);
        button7.setLocation(330, 145);

        //add author
        button8.setSize(89, 45);
        button8.setLocation(330, 220);

        //delete author
        button9.setSize(89, 45);
        button9.setLocation(330, 270);

        //return book
        button10.setSize(220, 20);
        button10.setLocation(195, 195);

        textArea1.setSize(350, 270);
        textArea1.setLocation(420, 45);

        scroll.setSize(350, 270);
        scroll.setLocation(420, 45);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        button1.addActionListener(actionListener());
        button5.addActionListener(actionListener2());
        button6.addActionListener(actionListener3());
        button10.addActionListener(actionListener4());
        button3.addActionListener(actionListener5());
        button4.addActionListener(actionListener6());
        button8.addActionListener(actionListener7());
        button9.addActionListener(actionListener8());

/*        button2.addActionListener(actionListener2());
        button3.addActionListener(actionListener3());
        button4.addActionListener(actionListener4());
        button5.addActionListener(actionListener5());
        button6.addActionListener(actionListener6());
        button7.addActionListener(actionListener7());
        button8.addActionListener(actionListener8());
        button9.addActionListener(actionListener9());
        button10.addActionListener(actionListener10());
        button11.addActionListener(actionListener11());
        button12.addActionListener(actionListener12());
        button13.addActionListener(actionListener13());*/
        setLayout(null);

        add(textField1);
        add(textField2);
        add(textField3);
        add(textField4);
        add(textField5);
        add(textField6);
        add(textField7);
        add(textField8);
        add(textField9);
        add(textField10);
        add(textField11);
        add(textField12);
        add(textField13);
        add(textField14);
        add(textField15);
        add(textField16);
        add(textField17);


        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);
        add(label8);
        add(label9);
        add(label10);
        add(label11);
        add(label12);
        add(label13);
        add(label14);
        add(label15);
        add(label16);
        add(label16);
        add(label17);


        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button10);
        add(button11);
        add(button12);


        /*add(textArea1);*/
        add(scroll);

    }


    private ActionListener actionListener() {
        return e -> {
            createBook();
        };
    }

    private ActionListener actionListener2() {
        return e -> {
            createUser();
        };
    }

    private ActionListener actionListener3() {
        return e -> {
            updateUser();
        };
    }

    private ActionListener actionListener4() {
        return e -> {
            returnBook();
        };
    }

    private ActionListener actionListener5() {
        return e -> {
            updateBook();
        };
    }

    private ActionListener actionListener6() {
        return e -> {
            deleteBook();
        };
    }

    private ActionListener actionListener7() {
        return e -> {
            createAuthor();
        };
    }

    private ActionListener actionListener8() {
        return e -> {
            deleteAuthor();
        };
    }

    public void createUser(){
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<User, Integer> userIntegerDao = new UserDaoImpl(factory);
            Dao<Book, Integer> bookIntegerDao = new BookDaoImpl(factory);
            try {
                final User user = new User();
                final Book book = bookIntegerDao.read(user.getBookid());
                user.setName(textField7.getText());
                user.setSurname(textField8.getText());
                user.setPatronymic(textField9.getText());
                user.setAddress(textField10.getText());
                user.setPhonenumber(Integer.parseInt(textField11.getText()));
                user.setBookid(1/*Integer.parseInt(textField12.getText())*/);
                book.setAmount(book.getAmount() - 1);
                userIntegerDao.create(user);
                textArea1.setText("Created: \n" + user.toString());
            } catch (Exception e) {
                textArea1.setText("er");
            }
        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

    public void updateUser(){
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<User, Integer> userIntegerDao = new UserDaoImpl(factory);
            Dao<Book, Integer> bookIntegerDao = new BookDaoImpl(factory);
            try {
                final User user = userIntegerDao.read(Integer.parseInt(textField13.getText()));
                final Book book = bookIntegerDao.read(user.getBookid());
                user.setName(textField7.getText());
                user.setSurname(textField8.getText());
                user.setPatronymic(textField9.getText());
                user.setAddress(textField10.getText());
                user.setPhonenumber(Integer.parseInt(textField11.getText()));
                user.setBookid(Integer.parseInt(textField12.getText()));
                book.setAmount(book.getAmount() - 1);
                bookIntegerDao.update(book);
                userIntegerDao.update(user);
                textArea1.setText("Updated: " + user.toString());
            } catch (Exception e) {
                textArea1.setText("error");
            }
        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

    public void readUser(){
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<User, Integer> userIntegerDao = new UserDaoImpl(factory);
            try {
                final User user = userIntegerDao.read(0);
                textArea1.setText(user.toString());
            } catch (Exception e) {
                textArea1.setText("");
            }
        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

    public void deleteUser(){
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<User, Integer> userIntegerDao = new UserDaoImpl(factory);
            try {
                final User user = userIntegerDao.read(0);
                textArea1.setText("deleted\n" + user.toString());
                userIntegerDao.delete(user);
            } catch (Exception e) {
                textArea1.setText("incorrect id");
            }
        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

    public void createBook(){
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Book, Integer> bookIntegerDao = new BookDaoImpl(factory);
            Dao<Author, Integer> authorIntegerDao = new AuthorDaoImpl(factory);

            try {
                final Book book = new Book();
                final Author author = authorIntegerDao.read(Integer.parseInt(textField1.getText()));
                book.setAuthorname(author.getName());
                book.setAuthorsurname(author.getSurname());
                book.setAuthorpatronymic(author.getPatronymic());
                book.setYearofrelease(Integer.parseInt(textField2.getText()));
                book.setName(textField3.getText());
                book.setGenre(textField4.getText());
                book.setStatus(textField5.getText());
                book.setAmount(Integer.parseInt(textField6.getText()));
                bookIntegerDao.create(book);
                textArea1.setText("Added\n" + book.toString());
            } catch (Exception e) {
                textArea1.setText("couldn't add");
            }
        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

    public void updateBook(){
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Book, Integer> bookIntegerDao = new BookDaoImpl(factory);
            try {
                final Book book = bookIntegerDao.read(Integer.parseInt(textField12.getText()));
                book.setYearofrelease(Integer.parseInt(textField2.getText()));
                book.setName(textField3.getText());
                book.setGenre(textField4.getText());
                book.setStatus(textField5.getText());
                book.setAmount(Integer.parseInt(textField6.getText()));
                bookIntegerDao.update(book);
                textArea1.setText("Updated\n" + book.toString());
            } catch (Exception e) {
                textArea1.setText("wasn't updated");
            }
        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

    public void deleteBook(){
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Book, Integer> bookIntegerDao = new BookDaoImpl(factory);
            final Book book1 = bookIntegerDao.read(Integer.parseInt(textField12.getText()));
            textArea1.setText("Deleted\n" + book1.toString());
            bookIntegerDao.delete(book1);
        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

    public void returnBook(){
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<User, Integer> userIntegerDao = new UserDaoImpl(factory);
            Dao<Book, Integer> bookIntegerDao = new BookDaoImpl(factory);

            try {
                final User user = userIntegerDao.read(Integer.parseInt(textField13.getText()));
                final Book book = bookIntegerDao.read(user.getBookid());
                user.setBookid(0);
                book.setAmount(book.getAmount() + 1);
                userIntegerDao.update(user);
                bookIntegerDao.update(book);
                textArea1.setText("Returned:\n" + book.toString());

            } catch (Exception e) {
                textArea1.setText("what");
            }
        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

    public void createAuthor(){
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Author, Integer> authorIntegerDao = new AuthorDaoImpl(factory);

            try {
                final Author author = new Author();
                author.setName(textField14.getText());
                author.setSurname(textField15.getText());
                author.setPatronymic(textField16.getText());
                author.setYearofborn(Integer.parseInt(textField17.getText()));
                authorIntegerDao.create(author);
                textArea1.setText("Created:\n" + author.toString());
            } catch (Exception e) {
                textArea1.setText("");
            }
        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }


    public void deleteAuthor(){
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Author, Integer> authorIntegerDao = new AuthorDaoImpl(factory);

            try {
                final Author author = authorIntegerDao.read(Integer.parseInt(textField13.getText()));
                textArea1.setText("Deleted:\n" + author.toString());
                authorIntegerDao.delete(author);

            } catch (Exception e) {
                textArea1.setText("");
            }
        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

}
