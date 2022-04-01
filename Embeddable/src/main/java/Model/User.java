package Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usedId;

    private String userName;

    private String password;
    @Embedded
    @AttributeOverride(name = "phoneNumber" , column = @Column(name = "telefon",length = 11,unique = true)) // Sadece bir veri için
    private Contact contact;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    public User() {
    }

    public User(String userName, String password, Contact contact, Date creationDate) {
        this.userName = userName;
        this.password = password;
        this.contact = contact;
        this.creationDate = creationDate;
    }

    public int getUsedId() {
        return usedId;
    }

    public void setUsedId(int usedId) {
        this.usedId = usedId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "usedId=" + usedId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", contact=" + contact +
                ", creationDate=" + creationDate +
                '}';
    }
}
