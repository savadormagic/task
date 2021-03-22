package EntityC;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(schema = "public", name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "authorname")
    private String authorname;

    @Column(name = "authorsurname")
    private String authorsurname;

    @Column(name = "authorpatronymic")
    private String authorpatronymic;

    @Column(name = "yearofrelease")
    private int yearofrelease;

    @Column(name = "name")
    private String name;

    @Column(name = "genre")
    private String genre;

    @Column(name = "status")
    private String status;

    @Column(name = "amount")
    private int amount;

    @Override
    public String toString() {
        return "Book: " +
                "\nid=:" + id +
                "\n authorname: " + authorname +
                "\nauthorsurname: " + authorsurname +
                "\nauthorpatronymic='" + authorpatronymic+
                "\nyearofrelease=" + yearofrelease +
                "\nname='" + name+
                "\ngenre='" + genre+
                "\nstatus='" + status+
                "\namount=" + amount;
    }
}
