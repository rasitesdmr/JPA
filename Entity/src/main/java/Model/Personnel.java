package Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Personnel")    //Tablo adımızı değiştirebiliyoruz.
public class Personnel {
    @Id
    @Column(name = "id", unique = true, length = 20, nullable = false)
    private int personnelId;
    @Column(name = "firstName", length = 20, updatable = false)
    private String firstName;

    private String lastName;

    /*
     * Date : Sadece tarihi tutar
     *
     * Tİme : Sadece zamanı tutar
     *
     * TimeStamp : Hem tarihi hemde zamanı tutar
     */

    @Temporal(TemporalType.DATE)
    private Date birthOfDate;

    private String personnelNumber;

    @Lob // Büyük veri alacağını bildirir
    private String about;

    @Transient // Veri tabanında kolonda gözükmesin demek
    private double salary;

    public Personnel() {

    }

    public Personnel(int personnelId, String firstName, String lastName, Date birthOfDate, String personnelNumber,
                     String about, double salary) {
        this.personnelId = personnelId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;
        this.personnelNumber = personnelNumber;
        this.about = about;
        this.salary = salary;
    }

    public int getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(int personnelId) {
        this.personnelId = personnelId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(Date birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public String getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(String personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "personnelId=" + personnelId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthOfDate=" + birthOfDate +
                ", personnelNumber='" + personnelNumber + '\'' +
                ", about='" + about + '\'' +
                ", salary=" + salary +
                '}';
    }
}
