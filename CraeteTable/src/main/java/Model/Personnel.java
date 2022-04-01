package Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Personnel {
    @Id
    private int personnelId;
    private String firstName;
    private String lastName;
    private Date birthOfDate;
    private String personnelNumber;


    public Personnel() {

    }

    public Personnel(int personnelId, String firstName, String lastName, Date birthOfDate, String personnelNumber) {
        this.personnelId = personnelId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;
        this.personnelNumber = personnelNumber;

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



    @Override
    public String toString() {
        return "Personnel{" +
                "personnelId=" + personnelId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthOfDate=" + birthOfDate +
                ", personnelNumber='" + personnelNumber + '\'' +
                '}';
    }
}
