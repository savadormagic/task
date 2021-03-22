package EntityC;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(schema = "public", name = "user")
public class User {

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

    @Column(name = "address")
    private String address;

    @Column(name = "phonenumber")
    private int phonenumber;

    @Column(name = "bookid")
    private int bookid;

    @Override
    public String toString() {
        return "User: \n" +
                "id: " + id +
                "\nname: " + name +
                "\nsurname: " + surname +
                "\npatronymic: " + patronymic+
                "\naddress: " + address +
                "\nphonenumber: " + phonenumber +
                "\nbookid: " + bookid;
    }
}
