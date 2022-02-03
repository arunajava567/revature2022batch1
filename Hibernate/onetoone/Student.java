package onetoone;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="Student")

public class Student 

{   @Id
	private int stdId;
       private String firstName;
       private String lastName;
       private int age;
    public int getStdId() {		return stdId;	}
	public void setStdId(int stdId) {this.stdId = stdId;	}
	public String getFirstName() {
		return firstName;	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;	}
	public String getLastName() {	return lastName;	}
	public void setLastName(String lastName) {
		this.lastName = lastName;	}
	public int getAge() {		return age;	}
	public void setAge(int age) {	this.age = age;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + "]";
	}
        
}
