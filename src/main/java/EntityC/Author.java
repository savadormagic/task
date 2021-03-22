package EntityC;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(schema = "public", name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "yearofborn")
    private int yearofborn;

    @Override
    public String toString() {
        return "Author: " +
                "\nid=" + id +
                "\name='" + name +
                "\nsurname='" + surname +
                "\npatronymic='" + patronymic +
                "\nyearofborn=" + yearofborn;
    }
}
